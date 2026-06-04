package org.Classfiles;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageCorporatePage extends BaseClass {

	public ManageCorporatePage()
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[@title='Create Corporate']")
	WebElement CreateCorporatebtn;

	@FindBy(xpath="//select[@id='title']")
	WebElement Title;

	@FindBy(xpath="//input[@id='firstName']")
	WebElement FirstName;

	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement LastName;

	@FindBy(xpath="//input[@placeholder='Designation']")
	WebElement Designation;

	@FindBy(xpath="//input[@placeholder='Department']")
	WebElement Department;

	@FindBy(xpath="//input[@placeholder='Email Id']")
	WebElement EmailId;

	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	WebElement MobileNumber;

	@FindBy(xpath="//input[@placeholder='Corporate name']")
	WebElement Corporatename;

	@FindBy(xpath="//textarea[@placeholder='Address']")
	WebElement Address;

	@FindBy(xpath="(//select[contains(@name,'country') or contains(@id,'country')])[2]")
	WebElement Country;

	@FindBy(xpath="//select[contains(@name,'timezone') or contains(@id,'timezone')]")
	WebElement Timezone;

	@FindBy(xpath="//select[contains(@name,'state') or contains(@id,'state')]")
	WebElement State;

	@FindBy(xpath="//select[contains(@name,'city') or contains(@id,'city')]")
	WebElement City;

	@FindBy(xpath="//input[@placeholder='Pin code']")
	WebElement PinCode;

	@FindBy(xpath="//input[@placeholder='Website']")
	WebElement Website;

	@FindBy(xpath="//input[contains(@placeholder,'Landline Phone Number')]")
	WebElement ContactNumber;

	@FindBy(xpath="//input[contains(@placeholder,'No of employees')]")
	WebElement NoOfEmployees;

	@FindBy(xpath="//select[contains(@name,'taxType') or contains(@id,'type')]")
	WebElement TaxType;

	@FindBy(xpath="//input[@type='file']")
	WebElement SelectImageToUpload;

	@FindBy(xpath="//input[contains(@placeholder,'Web Service Agent Id')]")
	WebElement WebServiceAgentId;

	@FindBy(xpath="//textarea[contains(@placeholder,'Additional information')]")
	WebElement AdditionalInformation;

	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement SubmitBtn;

	@FindBy(xpath="//button[contains(text(),'Reset')]")
	WebElement ResetBtn;

	@FindBy(xpath="//input[@name='searchTextdataTable']")
	WebElement Searchfield;

	@FindBy(xpath="//a[@title='View']")
	WebElement Viewbtn;


	@FindBy(xpath="//form[@id='advInsertApproveCorporate']//input[contains(@id,'corporateTypeDeposit')]")
	WebElement Depositbtn;

	@FindBy(xpath="//form[@id='advInsertApproveCorporate']//input[contains(@id,'corporateTypeUpfront')]")
	WebElement Upfrontbtn;

	@FindBy(xpath="//button[contains(text(),'Approve')]")
	WebElement Approvebtn;




	public WebElement getSearchfield() {
		return Searchfield;
	}

	public WebElement getViewbtn() {
		return Viewbtn;
	}

	public WebElement getDepositbtn() {
		return Depositbtn;
	}

	public WebElement getUpfrontbtn() {
		return Upfrontbtn;
	}

	public WebElement getApprovebtn() {
		return Approvebtn;
	}

	public WebElement getDepartment() {
		return Department;
	}

	public WebElement getCreateCorporatebtn() {
		return CreateCorporatebtn;
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

	public WebElement getDesignation() {
		return Designation;
	}

	public WebElement getEmailId() {
		return EmailId;
	}

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	public WebElement getCorporatename() {
		return Corporatename;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getTimezone() {
		return Timezone;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getPinCode() {
		return PinCode;
	}

	public WebElement getWebsite() {
		return Website;
	}

	public WebElement getContactNumber() {
		return ContactNumber;
	}

	public WebElement getNoOfEmployees() {
		return NoOfEmployees;
	}

	public WebElement getTaxType() {
		return TaxType;
	}

	public WebElement getSelectImageToUpload() {
		return SelectImageToUpload;
	}

	public WebElement getWebServiceAgentId() {
		return WebServiceAgentId;
	}

	public WebElement getAdditionalInformation() {
		return AdditionalInformation;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}

	public WebElement getResetBtn() {
		return ResetBtn;
	}



	public void CorporateRegister(int rownumber) throws Throwable
	{

		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 15);
		Explictwait(CreateCorporatebtn);
		Clicks(CreateCorporatebtn);
		SendKeyy(FirstName, getdataxlsheet(3, rownumber, 1));
		SendKeyy(LastName, getdataxlsheet(3, rownumber, 2));
		SendKeyy(Designation, getdataxlsheet(3, rownumber, 3));
		SendKeyy(Department, getdataxlsheet(3, rownumber, 4));
		SendKeyy(MobileNumber, getdataxlsheet(3, rownumber, 5));
		SendKeyy(EmailId, getdataxlsheet(3, rownumber, 6));
		SendKeyy(Corporatename, getdataxlsheet(3, rownumber, 7));
		SendKeyy(Address, getdataxlsheet(3, rownumber, 8));
		Selectdropdownbyvisibletext(Country, getdataxlsheet(3, rownumber, 9));
		Clicks(State);
		Selectdropdownbyvisibletext(State, getdataxlsheet(3, rownumber, 10));
		Clicks(City);
		Selectdropdownbyvisibletext(City, getdataxlsheet(3, rownumber, 11));
		SendKeyy(PinCode, getdataxlsheet(3, rownumber, 12));
		SendKeyy(Website, getdataxlsheet(3, rownumber, 13));
		SendKeyy(ContactNumber, getdataxlsheet(3, rownumber, 14));
		SendKeyy(NoOfEmployees, getdataxlsheet(3, rownumber, 15));
		Clicks(TaxType);
		Selectdropdownbyvisibletext(TaxType, getdataxlsheet(3, rownumber, 16));
		WebElement upload = driver.findElement(By.xpath("//input[@value='Browse...']"));
		Clicks(upload);
		Thread.sleep(3000);
		String filePath = "Sample.png";
		StringSelection selection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Clicks(SubmitBtn);
		WebElement Okbtn = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='proceedModal']")));
		Clicks(Okbtn);

	}

	public void ApproveCorporate(int rownumber) throws Throwable
	{

		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 15);
		Explictwait(CreateCorporatebtn);
		SendKeyy(Searchfield, getdataxlsheet(3, rownumber, 7));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='View']")));
		Clicks(Viewbtn);
		List<WebElement> Allcheckbox = driver.findElements(By.xpath("//form[@id='advInsertApproveCorporate']//i[contains(@class,'infi-icon')]"));
		int cellnumber =17;
		for(int i=0;i<Allcheckbox.size();i++)
		{
			if(getdataxlsheet(3, rownumber, cellnumber).equalsIgnoreCase("Y"))
			{
				WebElement Selectcheckbox = Allcheckbox.get(i);
				javascriptclick(Selectcheckbox);
			}
			cellnumber++;
		}
		String Corporatetype = getdataxlsheet(3, 2, 20);
		System.out.println("The corporate type is " + Corporatetype);
		if(Corporatetype.equalsIgnoreCase("Deposit"))
		{
			javascriptclick(Depositbtn);
		}
		else {
			javascriptclick(Upfrontbtn);
		}
		Clicks(Approvebtn);
		WebElement Okbtn = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='proceedModal']")));
		Clicks(Okbtn);



	}

}
