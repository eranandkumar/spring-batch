package com.ds.sort.array;

import com.ds.sort.array.util.Utility;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {22, 33, -23, 67, 2, 32, 12};

        System.out.println("Unsorted Array");
        Utility.printArray(array);
        System.out.println ( "**********************************" );

        for (int gap = array.length/2; gap > 0; gap = gap/2){

            for (int i = gap; i<array.length; i++){
                int newElement = array[i];

                int j = i;
                while (j >= gap && array[j - gap] > newElement){
                    array[j] = array[j - gap];
                    j = j-gap;
                }
                array[j] = newElement;
            }
        }
        System.out.println("Sorted Array");
        Utility.printArray(array);
    }
}
