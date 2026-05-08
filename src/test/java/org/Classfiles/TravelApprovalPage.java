package org.Classfiles;

import org.Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelApprovalPage extends BaseClass {


	public TravelApprovalPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title=' Travel Approval']")
	WebElement TestApprovalbtn;
	
	@FindBy(xpath="//a[contains(text(),' Pending Approval')]")
	WebElement PendingApproval;
	
	@FindBy(xpath="(//a[contains(text(),' Cart')])[4]")
	WebElement Cart;
	
	
	
	
	
	
}
