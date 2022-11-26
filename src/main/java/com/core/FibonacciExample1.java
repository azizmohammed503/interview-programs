package com.core;

import java.util.stream.Stream;

public class FibonacciExample1 {

	public static void main(String[] args) {
		 int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		
		 Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
	        .limit(10)
	        .forEach(x -> System.out.print( x[0] + "," ));

	}

}
