package org.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.selenium.Day1;

public class JsExecu extends Day1 {
	
	public void jsEx() throws InterruptedException
	{
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		WebElement retrn = driver.findElement(By.linkText("Return Policy"));
		je.executeScript("arguments[0].scrollIntoView();", retrn);
		Thread.sleep(2000);
		driver.close();
		
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		JsExecu e = new JsExecu();
		
		launchBrowser();
		url("https://www.flipkart.com/");
		Thread.sleep(2000);
		e.jsEx();
		
		

	}

}
