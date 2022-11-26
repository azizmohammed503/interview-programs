package com.multithread;

public class Emp {
	private String EmpNo ="";
	private String EmpName ="";
	private String EmpSalary ="";
	
	public String getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(String empNo) {
		EmpNo = empNo;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(String empSalary) {
		EmpSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Emp [EmpNo=" + EmpNo + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
	}
	
}
