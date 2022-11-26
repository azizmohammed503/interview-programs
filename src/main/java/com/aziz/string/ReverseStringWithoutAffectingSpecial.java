package com.aziz.string;

import java.util.Arrays;
import java.util.Collections;

public class ReverseStringWithoutAffectingSpecial {
	public static void reverse(char str[]) {
		// Initialize left and right pointers
		int r = str.length - 1, l = 0;
		// Traverse string from both ends until
		// 'l' and 'r'
		while (l < r) {
			// Ignore special characters
			if (!Character.isAlphabetic(str[l]))
				l++;
			else if (!Character.isAlphabetic(str[r]))
				r--;
			// Both str[l] and str[r] are not spacial
			else {
				char tmp = str[l];
				str[l] = str[r];
				str[r] = tmp;
				l++;
				r--;
			}
		}
	}

	// Driver Code
	public static void main(String[] args) {
		String str = "a!!!b.c.d,e'f,ghi";
		char[] charArray = str.toCharArray();

		System.out.println("Input string: " + str);
		reverse(charArray);
		String revStr = new String(charArray);

		System.out.println("Output string: " + revStr);
		String temp = "a!!!b.c.d,e'f,ghi";
		for(int i=0;i<str.length();i++){
		    char c=str.charAt(i);
		    if(((c>=65)&&(c<=90))||((c>=97)&&(c<122)))
		    	str.replace(c, temp.charAt(i));
		}
		
		//use this
		System.out.println("Input string: " + temp);
		 reverseString("T@E$J#A%S");
		 String strs= "T@E$J#A%S";
		 int len = strs.length();
		 char[] ch = new char[len];
		 for(int i=0; i<len; i++) {
			 char c = strs.charAt(i);
			 if(Character.isAlphabetic(c)) {
				 ch[len-1-i]= c;
			 }else {
				 ch[i]=c;
			 }
		 }
		 System.out.println(ch);
		
		 
 	}
	
	private static void reverseString(String s){
	    int len = s.length();
	    char[] chArr=new char[len];
        for(int i =0; i<len;i++) {
        	char ch =s.charAt(i);
        	if(Character.isAlphabetic(ch)) {
        		chArr[len-1-i]=ch;
        	}else {
        		chArr[i]=ch;
        	}
        }
        System.out.println(chArr);
	}
}