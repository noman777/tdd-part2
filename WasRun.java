package com.sibi;

public class WasRun extends TestCase {
	private String log;

	public WasRun(String name) {
		super(name);
	}

	public String getLog() {
		return log;
	}	

	public void testMethod() {
		log = log + "testMethod ";
	}

	public void testBrokenMethod() throws Exception {
		throw new Exception("Broken Method");
	}

	@Override
	public void setUp() {
		log = "setUp ";
	}
	
	@Override
	public void tearDown() {
		log = log + "tearDown ";
	}
}