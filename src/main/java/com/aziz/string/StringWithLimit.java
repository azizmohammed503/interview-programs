package com.aziz.string;

public class StringWithLimit {

	public static void main(String[] args) {
		String myString = "there,,are,more,than,three,commas,,,";
		String [] splitStrings = myString.split(",", 6);

		for(String string : splitStrings){
		    System.out.println(String.format(" \" %s \"", string));
		}
	}

}
