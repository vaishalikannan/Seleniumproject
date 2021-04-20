package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Rbt extends Day1{
	
	public void rbt() throws AWTException, InterruptedException
	{
		Robot rt = new Robot();
		Thread.sleep(5000);
		rt.keyPress(KeyEvent.VK_0);
		Thread.sleep(5000);
		rt.keyRelease(KeyEvent.VK_0);
		Thread.sleep(5000);
		driver.close();
	}

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		Rbt r= new Rbt();
		r.rbt();
		Thread.sleep(2000);
		
		launchBrowser();
		url("https://www.flipkart.com/");

	}

}
