package com.ds.sort.array.util;

public class Utility {

    public static void swap(int[] array, int i, int j){
        if (i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] +"\t");
        }
        System.out.println();
    }
}
