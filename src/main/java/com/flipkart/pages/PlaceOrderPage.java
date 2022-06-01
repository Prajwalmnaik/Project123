package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.Base.TestBase;

public class PlaceOrderPage extends TestBase {
  By placeOrderLoc=By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div[6]/div/form/button/span");
   public String validatePlaceOrder() {//*[@id="container"]/div/div[2]/div/div[1]/div[1]/div/div[6]/div/form/button
	   wait = new WebDriverWait(driver, Duration.ofSeconds(30));//*[@id="container"]/div/div[2]/div/div[1]/div[1]/div/div[6]/div/form/button/span
	    driver.findElement(placeOrderLoc).click();
	    wait(1000);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='CONTINUE']")));
	    String actResult = driver.findElement(By.xpath("//*[text()='CONTINUE']")).getText();
	    return actResult;
	   
   }
}
