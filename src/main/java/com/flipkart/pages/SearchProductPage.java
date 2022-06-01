package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.Base.TestBase;

public class SearchProductPage extends TestBase {
	
	
	By searchLoc =By.name("q");
	By searchButtonLoc =By.name("q");
	public String validateSearchProduct(String prod) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(searchLoc).sendKeys(prod);
		wait(1000);
		driver.findElement(searchButtonLoc).sendKeys(Keys.ENTER);
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/span")));
		}catch(TimeoutException te) {
			captureScreeenshot("Login Page Error");
		}
		String actResult = driver.findElement(By.className("_2i7N3j")).getText();
		return actResult;
		
	}
	

}
