package TestCases;

import org.testng.annotations.Test;

import Pageobject.Createservicepage;
import Pageobject.LoginPage;
import Testbase.BaseClass;

public class CreateTest extends BaseClass{

	@Test
	public void CreateService() {
		
		LoginPage lp = new LoginPage(driver);
		lp.EnterEmail("cust@yopmail.com");
		lp.EnterPassword("12345678");
		lp.ClickLogin();
		
	     Createservicepage cs= new Createservicepage(driver);
	     cs.Creatservice();
	     cs.ClickUnit();
	     cs.EnterAddress("Knowe Place");
	     cs.ClickMainteance();
	     cs.ClickWindow();
	     cs.ClickSize();
	     cs.EnterDetails("Test");
	     cs.ClickSameday();
	     cs.ClickContinue();
	     cs.ClickTime();
	     cs.ClickSubmit();
	}
}
