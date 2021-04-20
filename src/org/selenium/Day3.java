package org.selenium;

import org.openqa.selenium.By;


public class Day3 extends Day2{

	public void simpleData()
	{
		//driver.findElement(By.name("email")).sendKeys("vaishalithangamK@gmail.com");
		//driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/form/div[1]/div[1]/input"))
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("O@positive");
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/form/div[1]/div[2]/div[1]/input")).sendKeys("O@positive");
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		
		
	}

	public static void main(String[] args)

	{
		Day3  b = new Day3();
		b.launchBrowser();
		b.url();
		b.simpleData();
	}

}
