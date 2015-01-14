package com.sibi;

import java.lang.reflect.Method;

public abstract class TestCase {
	protected String name = null;

	public TestCase(String name) {
		this.name = name;
	}

	public TestResult run() {
		TestResult result = null;
		try {
			result = new TestResult();
			result.testStarted();
			setUp();
			Method method = this.getClass().getDeclaredMethod(this.name);
			method.invoke(this);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return result;
	}
	

	abstract public void setUp();
	abstract public void tearDown();
}