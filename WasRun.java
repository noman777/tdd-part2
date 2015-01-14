package com.sibi;



public class WasRun extends TestCase {
	private Boolean wasRun = false;

	public WasRun(String name) {
		super(name);
		this.wasRun = false;
	}

	public Boolean getWasRun() {
		return wasRun;
	}

	public void testMethod() {
		wasRun = true;
	}
}
