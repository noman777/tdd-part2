package com.sibi;

public class WasRun extends TestCase {
	private Boolean wasRun = false;
	private Boolean wasSetUp = false;

	public WasRun(String name) {
		super(name);
		this.wasRun = false;
	}

	public Boolean getWasRun() {
		return wasRun;
	}

	public void setUp() {
		wasRun = false;
		wasSetUp = true;
	}

	public void testMethod() {
		wasRun = true;
	}

	public Boolean getWasSetUp() {
		return wasSetUp;
	}
}
