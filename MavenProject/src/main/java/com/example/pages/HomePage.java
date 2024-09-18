package com.example.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	
	By ENEUR = By.xpath("//*[contains(@class, 'flex') and contains(@class, 'justify-end') and contains(@class, 'min-w-[92px]') and contains(@class, 'items-center') and contains(@class, 'gap-x-2.5')]");
	By CurrencyBtn =  By.xpath("//button[text()='Currency']");
	By Currency   =  By.xpath("//div[contains(text(),'Euro')]");
	By Thailand = By.xpath("//p[text()='Thailand']");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void getTitle()
	{
        Assert.assertEquals(driver.getTitle(),"BetterRoaming");		
	}
	public void homeCurrencyCntry()
	{
		driver.findElement(ENEUR).click();
		driver.findElement(CurrencyBtn).click();
		driver.findElement(Currency).click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 1000);");
	    //Thread.sleep(3000);
	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
	    WebElement thailandcntry = wait1.until(ExpectedConditions.visibilityOfElementLocated(Thailand));
	    thailandcntry.click();
	}
	

}
