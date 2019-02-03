package com.learn.batch.configuration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.learn.batch.domain.Customer;
import com.learn.batch.domain.CustomerFieldMapper;

/**
 * @author AnandKumar
 *
 */
@Configuration
public class JobConfiguration {
	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	public FlatFileItemReader<Customer> customerItemReader(){
		
			FlatFileItemReader<Customer> flatFileItemReader = new FlatFileItemReader<>();
			flatFileItemReader.setLinesToSkip(1);
			flatFileItemReader.setResource(new ClassPathResource("customer.csv"));
			
			DefaultLineMapper<Customer> customeLineMapper = new DefaultLineMapper<>();
			
			DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
			tokenizer.setNames(new String[] {"id","firstName","lastName","birthdate"});
			
			customeLineMapper.setLineTokenizer(tokenizer);
			customeLineMapper.setFieldSetMapper(new CustomerFieldMapper());
			customeLineMapper.afterPropertiesSet();
			
			flatFileItemReader.setLineMapper(customeLineMapper);
			
			return flatFileItemReader;
	}
	
	@Bean
    public ItemWriter<Customer> customItemWriter(){
		return items ->{
			for(Customer item: items) {
				System.out.println(item);
			}
		};
    }
    
    @Bean
	public Step step1() {
		return stepBuilderFactory.get("step1")
				.<Customer, Customer>chunk(10)
				.reader(customerItemReader())
				.writer(customItemWriter())
				.build();
	}
    
    @Bean
    public Job readFromDataBaseAndWriteToConsole() {
    		return jobBuilderFactory.get("readFromFlatFile")
    				.start(step1())
    				.build();
    }
}
