package com.qait.automationtest.test2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.Assert;
import org.testng.annotations.Test;

public class basic_auth {
  @Test
  public void f() {
  }

public void find(WebDriver driver) {
	driver.get("http://10.0.31.161:9292/");
	
	Assert.assertEquals(driver.findElement(By.linkText("Basic Auth")).isDisplayed(), true);
	// TODO Auto-generated method stub
	
}

public void click(WebDriver driver) {
	driver.findElement(By.linkText("Basic Auth")).click();
	// TODO Auto-generated method stub
	
}

public void pop_credentials(WebDriver driver) {
	Alert alert = driver.switchTo().alert() ;
	alert.authenticateUsing(new UserAndPassword("admin","admin"));
	alert.accept(); 
	// TODO Auto-generated method stub
	
}

public void verify(WebDriver driver) {
	Assert.assertEquals(driver.findElement(By.linkText("Congratulations! You must have the proper credentials. ")).isDisplayed(), true);
	
	// TODO Auto-generated method stub
	
}
}
