package com.multithread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
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

public class ReadBigFile implements Callable<String> {

	 private int[] frequencies = new int[256];
	    private MappedByteBuffer mbb;
	    byte[] buffer;
	    int remaining;
	    public ReadBigFile(int remaining, byte[] buffer, MappedByteBuffer mbb2) {
	    	this.remaining=remaining;
	    	this.buffer=buffer;
	    	  this.mbb = mbb;
		}

		public String call() throws UnsupportedEncodingException
	    {
	        System.out.println("Thread " + Thread.currentThread().getName() + "start");
	        mbb.get(buffer, 0, remaining);
	        String content = new String(buffer, "ISO-8859-1");
	        System.out.println("Thread " + Thread.currentThread().getName() + "finished");

	        return content.toString();
	    }

	public static void main(String args[]) throws InterruptedException, ExecutionException, IOException {

        // variables to hold options 
        int numberOfThreads = 1;
		ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
		List<Emp> empList = new ArrayList<Emp>();
		long startTime = System.currentTimeMillis();
		
		// read file
        RandomAccessFile raf = new RandomAccessFile("D://websites//java8//interview-programs//abcAziz.txt", "r");
        MappedByteBuffer mbb = raf.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, raf.length());

        Set<Future<String>> set = new HashSet<Future<String>>();
        Set<ReadBigFile> readBigFile = new HashSet<>();
        long chunkSize = raf.length() / numberOfThreads;
        byte[] buffer = new byte[(int) chunkSize];

        while(mbb.hasRemaining())
        {
            int remaining = buffer.length;
            if(mbb.remaining() < remaining)
            {
                remaining = mbb.remaining();
            }
           
            //System.out.println(content);
            @SuppressWarnings("unchecked")
            Callable<String> callable = new ReadBigFile(remaining,buffer,mbb);
            readBigFile.add((ReadBigFile) callable);

        }

        raf.close();
		List<Future<String>> futures = executor.invokeAll(readBigFile);
		long end = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.println("Execution time is " + formatter.format((end - startTime) / 1000d) + " seconds");

for (Future<String> future : futures) {
			String str = future.get();
			System.out.println(str);

		}
		
		executor.shutdown();
	}


	private static void dispalyAllEmp(List<Emp> empList) {
		// TODO Auto-generated method stub
		for (Emp emp : empList) {
			System.out.println(
					"EmpNo " + emp.getEmpNo() + " EmpNnme " + emp.getEmpName() + " Salary " + emp.getEmpSalary());
		}
	}

}
 