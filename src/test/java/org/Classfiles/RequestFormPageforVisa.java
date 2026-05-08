package org.Classfiles;

import java.util.List;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequestFormPageforVisa extends BaseClass {
	
	
	public RequestFormPageforVisa()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@placeholder='Enter country']")
	WebElement Country;
	
	@FindBy(xpath="//select[@id='visa_type']")
	WebElement Visatype;
	
	@FindBy(xpath="//select[@id='journey_type']")
	WebElement Journytype;
	
	@FindBy(xpath="//select[@id='noOfPassnger']")
	WebElement NoofPassenger;
	
	@FindBy(xpath="//input[@placeholder='Onward date']")
	WebElement OnwardDate;
	
	@FindBy(xpath="//input[@placeholder='Return date']")
	WebElement ReturnDate;
	

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
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement Submitbtn;
	
	


	public WebElement getSubmitbtn() {
		return Submitbtn;
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

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getVisatype() {
		return Visatype;
	}

	public WebElement getJournytype() {
		return Journytype;
	}

	public WebElement getNoofPassenger() {
		return NoofPassenger;
	}

	public WebElement getOnwardDate() {
		return OnwardDate;
	}

	public WebElement getReturnDate() {
		return ReturnDate;
	}
	
	
	

	public void VisaRequestFormfillingCA(int rows ) throws Throwable
	{
		
		implicitwait();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		SendKeyy(Country, getdataxlsheet(0, rows, 1));
		Thread.sleep(1000);
		List<WebElement> suggestions = wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li")));
		Down();
		Enter();
		Selectdropdownbyvisibletext(Visatype, getdataxlsheet(0, rows, 2));
		Selectdropdownbyvisibletext(Journytype, getdataxlsheet(0, rows, 3));
		Selectdropdownbyvisibletext(NoofPassenger, getdataxlsheet(0, rows, 4));
		javascriptclick(OnwardDate);
		Thread.sleep(1000);
		datepicks(getdataxlsheet(0, rows, 5));
		Thread.sleep(1000);
		javascriptclick(ReturnDate);
		Thread.sleep(1000);
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
		WebElement PassengerMobileCode = driver.findElement(By.xpath("(//select[contains(@id,'mobile_code')])["+(2 *( i + 1))+"]"));
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
		Selectdropdownbyvisibletext(Billtoadress, getdataxlsheet(0, rows, 8));
		List<WebElement> TotalPassports = driver.findElements(By.xpath("//div[contains(@class,'passport-form row')]"));
		int Noofadults = TotalPassports.size();
		System.out.println("Total passpots are "+Noofadults );
		List<WebElement> PassportNo = driver.findElements(By.xpath("//input[@placeholder='Passport number']"));
		List<WebElement> Nationality = driver.findElements(By.xpath("//input[@placeholder='Nationality']"));
		List<WebElement> Placeofissues = driver.findElements(By.xpath("//input[@placeholder='Place of issue']"));
		List<WebElement> DateofBirthCalenders = driver.findElements(By.xpath("//input[contains(@id,'dateOfBirth')]"));
		List<WebElement> DateofIssueCalenders = driver.findElements(By.xpath("//input[contains(@id,'dateOfIssue')]"));
		List<WebElement> DateofExpiryCalenders = driver.findElements(By.xpath("//input[contains(@id,'expiryDate')]"));
		List<WebElement> Address = driver.findElements(By.xpath("//textarea[contains(@id,'address')]"));	
		int sheetnum = 1;
		int rownumber = 15;
		for(int i=0; i<Noofadults;i++)
		{
//			System.out.println("The i value is "+ i);
			String value = PassportNo.get(i).getAttribute("value");
			if(value.isEmpty() || value == null)
			{
			SendKeyy(PassportNo.get(i), getdataxlsheet(sheetnum, rownumber, 2));
			SendKeyy(Placeofissues.get(i), getdataxlsheet(sheetnum, rownumber, 4));
			Thread.sleep(2000);
			Down();
			Enter();
			Thread.sleep(1000);
			SendKeyy(Nationality.get(i), getdataxlsheet(sheetnum, rownumber, 3));
			Thread.sleep(2000);
			Down();
			Enter();
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
			Selectdropdownbyindex(year1, 50);
			WebElement month1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Selectdropdownbyindex(month1, i);
			WebElement SelectDate1 = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]"));
			javascriptclick(SelectDate1);
			Thread.sleep(1000);
			javascriptclick(DateofExpiryCalenders.get(i));
			Thread.sleep(500);
			javascriptclick(DateofExpiryCalenders.get(i));
			dateselect("50");
			Thread.sleep(1000);
			SendKeyy(Address.get(i), getdataxlsheet(sheetnum, rownumber, 5));
			rownumber++;
			}
			else
			{
				System.out.println("Details are already given");
				}
		}		
		Clicks(Submitbtn);
		try
		{
			WebElement yes = driver.findElement(By.xpath("(//input[@value='Yes'])[2]"));
			Clicks(yes);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
}
	

	
	public void VisaRequestFormfillingCU(int rows ) throws Throwable
	{
		
		implicitwait();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		SendKeyy(Country, getdataxlsheet(0, rows, 1));
		Thread.sleep(1000);
		List<WebElement> suggestions = wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li")));
		Down();
		Enter();
		Selectdropdownbyvisibletext(Visatype, getdataxlsheet(0, rows, 2));
		Selectdropdownbyvisibletext(Journytype, getdataxlsheet(0, rows, 3));
		//Selectdropdownbyvisibletext(NoofPassenger, getdataxlsheet(0, rows, 4));
		javascriptclick(OnwardDate);
		Thread.sleep(1000);
		datepicks(getdataxlsheet(0, rows, 5));
		Thread.sleep(1000);
		javascriptclick(ReturnDate);
		Thread.sleep(1000);
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
		WebElement PassengerMobileCode = driver.findElement(By.xpath("(//select[contains(@id,'mobile_code')])["+(2 *( i + 1))+"]"));
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
		Selectdropdownbyvisibletext(Billtoadress, getdataxlsheet(0, rows, 8));
		List<WebElement> TotalPassports = driver.findElements(By.xpath("//div[contains(@class,'passport-form row')]"));
		int Noofadults = TotalPassports.size();
		System.out.println("Total passpots are "+Noofadults );
		List<WebElement> PassportNo = driver.findElements(By.xpath("//input[@placeholder='Passport number']"));
		List<WebElement> Nationality = driver.findElements(By.xpath("//input[@placeholder='Nationality']"));
		List<WebElement> Placeofissues = driver.findElements(By.xpath("//input[@placeholder='Place of issue']"));
		List<WebElement> DateofBirthCalenders = driver.findElements(By.xpath("//input[contains(@id,'dateOfBirth')]"));
		List<WebElement> DateofIssueCalenders = driver.findElements(By.xpath("//input[contains(@id,'dateOfIssue')]"));
		List<WebElement> DateofExpiryCalenders = driver.findElements(By.xpath("//input[contains(@id,'expiryDate')]"));
		List<WebElement> Address = driver.findElements(By.xpath("//textarea[contains(@id,'address')]"));	
		int sheetnum = 1;
		int rownumber = 15;
		for(int i=0; i<Noofadults;i++)
		{
//			System.out.println("The i value is "+ i);
			String value = PassportNo.get(i).getAttribute("value");
			if(value.isEmpty() || value == null)
			{
			SendKeyy(PassportNo.get(i), getdataxlsheet(sheetnum, rownumber, 2));
			SendKeyy(Placeofissues.get(i), getdataxlsheet(sheetnum, rownumber, 4));
			Thread.sleep(2000);
			Down();
			Enter();
			Thread.sleep(1000);
			SendKeyy(Nationality.get(i), getdataxlsheet(sheetnum, rownumber, 3));
			Thread.sleep(2000);
			Down();
			Enter();
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
			Selectdropdownbyindex(year1, 50);
			WebElement month1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Selectdropdownbyindex(month1, i);
			WebElement SelectDate1 = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]"));
			javascriptclick(SelectDate1);
			Thread.sleep(1000);
			javascriptclick(DateofExpiryCalenders.get(i));
			Thread.sleep(500);
			javascriptclick(DateofExpiryCalenders.get(i));
			dateselect("50");
			Thread.sleep(1000);
			SendKeyy(Address.get(i), getdataxlsheet(sheetnum, rownumber, 5));
			rownumber++;
			}
			else
			{
				System.out.println("Details are already given");
				}
		}		
		Clicks(Submitbtn);
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
