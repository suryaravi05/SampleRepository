package org.testMaven;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static Alert b;
	public static JavascriptExecutor js;
	public static Select s;
	
	
	public static void launchchrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	public static void winMin() {
		driver.manage().window().setPosition(new Point(0,-100));
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void winMax(){
		driver.manage().window().maximize();
	}
	
	public static void fullScreen() {
		driver.manage().window().fullscreen();
	}
	
	public static void closeTab() {
		driver.close();
	}
	
	public static void exitBrowser() {
		driver.quit();
	}
	public static void printTitle() {
		String printTitle=driver.getTitle();
		System.out.println(printTitle);	
	}
	
	public static void printUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void value(WebElement ref , String value) {
		ref.sendKeys(value);
	}
	
	public static void btnClick(WebElement ref) {
		ref.click();
	}
	
	public static void gettext(WebElement ref) {
		String text = ref.getText();
		System.out.println(text);
	}
	
	public static void getAttr(WebElement ref, String value) {
		String val = ref.getAttribute(value);
		System.out.println(val);
	}
	
	public static void threadSleep(long millis) throws InterruptedException{
		Thread.sleep(millis);
	}
	
	public static void cursorMove(WebElement ref) {
		a = new Actions(driver);
		a.moveToElement(ref).perform();
	}
	
	public static void cursorClick(WebElement ref){
		a = new Actions(driver);
		a.moveToElement(ref).click().perform();		
	}
	
	public static void dragdrop(WebElement ref_1,WebElement ref_2) {
		a.dragAndDrop(ref_1, ref_2).perform();
	}
	
	public static void doubleClick(WebElement ref) {
		a = new Actions(driver);
		a.doubleClick(ref).perform();
	}
	
	public static void contextClick(WebElement ref) {
		a = new Actions(driver);
		a.contextClick(ref).perform();
	}
	
	public static void keyPress(int kcode) throws AWTException {
		r= new Robot();
		r.keyPress(kcode);
	}
	
	public static void keyRelese(int kcode) throws AWTException {
		r= new Robot();
		r.keyRelease(kcode);
	}
	
	public static void acceptAlert() {
		b = driver.switchTo().alert();
		b.accept();
	}
	
	public static void dismissAlert() {
		b = driver.switchTo().alert();
		b.dismiss();
	}
	
	public static void alertValue(String value) {
		b = driver.switchTo().alert();
		b.sendKeys(value);
	}
	
	public static void alertGetText() {
		b = driver.switchTo().alert();
		System.out.println(b.getText());
	}
	
	public static void screenShot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File f= new File("");
		FileUtils.copyFile(src, f);
	}
	
	public static void selectframe(int value) {
		driver.switchTo().frame(value);
	}

	public static void selectframe(String value) {
		driver.switchTo().frame(value);
	}
	
	public static void selectframe(WebElement value) {
		driver.switchTo().frame(value);
	}
	
	public static void defaultFrame() {
		driver.switchTo().defaultContent();
	}
	
	public static void prentFrame() {
		driver.switchTo().parentFrame();
	}
	
	public static void getWinValue(String value) {
		driver.switchTo().window(value);
	}
	
	public static void selectValue(WebElement ref,String value) {
		s =new Select(ref);
		s.selectByValue(value);
	}
	
	public static void deselectValue(WebElement ref,String value) {
		s =new Select(ref);
		s.deselectByValue(value);
	}
	
	public static void visibleTextValue(WebElement ref,String text) {
		s =new Select(ref);
		s.selectByVisibleText(text);
	}
	
	public static void devisibleTextValue(WebElement ref,String text) {
		s =new Select(ref);
		s.deselectByVisibleText(text);
	}
	
	public static void selectIndex(WebElement ref,int index) {
		s =new Select(ref);
		s.selectByIndex(index);
	}
	
	public static void deselectIndex(WebElement ref,int index) {
		s =new Select(ref);
		s.deselectByIndex(index);
	}
	
	public static void deselectAll(WebElement ref) {
		s= new Select(ref);
		s.deselectAll();
	}
	
	public static void selectMultiple(WebElement ref) {
		s =new Select(ref);
		System.out.println(s.isMultiple());
	}
	
	public static void getvalue(WebElement ref) {
		ref.isSelected();
	}
	
	public static void getTableVal(List ref, int val) {
		ref.get(val);
	}
}
