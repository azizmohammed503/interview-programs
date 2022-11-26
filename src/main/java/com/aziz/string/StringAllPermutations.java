package com.aziz.string;

import java.util.Scanner;

class StringAllPermutations {

	static void permute(String s, String answer) {
		if (s.length() == 0) {
			System.out.print(answer + "  ");
			//return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String left_substr = s.substring(0, i);
			String right_substr = s.substring(i + 1);
			String rest = left_substr + right_substr;
			permute(rest, answer + ch);
		}
	}

// Driver code
	public static void main(String args[]) {
		//Scanner scan = new Scanner(System.in);

		String s;
		String answer = "";

		System.out.print("Enter the string : ");
	//	s = scan.next();

		System.out.print("\nAll possible strings are : ");
		//permute(s, answer);
		 printAllCombi("ABC","");
		
		
	}
	//String str = "ABC";
	//String res = "";
	static void printAllCombi(String str,String res){
		
		if(str.length() == 0) {
			System.out.println(res);
		}
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			String left = str.substring(0,i);
			String right = str.substring(i+1);
			String rest = left + right;
			printAllCombi(rest,res+ch);
		}
	}
}

// This code is contributed by adityapande88