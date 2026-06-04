package org.Classfiles;

import java.io.IOException;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageBilToPage extends BaseClass {
	
	public ManageBilToPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//select[@id='corporateId']")
	WebElement CorporateName;
	
	@FindBy(xpath="//input[@value='Add New']")
	WebElement Addnew;
	
	@FindBy(xpath="//select[@id='stateId']")
	WebElement State;
	
	@FindBy(xpath="//textarea[@id='billToName']")
	WebElement Billname;
	
	@FindBy(xpath="//input[@id='insertBillTo']")
	WebElement Submit;

	
	public WebElement getCorporateName() {
		return CorporateName;
	}

	public WebElement getAddnew() {
		return Addnew;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getBillname() {
		return Billname;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	
	public void AddBilTo() throws Throwable
	{
		Explictwait(CorporateName);
		WebDriverWait w = new WebDriverWait(driver, 15);
		Selectdropdownbyvisibletext(CorporateName, getdataxlsheet(3, 2, 7));
		Clicks(Addnew);
		Thread.sleep(500);
		Selectdropdownbyvisibletext(State, "Assam");
		SendKeyy(Billname, getdataxlsheet(3, 2, 22));
		Clicks(Submit);
		WebElement Okbtn = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='proceedModal']")));
		Clicks(Okbtn);
	}
	
	
	
}
