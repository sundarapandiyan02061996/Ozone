package org.Classfiles;

import java.io.IOException;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GSTpage extends BaseClass {
	
	public GSTpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Create GST Code')]")
	WebElement CreateGST;
	
	@FindBy(xpath="//select[contains(@id,'billableCorporateId')]")
	WebElement Coporatelist;
	

	@FindBy(xpath="(//select[contains(@id,'state')])[1]")
	WebElement State;

	@FindBy(xpath="//input[@placeholder='Enter GST Code']")
	WebElement GSTCode;

	@FindBy(xpath="//input[@placeholder='Enter Registered Company']")
	WebElement RegisteredCompany;

	@FindBy(xpath="//input[@placeholder='Enter Email Address']")
	WebElement EmailAddress;

	@FindBy(xpath="//input[@placeholder='Enter Mobile Number']")
	WebElement MobileNumber;

	@FindBy(xpath="//textarea[@placeholder='Enter GST Address 1']")
	WebElement GSTAddress1;

	@FindBy(xpath="//textarea[@placeholder='Enter GST Address 2']")
	WebElement GSTAddress2;

	@FindBy(xpath="//input[@placeholder='Enter city']")
	WebElement City;

	@FindBy(xpath="//input[@placeholder='Enter zip code']")
	WebElement ZipCode;

	@FindBy(xpath="//input[@placeholder='Enter SAC Code']")
	WebElement SACCode;

	@FindBy(xpath="//input[@type='checkbox']")
	WebElement DefaultGST;

	@FindBy(xpath="//input[contains(@value,'Submit')]")
	WebElement SubmitBtn;

	@FindBy(xpath="//button[contains(text(),'Reset')]")
	WebElement ResetBtn;

	@FindBy(xpath="//button[contains(@class,'close') or contains(@ng-click,'cancel')]")
	WebElement CloseBtn;
	
	@FindBy(xpath="(//select[@id='billtoId'])[1]")
	WebElement Billable;
	
	

	public WebElement getBillable() {
		return Billable;
	}

	public WebElement getCreateGST() {
		return CreateGST;
	}

	public WebElement getCoporatelist() {
		return Coporatelist;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getGSTCode() {
		return GSTCode;
	}

	public WebElement getRegisteredCompany() {
		return RegisteredCompany;
	}

	public WebElement getEmailAddress() {
		return EmailAddress;
	}

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	public WebElement getGSTAddress1() {
		return GSTAddress1;
	}

	public WebElement getGSTAddress2() {
		return GSTAddress2;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getZipCode() {
		return ZipCode;
	}

	public WebElement getSACCode() {
		return SACCode;
	}

	public WebElement getDefaultGST() {
		return DefaultGST;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}

	public WebElement getResetBtn() {
		return ResetBtn;
	}

	public WebElement getCloseBtn() {
		return CloseBtn;
	}
	
	
	
	public void MapGST() throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 15);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Create GST Code')]")));
		Clicks(CreateGST);
		Selectdropdownbyvisibletext(Coporatelist, getdataxlsheet(3, 2, 7));
		Thread.sleep(3000);
		Selectdropdownbyvisibletext(State, "Assam (18)");
		SendKeyy(GSTCode, "18ABCDE1234F1Z5");
		SendKeyy(RegisteredCompany, "Automationcompany");
		SendKeyy(EmailAddress, "sss@yopmail.com");
		SendKeyy(MobileNumber, "7703838383");
		SendKeyy(GSTAddress1, "Test");
		SendKeyy(GSTAddress2, "Test");
		SendKeyy(City, "Chennai");
		SendKeyy(ZipCode, "600042");
		SendKeyy(SACCode, "12345");
		Selectdropdownbyvisibletext(Billable, getdataxlsheet(3, 2, 22));
		Clicks(SubmitBtn);
		WebElement Okbtn = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='proceedModal']")));
		Clicks(Okbtn);
		
		
	}

}
