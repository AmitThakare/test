package com.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	public WebDriver driver;
	
	@BeforeClass
	@Parameters("Browser")
		public void ParallelTestExecute(String Browser)
	{
		if(Browser.equalsIgnoreCase("Firefox"))
				{
					driver=new FirefoxDriver();
					System.out.println("Firefox browser open");
				}
		else if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation jar files\\Driver files\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Chrome browser open");
		}
	}
	
	
	@Test
	public void setup()
	{
	
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-server/2.53.0");
		driver.quit();
	}
	
	
}
