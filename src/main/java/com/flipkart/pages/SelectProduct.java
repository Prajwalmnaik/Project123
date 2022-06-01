package com.flipkart.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.Base.TestBase;

public class SelectProduct extends TestBase {
By selectProductLoc=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");
public String validateselectProduct() {
	 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 
	  driver.findElement( selectProductLoc).click();
	  wait(1000);
	  Set<String> parentWindow=driver.getWindowHandles();
	  Set<String> allWindows=driver.getWindowHandles();
	  
	  for(String obj:allWindows) {
		  if(!obj.equals(parentWindow)) {
			  driver.switchTo().window(obj);
		  }
	  }
	  
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Share']")));
			
			String actResult = driver.findElement(By.xpath("//span[text()='Share']")).getText();
			return actResult;
	
}
}
