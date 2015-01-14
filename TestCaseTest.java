package com.sibi;

public class TestCaseTest {
	
	public TestCaseTest(){
		testTemplateMethod();
	}
	
	public void testTemplateMethod() {
		WasRun test = new WasRun("testMethod");
		test.run();
		assert ("setUp testMethod tearDown ".equals(test.getLog()));
		System.out.println("Ended");
	}

	public static void main(String args[]) {
		new TestCaseTest();	
	}
}
