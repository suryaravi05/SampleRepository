package org.testMaven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngSample extends BaseClass{

	@BeforeClass
	public void launchingBrowser() {
		System.out.println("Chrome");
	}
	
	@AfterClass
	private void closingBrowser() {
		System.out.println("close");
	}
	
	@BeforeMethod
	private void startTime() {
		System.out.println("start");
	}
	
	@AfterMethod
	private void endTime() {
		System.out.println("End");
	}
	
	@Test
	public void tc1() {
		System.out.println("Test case 1");
	}
	
	@Test
	public void tc4() {
		System.out.println("Test case 4");
	}
	
	@Test
	public void tc3() {
		System.out.println("Test case 3");
	}
	@Test
	public void tc2() {
		System.out.println("Test case 2");
	}
}

