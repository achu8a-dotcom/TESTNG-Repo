package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	
	@Test(priority=1)
	
	public void verifyuserisabletologinusingvalidcredentials()
	{
		LoginPage loginpage=new LoginPage(driver);
		String user="admin";
		String passwd="admin";
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(passwd);
		loginpage.clickSignin();
		boolean homepage=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepage);
		
		
	}
	
	
	@Test(priority=2)
	public void verifyuserisunabletologinusinginvalidusernameandvalidpassword()
	{
		LoginPage loginpage=new LoginPage(driver);
		String user="admin58";
		String passwd="admin";
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(passwd);
		loginpage.clickSignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
	}
	
	@Test(priority=3)
	public void verifyuserisunabletologinusingvalidusernameandinvalidpassword()
	{
		LoginPage loginpage=new LoginPage(driver);
		String user="admin";
		String passwd="adam";
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(passwd);
		loginpage.clickSignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
		
	}
	
	@Test(priority=4)
	public void verifyuserisunabletologinusinginvalidusernameandinvalidpassword()
	{
		LoginPage loginpage=new LoginPage(driver);
		String user="admin58";
		String passwd="adam";
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(passwd);
		loginpage.clickSignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
		
	}


}
