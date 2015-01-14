package com.sibi;

import java.lang.reflect.Method;

public abstract class TestCase {
	protected String name = null;

	public TestCase(String name) {
		this.name = name;
	}

	public void run() {
		try {
			setUp();
			Method method = this.getClass().getDeclaredMethod(this.name);
			method.invoke(this);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	abstract public void setUp();
	abstract public void tearDown();
}