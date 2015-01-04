package com.sibi;

public class TestCaseTest {
	
	public TestCaseTest(){
		testTemplateMethod();
		testResult();
		testFailedResult(); 
		testFailedResultFormatting();
	}
	public void testTemplateMethod() {
		WasRun test = new WasRun("testMethod");
		test.run();
		assert ("setUp testMethod tearDown ".equals(test.getLog()));
	}

	public void testResult() {
		WasRun test = new WasRun("testMethod");
		TestResult result = test.run();
		assert ("1 run: 0 failed".equals(result.summary()));
	}

	public void testFailedResult() {
		WasRun test = new WasRun("testBrokenMethod");
		TestResult result = test.run();
		assert ("1 run: 1 failed".equals(result.summary()));
	}

	public void testFailedResultFormatting() {
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		assert ("1 run: 1 failed" == result.summary());
	}

	public static void main(String args[]) {
	   new TestCaseTest();
	   System.out.println("Done");		
	}
}