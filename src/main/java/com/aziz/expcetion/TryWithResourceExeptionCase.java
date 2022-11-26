package com.aziz.expcetion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourceExeptionCase {

	public static void main(String[] args) {
		BufferedReader buff1=null;
		String str ="";
		try(
				BufferedReader buff= new BufferedReader(new FileReader(new File("D:/test")));
				){
			 buff.readLine();
		}catch (ArithmeticException e) {
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
