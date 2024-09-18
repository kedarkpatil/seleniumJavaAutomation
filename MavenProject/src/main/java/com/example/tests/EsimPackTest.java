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
import org.testng.annotations.Test;


public class EsimPackTest extends BaseTest {
	By ENEUR = By.xpath("//*[contains(@class, 'flex') and contains(@class, 'justify-end') and contains(@class, 'min-w-[92px]') and contains(@class, 'items-center') and contains(@class, 'gap-x-2.5')]");
	By CurrencyBtn =  By.xpath("//button[text()='Currency']");
	By Currency   =  By.xpath("//div[contains(text(),'Euro')]");
	By Thailand = By.xpath("//p[text()='Thailand']");
	By Rechargeseccard = By.xpath("//div[contains(@class,'grid grid-cols-1')]//div[contains(@class,'flex flex-col gap-4')][2]");
	
	By Country =  By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(1) > p");
	By Data  = By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(2) > p");
	By Validity  = By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(3) > p");
	By PlanType  = By.cssSelector("div:nth-child(2) > div > div > div > div:nth-child(4) > p");
	
	
	@Test
    public void test() throws InterruptedException
    {
		driver.get("https://www.betterroaming.com/");
		driver.manage().window().maximize();
		driver.findElement(ENEUR).click();
		driver.findElement(CurrencyBtn).click();
		driver.findElement(Currency).click();
		//driver.switchTo().alert().accept();
 		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		//WebElement acceptCookiesButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Accept All']")));
//		acceptCookiesButton.click();
		
		
		 // Scroll down by a certain amount of pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(3000);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));

        // Wait for a specific element to be visible
        WebElement thailandcntry = wait1.until(ExpectedConditions.visibilityOfElementLocated(Thailand));
      
        // Perform actions on the element
        
        
        thailandcntry.click();
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        
        
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(3));

        // Wait for a specific element to be visible
        WebElement  rechargeinfo = wait2.until(ExpectedConditions.visibilityOfElementLocated(Rechargeseccard));
        
        Assert.assertEquals("Thailand", driver.findElement(Country).getText());
        Assert.assertEquals("5 GB", driver.findElement(Data).getText());
        Assert.assertEquals("30 DAYS", driver.findElement(Validity).getText());
        Assert.assertEquals("Data only", driver.findElement(PlanType).getText());
        
//        System.out.println(driver.findElement(Country).getText());
//        System.out.println(driver.findElement(Data).getText());
//        System.out.println(driver.findElement(Validity).getText());
//        System.out.println(driver.findElement(PlanType).getText());
    }
	
}	
