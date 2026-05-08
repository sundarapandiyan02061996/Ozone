package org.Classfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//input[@id='loginEmail']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath ="(//button[contains(@class,'log-user')])[1]")
	WebElement Loginbtn;
	
	
	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}




	public void Corporateadminlogin() throws Throwable
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./Config.properties"));
		SendKeyy(Email, p.getProperty("CAusername"));
		SendKeyy(Password, p.getProperty("CApassword"));
		Clicks(Loginbtn);	
	}

	public void Corporateuserlogin() throws Throwable
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./Config.properties"));
		SendKeyy(Email, p.getProperty("CUAdminusername"));
		SendKeyy(Password, p.getProperty("CUAdminpassword"));
		Clicks(Loginbtn);	
	}
	
	public void ApproveUserlogin() throws Throwable
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./Config.properties"));
		SendKeyy(Email, p.getProperty("ApproveAdminusername"));
		SendKeyy(Password, p.getProperty("ApproveAdminpassword"));
		Clicks(Loginbtn);	
	}
}


