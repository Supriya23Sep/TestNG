package com.supriya.TestNG1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG001 {
	
	public WebDriver driver;

		@Test
		public void Test1() throws InterruptedException 
		{
			
			driver.get("https://www.google.com/");
			String vTitle = driver.getTitle();
			System.out.println("The Title is "+vTitle);
			Thread.sleep(5000);
		}
		
		@BeforeTest
		public void OpenBrowser() {
			System.out.println("Before Test: Opening Browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004566\\OneDrive - Arisglobal software pvt Ltd\\Supriya\\Selenium\\chromedriver.exe");
			driver=new org.openqa.selenium.chrome.ChromeDriver();		
		}

		@AfterTest
		public void CloseBrowser() {
			driver.close();
			System.out.println("After Test: Closed Browser");
		}
		
}
