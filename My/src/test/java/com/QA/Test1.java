package com.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {

	
	@Test
	public void setup()
	{
		WebDriver driver =new FirefoxDriver(); //Open firefox driver
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-server/2.53.0");
		driver.quit();
	}
	
	
}
