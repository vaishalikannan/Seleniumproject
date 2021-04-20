package org.alertfunc;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium.Day1;

public class AlertFunction extends Day1{


	public void alrt() throws InterruptedException

	{
		WebElement generateclick = driver.findElement(By.xpath("(//button)[3]"));
		String text1 = generateclick.getText();
		System.out.println(text1);
		generateclick.click();
		Thread.sleep(2000);
		String alert1 = driver.switchTo().alert().getText();
		System.out.println(alert1);
		Thread.sleep(2000);
			Alert o = driver.switchTo().alert();// Alert o = (Alert) driver;
			o.accept();
		//driver.switchTo().alert().accept();
		Thread.sleep(2000);

		WebElement confirmalert = driver.findElement(By.xpath("(//button)[4]"));
		String text2 = confirmalert.getText();
		System.out.println(text2);
		confirmalert.click();
		Thread.sleep(2000);
		String alert2 = driver.switchTo().alert().getText();
		System.out.println(alert2);
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
			o.dismiss();
		Thread.sleep(2000);
		driver.close();
	}
	
	public void buttons() throws InterruptedException
	{
		WebElement male = driver.findElement(By.xpath("//input[@id='male']"));
		try
		{
			male = driver.findElement(By.xpath("//input[@id='males']"));
		}
		catch(Exception e)
		{
			male = driver.findElement(By.xpath("//input[@id='male']"));
		}
		//WebElement female = driver.findElement(By.xpath("//input[@id='female']"));
		WebDriverWait oo = new WebDriverWait(driver, 5);//11- exception ( every 30 milli sec)
		//oo.until(ExpectedConditions.visibilityOf(female)).click();  //90 % 
		oo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='female']"))).click();
		Thread.sleep(5000);   // wait for 5 sec
		
		male.click();
		Thread.sleep(5000);
		//female.click();
		WebElement auto = driver.findElement(By.xpath("(//form/input)[3]"));
		WebElement perf = driver.findElement(By.xpath("(//form/input)[4]"));
		auto.click();  //check
		Thread.sleep(5000);
		perf.click();  //check
		Thread.sleep(5000);
		auto.click();   //uncheck
		
		String attribute = auto.getAttribute("value");
		if(attribute=="0")  //off or not ( to check the attribut of xpath)
		{
			auto.click();
		}

	}

	public static void main(String[] args) throws InterruptedException {
		AlertFunction a = new AlertFunction();
		launchBrowser();
		url("https://www.testandquiz.com/selenium/testing.html");
		a.alrt();
		//a.buttons();

	}

}
