package com.multithread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SearchWordIn1000FilesBestWay implements Callable<Map<String, Map<String, Map<String, Integer>>>> {
	private String fileName = "";
	private String serachWord  = "";
	public SearchWordIn1000FilesBestWay(String string, String string2) {
		this.fileName = string;
		this.serachWord = string2;
	}

	public Map<String, Map<String, Map<String, Integer>>> call() throws Exception {
		Thread.sleep(100);
		String line = "";
		Map<String, Map<String, Map<String, Integer>>> wordserach = new HashMap<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName), 10);
			Map<String, Map<String, Integer>> filemap = new HashMap<>();
			Map<String, Integer> wordlinemap = new HashMap<>();
			while ((line = br.readLine()) != null) {
				if (line.contains(serachWord)) {
					if(wordlinemap.keySet().contains(serachWord)) {
						wordlinemap.put(line, wordlinemap.get(line)+1);
					}else {
					wordlinemap.put(line, 1);
					}
					filemap.put(fileName + ".txt", wordlinemap);
					wordserach.put("wordserach", filemap);
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (!wordserach.isEmpty()) {
			return wordserach;
		}
		return wordserach;
	}

	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(500);
		List<Emp> empList = new ArrayList<Emp>();
		long startTime = System.currentTimeMillis();
		// Create MyCallable instance
		Set<SearchWordIn1000FilesBestWay> readMultiFileDataObj = new HashSet<>();
		File f = new File("D://JUnit-test-cases//test-files//");
		if(f.isDirectory()) {
			for(String fileNmae:f.list()) {
				readMultiFileDataObj.add(new SearchWordIn1000FilesBestWay("D://JUnit-test-cases//test-files//"+fileNmae,"Mohammed"));
			}
			
		}
		List<Future<Map<String, Map<String, Map<String, Integer>>>>> futures =  executor.invokeAll(readMultiFileDataObj);
		long end = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.println("Execution time is " + formatter.format((end - startTime) / 1000d) + " seconds");
		
		
		for (Future<Map<String, Map<String, Map<String, Integer>>>> future : futures) {
			Map<String, Map<String, Map<String, Integer>>> str =future.get();
			if(str != null) {
			System.out.println(str);
			}
		}
		
		//dispalyAllEmp(empList);
		//findEmp("22", empList);
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