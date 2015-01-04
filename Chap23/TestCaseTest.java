package com.sibi;

public class TestCaseTest extends TestCase {
	TestResult result = null;

	public TestCaseTest(String name) {
		super(name);
	}

	@Override
	public void setUp() {
		result = new TestResult();
	}

	public void testTemplateMethod() {
		WasRun test = new WasRun("testMethod");
		test.run(result);
		assert ("setUp testMethod tearDown ".equals(test.getLog()));
	}

	public void testResult() {
		WasRun test = new WasRun("testMethod");
		test.run(result);
		assert ("1 run: 0 failed".equals(result.summary()));
	}

	public void testFailedResult() {
		WasRun test = new WasRun("testBrokenMethod");
		test.run(result);
		assert ("1 run: 1 failed".equals(result.summary()));
	}

	public void testFailedResultFormatting() {
		result.testStarted();
		result.testFailed();
		assert ("1 run: 1 failed" == result.summary());
	}

	public void testSuite() {
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		suite.run(result);
		assert ("2 run: 1 failed" == result.summary());
	}

	public static void main(String args[]) {
		TestResult result = new TestResult();
		(new TestCaseTest("testTemplateMethod")).run(result);
		(new TestCaseTest("testResult")).run(result);
		(new TestCaseTest("testFailedResult")).run(result);
		(new TestCaseTest("testFailedResultFormatting")).run(result);
		(new TestCaseTest("testSuite")).run(result);
		
	}

	@Override
	public void tearDown() {
	}
}