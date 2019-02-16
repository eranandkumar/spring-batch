package com.ds.list.singlylinkedlist;

import com.ds.list.ListUtil.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodEx {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<> ();

        employeeList.add ( new Employee ( 1, "Anand", "Kumar" ) );
        employeeList.add ( new Employee ( 5, "Aman", "Akash" ) );
        employeeList.add ( new Employee ( 6, "Saurav", "kumar" ) );
        employeeList.add ( new Employee ( 23, "Vivek", "Ranjan" ) );

        employeeList.forEach ( employee -> System.out.println (employee) );

        employeeList.get ( 1 ); //Getting Value from Specific Index

        System.out.println (employeeList.isEmpty ());

        employeeList.set(1, new Employee(9, "XXX", "YYY"));
        //employeeList.forEach(employee -> System.out.println(employee));

        //System.out.println(employeeList.size());

        employeeList.add(3, new Employee(10, "ZZZ", "ZZZ"));
        //employeeList.forEach(employee -> System.out.println(employee));

//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for (Employee employee: employeeArray) {
//            System.out.println(employee);
//        }

        System.out.println(employeeList.contains(new Employee(6, "Saurav", "kumar" )));
        System.out.println(employeeList.indexOf(new Employee(23, "Vivek", "Ranjan" )));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
