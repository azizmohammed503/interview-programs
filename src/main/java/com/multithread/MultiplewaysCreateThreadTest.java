package com.multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Extend the java.lang.Thread class'
class MultiplewaysCreateThreadTest extends Thread {

	// method where the thread execution will start
	public void run() {
		System.out.println("Thread is from extends Thread ==> " + Thread.currentThread().getName());
	}

	// let’s see how to start the threads
	public static void main(String[] args) {
		Thread t1 = new MultiplewaysCreateThreadTest();
		t1.start(); // this starts the 2nd thread. This calls the run() method.
		
		Thread t = new Thread(new MultiplewaysCreateThreadTest(), "My thread");
		t.start();
		
		MultiplewaysCreateThreadTest th = new MultiplewaysCreateThreadTest();
		th.start();

	}
}


// Implement the java.lang.Runnable interface
class UseRunnableInterf implements Runnable {

	public void run() {
		System.out.println("Thread is from implements Runnable ==> " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new UseRunnableInterf(), "Runnable");
		t1.start();
	}

}


// Implement the java.util.concurrent.Callable interface
class Counter implements Callable<String> {

	private static final int THREAD_POOL_SIZE = 2;

	// method where the thread execution takes place
	public String call() {
		return Thread.currentThread().getName() + " executing ...";
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// create a pool of 2 threads
		ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

		Future future1 = executor.submit(new Counter());
		Future future2 = executor.submit(new Counter());

		System.out.println(Thread.currentThread().getName() + " executing ...");

		// asynchronously get from the worker threads
		System.out.println(future1.get());
		System.out.println(future2.get());

	}
}

//By using anonymous inner class
class AnonymousThread {

	public static void main(String[] args) {
		
		 Thread trd1 = new Thread("My Thread 1") {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " executing ...");
			}
		};
		trd1.start();
	}
}
