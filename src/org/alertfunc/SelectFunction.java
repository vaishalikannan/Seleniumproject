package org.alertfunc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.selenium.Day1;

public class SelectFunction extends Day1
{
	public void slct() throws InterruptedException
	{
		WebElement dropdown = driver.findElement(By.id("testingDropdown"));

		Select o = new Select(dropdown);

		Thread.sleep(5000);
		o.selectByIndex(0);
		Thread.sleep(5000);
		o.selectByValue("Performance");
		Thread.sleep(5000);
		o.selectByVisibleText("Performance Testing");
		Thread.sleep(5000);
		//o.deselectByVisibleText("Performance Testing");
		//Thread.sleep(5000);
		//o.deselectByValue("Performance");
		//	Thread.sleep(5000);
		//	o.deselectByIndex(0);
		//	Thread.sleep(5000);
		List<WebElement> options = o.getOptions();
		for (WebElement eachone : options) {
			String text = eachone.getText();
			System.out.println(text);
			
		}

		driver.close();
	}

	public static void main(String[] args) throws InterruptedException 
	{
		SelectFunction s = new SelectFunction();
		launchBrowser();
		url("https://www.testandquiz.com/selenium/testing.html");
		s.slct();

	}

}
