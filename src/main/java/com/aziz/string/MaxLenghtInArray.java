package com.aziz.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxLenghtInArray {

	public static void main(String[] args) {
		String[] strarr = {"dsfdf","sdsd","s","asdsdfsd"};
		List<Integer> list =  new ArrayList<>();
		for(int i =0; i<strarr.length; i++) {
			System.out.println(strarr[i].length());
			list.add(strarr[i].length());
		}
		List<Integer> lis1= list.stream().sorted(Comparator.reverseOrder()).limit(1).collect(Collectors.toList());
		System.out.println(lis1);
		

	}

}
