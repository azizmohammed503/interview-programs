package com.multithread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WriteMultiFileData implements Callable<String> {
	private String fileName = "";
    public WriteMultiFileData(String string) {
		this.fileName=string;
	}
	
	public String call() throws Exception {
		Thread.sleep(100);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("D://websites//java8//interview-programs//abcAziz" + ".txt"))) {
		//int num	= (int)(Math.random() * ((78676) + 1));
			//String content = "EmpID: VLS" + num + " EmpName: Mohamed" + fileName + " EmpSalary: " + num*2;
			int num	= (int)(Math.random() * ((9) + 1));
			int num2	= (int)(Math.random() * ((9) + 1));
			System.out.println(num);
			System.out.println(num2);
			String serachWord= "Suraj";
			String serachWord2= "";
			if(num == 9) {
				serachWord= "Mohammed Aziz";
			}
			if (fileName.contains("9")) {
				serachWord2= "Mohammed Aziz";
			}
			
		String content = "1.1 High Level overview\r\n" + 
				"Clients want to set either Adloadtype or Admodel flag in case of hybrid implementation.\r\n" + 
				"1.2 Major Function, Logic or Processing \r\n" + 
				"In order to merge adloadtype (DCR) and Admodel (DTVR) flag, we need to make changes on config file and collection code.\r\n" + 
				"\r\n" + 
				"Config 300 and config 200\r\n" + 
				" Update the  &c57 param mapping in the all DCR pings to &c57=adldf,|![nol_adLoadType||nol_linearAdLoadFlag]!| \r\n" + 
				"Update c22 param mapping to &c22=laf,|![nol_adLoadType||nol_linearAdLoadFlag]!|\r\n" + 
				"Update &cr param mapping in the DTVR ping to &cr=|!nol_tagPresence+nol_sdkDelimiter+nol_breakout+nol_sdkDelimiter+nol_tsvFlag+nol_sdkDelimiter+nol_segmentPrefix+nol_currSeg+nol_sdkDelimiter+nol_duration+nol_sdkDelimiter+[nol_adLoadType||nol_linearAdLoadFlag]!|\r\n" + 
				"Remove the default values of nol_adLoadType and nol_linearAdLoadFlag from the config file.\r\n" + 
				"Just to make sure all pings are in sync, change corresponding Facebook pings as well.Though Facebook pings are not used from browser (Config 200/300)  any more.\r\n" + 
				"CacheConfig\r\n" + 
				"Update the  &c57 param mapping in the all DCR pings to &c57=adldf,|![nol_adLoadType_content||nol_linearAdLoadFlag]!| \r\n" + 
				"		\r\n" + 
				"\r\n" + 
				"Config 150 by "+serachWord2+"\r\n" + 
				"Only modify default value of nol_linearAdLoadFlag to 1 as below. \"nol_linearAdLoadFlag\":\"1\",\r\n" + 
				"\r\n" + 
				"Collection/Harmonization Change\r\n" + 
				"Census collection, Harmonization(Cloud API) to default the nol_linearAdLoadFlag value to 1 in DTVR ping if nol_linearAdLoadFlag value received in the ping is other than 1 or 2 and even if no value is  passed.\r\n" + 
				"Census collection, Harmonization(Cloud API) to default the  nol_adLoadType value to 2 in DCR ping if nol_adLoadType value received in the ping is other than 1 or 2 and even if the no value is passed.\r\n" + 
				"Notes : Browser SDK never fires facebook ping once this solution is  implemented.All browser SDK clients should be migrated to Bundled SDK.\r\n" + 
				"Signed Off By - \r\n" + 
				"Collection -  Sanjib Acharya\r\n" + 
				"Browser SDK - Yeng Yang, Ankit Agrawal\r\n" + 
				"App SDK -"+serachWord+"\r\n" + 
				"Harmonization -  Jose Mortensen (Collections guarantees defaults are set right, work on cloud API)\r\n" + 
				"";
		  for(int i=0; i<= 1000000000; i++){
			bw.write(i+  "content");
		  }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "done";
	}
    
    public static void main(String args[]) throws InterruptedException{
    	long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(1);  
        List<WriteMultiFileData>  writeMultiFileData = new ArrayList<>();
        //Create MyCallable instance
        for(int i=0; i<= 1; i++){
        	writeMultiFileData.add(new WriteMultiFileData(""+i));
        }
		List<Future<String>> futures = executor.invokeAll(writeMultiFileData);
		long end = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.println("Execution time is " + formatter.format((end - startTime) / 1000d) + " seconds");
		
       /* for(Future<String> fut : futures){
            try {
                //System.out.println(new Date()+ "::"+fut.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
        //shut down the executor service now
        executor.shutdown();
    }

}