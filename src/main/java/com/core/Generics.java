package com.core;

public class Generics<T> {


	@SuppressWarnings("unchecked")
	T add(T i, T j){

		return (T) new Integer((int) i); 
	 }

	public static void main(String[] args) {
		Generics<Integer> generics = new Generics<>();
		System.out.println(generics.add(new Integer(3), new Integer(8)));

	}

}
