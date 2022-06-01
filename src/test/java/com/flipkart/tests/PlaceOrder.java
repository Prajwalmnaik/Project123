package com.flipkart.tests;


import org.testng.annotations.Test;

import com.flipkart.Base.TestBase;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.PlaceOrderPage;
import com.flipkart.pages.ProductDetailePage;
import com.flipkart.pages.SearchProductPage;
import com.flipkart.pages.SelectProduct;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
	
	
  @Test(priority =1)
  public void loginTest() {
	  LoginPage loginPage = new LoginPage();
	  String actResult = loginPage.validateLogin("9591028479", "pajju311");
	  
	  Assert.assertEquals(actResult, "Prajwal");
  }
  @Test(priority=2,dependsOnMethods="loginTest")
  public void searchProductTest() {
	  SearchProductPage searchProduct=new SearchProductPage();
	  String actResult  = searchProduct.validateSearchProduct("laptop");
	  Assert.assertEquals(actResult, "Sort By");
  }
  
  @Test(priority=3,dependsOnMethods="searchProductTest")
  public void selectProduct() {
	  SelectProduct selectProduct=new SelectProduct();
	  String actResult = selectProduct.validateselectProduct();
	  Assert.assertEquals(actResult, "Share");
	  
  }
  
  @Test(priority=4,dependsOnMethods="selectProduct")
  
  public void ProductDetaileTest() {
	  ProductDetailePage selectProduct=new ProductDetailePage();
	  String actResult =selectProduct.validateProductDetaile();
	  Assert.assertEquals(actResult, "PRICE DETAILS");
	  
  }
  @Test(priority=5,dependsOnMethods="ProductDetaileTest")
  public void PlaceOrderTest() {
	 PlaceOrderPage placeOrder=new PlaceOrderPage();
	  String actResult = placeOrder.validatePlaceOrder();
	  Assert.assertEquals(actResult, "CONTINUE");
  } 

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void setUp() {
	 
	  launchBrowser();
	  navigateToURL();
	 
  }

  @AfterClass
  public void afterClass() {
  }

}
