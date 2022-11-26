package com.multithread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ReadMultiFileData implements Callable<String> {
	private String fileName = "";

	public ReadMultiFileData(String string) {
		this.fileName = string;
	}

	public String call() throws Exception {
		Thread.sleep(100);
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName + ".pdf"), 10);
			line = br.readLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return line;
	}

	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(100);
		List<Emp> empList = new ArrayList<Emp>();
		long startTime = System.currentTimeMillis();
		// Create MyCallable instance
		Set<ReadMultiFileData> readMultiFileDataObj = new HashSet<>();
		for (int i = 0; i < 1000; i++) {
			readMultiFileDataObj.add(new ReadMultiFileData("D://JUnit-test-cases//test-files//abc" + i));
		}
		List<Future<String>> futures =  executor.invokeAll(readMultiFileDataObj);
		long end = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.println("Execution time is " + formatter.format((end - startTime) / 1000d) + " seconds");
		
		
		for (Future<String> future : futures) {
			String[] str = future.get().split(" ");
			Emp emp = new Emp();
			emp.setEmpNo(str[1].trim());
			emp.setEmpName(str[3].trim());
			emp.setEmpSalary(str[5].trim());
			empList.add(emp);
			 
		}
		//dispalyAllEmp(empList);
		findEmp("22", empList);
		// shut down the executor service now
		executor.shutdown();
	}

	
	
	private static void findEmp(String str, List<Emp> empList) {
		System.out.println("All Employees -----"+empList.size());
		for (Emp emp : empList) {
			if (emp.getEmpNo().equalsIgnoreCase(str)) {
				System.out.println(str+" emp detais------- ----");
				System.out.println(
						"EmpNo " + emp.getEmpNo() + " EmpNnme " + emp.getEmpName() + " Salary " + emp.getEmpSalary());
				break;
			}
		}
	}

	private static void dispalyAllEmp(List<Emp> empList) {
		// TODO Auto-generated method stub
		for (Emp emp : empList) {
			System.out.println(
					"EmpNo " + emp.getEmpNo() + " EmpNnme " + emp.getEmpName() + " Salary " + emp.getEmpSalary());
		}
	}

}