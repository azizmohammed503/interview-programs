/*package com.multithread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ThreadReadDemo {
	static Integer fromCount = 0;

	*//**
	 * Java multithreaded reading large files
	 * 
	 * @param args
	 * @throws IOException
	 *//*
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D://a.txt");
		long lineCount = Files.lines(path).count();
		Integer threadsCount = 5;
		Integer forThread = (int) (lineCount / threadsCount);
		// System.out.println(lineCount);
		// System.out.println(forThread);

		for (int i = 1; i <= 5; i++) {
			// System.out.println(forThread * (i-1)+"-"+forThread * i);
			Thread d = new Thread(new MultiThread(forThread * (i - 1), forThread * i), "" + i);
			d.start();
		}
	}

	public ThreadReadDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

}

class MultiThread implements Runnable {
	private static BufferedReader br = null;
	private List<String> list;
	private int startLine = 0;
	private int endLine = 0;

	static {
		try {
			br = new BufferedReader(new FileReader("D://a.txt"), 10);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public MultiThread(Integer startLine, Integer endLine) {
		this.startLine = startLine;
		this.endLine = endLine;
	}

	public void run() {
		String line = null;
		int count = 0;
		System.out.println("Thread " + Thread.currentThread().getName() + " ==> " + startLine + "-" + endLine);
		this.list = new ArrayList<String>();
		try {
			for (int i = startLine; i < endLine; i++) {
				System.out.println("Thread " + Thread.currentThread().getName() + " ==> " + i);
				Path path = Paths.get("D://a.txt");
				List<String> l=Files.readAllLines(path);
				
			}

			
			 * while ((line = br.readLine()) != null) { System.out.println(line);
			 * list.add(line); count++; }
			 

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void display(List<String> list, String string) {
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println(list.size() + "==>" + string);
	}

}*/