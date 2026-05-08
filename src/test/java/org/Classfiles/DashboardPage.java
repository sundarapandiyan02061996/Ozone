package org.Classfiles;

import org.Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BaseClass {
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(@title,' Travel Request')]")
	WebElement TravelRequestbtn;
	
	
	@FindBy(xpath="//ul//li//a[contains(text(),'New Travel Request')]")
	WebElement NewTravelRequest;
	
	
	@FindBy(xpath="(//ul//li//a[contains(text(),' Air')])[1]")
	WebElement Airbtn;
	
	@FindBy(xpath="(//ul//li//a[contains(text(),' Hotel')])[1]")
	WebElement Hotelbtn;
	
	@FindBy(xpath="(//ul//li//a[contains(text(),' Car')])[2]")
	WebElement Carbtn;
	
	@FindBy(xpath="(//ul//li//a[contains(text(),' Visa')])[1]")
	WebElement Visabtn;
	
	@FindBy(xpath="//a[@title=' Travel Approval']")
	WebElement TestApprovalbtn;
	
	@FindBy(xpath="//a[contains(text(),' Pending Approval')]")
	WebElement PendingApproval;
	
	@FindBy(xpath="(//a[contains(text(),' Cart')])[4]")
	WebElement Cart;
	
	@FindBy(xpath="//p[@id='userprofpop']")
	WebElement Profilebtn;

	@FindBy(xpath="(//a[@title='Log out'])[1]")
	WebElement Logoutbtn;
	
	
	
	public WebElement getCarbtn() {
		return Carbtn;
	}


	public WebElement getHotelbtn() {
		return Hotelbtn;
	}


	public WebElement getTestApprovalbtn() {
		return TestApprovalbtn;
	}


	public WebElement getPendingApproval() {
		return PendingApproval;
	}


	public WebElement getCart() {
		return Cart;
	}


	public WebElement getProfilebtn() {
		return Profilebtn;
	}


	public WebElement getLogoutbtn() {
		return Logoutbtn;
	}


	public WebElement getTravelRequestbtn() {
		return TravelRequestbtn;
	}


	public WebElement getNewTravelRequest() {
		return NewTravelRequest;
	}


	public WebElement getAirbtn() {
		return Airbtn;
	}

	
	public void SelectAir() throws Throwable
	{
		implicitwait();
		Thread.sleep(1000);
		Explictwait(TravelRequestbtn);
		Thread.sleep(1000);
		javascriptclick(TravelRequestbtn);
		Thread.sleep(2000);
		javascriptclick(NewTravelRequest);
		Thread.sleep(2000);
		javascriptclick(Airbtn);
	}
	
	
	public void Logout()
	{
		implicitwait();
		Explictwait(Profilebtn);
		javascriptclick(Profilebtn);
		Explictwait(Logoutbtn);
		javascriptclick(Logoutbtn);
	}
	
	public void SelectPendindApproval() throws Throwable
	{
		implicitwait();
		Explictwait(TestApprovalbtn);
		Thread.sleep(1000);
		javascriptclick(TestApprovalbtn);
		Thread.sleep(1000);
		javascriptclick(PendingApproval);
		Thread.sleep(1000);
		javascriptclick(Cart);		
	}
	
	public void Selecthotel() throws Throwable
	{
		implicitwait();
		Thread.sleep(1000);
		Explictwait(TravelRequestbtn);
		Thread.sleep(1000);
		javascriptclick(TravelRequestbtn);
		Thread.sleep(2000);
		javascriptclick(NewTravelRequest);
		Thread.sleep(2000);
		javascriptclick(Hotelbtn);
		
	}
	
	public void SelectCar() throws Throwable
	{
		implicitwait();
		Thread.sleep(1000);
		Explictwait(TravelRequestbtn);
		Thread.sleep(1000);
		javascriptclick(TravelRequestbtn);
		Thread.sleep(2000);
		javascriptclick(NewTravelRequest);
		Thread.sleep(2000);
		javascriptclick(Carbtn);
		
	}
	
	public void SelectVisa() throws Throwable
	{
		implicitwait();
		Thread.sleep(1000);
		Explictwait(TravelRequestbtn);
		Thread.sleep(1000);
		javascriptclick(TravelRequestbtn);
		Thread.sleep(2000);
		javascriptclick(NewTravelRequest);
		Thread.sleep(2000);
		javascriptclick(Visabtn);
		
	}
	
	
	
	
	
}
