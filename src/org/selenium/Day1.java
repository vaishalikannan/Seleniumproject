package org.selenium;



import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	public static  WebDriver driver;  	

	public static  void launchBrowser()
	{
		String path=".//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}
	public static void url(String u) 
	{
		  driver.get(u);
		  driver.manage().window().maximize();
	}


	public static void main(String[] args) throws InterruptedException,IOException,AWTException
	
	{
		launchBrowser();
		url("https://www.flipkart.com/");
		
		
		
	}

}
