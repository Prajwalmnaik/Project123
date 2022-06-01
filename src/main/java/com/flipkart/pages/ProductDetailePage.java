package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.Base.TestBase;

public class ProductDetailePage  extends TestBase {
By productDetaileLoc=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
public String validateProductDetaile() {
	 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.findElement(productDetaileLoc).click();
	wait(1000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/div/span")));
	String actResult = driver.findElement(By.className("_3aPjap")).getText();
	return actResult;

}

}
