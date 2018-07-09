package com.qait.automationtest.test2;



import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class broken_images {
	static int invalidImageCount = 0;
  @Test
public void f() {
  }

@Test
public void check(WebDriver driver) {
	driver.findElement(By.linkText("Broken Images")).click();
	try {
		
		List<WebElement> imagelist = driver.findElements(By.tagName("img"));

		for (WebElement imgElement :imagelist) {
		if (imgElement != null) {
		verifyimageActive(imgElement);
		}
		}
	
		
		System.out.println("Total no. of invalid images are "	+ invalidImageCount);		} 
	catch (Exception e) 
	{			e.printStackTrace();	
	System.out.println(e.getMessage());	
	}	
	}
@Test
public static void verifyimageActive(WebElement imgElement)
{		
	try {	
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(imgElement.getAttribute("src"));
		HttpResponse response = (HttpResponse) client.execute(request);			
		// verifying response code he HttpStatus should be 200 if not,	
		// increment as invalid images count			
		if (((org.apache.http.HttpResponse) response).getStatusLine().getStatusCode() != 200)			
		{				
		invalidImageCount++;	
		}		
		} 
	catch (Exception e)
	{			e.printStackTrace();		
	}	}
	
	// TODO Auto-generated method stub
	
}

