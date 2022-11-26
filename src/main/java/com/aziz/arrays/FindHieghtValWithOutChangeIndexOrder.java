package com.aziz.arrays;

public class FindHieghtValWithOutChangeIndexOrder {
	;

	// Method to find maximum in arr[]
	public static int largest(int[] arr) {
		int i;
		// Initialize maximum element
		int max = arr[0];
		// Traverse array elements from second and
		// compare every element with current max
		for (i = 1; i < arr.length; i++) {
			if (arr[i] < max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void desndingOrder(int[] array) {
		int large[] = new int[5];
		int max = 0, index;
		for (int j = 0; j < 5; j++) {
			max = array[0];
			index = 0;
			for (int i = 1; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];
					index = i;
				}
			}
			large[j] = max;
			array[index] = 0;
			System.out.println("Largest " + j + " : " + large[j]);
		}
	}
	
	public static void assendingOrder(int[] array) {
		int i;
		int large[] = new int[5];
		int max = 0, index;
		for (int j = 0; j < 5; j++) {
			max = array[0];
			index = 0;
			for (i = 1; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];
					index = i;
				}
			}
			large[j] = max;
			array[index] = Integer.MIN_VALUE;

			System.out.println("Lowest " + j + " : " + large[j]);
		}
	}

	// Driver method
	public static void main(String[] args) {
		int array[] = { 33, 55, 13, 46, 87, 42, 1, 34, 43, 56 };
		System.out.println("Largest in given array is " + largest(array));
		System.out.println("");
		desndingOrder(array);
		
		System.out.println("");
		assendingOrder(array);

	}
}
