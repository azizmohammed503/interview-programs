package com.core;

public class ShutdownHook {

	public static void main(String[] args) {
	
		//Greceful shutdown
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run () {
				System.out.println("Test shutdown hook");
			}
		});
		
		//forceful shutdown
		Runtime.getRuntime().halt(0);
		//System.out.println("After halt");
		
		// 987897 kill -9 forceful shutdown
		
		//Greceful shutdown
		System.exit(0); // sucessfull shutdown
		System.exit(1); // unsucessfull exeption
		System.exit(-1); // unsucessfull error
		System.out.println("After exit");
		
	}
}
