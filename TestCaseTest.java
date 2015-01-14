package com.sibi;

public class TestCaseTest {
	
	public TestCaseTest(){
		System.out.println("Started...");
		WasRun test = new WasRun("testMethod");
		assert !test.getWasRun();
		test.run();
		assert test.getWasRun();
	}


	public static void main(String args[]) {
		new TestCaseTest();
	}
}
