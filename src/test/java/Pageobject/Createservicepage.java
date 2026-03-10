package Pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createservicepage extends Basepage{

	public Createservicepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//span[normalize-space()='Create Service Request']")
	WebElement clickservice;
	
	@FindBy(xpath="//p[normalize-space()='Professional AC unit cleaning and maintenance']")
	WebElement clickunitcleaning;
	
	@FindBy(xpath="//input[@name='address']")
	WebElement txtadress;
	
	@FindBy(xpath="//span[normalize-space()='AC maintenance']")
	WebElement clickmaintenace;
	
	@FindBy(xpath="//span[normalize-space()='Window unit']")
	WebElement clickwindowunit;
	
	@FindBy(xpath="//div[normalize-space()='Small (1-2 hrs)']")
	WebElement clicksize;
	
	@FindBy(xpath="//textarea[@placeholder='Provide additional details about the required service.']")
	WebElement txtdetails;
	
	@FindBy(xpath="//input[contains(@value,'Same-day')]")
	WebElement clicksameday;
	
	@FindBy(xpath="//button[normalize-space()='Continue to Schedule']")
	WebElement clickcontinue;
	
	@FindBy(xpath="(//button[normalize-space()='Within A Week'])[1]")
	WebElement clickdate;
	
	@FindBy(xpath="//span[normalize-space()='Morning (8am - 12pm)']")
	WebElement clicktime;
	
	@FindBy(xpath="//button[normalize-space()='Submit Request']")
	WebElement clicksubmit;
	
	public void Creatservice() {
		clickservice.click();
	}
	
	public void ClickUnit() {
		clickunitcleaning.click();
	}
	
	public void EnterAddress(String address) {
		txtadress.sendKeys(address);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 500);");
	}
	
	public void ClickMainteance() {
		clickmaintenace.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 500);");
	}
	
	public void ClickWindow() {
		clickwindowunit.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 500);");
	}
	
	public void ClickSize() {
		clicksize.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 500);");
	}
	
	public void EnterDetails(String details) {
		txtdetails.sendKeys(details);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 500);");
	}
	
	public void ClickSameday() {
		clicksameday.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 500);");
	}
	
	public void ClickContinue() {
		clickcontinue.click();
	}
	
	public void ClickDate() {
		clickdate.click();
	}
	
	public void ClickTime() {
		clicktime.click();
	}
	
	public void ClickSubmit() {
		clicksubmit.click();
	}
}
