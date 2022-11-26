package com.aziz.junit;

public class Exceptioncase {

	public String throwExcetion() {
		if(true) {
			 throw new NullPointerException();
		}
		return null;
	}
}
