package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.Excelutility;

public class LoginTest extends Base {
	
	@Test(priority=1,groups= {"regression"},retryAnalyzer=retry.Retry.class)
	
	public void verifyuserisabletologinusingvalidcredentials() throws IOException
	{
		LoginPage loginpage=new LoginPage(driver);
		//String user="admin";
		//String passwd="admin";
		String user=Excelutility.readStringData(1, 0,"Loginpage");
		String passwd=Excelutility.readStringData(1, 1, "Loginpage");
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(passwd);
		loginpage.clickSignin();
		boolean homepage=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepage);
		
		
	}
	
	
	@Test(priority=2)
	public void verifyuserisunabletologinusinginvalidusernameandvalidpassword() throws IOException
	{
		LoginPage loginpage=new LoginPage(driver);
		//String user="admin58";
		//String passwd="admin";
		String user=Excelutility.readStringData(2, 0,"Loginpage");
		String passwd=Excelutility.readStringData(2, 1, "Loginpage");
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(passwd);
		loginpage.clickSignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
	}
	
	@Test(priority=3)
	public void verifyuserisunabletologinusingvalidusernameandinvalidpassword() throws IOException
	{
		LoginPage loginpage=new LoginPage(driver);
		//String user="admin";
		//String passwd="adam";
		String user=Excelutility.readStringData(3, 0,"Loginpage");
		String passwd=Excelutility.readStringData(3, 1, "Loginpage");
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(passwd);
		loginpage.clickSignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
		
	}
	
	@Test(priority=4)
	public void verifyuserisunabletologinusinginvalidusernameandinvalidpassword() throws IOException
	{
		LoginPage loginpage=new LoginPage(driver);
		//String user="admin58";
		//String passwd="adam";
		String user=Excelutility.readStringData(4, 0,"Loginpage");
		String passwd=Excelutility.readStringData(4, 1, "Loginpage");
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(passwd);
		loginpage.clickSignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
		
	}


}
