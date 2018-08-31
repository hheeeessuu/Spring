package com.dto;

public class EmpDTO {
	
	private int empno;
	private String ename;
	private int salary;

	@Override
	public String toString() {
		return "EmpDTO [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	public EmpDTO(int empno, String ename, int salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	public EmpDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	

}
