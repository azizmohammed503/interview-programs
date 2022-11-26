package com.junit;

public class PrivateTest {
	private String id;
	private Emp emp= new Emp();

	
	private Integer addMethod(Integer a, Integer b) {
		return a + b;
	}
	public PrivateTest(String id) {
		this.id = id;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	
}
