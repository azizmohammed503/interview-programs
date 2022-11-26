package com.aziz.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ListwithEvenAndOdd {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(5);list.add(6);
		list.add(2);list.add(7);list.add(8);
		list.add(3);
		list.add(4);
		for(Integer i:list){
	       if( i % 2 == 0){
            System.out.print(i + " ");
	       }
		}
		 System.out.println(" ");
		list.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		 System.out.print(" ");
		IntStream.range(0, 100).filter(n->n % 2 ==1).forEach(n->System.out.print(n+" "));
  }
}
//https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/