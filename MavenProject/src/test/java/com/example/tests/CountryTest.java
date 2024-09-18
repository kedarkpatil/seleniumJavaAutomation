package com.example.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.example.pages.CountryPage;
import com.example.pages.HomePage;


public class CountryTest extends BaseTest {
	HomePage hmpg;
	CountryPage cntrypg;
	 
	By Rechargeseccard = By.xpath("//div[contains(@class,'grid grid-cols-1')]//div[contains(@class,'flex flex-col gap-4')][2]");
	By Country =  By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(1) > p");
	By Data  = By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(2) > p");
	By Validity  = By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(3) > p");
	By PlanType  = By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(4) > p");
	
	@Test
    public void test() throws InterruptedException
    {
		  CountryPage cntrypg = new CountryPage(driver);
		  HomePage hmpg=new HomePage(driver);
		  hmpg.homeCurrencyCntry();
          Thread.sleep(7000);
		  cntrypg.rechargeInfoCard();
		  cntrypg.assertRechargeInfo();
    }
}	
