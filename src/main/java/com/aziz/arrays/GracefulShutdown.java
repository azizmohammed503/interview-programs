package com.aziz.arrays;

import java.io.IOException;

public class GracefulShutdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str=new String[]{"jit","Ajit"};
		System.out.println(str.length);
		//HardShutdown
		//Runtime.getRuntime().halt(1);
		//System.out.println("After halt");
		
		//GracefulShutdown
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run () {
				System.out.println("Test shutdown hook");
			}
		});

		//HardShutdown
		//System.exit(0);
		System.out.println("After exit");
		
		//https://www.java2novice.com/java_interview_questions/runtime-system-class/
		
	}

}
