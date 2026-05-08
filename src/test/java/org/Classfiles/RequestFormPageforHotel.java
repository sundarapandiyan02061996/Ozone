package org.Classfiles;

import java.io.IOException;
import java.util.List;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequestFormPageforHotel extends BaseClass {
	
	public RequestFormPageforHotel()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Select location']")
	WebElement Hotellocation;
	
	@FindBy(xpath="//input[@placeholder='Check-in']")
	WebElement Checkin;
	
	@FindBy(xpath="//input[@placeholder='Check-out']")
	WebElement Checkout;
	
	@FindBy(xpath="//select[@id='adultCounts1']")
	WebElement Adultcoutn;
	
	@FindBy(xpath = "(//p[contains(@id,'Employee0')])")
	WebElement EmployeeRadio;

	@FindBy(xpath = "(//p[contains(@id,'Guest0')])")
	WebElement GuestRadio;

	@FindBy(xpath = "(//select[contains(@id,'titles0')])[2]")
	WebElement TitleDropdown;

	@FindBy(xpath = "(//input[@id='first_name0'])[2]")
	WebElement FirstName;

	@FindBy(xpath = "(//input[@id='last_name0'])[2]")
	WebElement LastName;

	@FindBy(xpath = "(//select[@id='mobile_code0'])")
	WebElement MobileCode;

	@FindBy(xpath = "(//input[@id='mobile_number0'])[2]")
	WebElement MobileNumber;

	@FindBy(xpath = "(//input[@id='email0'])[2]")
	WebElement Email;

	@FindBy(xpath = "(//input[@id='project_code0'])[2]")
	WebElement ProjectCode;

	@FindBy(xpath = "(//select[@id='purpose_of_travel'])[1]")
	WebElement PurposeofTravel;
	
	@FindBy(xpath = "(//select[@id='billto_address'])[1]")
	WebElement Billtoadress;
	
	@FindBy(xpath = "(//select[@id='billable'])")
	WebElement Billable;
	
	@FindBy(xpath = "(//button[@id='proceed'])[1]")
	WebElement Proceed;
	
	

	public WebElement getCheckin() {
		return Checkin;
	}

	public WebElement getHotellocation() {
		return Hotellocation;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdultcoutn() {
		return Adultcoutn;
	}

	public WebElement getEmployeeRadio() {
		return EmployeeRadio;
	}

	public WebElement getGuestRadio() {
		return GuestRadio;
	}

	public WebElement getTitleDropdown() {
		return TitleDropdown;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getMobileCode() {
		return MobileCode;
	}

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getProjectCode() {
		return ProjectCode;
	}

	public WebElement getPurposeofTravel() {
		return PurposeofTravel;
	}

	public WebElement getBilltoadress() {
		return Billtoadress;
	}

	public WebElement getBillable() {
		return Billable;
	}

	public WebElement getProceed() {
		return Proceed;
	}
	
	
	public void HotelRequestform(int rows) throws Throwable
	{
		implicitwait();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		SendKeyy(Hotellocation, getdataxlsheet(0, rows, 1));
		Thread.sleep(1000);
		List<WebElement> suggestions = wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li")));
		Down();
		Enter();
		//javascriptclick(selectsectororigin);
		javascriptclick(Checkin);
		Thread.sleep(1000);
		datepicks(getdataxlsheet(0, rows, 2));
		Thread.sleep(1000);
//		javascriptclick(Checkout);
//		Thread.sleep(1000);
//		datepicks(getdataxlsheet(0, 17, 3));
		Selectdropdownbyvisibletext(Adultcoutn, getdataxlsheet(0, rows, 4));
		int row = 1;
		List<WebElement> Totalemployees = driver.findElements(By.xpath("//span[contains(text(),'Passenger information')]"));
		for(int i=0;i<Totalemployees.size();i++)
		{
			WebElement Passengerinformation = driver.findElement(By.xpath("(//a[contains(@title,'Guest')])["+(i+1)+"]"));
			String type = Passengerinformation.getText().trim();
			System.out.println(Totalemployees.size());
			System.out.println(type);
			if(type.equalsIgnoreCase(getdataxlsheet(1, row, 0)))	
			{
		javascriptclick(Passengerinformation);
		Thread.sleep(500);
		WebElement Title = driver.findElement(By.xpath("(//select[contains(@id,'titles')])["+(2 *( i + 1))+"]"));
		Thread.sleep(1000);
		javascriptclick(Title);
		Selectdropdownbyvisibletext(Title, getdataxlsheet(1, row, 1));
		WebElement Passengerfirstname = driver.findElement(By.xpath("(//input[contains(@id,'first_name')])["+(2 *( i + 1))+"]"));
		SendKeyy(Passengerfirstname, getdataxlsheet(1, row, 2));
		WebElement Passengerlastname = driver.findElement(By.xpath("(//input[contains(@id,'last_name')])["+(2 *( i + 1))+"]"));
		SendKeyy(Passengerlastname, getdataxlsheet(1, row, 3));
		WebElement PassengerMobileCode = driver.findElement(By.xpath("(//select[contains(@id,'mobile_code')])["+(i+1)+"]"));
		Clicks(PassengerMobileCode);
		Selectdropdownbyvisibletext(PassengerMobileCode, getdataxlsheet(1, row, 4));
		WebElement PassengerMobilenumber = driver.findElement(By.xpath("(//input[contains(@id,'mobile_number')])["+(2 *( i + 1))+"]"));
		SendKeyy(PassengerMobilenumber, getdataxlsheet(1, row, 5));
		WebElement PassengerEmailid = driver.findElement(By.xpath("(//input[contains(@id,'email')])["+(2 *( i + 1))+"]"));
		SendKeyy(PassengerEmailid, getdataxlsheet(1, row, 6));
		WebElement PassengerProjectCode = driver.findElement(By.xpath("(//input[contains(@id,'project_code')])["+(2 *( i + 1))+"]"));
		SendKeyy(PassengerProjectCode, getdataxlsheet(1, row, 7));
//		WebElement AdharCard = driver.findElement(By.xpath("//input[@placeholder='Enter aadhar number']["+(2 *( i + 1))+"]"));
//		SendKeyy(AdharCard, "123456789");
		WebElement Roomno = driver.findElement(By.xpath("(//select[contains(@id,'roomNumber')])["+(2 *( i + 1))+"]"));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(Roomno, "1");
		}
			else
			{

				WebElement EmployeeCode1 = driver.findElement(By.xpath("(//input[contains(@id,'employee_code')])[" + (2 * i + 1) + "]"));
				String value = EmployeeCode1.getAttribute("value");
				if(value.isEmpty() || value == null)
				{
				WebElement EmployeeCode = driver.findElement(By.xpath("(//input[contains(@id,'employee_code')])[" + (2 * i + 1) + "]"));
				SendKeyy(EmployeeCode, getdataxlsheet(1, row, 8));
				WebDriverWait wait = new WebDriverWait(driver, 10);
				WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+getdataxlsheet(1, row, 9)+"')]")));
				Clicks(suggestion);
				WebElement Roomno = driver.findElement(By.xpath("(//select[contains(@id,'roomNumber')])["+ (2 * i + 1) +"]"));
				Thread.sleep(1000);
				Selectdropdownbyvisibletext(Roomno, "1");
				}
			}
			row++;
		}	
		Thread.sleep(1000);
		try
		{
		WebElement Nationality = driver.findElement(By.xpath("(//input[@placeholder='Nationality'])[2]"));
		SendKeyy(Nationality, "IND");
		Thread.sleep(2000);
		Down();
		Enter();
		}
		catch (Exception e) {
			WebElement Nationality = driver.findElement(By.xpath("(//input[@placeholder='Nationality'])[1]"));
			SendKeyy(Nationality, "IND");
			Thread.sleep(2000);
			Down();
			Enter();
		}
		Selectdropdownbyvisibletext(PurposeofTravel, getdataxlsheet(0, rows, 5));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(Billable, getdataxlsheet(0, rows, 6));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(Billtoadress, getdataxlsheet(0, rows, 7));
		Clicks(Proceed);	
		try
		{
			WebElement yes = driver.findElement(By.xpath("(//input[@value='Yes'])[2]"));
			Clicks(yes);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void HotelRequestformforCUuser(int rows) throws Throwable
	{
		implicitwait();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		SendKeyy(Hotellocation, getdataxlsheet(0, rows, 1));
		List<WebElement> suggestions = wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li")));
		Down();
		Enter();
		//javascriptclick(selectsectororigin);
		javascriptclick(Checkin);
		Thread.sleep(1000);
		datepicks(getdataxlsheet(0, rows, 2));
		Thread.sleep(1000);
//		javascriptclick(Checkout);
//		Thread.sleep(1000);
//		datepicks(getdataxlsheet(0, 17, 3));
		Selectdropdownbyvisibletext(Adultcoutn, getdataxlsheet(0, rows, 4));
		int row = 1;
		List<WebElement> Totalemployees = wait1.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[contains(text(),'Passenger information')]"), 1));
		for(int i=0;i<Totalemployees.size();i++)
		{
			WebElement Passengerinformation = driver.findElement(By.xpath("(//a[contains(@title,'Guest')])["+(i+1)+"]"));
			String type = Passengerinformation.getText().trim();
			System.out.println(Totalemployees.size());
			System.out.println(type);
			if(type.equalsIgnoreCase(getdataxlsheet(1, row, 0)))	
			{
		javascriptclick(Passengerinformation);
		Thread.sleep(500);
		WebElement Title = driver.findElement(By.xpath("(//select[contains(@id,'titles')])["+(2 *( i + 1))+"]"));
		Thread.sleep(1000);
		javascriptclick(Title);
		Selectdropdownbyvisibletext(Title, getdataxlsheet(1, row, 1));
		WebElement Passengerfirstname = driver.findElement(By.xpath("(//input[contains(@id,'first_name')])["+(2 *( i + 1))+"]"));
		SendKeyy(Passengerfirstname, getdataxlsheet(1, row, 2));
		WebElement Passengerlastname = driver.findElement(By.xpath("(//input[contains(@id,'last_name')])["+(2 *( i + 1))+"]"));
		SendKeyy(Passengerlastname, getdataxlsheet(1, row, 3));
		WebElement PassengerMobileCode = driver.findElement(By.xpath("(//select[contains(@id,'mobile_code')])["+(i+1)+"]"));
		Clicks(PassengerMobileCode);
		Selectdropdownbyvisibletext(PassengerMobileCode, getdataxlsheet(1, row, 4));
		WebElement PassengerMobilenumber = driver.findElement(By.xpath("(//input[contains(@id,'mobile_number')])["+(2 *( i + 1))+"]"));
		SendKeyy(PassengerMobilenumber, getdataxlsheet(1, row, 5));
		WebElement PassengerEmailid = driver.findElement(By.xpath("(//input[contains(@id,'email')])["+(2 *( i + 1))+"]"));
		SendKeyy(PassengerEmailid, getdataxlsheet(1, row, 6));
		WebElement PassengerProjectCode = driver.findElement(By.xpath("(//input[contains(@id,'project_code')])["+(2 *( i + 1))+"]"));
		SendKeyy(PassengerProjectCode, getdataxlsheet(1, row, 7));
//		WebElement AdharCard = driver.findElement(By.xpath("//input[@placeholder='Enter aadhar number']["+(2 *( i + 1))+"]"));
//		SendKeyy(AdharCard, "123456789");
		WebElement Roomno = driver.findElement(By.xpath("(//select[contains(@id,'roomNumber')])["+(2 *( i + 1))+"]"));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(Roomno, "1");
		}
			else
			{

				WebElement EmployeeCode1 = driver.findElement(By.xpath("(//input[contains(@id,'employee_code')])[" + (2 * i + 1) + "]"));
				String value = EmployeeCode1.getAttribute("value");
				if(!value.isEmpty() || value != null)
				{
				WebElement Roomno = driver.findElement(By.xpath("(//select[contains(@id,'roomNumber')])["+ (2 * i + 1) +"]"));
				Thread.sleep(1000);
				Selectdropdownbyvisibletext(Roomno, "1");
				Thread.sleep(1000);
				WebElement Nationality = driver.findElement(By.xpath("(//input[@placeholder='Nationality'])[2]"));
				SendKeyy(Nationality, "IND");
				Thread.sleep(2000);
				Down();
				Enter();
				}
			}
			row++;
		}	
		Selectdropdownbyvisibletext(PurposeofTravel, getdataxlsheet(0, rows, 5));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(Billable, getdataxlsheet(0, rows, 6));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(Billtoadress, getdataxlsheet(0, rows, 7));
		Clicks(Proceed);
		try
		{
			WebElement yes = driver.findElement(By.xpath("(//input[@value='Yes'])[2]"));
			Clicks(yes);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	

}
