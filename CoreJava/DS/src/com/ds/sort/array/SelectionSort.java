package com.ds.sort.array;

import com.ds.sort.array.util.Utility;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {22, 33, -23, 67, 2, 32, 12};

        System.out.println("Unsorted Array");
        Utility.printArray(array);
        System.out.println ( "**********************************" );

        for (int unsortedPartionIndex = array.length - 1; unsortedPartionIndex > 0; unsortedPartionIndex--) {
            int largestArrElementIndex = 0;
            for (int i = 1; i <= unsortedPartionIndex; i++) {
                if (array[i] > array[largestArrElementIndex])
                    largestArrElementIndex = i;
            }
            Utility.swap(array, largestArrElementIndex, unsortedPartionIndex);
        }
        System.out.println("Sorted Array");
        Utility.printArray(array);
    }
}
