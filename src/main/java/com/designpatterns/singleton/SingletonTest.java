package com.designpatterns.singleton;

public class SingletonTest {

	/// Singleton test
	public static void main(String[] args) {
		MySingleton singleton = MySingleton.getInstance();
		MySingleton singleton1 = MySingleton.getInstance();
		if(singleton == singleton1) {
			System.out.println("same refrence");
		}
		singleton.getMessage();
	}
}
