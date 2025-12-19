package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base{
	
	@Test
	public void login()
	{
		String usern="admin";
		String pass="admin";
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(usern);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys(pass);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		
	}
	
	@Test
	
	public void incorrectUsername()
	{
		String usern="admin23";
		String pass="admin";
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(usern);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys(pass);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		System.out.println("Username is incorrect");
		
	}
	
@Test
	
	public void incorrectPassword()
	{
		String usern="admin";
		String pass="javaworld";
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(usern);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys(pass);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		System.out.println("Password is incorrect");
		
	}

@Test

public void incorrectUsernamePassword()
{
	String usern="admin23";
	String pass="javaworld";
	WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	username.sendKeys(usern);
	WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys(pass);
	WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
	signin.click();
	System.out.println("Username or Password is incorrect");
	
}
	

}
