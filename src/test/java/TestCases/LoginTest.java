package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobject.LoginPage;
import Testbase.BaseClass;

public class LoginTest extends BaseClass{

	@Test
	public void ValidLogin() {
    
		LoginPage lp = new LoginPage(driver);
		lp.EnterEmail("cust@yopmail.com");
		lp.EnterPassword("12345678");
		lp.ClickLogin();
	}

	@Test
	public void InValidLogin() {
	    
		String newmsg="Invalid credentials";
		LoginPage lp = new LoginPage(driver);
		lp.EnterEmail("cust@yopmail.com");
		lp.EnterPassword("123456");
		lp.ClickLogin();
		String msg = lp.CheckErrormsg();
		Assert.assertEquals(newmsg, msg);
	}
	
}
