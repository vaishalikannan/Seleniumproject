package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static WebDriver driver;

	public void launchBrowser()
	{
		String path =".//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}
	public void url()
	{
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

	}
	public void verify()
	{
		String currentUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(currentUrl);
		System.out.println(title);
	}

	public void login()

	{
		driver.findElement(By.name("email")).sendKeys("vaishalithangamk@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("O@positive");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.linkText("Forgotten Password")).click();

	}

	
	
	public static void main(String[] args)
	
	{
		Day2 a = new Day2();
		a.launchBrowser();
		a.url();
		a.verify();
		a.login();

	}

}
