package com.sibi;

public class TestCaseTest extends TestCase {
	

	public static void main(String args[]) {
		System.out.println("Starting...");
		new TestCaseTest("testRunning");
		new TestCaseTest("testSetUp");
		System.out.println("Ended");
		
	}
	
	public TestCaseTest(String name) {
		super(name);
		run();
	}

	public void setUp() {
		test = new WasRun("testMethod");
	}

	public void testRunning() {
		run();
		assert test.getWasRun();
	}

	public void testSetUp() {
		run();
		assert (test.getWasSetUp());
	}

	WasRun test = null;
}
