package org.Classfiles;

import java.io.IOException;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageEmployeeProfilePage extends BaseClass {
	
	public ManageEmployeeProfilePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@title='Add New Employee']")
	WebElement AddnewEmployee;
	
	@FindBy(xpath="//select[@id='employee_title']")
	WebElement Title;

	@FindBy(xpath="//input[@id='employee_first_name']")
	WebElement FirstName;

	@FindBy(xpath="//input[@id='employee_last_name']")
	WebElement LastName;

	@FindBy(xpath="(//input[contains(@placeholder,'Email')])[2]")
	WebElement EmailID;

	@FindBy(xpath="(//select[contains(@class,'modern-select')])[2]")
	WebElement MobileCode;

	@FindBy(xpath="//input[contains(@placeholder,'Mobile Number')]")
	WebElement MobileNumber;

	@FindBy(xpath="//input[contains(@placeholder,'Alternate Email')]")
	WebElement AlternateEmailID;

	@FindBy(xpath="(//select[contains(@class,'modern-select')])[3]")
	WebElement AlternateMobileCode;

	@FindBy(xpath="//input[contains(@placeholder,'Alternate Mobile Number')]")
	WebElement AlternateMobileNumber;

	@FindBy(xpath="//input[contains(@placeholder,'Employee Number')]")
	WebElement EmployeeNumber;

	@FindBy(xpath="//select[contains(@id,'band') or contains(@name,'band')]")
	WebElement EmployeeBand;

	@FindBy(xpath="//select[contains(@id,'designation') or contains(@name,'designation')]")
	WebElement Designation;

	@FindBy(xpath="//select[contains(@id,'department') or contains(@name,'department')]")
	WebElement Department;

	@FindBy(xpath="//select[@ng-model ='selectedCountry']")
	WebElement Location;

	@FindBy(xpath="//select[contains(@id,'timezone') or contains(@name,'timezone')]")
	WebElement Timezone;

	@FindBy(xpath="//select[contains(@id,'cost') or contains(@name,'cost')]")
	WebElement CostCenterCode;

	@FindBy(xpath="//select[contains(@id,'bill') or contains(@name,'bill')]")
	WebElement BillToAddress;

	@FindBy(xpath="//select[contains(@id,'user_type') or contains(@name,'user_type')]")
	WebElement UserType;

	@FindBy(xpath="//select[contains(@id,'status') or contains(@name,'status')]")
	WebElement Status;

	@FindBy(xpath="//input[contains(@placeholder,'Date') or @type='date']")
	WebElement DateOfBirth;
	
	@FindBy(xpath="(//button[contains(text(),'Next')])[1]")
	WebElement Nextbtn1;
	
	@FindBy(xpath="(//button[contains(text(),'Next')])[2]")
	WebElement Nextbtn2;
	
	@FindBy(xpath="(//button[contains(text(),'Next')])[3]")
	WebElement Nextbtn3;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement Submitbtn;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement OKbtn;

	
	
	
	public WebElement getOKbtn() {
		return OKbtn;
	}


	public WebElement getNextbtn1() {
		return Nextbtn1;
	}


	public WebElement getNextbtn2() {
		return Nextbtn2;
	}


	public WebElement getNextbtn3() {
		return Nextbtn3;
	}


	public WebElement getSubmitbtn() {
		return Submitbtn;
	}


	public WebElement getNextbtn() {
		return Nextbtn1;
	}


	public WebElement getTitle() {
		return Title;
	}


	public WebElement getFirstName() {
		return FirstName;
	}


	public WebElement getLastName() {
		return LastName;
	}


	public WebElement getEmailID() {
		return EmailID;
	}


	public WebElement getMobileCode() {
		return MobileCode;
	}



	public WebElement getMobileNumber() {
		return MobileNumber;
	}


	public WebElement getAlternateEmailID() {
		return AlternateEmailID;
	}


	public WebElement getAlternateMobileCode() {
		return AlternateMobileCode;
	}


	public WebElement getAlternateMobileNumber() {
		return AlternateMobileNumber;
	}


	public WebElement getEmployeeNumber() {
		return EmployeeNumber;
	}


	public WebElement getEmployeeBand() {
		return EmployeeBand;
	}


	public WebElement getDesignation() {
		return Designation;
	}


	public WebElement getDepartment() {
		return Department;
	}


	public WebElement getLocation() {
		return Location;
	}


	public WebElement getTimezone() {
		return Timezone;
	}


	public WebElement getCostCenterCode() {
		return CostCenterCode;
	}


	public WebElement getBillToAddress() {
		return BillToAddress;
	}


	public WebElement getUserType() {
		return UserType;
	}


	public WebElement getStatus() {
		return Status;
	}


	public WebElement getDateOfBirth() {
		return DateOfBirth;
	}


	public WebElement getAddnewEmployee() {
		return AddnewEmployee;
	}
	
	
	public void CorporateAdmin(int row) throws Throwable
	{
		implicitwait();
		Explictwait(AddnewEmployee);
		javascriptclick(AddnewEmployee);
		Explictwait(Title);
		Selectdropdownbyvisibletext(Title, getdataxlsheet(2, row, 0));
		SendKeyy(FirstName, getdataxlsheet(2, row, 1));
		SendKeyy(LastName, getdataxlsheet(2, row, 2));
		SendKeyy(EmailID, getdataxlsheet(2, row, 3));
		Selectdropdownbyvisibletext(MobileCode, getdataxlsheet(2, row, 4));
		SendKeyy(MobileNumber, getdataxlsheet(2, row, 5));
		SendKeyy(EmployeeNumber, getdataxlsheet(2, row, 6));
		Selectdropdownbyvisibletext(EmployeeBand,  "Add New");
		WebElement bandname = driver.findElement(By.xpath("//input[@id='newband']"));
		bandname.sendKeys("Test");
		Selectdropdownbyindex(Designation, 1);
		Selectdropdownbyindex(Department,  1);
		Selectdropdownbyvisibletext(Location,  getdataxlsheet(2, row, 7));
		Selectdropdownbyvisibletext(CostCenterCode,  "Add New");
		WebElement Costcenter = driver.findElement(By.xpath("//input[@id='newcostcenter']"));
		Costcenter.sendKeys("Test");
		Selectdropdownbyvisibletext(BillToAddress,  getdataxlsheet(2, row, 8));
		Selectdropdownbyvisibletext(UserType,  getdataxlsheet(2, row, 9));
		Clicks(Nextbtn1);
		Explictwait(Nextbtn2);
		Clicks(Nextbtn2);
		Explictwait(Nextbtn3);
		Clicks(Nextbtn3);
		Explictwait(Submitbtn);
		Clicks(Submitbtn);
		Explictwait(OKbtn);
		Clicks(OKbtn);
	}
	
	
	

}
