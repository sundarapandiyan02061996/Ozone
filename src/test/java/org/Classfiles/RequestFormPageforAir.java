package org.Classfiles;

import java.io.IOException;
import java.util.List;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codeborne.selenide.commands.Click;

public class RequestFormPageforAir extends BaseClass {
	
	
	public RequestFormPageforAir()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@title='Domestic']")
	WebElement Domestic;

	@FindBy(xpath = "//a[@title='International']")
	WebElement International;

	@FindBy(xpath = "//span[text()='Flight']")
	WebElement FlightTab;

	@FindBy(xpath = "//span[text()='Hotel']")
	WebElement HotelTab;

	@FindBy(xpath = "//span[text()='Car']")
	WebElement CarTab;

	@FindBy(xpath = "//span[text()='Visa']")
	WebElement VisaTab;

	@FindBy(xpath = "//span[text()='Insurance']")
	WebElement InsuranceTab;

	@FindBy(xpath = "//select[@id='adultcount']")
	WebElement TravellersDropdown;
	
	@FindBy(xpath = "//select[@id='adultcountInter']")
	WebElement TravellersDropdownInternational;

	@FindBy(xpath = "(//select[@id='flightClass'])[1]")
	WebElement CabinDropdown;

	@FindBy(xpath = "(//input[contains(@id,'depFrom')])[1]")
	WebElement DepartureFrom;

	@FindBy(xpath = "//input[@id='depTo0']")
	WebElement GoingTo;

	@FindBy(xpath = "(//input[contains(@id,'depFrom')])[2]")
	WebElement InternationalDepartureFrom;

	@FindBy(xpath = "//input[@id='idepTo0']")
	WebElement InternationalGoingTo;
	
	@FindBy(xpath = "(//input[contains(@id,'onwardDate0')])[1]")
	WebElement TravelDates;
	
	@FindBy(xpath = "(//input[contains(@id,'endDate')])[1]")
	WebElement ReturnDate;

	@FindBy(xpath = "//a[contains(text(),'Advanced search')]")
	WebElement AdvancedSearch;

	@FindBy(xpath = "(//p[contains(@id,'Employee0')])")
	WebElement EmployeeRadio;

	@FindBy(xpath = "(//p[contains(@id,'Guest0')])")
	WebElement GuestRadio;

	@FindBy(xpath = "(//select[contains(@id,'titles0')])[2]")
	WebElement TitleDropdown;

	@FindBy(xpath = "(//input[@id='first_name0'])[1]")
	WebElement FirstName;

	@FindBy(xpath = "(//input[@id='last_name0'])[1]")
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
	WebElement Billable;
	
	@FindBy(xpath = "(//button[@id='proceed'])[1]")
	WebElement Proceed;
	
	@FindBy(xpath="//input[@id='ionwardDate0']")
	WebElement InternationalaDeparturedate;
	
	@FindBy(xpath="//input[@id='iendDate']")
	WebElement InternationalaEndDate;

	
	
	public WebElement getTravellersDropdownInternational() {
		return TravellersDropdownInternational;
	}

	public WebElement getInternationalaDeparturedate() {
		return InternationalaDeparturedate;
	}

	public WebElement getInternationalaEndDate() {
		return InternationalaEndDate;
	}

	public WebElement getInternationalDepartureFrom() {
		return InternationalDepartureFrom;
	}

	public WebElement getInternationalGoingTo() {
		return InternationalGoingTo;
	}

	public WebElement getDomestic() {
		return Domestic;
	}

	public WebElement getInternational() {
		return International;
	}

	public WebElement getFlightTab() {
		return FlightTab;
	}

	public WebElement getHotelTab() {
		return HotelTab;
	}

	public WebElement getCarTab() {
		return CarTab;
	}

	public WebElement getVisaTab() {
		return VisaTab;
	}

	public WebElement getInsuranceTab() {
		return InsuranceTab;
	}

	public WebElement getTravellersDropdown() {
		return TravellersDropdown;
	}

	public WebElement getCabinDropdown() {
		return CabinDropdown;
	}

	public WebElement getDepartureFrom() {
		return DepartureFrom;
	}

	public WebElement getGoingTo() {
		return GoingTo;
	}

	public WebElement getTravelDates() {
		return TravelDates;
	}

	public WebElement getReturnDate() {
		return ReturnDate;
	}

	public WebElement getAdvancedSearch() {
		return AdvancedSearch;
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

	public WebElement getBillable() {
		return Billable;
	}

	public WebElement getProceed() {
		return Proceed;
	}
	
	
	public void RequestFormfillingOW(int rows ) throws Throwable
	{
		
		implicitwait();
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(TravellersDropdown, getdataxlsheet(0, rows, 1));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(CabinDropdown, getdataxlsheet(0, rows, 2));
		SendKeyy(DepartureFrom, getdataxlsheet(0, rows, 3));
		WebElement selectsectororigin = driver.findElement(By.xpath("(//a[contains(@class,'city')]//span[contains(text(),'"+ getdataxlsheet(0, rows, 3)+"')])[1]"));
		javascriptclick(selectsectororigin);
		Thread.sleep(1000);
		SendKeyy(GoingTo, getdataxlsheet(0, rows, 4));
		WebElement selectsectordestination = driver.findElement(By.xpath("(//a[contains(@class,'city')]//span[contains(text(),'"+ getdataxlsheet(0, rows, 4)+"')])[1]"));
		javascriptclick(selectsectordestination);
		Thread.sleep(3000);
		datepicks(getdataxlsheet(0, rows, 5));
		Thread.sleep(3000);
		int row = 1;
		List<WebElement> Totalemployees = driver.findElements(By.xpath("//span[contains(text(),'Passenger information')]"));
		for(int i=0;i<Totalemployees.size();i++)
		{
			WebElement Passengerinformation = driver.findElement(By.xpath("(//a[contains(@title,'Guest')])["+(i+1)+"]"));
			String type = Passengerinformation.getText().trim();
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
				}
			}
			row++;
		}	
		Selectdropdownbyvisibletext(PurposeofTravel, getdataxlsheet(0, rows, 7));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(Billable, getdataxlsheet(0, rows, 8));
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
	
	
	public void RequestFormfillingRT(int rows ) throws Throwable
	{
		implicitwait();
		Selectdropdownbyvisibletext(TravellersDropdown, getdataxlsheet(0, rows, 1));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(CabinDropdown, getdataxlsheet(0, rows, 2));
		SendKeyy(DepartureFrom, getdataxlsheet(0, rows, 3));
		WebElement selectsectororigin = driver.findElement(By.xpath("(//a[contains(@class,'city')]//span[contains(text(),'"+ getdataxlsheet(0, rows, 3)+"')])[1]"));
		javascriptclick(selectsectororigin);
		Thread.sleep(1000);
		SendKeyy(GoingTo, getdataxlsheet(0, rows, 4));
		WebElement selectsectordestination = driver.findElement(By.xpath("(//a[contains(@class,'city')]//span[contains(text(),'"+ getdataxlsheet(0, rows, 4)+"')])[1]"));
		javascriptclick(selectsectordestination);
		Thread.sleep(2000);
		datepicks(getdataxlsheet(0, rows, 5));
		Thread.sleep(2000);
		javascriptclick(ReturnDate);
		Thread.sleep(2000);
		datepicks(getdataxlsheet(0, rows, 6));
		Thread.sleep(2000);
		int row = 1;
		List<WebElement> Totalemployees = driver.findElements(By.xpath("//span[contains(text(),'Passenger information')]"));
		for(int i=0;i<Totalemployees.size();i++)
		{
			WebElement Passengerinformation = driver.findElement(By.xpath("(//a[contains(@title,'Guest')])["+(i+1)+"]"));
			String type = Passengerinformation.getText().trim();
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
				}
			}
			row++;
		}	
		Selectdropdownbyvisibletext(PurposeofTravel, getdataxlsheet(0, rows, 7));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(Billable, getdataxlsheet(0, rows, 8));
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
	
	
	public void RequestFormfillingInternationalOW(int rows) throws Throwable
	{
		implicitwait();
		Thread.sleep(500);
		javascriptclick(International);
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(TravellersDropdownInternational, getdataxlsheet(0, rows, 1));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(CabinDropdown, getdataxlsheet(0, rows, 2));
		SendKeyy(InternationalDepartureFrom, getdataxlsheet(0, rows, 3));
		//WebElement selectsectororigin = driver.findElement(By.xpath("//li[contains(text(),"+ getdataxlsheet(0, 4, 3)+")]"));
		Thread.sleep(2000);
		Down();
		Enter();
		Thread.sleep(1000);
		SendKeyy(InternationalGoingTo, getdataxlsheet(0, rows, 4));
		//WebElement selectsectordestination = driver.findElement(By.xpath("//li[contains(text(),"+ getdataxlsheet(0, 4, 4)+")]"));
		Thread.sleep(2000);
		Down();
		Enter();
		Thread.sleep(1000);
		javascriptclick(InternationalaDeparturedate);
		Thread.sleep(1000);
		datepicks(getdataxlsheet(0, rows, 5));
		Thread.sleep(3000);
		int row = 1;
		List<WebElement> Totalemployees = driver.findElements(By.xpath("//span[contains(text(),'Passenger information')]"));
		for(int i=0;i<Totalemployees.size();i++)
		{
			WebElement Passengerinformation = driver.findElement(By.xpath("(//a[contains(@title,'Guest')])["+(i+1)+"]"));
			String type = Passengerinformation.getText().trim();
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
				}
			}
			row++;
		}	
		Selectdropdownbyvisibletext(PurposeofTravel, getdataxlsheet(0, rows, 7));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(Billable, getdataxlsheet(0, rows, 8));
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
	
	public void RequestFormfillingInternationalRT(int rows) throws Throwable
	{
		implicitwait();
		Thread.sleep(500);
		javascriptclick(International);
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(TravellersDropdownInternational, getdataxlsheet(0, rows, 1));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(CabinDropdown, getdataxlsheet(0, rows, 2));
		SendKeyy(InternationalDepartureFrom, getdataxlsheet(0, rows, 3));
		//WebElement selectsectororigin = driver.findElement(By.xpath("//li[contains(text(),"+ getdataxlsheet(0, 4, 3)+")]"));
		Thread.sleep(2000);
		Down();
		Enter();
		Thread.sleep(1000);
		SendKeyy(InternationalGoingTo, getdataxlsheet(0, rows, 4));
		//WebElement selectsectordestination = driver.findElement(By.xpath("//li[contains(text(),"+ getdataxlsheet(0, 4, 4)+")]"));
		Thread.sleep(1000);
		Down();
		Enter();
		Thread.sleep(1000);
		javascriptclick(InternationalaDeparturedate);
		Thread.sleep(1000);
		datepicks(getdataxlsheet(0, rows, 5));
		Thread.sleep(3000);
		WebElement Enddate = driver.findElement(By.xpath("//input[@id='iendDate']"));
		javascriptclick(Enddate);
		datepicks(getdataxlsheet(0, rows, 6));
		int row = 1;
		List<WebElement> Totalemployees = driver.findElements(By.xpath("//span[contains(text(),'Passenger information')]"));
		for(int i=0;i<Totalemployees.size();i++)
		{
			WebElement Passengerinformation = driver.findElement(By.xpath("(//a[contains(@title,'Guest')])["+(i+1)+"]"));
			String type = Passengerinformation.getText().trim();
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
				}
			}
			row++;
		}	
		Selectdropdownbyvisibletext(PurposeofTravel, getdataxlsheet(0, rows, 7));
		Thread.sleep(1000);
		Selectdropdownbyvisibletext(Billable, getdataxlsheet(0, rows, 8));
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

		
