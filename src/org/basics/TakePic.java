package org.basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.selenium.Day1;

public class TakePic extends Day1
{
	static int i=1;
	public static void takePic() throws InterruptedException, IOException
	{
		
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(".//Screenshot//pic"+i+".png"));
		Thread.sleep(2000);
		i++;
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		launchBrowser();
		
		url("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		TakePic.takePic();
		
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		
		TakePic.takePic();
		
	}

}
