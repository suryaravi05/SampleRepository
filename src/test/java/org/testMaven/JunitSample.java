package org.testMaven;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitSample extends BaseClass{


	@BeforeClass
	public static void launchBrowser() {
		launchchrome();
		loadUrl("https://www.facebook.com");
		winMax();
	}
	
	@AfterClass
	public static void closeBrowser() {
		closeTab();
	}
	
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	public void endTime() {
		System.out.println(new Date());
	}
	
	@Test
	public void tc4() {
		String curl = driver.getCurrentUrl();
		Assert.assertEquals("Verify the Url",curl.contains("https://www.facebook.com"),curl);
		System.out.println("Success");
		
	}
	
	@Test
	public void tc1() {
		String title = driver.getTitle();
		Assert.assertTrue("Verify the title", title.contains("Facebook"));
		System.out.println("Success");
	}
	@Ignore
	@Test
	public void tc3() {
		System.out.println("test case 3");
	}
	@Ignore
	@Test
	public void tc2() {
		System.out.println("test case 2");
	}
	
}
