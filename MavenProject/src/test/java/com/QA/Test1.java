package com.QA;


import org.testng.annotations.Test;

public class Test1 extends CrossBrowserTest {

	@Test
	public void setup()
	{
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-server/2.53.0");
		driver.close();
	}
	
	
	
	
}
