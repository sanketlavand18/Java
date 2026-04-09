package com.day_6;

public abstract class Employee extends Person {

	private String desg;
	private String dept;

	public Employee(int id, String name, String mob, String desg, String dept) {
		super(id, name, mob);
		this.desg = desg;
		this.dept = dept;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getDesg() {
		return desg;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public abstract void salaryCalculate();

	@Override
	public String toString() {
		return super.toString() + " desg: " + desg + " dept: " + dept;
	}
}