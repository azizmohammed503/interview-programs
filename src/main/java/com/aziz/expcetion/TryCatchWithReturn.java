package com.aziz.expcetion;

public class TryCatchWithReturn {
	
	public String retTry() {
		try {
			System.out.println("try");
			//int a = 100/0;
            return "return try";
		} catch (Exception e) {
			System.out.println("catche"+e);
			return "return catch";
		} finally {
			System.out.println("finally");
			return "return finally";
		}
		//return "last";
	}

	public static void main(String[] args) {

		TryCatchWithReturn tryCatchWithReturn = new TryCatchWithReturn();
		System.out.println(tryCatchWithReturn.retTry());
	}

}
