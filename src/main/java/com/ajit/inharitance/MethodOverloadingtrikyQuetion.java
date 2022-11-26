package com.ajit.inharitance;

public class MethodOverloadingtrikyQuetion {

	public void m1(String str,Integer i){
		System.out.println("String str,Integer i");
		
	}
    public void m1(Integer i, String str){
		System.out.println("Integer i String str");
		
	}
    
	public static void main(String[] args) {
		MethodOverloadingtrikyQuetion m=new MethodOverloadingtrikyQuetion();
		m.m1("", 2);

	}

}
