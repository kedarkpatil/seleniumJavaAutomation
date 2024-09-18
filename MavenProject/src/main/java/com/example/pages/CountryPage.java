package com.example.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CountryPage {
	WebDriver driver;
	
    By Rechargeseccard = By.xpath("//div[contains(@class,'grid grid-cols-1')]//div[contains(@class,'flex flex-col gap-4')][2]");
	By Country =  By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(1) > p");
	By Data  = By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(2) > p");
	By Validity  = By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(3) > p");
	By PlanType  = By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(4) > p");
	By Price  = By.cssSelector("div:nth-child(2) > div.bg-white.w-full.z-20.pt-0 > div > div > p");
	
	public CountryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void rechargeInfoCard()
	{
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0, 500);");
	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	        // Wait for a specific element to be visible
	      WebElement  rechargeinfo = wait.until(ExpectedConditions.visibilityOfElementLocated(Rechargeseccard));
	}
	public void assertRechargeInfo()
	{
		  Assert.assertEquals("Thailand", getText(Country));
	      Assert.assertEquals("5 GB", getText(Data));
	      Assert.assertEquals("30 DAYS", getText(Validity));
	      Assert.assertEquals("Data only", getText(PlanType));
	      Assert.assertEquals("€9.29", getText(PlanType));
	}
	public String getText(By locator) 
	{
	      WebElement element = driver.findElement(locator);
	      return element.getText();
	}
	
}
