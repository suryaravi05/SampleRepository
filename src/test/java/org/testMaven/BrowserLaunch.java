package org.testMaven;



import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunch extends BaseClass {

	public static void main(String args[]) throws AWTException {
		
		launchchrome();
		
		loadUrl("https://www.facebook.com");
		
		winMax();
		
		printTitle();
		
		printUrl();
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Surya");
		
		doubleClick(txtUser);
//		keyPress(KeyEvent.VK_DOWN);
//		keyRelese(KeyEvent.VK_DOWN);
		
		
		
		
//		Actions a =new Actions(driver);
//		
//		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
//		cursorMove(courses);
//		
//		WebElement contentClick = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
//		cursorMove(contentClick);
//
//		WebElement btnClick = driver.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
//		cursorClick(btnClick);
		
		
		
		
//		WebElement simple= driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
//		btnClick(simple);
//		
//		acceptAlert();
		
//		WebElement findElement = driver.findElement(By.id("email"));
//		value(findElement,"surya");
//		
//		WebElement findElement_1 = driver.findElement(By.id("pass"));
//		value(findElement_1,"Sakthisurya");
//		
//		WebElement btnclick = driver.findElement(By.xpath("//button[@name='login']"));
//		btnClick(btnclick);
		
		
		
		
	}
}
