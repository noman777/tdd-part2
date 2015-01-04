package com.sibi;

import java.lang.reflect.Method;

public abstract class TestCase {
	protected String name = null;
	abstract public void setUp();
	
	public TestCase(String name) {
		this.name = name;
	}

	public void run() {
		try {
			setUp();
			Method method = this.getClass().getDeclaredMethod(this.name);
			method.invoke(this);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}