package com.multithread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExcuetThreadsSequensally extends Thread {
    public ExcuetThreadsSequensally(String name) {
        super(name);
    }

    @Override
    public void run() {
		try {
    	FileWriter fw = new FileWriter("D://ThreadDemo.txt");
	    BufferedWriter bw  = new BufferedWriter(fw);
        for (int i = 0; i < 1000000; i++) {
            System.out.println("This is the line "+ getName() + ": " + i);
				bw.write("This is the line "+ getName() + ": " + i+"\n");
            try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        } catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
    
    
    
    public static void main(String args[]) throws InterruptedException {
        Thread thread1 = new ExcuetThreadsSequensally("A");
        Thread thread2 = new ExcuetThreadsSequensally("B");
        Thread thread3 = new ExcuetThreadsSequensally("C");

       /* thread1.run();
        thread2.run();
        thread3.run();*/
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }
}

