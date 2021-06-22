package com.example.helorestwithgradle.employee;

public class EmployeeRequest{
	private String fname;
	private String lname;

	public String getFname(){
		return fname;
	}

	public String getLname(){
		return lname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}
