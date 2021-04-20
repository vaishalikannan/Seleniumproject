package org.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.selenium.Day1;

public class BasicsOfMouse extends Day1

{
	public void basics() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		
		WebElement viewall = driver.findElement(By.xpath("(//a[text()='VIEW ALL'])[1]"));
		a.click(viewall).build().perform();
		Thread.sleep(4000);
		
		WebElement Context = driver.findElement(By.linkText("Best Selling Laptops"));
		a.contextClick(Context).build().perform();
	}
	
	public static void main(String[] args) throws InterruptedException  
	{
		BasicsOfMouse bc = new BasicsOfMouse();
		launchBrowser();
		url("https://www.flipkart.com/");
		bc.basics();



	}

}
