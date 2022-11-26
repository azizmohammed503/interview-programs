package com.aziz.arrays;

public class EmpSort {

	private int id;
	private String name;
	private Integer salary;

	public EmpSort(int id, String string, int sal) {
		this.id = id;
		this.name = string;
		this.salary = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp3 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
