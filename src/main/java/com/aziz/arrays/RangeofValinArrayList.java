package com.aziz.arrays;

import java.util.ArrayList;
import java.util.List;

public class RangeofValinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
	    list.add(10);
	    list.add(60);
	    list.add(70);
	    list.add(30);
	    list.add(40);
	    list.add(50);
	    list.add(60);
	    list.add(90);
	    list.add(0);
	    System.out.println(list);

	    for (Integer singleValue: list) {
	        if(singleValue>=10 && singleValue<=80) {
	            System.out.println(singleValue);
	        }
	    }
	}

}
