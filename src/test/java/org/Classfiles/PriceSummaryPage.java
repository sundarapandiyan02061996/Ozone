package org.Classfiles;

import java.io.IOException;
import java.util.List;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceSummaryPage extends BaseClass {

	public PriceSummaryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[@id='proceed']")
	WebElement ProceedtoPay;
	
	@FindBy(xpath="//button[@id='proceedApproval']")
	WebElement SendforApproval;
	
	@FindBy(xpath="(//input[@value='Yes'])[3]")
	WebElement Yesbtn;
	
	@FindBy(xpath="//button[contains(text(),'Approve')]")
	WebElement Approvebtn;
	
	@FindBy(xpath="//button[contains(text(),'Pay to submit')]")
	WebElement Paytosubmit;
	
	
	
	
	public WebElement getPaytosubmit() {
		return Paytosubmit;
	}

	public WebElement getApprovebtn() {
		return Approvebtn;
	}

	public WebElement getYesbtn() {
		return Yesbtn;
	}

	public WebElement getProceedtoPay() {
		return ProceedtoPay;
	}

	public WebElement getSendforApproval() {
		return SendforApproval;
	}

	public void pricesummaryDomestic()
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 150);
		w.until(ExpectedConditions.elementToBeClickable(ProceedtoPay));
		Clicks(ProceedtoPay);
		try
		{
		Thread.sleep(1000);
		Clicks(Yesbtn);	
		}
		catch (Exception e) {
		}
	}
	
	public void pricesummaryInternataional() throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.elementToBeClickable(ProceedtoPay));
		List<WebElement> TotalAdults = driver.findElements(By.xpath("//div[@class='passenger-details']//span[contains(text(),'Adult')]"));
		int Noofadults = TotalAdults.size();
		Clicks(ProceedtoPay);
		List<WebElement> Firstname = driver.findElements(By.xpath("//input[@placeholder='First Name']"));
		List<WebElement> Lastname = driver.findElements(By.xpath("//input[@placeholder='Last Name']"));
		List<WebElement> PassportNo = driver.findElements(By.xpath("//input[@placeholder='Passport Number']"));
		List<WebElement> Nationality = driver.findElements(By.xpath("//input[@placeholder='Nationality']"));
		List<WebElement> Placeofissues = driver.findElements(By.xpath("//input[@placeholder='Place of issue']"));
		List<WebElement> DateofBirthCalenders = driver.findElements(By.xpath("//input[@placeholder='Date of birth']"));
		List<WebElement> DateofIssueCalenders = driver.findElements(By.xpath("//input[@placeholder='issue date']"));
		List<WebElement> DateofExpiryCalenders = driver.findElements(By.xpath("//input[@placeholder='expiry date']"));
		List<WebElement> Address = driver.findElements(By.xpath("//input[contains(@id,'address1')]"));
		List<WebElement> Pincodes = driver.findElements(By.xpath("//input[@placeholder='Pincode']"));
		List<WebElement> Genders = driver.findElements(By.xpath("//select[contains(@id,'gender')]"));
		List<WebElement> Submitbtn = driver.findElements(By.xpath("//a[@title='Submit']"));
		int sheetnum = 1;
		int rownumber = 15;
		int temp =3; // Unable to take proper xpath of Expiry date calender field due to UI issue. once the issue has fixed we should change the xpath accodingly
		for(int i=0; i<Noofadults;i++)
		{
//			System.out.println("The i value is "+ i);
			String value = Firstname.get(i).getAttribute("value");
			if(value.isEmpty() || value == null)
			{
			SendKeyy(Firstname.get(i), getdataxlsheet(sheetnum, rownumber, 0));
			SendKeyy(Lastname.get(i), getdataxlsheet(sheetnum, rownumber, 1));
			SendKeyy(PassportNo.get(i), getdataxlsheet(sheetnum, rownumber, 2));
			SendKeyy(Nationality.get(i), getdataxlsheet(sheetnum, rownumber, 3));
			Thread.sleep(2000);
			Down();
			Enter();
			SendKeyy(Placeofissues.get(i), getdataxlsheet(sheetnum, rownumber, 4));
			Thread.sleep(2000);
			Down();
			Enter();
			Thread.sleep(1000);
			javascriptclick(DateofBirthCalenders.get(i));
			WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Selectdropdownbyindex(year, i);
			WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Selectdropdownbyindex(month, i);
			WebElement SelectDate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]"));
			javascriptclick(SelectDate);
			Thread.sleep(1000);
			javascriptclick(DateofIssueCalenders.get(i));
			WebElement year1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Selectdropdownbyindex(year1, 30);
			WebElement month1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Selectdropdownbyindex(month1, i);
			WebElement SelectDate1 = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]"));
			javascriptclick(SelectDate1);
			Thread.sleep(1000);
			javascriptclick(DateofExpiryCalenders.get(i));
			Thread.sleep(500);
			javascriptclick(DateofExpiryCalenders.get(i));
//			WebElement ExpiryDate = driver.findElement(By.xpath("(//span[contains(@class,'default-calendar') and contains(@class,'calendar')])["+temp+"]"));
//			javascriptclick(ExpiryDate);
			dateselect("50");
			Thread.sleep(1000);
			SendKeyy(Address.get(i), getdataxlsheet(sheetnum, rownumber, 5));
			SendKeyy(Pincodes.get(i), getdataxlsheet(sheetnum, rownumber, 6));
			Selectdropdownbyvisibletext(Genders.get(i), getdataxlsheet(sheetnum, rownumber, 7));
			Thread.sleep(1000);
			Clicks(Submitbtn.get(i));
			WebElement OK = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]")));
			Thread.sleep(2000);
			Clicks(OK);
			Clicks(ProceedtoPay);
			temp = temp +3;
			rownumber++;
			}
			else
			{
				//System.out.println("Details are already given");
				Clicks(ProceedtoPay);
			}
		}
		try
		{
			WebElement Yes = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Yes'])[3]")));
			Clicks(Yes);
			Clicks(ProceedtoPay);
		}
		catch (Exception e) {
			try
			{
			Clicks(ProceedtoPay);
			}
			catch (Exception ee) {
				System.out.println("Nothing");
			}
		}
	}
	
	
	public void pricesummaryDomesticbyCU()
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.elementToBeClickable(SendforApproval));
		Clicks(SendforApproval);
		try
		{
			WebDriverWait w1 = new WebDriverWait(driver, 5);
			WebElement Yes = w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Yes'])[4]")));
			Clicks(Yes);
		}
		catch (Exception e) {
		}
	}
	
	
	public void pricesummaryInternataionalCU() throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.elementToBeClickable(SendforApproval));
		List<WebElement> TotalAdults = driver.findElements(By.xpath("//div[@class='passenger-details']//span[contains(text(),'Adult')]"));
		int Noofadults = TotalAdults.size();
		Clicks(SendforApproval);
		List<WebElement> Firstname = driver.findElements(By.xpath("//input[@placeholder='First Name']"));
		List<WebElement> Lastname = driver.findElements(By.xpath("//input[@placeholder='Last Name']"));
		List<WebElement> PassportNo = driver.findElements(By.xpath("//input[@placeholder='Passport Number']"));
		List<WebElement> Nationality = driver.findElements(By.xpath("//input[@placeholder='Nationality']"));
		List<WebElement> Placeofissues = driver.findElements(By.xpath("//input[@placeholder='Place of issue']"));
		List<WebElement> DateofBirthCalenders = driver.findElements(By.xpath("//input[@placeholder='Date of birth']"));
		List<WebElement> DateofIssueCalenders = driver.findElements(By.xpath("//input[@placeholder='issue date']"));
		List<WebElement> DateofExpiryCalenders = driver.findElements(By.xpath("//input[@placeholder='expiry date']"));
		List<WebElement> Address = driver.findElements(By.xpath("//input[contains(@id,'address1')]"));
		List<WebElement> Pincodes = driver.findElements(By.xpath("//input[@placeholder='Pincode']"));
		List<WebElement> Genders = driver.findElements(By.xpath("//select[contains(@id,'gender')]"));
		List<WebElement> Submitbtn = driver.findElements(By.xpath("//a[@title='Submit']"));
		
		int sheetnum = 1;
		int rownumber = 15;
		int temp =3; // Unable to take proper xpath of Expiry date calender field due to UI issue. once the issue has fixed we should change the xpath accodingly
		for(int i=0; i<Noofadults;i++)
		{
			String value = Firstname.get(i).getAttribute("value");
			if(value.isEmpty() || value == null)
			{
			SendKeyy(Firstname.get(i), getdataxlsheet(sheetnum, rownumber, 0));
			SendKeyy(Lastname.get(i), getdataxlsheet(sheetnum, rownumber, 1));
			SendKeyy(PassportNo.get(i), getdataxlsheet(sheetnum, rownumber, 2));
			SendKeyy(Nationality.get(i), getdataxlsheet(sheetnum, rownumber, 3));
			Thread.sleep(2000);
			Down();
			Enter();
			SendKeyy(Placeofissues.get(i), getdataxlsheet(sheetnum, rownumber, 4));
			Thread.sleep(2000);
			Down();
			Enter();
			Thread.sleep(1000);
			javascriptclick(DateofBirthCalenders.get(i));
			WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Selectdropdownbyindex(year, i);
			WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Selectdropdownbyindex(month, i);
			WebElement SelectDate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]"));
			javascriptclick(SelectDate);
			Thread.sleep(1000);
			javascriptclick(DateofIssueCalenders.get(i));
			WebElement year1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Selectdropdownbyindex(year1, 30);
			WebElement month1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Selectdropdownbyindex(month1, i);
			WebElement SelectDate1 = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]"));
			javascriptclick(SelectDate1);
			Thread.sleep(1000);
			javascriptclick(DateofExpiryCalenders.get(i));
			Thread.sleep(500);
			javascriptclick(DateofExpiryCalenders.get(i));
//			WebElement ExpiryDate = driver.findElement(By.xpath("(//span[contains(@class,'default-calendar') and contains(@class,'calendar')])["+temp+"]"));
//			javascriptclick(ExpiryDate);
			dateselect("50");
			Thread.sleep(1000);
			SendKeyy(Address.get(i), getdataxlsheet(sheetnum, rownumber, 5));
			SendKeyy(Pincodes.get(i), getdataxlsheet(sheetnum, rownumber, 6));
			Selectdropdownbyvisibletext(Genders.get(i), getdataxlsheet(sheetnum, rownumber, 7));
			Thread.sleep(1000);
			Clicks(Submitbtn.get(i));
			WebElement OK = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]")));
			Thread.sleep(2000);
			Clicks(OK);
			Clicks(SendforApproval);
			temp = temp +3;
			rownumber++;
			}
			else
			{
				System.out.println("Details are already given");
			}
		}
		
		
		try
		{
			WebElement Yes = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Yes'])[4]")));
			Clicks(Yes);
		}
		catch (Exception e) {
			try
			{
			Clicks(SendforApproval);
			}
			catch (Exception ee) {
				System.out.println("Nothing");
			}
		}

	}
	
	
	public void Approve()
	{
		implicitwait();
		Explictwait(Approvebtn);
		Clicks(Approvebtn);
		WebElement Yes = driver.findElement(By.xpath("(//input[@value='Yes'])[2]"));
		Clicks(Yes);
	}
	
	
	public void Combinationpayment()
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 150);
		w.until(ExpectedConditions.elementToBeClickable(ProceedtoPay));
		Clicks(ProceedtoPay);
		try
		{
		Thread.sleep(1000);
		Clicks(Yesbtn);	
		}
		catch (Exception e) {
		}
	}
	
	

}
