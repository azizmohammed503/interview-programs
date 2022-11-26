package com.aziz.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindoutRemovedNumber {
	public static void main(String[] args) {
		
		List<Integer> numbersList = new ArrayList<Integer>();
		for(int i=0;i<30;i++){
			numbersList.add(i);
		}
		List<Integer> backup = new ArrayList<Integer>(numbersList);
		
		numbersList.remove(9);
        backup.removeAll(numbersList);
		
		System.out.println(numbersList);
		System.out.println(backup);
	}
}
