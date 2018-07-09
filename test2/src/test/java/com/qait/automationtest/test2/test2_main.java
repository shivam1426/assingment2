package com.qait.automationtest.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2_main {
	
	WebDriver driver;
	@BeforeTest()
	public void start()
	{
		String exepath = "/home/qainfotech/chromedriver";
		System.setProperty("webdriver.chrome.driver",exepath);
		driver=new ChromeDriver();
	}
	@AfterTest()
	 public void close()
	 {
		driver.close();
	 }

	@Test()
	public void basic_auth()
	{
		basic_auth b =new basic_auth();
		b.find(driver);
		b.click(driver);
		b.pop_credentials(driver);
	//	b.verify(driver);
	}
	
	@Test()
	public void broken_images()
	{
		driver.get("http://10.0.31.161:9292/");
		broken_images br=new broken_images();
		br.check(driver);
		
	}
	
	
 
}
