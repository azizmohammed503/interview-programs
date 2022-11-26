package com.aziz.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondHightValue {

	public static void main(String[] args) {
	 
		
		List<Integer> list= new ArrayList<>(Arrays.asList(3,576,3,12,5,6,2,3));
		Integer  i = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(i);
		
		
		list.stream().sorted((p1,p2)->p1.compareTo(p2)).skip(1).findFirst().get();
	}

}
