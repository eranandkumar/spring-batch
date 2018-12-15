package com.ds.sort.array;
import com.ds.sort.array.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {22,33,-23,67,2,32,12};

        System.out.println("Unsorted Array");
        Utility.printArray(array);
        System.out.println("**********************************");

        for (int unsortedindex = array.length -1; unsortedindex > 0; unsortedindex--){
            for (int i=0; i<unsortedindex; i++){
                if (array[i] > array[i+1]) {
                    Utility.swap(array, i, i + 1);
                }
            }
        }
        System.out.println("Sorted Array");
        Utility.printArray(array);
    }
}
