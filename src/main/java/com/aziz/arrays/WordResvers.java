package com.aziz.arrays;

public class WordResvers {

	public static void main(String[] args) {
		String str = "Java is a greate lang";
		String str1[] = str.split(" ");
		String finalStr = "";
		for (int i = str1.length - 1; i >= 0; i--) {
			finalStr += str1[i] + " ";
		}
		System.out.println(finalStr);
		
	
		String[] str3 = str.split(" ");
		String finalStr2 = "";
		for(String s: str3 ) {
			for (int i = s.length() - 1; i >= 0; i--) {
				finalStr2 += s.charAt(i);
			}
			finalStr2 += " ";
		}
		System.out.println(finalStr2);
		
		String str2 = "Java is a greate lang";
		String stringReverse = "";
		for (int j = str2.length() - 1; j >= 0;j--) {
			stringReverse = stringReverse+str2.charAt(j);
		}
		System.out.println(stringReverse);

	}

}
