package com.java8.stream;

public class Employee {
	
	private Integer eid;
	private String ename;
	private Double esal;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(Integer eid, String ename, Double esal, String dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.dept = dept;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getEsal() {
		return esal;
	}

	public void setEsal(Double esal) {
		this.esal = esal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee {eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", dept=" + dept + "}";
	}
	
	

}
