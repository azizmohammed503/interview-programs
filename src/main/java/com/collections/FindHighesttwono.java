package com.collections;

public class FindHighesttwono {

	public static void main (String [] args) {
		int[] arr = {4,5,0,33,22,56,6,5,33};
		int max1=0;
		int max2=0;
		for(Integer num :arr) {
			if(max1 < num) {
				max2=max1;
				max1=num;
			}else if(max2 < num) {
				max2=num;
			}
		}
		System.out.println(max1 +" "+ max2);
	}
}
