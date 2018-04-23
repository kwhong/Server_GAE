package com.ddsoftlab.testApp.common;

public class TestClass {

	private String test1;
	private String test2;
	
	public TestClass() {
		this.test1 = "Test1";
		this.test2 = "Test2";
	}
	
	public String getTest1() {
		return this.test1;
	}
	
	public String getTest2() {
		return this.test2;
	}

	public void setTest1(String str) {
		this.test1 = str;
	}
	
	public void setTest2(String str) {
		this.test2 = str;
	}
}
