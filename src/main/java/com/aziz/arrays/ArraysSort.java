package com.aziz.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {

	public static void main(String[] args) {
		 String[] srtArray = {"Z", "V", "L","A","D"};
		 Integer[] inta ={9,2,22,233,3,1,1};
		 //Arrays.sort(inta);
		 Arrays.sort(srtArray,Collections.reverseOrder());
		 
		 System.out.println(inta);
		 for(int i : inta) {
			 System.out.print(","+i);
		 }
		 System.out.println("");
		 for(String i : srtArray) {
			 System.out.print(","+i);
		 }

	}

}
