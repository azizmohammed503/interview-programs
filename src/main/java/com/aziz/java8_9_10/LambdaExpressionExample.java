package com.aziz.java8_9_10;

interface Drawable {
	public void draw();
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		final int width = 10;

		// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();
		
		 //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
        
        
        Drawable s = () -> {
        	System.out.println("I have nothing to say.");
		};
		s.draw();
	}
}