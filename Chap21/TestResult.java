package com.sibi;

public class TestResult {
	Integer runCount;

	public TestResult() {
		runCount = 0;
	}

	public void testStarted() {
		runCount++;
	}

	public String summary() {
		return runCount + " run: 0 failed";
	}
}