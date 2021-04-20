package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestAndQuiz  extends Day1 
{

	public void dragDrop() throws InterruptedException
	
	{
		Actions aa = new Actions(driver);
		
	//	WebElement ddclickks = driver.findElement(By.xpath("//div/h1"));
	//	aa.doubleClick(ddclickks);
		
		//WebElement framename = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		//driver.switchTo().frame(framename);
		Thread.sleep(5000);
		
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.xpath("//li/h5"));
		
		WebElement drop = driver.findElement(By.id("trash"));
		
		aa.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("Accepted Elements")).click();
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException
	
	{
		TestAndQuiz t = new TestAndQuiz();
		launchBrowser();
		url("https://www.globalsqa.com/demo-site/draganddrop");
		t.dragDrop();

	}

}
