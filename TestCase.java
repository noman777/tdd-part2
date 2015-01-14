package com.sibi;

import java.lang.reflect.Method;

public abstract class TestCase {
	protected String name = null;

	public TestCase(String name) {
		this.name = name;
	}

	public void run(TestResult result) {
		try {
			result.testStarted();
			setUp();
			Method method = this.getClass().getDeclaredMethod(this.name);
			method.invoke(this);
		}
		catch (Exception e) {
			result.testFailed();
		} finally {
			tearDown();
		}
	}
	

	abstract public void setUp();
	abstract public void tearDown();
}