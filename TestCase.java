package com.sibi;


import java.lang.reflect.Method;

public class TestCase {
	protected String name = null;

	public TestCase(String name) {
		this.name = name;
	}

	public void run() {
		try {
			Method method = this.getClass().getDeclaredMethod(this.name);
			method.invoke(this);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}