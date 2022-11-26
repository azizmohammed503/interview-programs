package com.aziz.integer;

public class IntegerReverse {
	public Integer revese(int val) {
		String str = val+"";
		String temp= "";
		for(int i = str.length()-1; i>=0; i--) {
			temp+= str.charAt(i);
		}
		return Integer.parseInt(temp);
	}

	public static void main(String[] args) {
		IntegerReverse integerReverse = new IntegerReverse();
		int val =integerReverse.revese(12345);
		System.out.println(val);

	}

}
