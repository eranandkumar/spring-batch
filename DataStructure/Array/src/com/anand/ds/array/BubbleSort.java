package com.anand.ds.array;
/*
 * Sorting Array Using BubbleSort
 */
public class BubbleSort {
	public static void main(String [] args) {
		int [] intArray = new int[] {20, 35, -15, 7, 55, 1, -22};
		System.out.println("Length of Array -: " + intArray.length);
		
		for(int lastIndexOfUnSortedArray = intArray.length-1; lastIndexOfUnSortedArray > 0; lastIndexOfUnSortedArray--) {
			for(int i=0; i < lastIndexOfUnSortedArray ; i++) {
				if(intArray[i] < intArray[i+1]) {
					swap(intArray, i, i+1);
				}
			}
		}
	
		for(int array : intArray) {
			System.out.println(array);
		}
	}
	
	public static void swap(int [] intArray, int i, int j) {
		if( i == j)
			return;
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}
}
