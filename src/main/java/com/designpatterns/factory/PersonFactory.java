package com.designpatterns.factory;

public class PersonFactory {

	public static Person getInstance(String name) {
		if("Male".equals(name)) {
			return new Male();
		}else if("Female".equals(name)) {
			return new Female();
		}
		return null;
	}
}
