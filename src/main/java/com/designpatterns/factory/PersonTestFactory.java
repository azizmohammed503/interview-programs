package com.designpatterns.factory;

public class PersonTestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person person = PersonFactory.getInstance("Male");
      System.out.println(person.getName());
      
      Person person1 = PersonFactory.getInstance("Female");
      System.out.println(person1.getName());
	}
}
