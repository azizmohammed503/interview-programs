package com.aziz.string;

// Java program to calculate sum of all numbers present
// in a string containing alphanumeric characters
class StringWithDigites {

	// Function to calculate sum of all numbers present
	// in a string containing alphanumeric characters
	static int findSum(String str) {
		// A temporary string
		String temp = "0";
		String output = "";
		// holds sum of all numbers present in the string
		int sum = 0;
		// read each character in input string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// if current character is a digit
			if (Character.isDigit(ch))
				temp += ch;
			// if current character is an alphabet
			else {
				// increment sum by number found earlier
				// (if any)
				sum += Integer.parseInt(temp);
				//output += sum+""+ch;
				// reset temporary string to empty
				temp = "0";
			}
		}
		// atoi(temp.c_str()) takes care of trailing
		// numbers
		System.out.println(output);
		return sum + Integer.parseInt(temp);
	}

	// Driver code
	public static void main(String[] args) {

		// input alphanumeric string
		String str = "2abc20yz2";

		// Function call
		System.out.println(findSum(str));
	}
}


// This code is contributed by AnkitRai01