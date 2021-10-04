package com.example.demo;

public class Studentdetails {
	
	private String name;
	private int sno;
	private String std;
	private String sec;
	private String school;
	
	
	
	public Studentdetails(String name, int sno,String std, String sec, String school) {
		super();
		this.name = name;
		this.sno = sno;
		this.std = std;
		this.sec = sec;
		this.school = school;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
	
	/*
	 * @Override public String toString() { return "Studentdetails [name=" + name +
	 * ", sno=" + sno + ", std=" + std + ", sec=" + sec + ", school=" + school +
	 * "]"; }
	 */

}
