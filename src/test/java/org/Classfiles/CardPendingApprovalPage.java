package org.Classfiles;

import java.io.IOException;

import org.Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardPendingApprovalPage extends BaseClass {
	

	public CardPendingApprovalPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement Searchfield;
	
	@FindBy(xpath="//a[@title='View itinerary']")
	WebElement ViewItenary;

	public WebElement getSearchfield() {
		return Searchfield;
	}

	public WebElement getViewItenary() {
		return ViewItenary;
	}
	
	
	
	public void ViewTransactionhistory(String PackageID) throws Throwable
	{
		implicitwait();
		SendKeyy(Searchfield, PackageID );
		javascriptclick(ViewItenary);		
	}
	
	
	
	

}
