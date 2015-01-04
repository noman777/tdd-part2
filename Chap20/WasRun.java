package com.sibi;

public class WasRun extends TestCase {
	private String log;

	public WasRun(String name) {
		super(name);
	}

	public String getLog() {
		return log;
	}

	@Override
	public void setUp() {
		log = "setUp ";
	}

	public void testMethod() {
		log = log + "testMethod ";
	}

	@Override
	public void tearDown() {
		log = log + "tearDown ";
	}
}
