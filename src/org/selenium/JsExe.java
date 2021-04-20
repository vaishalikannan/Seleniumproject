package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JsExe extends Day1{
	
	public void jsExe()
	{
		WebElement user = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','vaishalithangamk@gmail.com')", user);
		js.executeScript("arguments[0].setAttribute('value','vaishuthangam')", pass);
		
		//Object executeScript = js.executeScript("return argument[0].getAttribute('value',pass");
	//	System.out.println(executeScript);
		
		js.executeScript("arguments[0].click()", login);
		driver.close();
	}
	public static void main(String[] args) 
	{
		JsExe y = new JsExe();
		
		launchBrowser();
		url("https://www.facebook.com");
		y.jsExe();
		
		
	}

}
