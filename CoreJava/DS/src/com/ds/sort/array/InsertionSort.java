package com.ds.sort.array;

import com.ds.sort.array.util.Utility;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {22, 33, -23, 67, 2, 32, 12};

        System.out.println("Unsorted Array");
        Utility.printArray(array);
        System.out.println ( "**********************************" );

        for (int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++){
            int newElement = array[unsortedIndex];

            int i;
            for (i=unsortedIndex; i > 0 && array[i-1] > newElement; i--){
                array[i] = array[i-1];
            }
            array[i] = newElement;
        }

        System.out.println("Sorted Array");
        Utility.printArray(array);
    }
}
