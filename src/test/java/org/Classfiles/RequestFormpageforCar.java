package org.Classfiles;

import java.util.List;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequestFormpageforCar extends BaseClass {

	public RequestFormpageforCar()
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//input[@placeholder='Select city']")
	WebElement Locationcity;

	@FindBy(xpath="//input[@placeholder='Pickup date']")
	WebElement Pickupdate;

	@FindBy(xpath="//select[@id='pickupTime0']")
	WebElement Pickuptime;

	@FindBy(xpath="//input[@placeholder='Departure / Arrival details']")
	WebElement Departuredetails;

	@FindBy(xpath="//input[@placeholder='Pickup location']")
	WebElement Pickupdetails;

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

	@FindBy(xpath = "(//input[@placeholder='Enter age'])[1]")
	WebElement Age;
	
	@FindBy(xpath = "(//input[@placeholder='Enter age'])[2]")
	WebElement GuestAge;

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

	public WebElement getLocationcity() {
		return Locationcity;
	}

	public WebElement getPickupdate() {
		return Pickupdate;
	}

	public WebElement getPickuptime() {
		return Pickuptime;
	}

	public WebElement getDeparturedetails() {
		return Departuredetails;
	}

	public WebElement getPickupdetails() {
		return Pickupdetails;
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

	public WebElement getAge() {
		return Age;
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


	public void CarRequestformCA(int rows) throws Throwable
	{
		implicitwait();
		//WebDriverWait wait1 = new WebDriverWait(driver, 20);
		SendKeyy(Locationcity, getdataxlsheet(0, rows, 1));
		Thread.sleep(1000);
		javascriptclick(Pickupdate);
		Thread.sleep(1000);
		datepicks(getdataxlsheet(0, rows, 2));
		Thread.sleep(1000);
		Selectdropdownbyindex(Pickuptime, 5);
		SendKeyy(Departuredetails, getdataxlsheet(0, rows, 3));
		SendKeyy(Pickupdetails, getdataxlsheet(0, rows, 4));
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
			try
			{
				SendKeyy(GuestAge, "25");
			}
			catch (Exception e) {
				SendKeyy(Age, "26");
			}
		}	
		Thread.sleep(1000);
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

	
	public void CombinationCarRequestformCA(int rows) throws Throwable
	{
		implicitwait();
		//WebDriverWait wait1 = new WebDriverWait(driver, 20);
		SendKeyy(Locationcity, getdataxlsheet(0, rows, 1));
		Thread.sleep(1000);
		javascriptclick(Pickupdate);
		Thread.sleep(1000);
		datepicks(getdataxlsheet(0, rows, 2));
		Thread.sleep(1000);
		Selectdropdownbyindex(Pickuptime, 5);
		SendKeyy(Departuredetails, getdataxlsheet(0, rows, 3));
		SendKeyy(Pickupdetails, getdataxlsheet(0, rows, 4));
			try
			{
				SendKeyy(GuestAge, "25");
			}
			catch (Exception e) {
				SendKeyy(Age, "26");
			}
		Thread.sleep(1000);
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
