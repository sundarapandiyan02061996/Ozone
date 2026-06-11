package org.Classfiles;

import java.util.List;

import javax.xml.xpath.XPath;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyBookingListPage extends BaseClass {
	
	public MyBookingListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
    @FindBy(xpath="//input[@name='searchTextrequestListDisplay']")
	WebElement Searchfield;
    
    @FindBy(xpath="//a[@title='View / hide list details']")
	WebElement Expandbtn;
    
    @FindBy(xpath="//a[@title='Cancel ticket']")
   	WebElement CancelTicket;
    
    @FindBy(xpath="//input[@value='Proceed To Cancel']")
   	WebElement ProceedtoCancel;
    
    @FindBy(xpath="//textarea[@id='cancelReason']")
   	WebElement CancelReason;
    
    @FindBy(xpath="//input[@id='cancelBtn']")
   	WebElement Yesbtn;
    
    @FindBy(xpath="//button[contains(text(),'OK')]")
   	WebElement Okbtn;
    
    @FindBy(xpath="//textarea[@id='cancel']")
   	WebElement Flightcancelremarks;
    
    
    
    

	public WebElement getProceedtoCancel() {
		return ProceedtoCancel;
	}

	public WebElement getCancelReason() {
		return CancelReason;
	}

	public WebElement getYesbtn() {
		return Yesbtn;
	}

	public WebElement getSearchfield() {
		return Searchfield;
	}

	public WebElement getExpandbtn() {
		return Expandbtn;
	}

	public WebElement getCancelTicket() {
		return CancelTicket;
	}
    
    
	
	public void Cancelbooking(int row) throws Throwable
	{
		WebDriverWait w = new WebDriverWait(driver, 20);
		Explictwait(Searchfield);
		SendKeyy(Searchfield, getdata2xlsheet(0, row, 3));
		Explictwait(Expandbtn);
		javascriptclick(Expandbtn);
		Explictwait(CancelTicket);
		javascriptclick(CancelTicket);
		Explictwait(ProceedtoCancel);
		Clicks(ProceedtoCancel);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='cancelReason']")));
		SendKeyy(CancelReason, "Test");
		Clicks(Yesbtn);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]")));
		Clicks(Okbtn);	
	}
    
	public void CancelAllFlightbooking(int row) throws Throwable
	{
		WebDriverWait w = new WebDriverWait(driver, 20);
		Explictwait(Searchfield);
		SendKeyy(Searchfield, getdata2xlsheet(0, row, 3));
		Explictwait(Expandbtn);
		javascriptclick(Expandbtn);
		Explictwait(CancelTicket);
		javascriptclick(CancelTicket);
		Explictwait(ProceedtoCancel);
		List<WebElement> Allcheckbox = driver.findElements(By.xpath("//div[contains(@class,'checkbox inline-block')]"));
		for(int i=0;i<Allcheckbox.size();i++)
		{
			WebElement SelectCheckbox = Allcheckbox.get(i);
			Clicks(SelectCheckbox);
		}
		Clicks(ProceedtoCancel);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='cancel']")));
		SendKeyy(Flightcancelremarks, "Test");
		Clicks(Yesbtn);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]")));
		Clicks(Okbtn);	
	}
	
	public void CancelPartialFlightbooking(int row) throws Throwable
	{
		WebDriverWait w = new WebDriverWait(driver, 20);
		Explictwait(Searchfield);
		SendKeyy(Searchfield, getdata2xlsheet(0, row, 3));
		Explictwait(Expandbtn);
		javascriptclick(Expandbtn);
		Explictwait(CancelTicket);
		javascriptclick(CancelTicket);
		Explictwait(ProceedtoCancel);
		List<WebElement> Allcheckbox = driver.findElements(By.xpath("//div[contains(@class,'checkbox inline-block')]"));
		for(int i=0;i<Allcheckbox.size();i++)
		{
			WebElement SelectCheckbox = Allcheckbox.get(i);
			Clicks(SelectCheckbox);
			break;
		}
		Clicks(ProceedtoCancel);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='cancel']")));
		SendKeyy(Flightcancelremarks, "Test");
		Clicks(Yesbtn);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]")));
		Clicks(Okbtn);	
	}
	
	public void CancelRTsegmentFlightbooking(int row) throws Throwable
	{
		WebDriverWait w = new WebDriverWait(driver, 20);
		Explictwait(Searchfield);
		SendKeyy(Searchfield, getdata2xlsheet(0, row, 3));
		Explictwait(Expandbtn);
		javascriptclick(Expandbtn);
		Explictwait(CancelTicket);
		javascriptclick(CancelTicket);
		Explictwait(ProceedtoCancel);
		List<WebElement> Allcheckbox = driver.findElements(By.xpath("(//div[@id='onward_ADT'])[1]//div[contains(@class,'checkbox inline-block')]"));
		for(int i=0;i<Allcheckbox.size();i++)
		{
			WebElement SelectCheckbox = Allcheckbox.get(i);
			Clicks(SelectCheckbox);
		}
		Clicks(ProceedtoCancel);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='cancel']")));
		SendKeyy(Flightcancelremarks, "Test");
		Clicks(Yesbtn);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]")));
		Clicks(Okbtn);	
	}
	
	public void CancelRTCrosspaxFlightbooking(int row) throws Throwable
	{
		WebDriverWait w = new WebDriverWait(driver, 20);
		Explictwait(Searchfield);
		SendKeyy(Searchfield, getdata2xlsheet(0, row, 3));
		Explictwait(Expandbtn);
		javascriptclick(Expandbtn);
		Explictwait(CancelTicket);
		javascriptclick(CancelTicket);
		Explictwait(ProceedtoCancel);
		List<WebElement> AllcheckboxOnward = driver.findElements(By.xpath("(//div[@id='onward_ADT'])[1]//div[contains(@class,'checkbox inline-block')]"));
		for(int i=0;i<AllcheckboxOnward.size();i++)
		{
			WebElement SelectCheckbox = AllcheckboxOnward.get(i);
			Clicks(SelectCheckbox);
			break;
		}
		List<WebElement> AllcheckboxReturn = driver.findElements(By.xpath("(//div[@id='onward_ADT'])[2]//div[contains(@class,'checkbox inline-block')]"));
		for(int i=0;i<AllcheckboxReturn.size();i++)
		{
			WebElement SelectCheckbox = AllcheckboxReturn.get(i);
			Clicks(SelectCheckbox);
			break;
		}
		Clicks(ProceedtoCancel);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='cancel']")));
		SendKeyy(Flightcancelremarks, "Test");
		Clicks(Yesbtn);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]")));
		Clicks(Okbtn);	
	}

}
