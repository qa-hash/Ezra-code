package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@id='email']")
	WebElement txtemail;

	@FindBy(xpath="//input[@id='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement clicklogin;
	
	@FindBy(xpath="//div[@class='text-red-600 text-sm bg-red-50 p-3 rounded-xl border border-red-100 italic']")
	WebElement errormsg;
	
	public void EnterEmail(String mail) {
		txtemail.sendKeys(mail);
	}
	
	public void EnterPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	
	public void ClickLogin() {
		clicklogin.click();
	}
	
	public String CheckErrormsg() {
		String msg=errormsg.getText();
		System.out.println(msg);
		return msg;
	}
}
