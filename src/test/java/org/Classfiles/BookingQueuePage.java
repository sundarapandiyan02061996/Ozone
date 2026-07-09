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

public class BookingQueuePage extends BaseClass {

	public BookingQueuePage()
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//div[contains(@class,'fil-icon')]")
	WebElement Filtericon;

	@FindBy(xpath="//li//a[contains(text(),'Reference Based')]")
	WebElement Referencebasedbtn;

	@FindBy(xpath="//select[@id='referenceType']")
	WebElement Referencetypedpd;

	@FindBy(xpath="//input[@id='referenceNumber']")
	WebElement ReferenceID;

	@FindBy(xpath="//a[@id='filterSearch']")
	WebElement Searchbtn;

	@FindBy(xpath="//a[contains(@class,'details-control')]")
	WebElement Expanddetails;

	@FindBy(xpath="(//a[@title='Fulfill'])[1]")
	WebElement Fullfilbtn;

	@FindBy(xpath="(//a[@title='Fulfill'])[2]")
	WebElement FullfilbtnCar;

	@FindBy(xpath="(//a[@title='Fulfill'])[5]")
	WebElement FullfilbtnHotel;

	@FindBy(xpath="(//a[@title='Fulfill'])[7]")
	WebElement FullfilbtnInsurance;

	@FindBy(xpath="(//a[@title='Fulfill'])[6]")
	WebElement FullfilbtnVisa;

	@FindBy(xpath="//button[contains(text(),'Continue Fulfillment')]")
	WebElement ContinueFullfilbtn;

	@FindBy(xpath="//input[contains(@value,'Continue Fulfillment')]")
	WebElement ContinueFullfilbtnCar;

	@FindBy(xpath="//input[@id='reservation_ref_Return']")
	WebElement ReservationreferencefieldReturn;

	@FindBy(xpath="//input[@id='pnr_Return']")
	WebElement AirlinePNRReturn;

	@FindBy(xpath="//input[@id='ticketNumber_Return']")
	WebElement TicketnoReturn;

	@FindBy(xpath="//input[@id='cancellation_Return']")
	WebElement CancellfeeReturn;

	@FindBy(xpath="//select[@id='reservationId_Return']")
	WebElement AirlineloginiddpdReturn;

	@FindBy(xpath="//select[@id='fareType_Return']")
	WebElement FaretypedpdReturn;

	@FindBy(xpath="//input[@id='reservation_ref_Onward']")
	WebElement Reservationreferencefield;

	@FindBy(xpath="//input[@id='pnr_Onward']")
	WebElement AirlinePNR;

	@FindBy(xpath="//input[@id='ticketNumber_Onward']")
	WebElement Ticketno;

	@FindBy(xpath="//input[@id='cancellation_Onward']")
	WebElement Cancellfee;

	@FindBy(xpath="//select[@id='reservationId_Onward']")
	WebElement Airlineloginiddpd;

	@FindBy(xpath="//select[@id='fareType_Onward']")
	WebElement Faretypedpd;

	@FindBy(xpath="(//button[contains(text(),'Submit')])[1]")
	WebElement Submitbtn;

	@FindBy(xpath="(//button[contains(text(),'Proceed')])[1]")
	WebElement Proceedbtn;

	@FindBy(xpath="(//span[contains(text(),'×')])[1]")
	WebElement Closebtn;

	@FindBy(xpath="(//span[contains(text(),'Log Out')])")
	WebElement logoutbtn;

	@FindBy(xpath="//div[@class='Return']")
	WebElement Return;

	@FindBy(xpath="//select[@id='carType']")
	WebElement Cartype;

	@FindBy(xpath="//select[@id='carModel']")
	WebElement CarModel;

	@FindBy(xpath="//input[@id='serviceType']")
	WebElement ServiceType;

	@FindBy(xpath="//input[@id='carRegNo']")
	WebElement CarRegNo;

	@FindBy(xpath="//input[@id='chauffeurContact']")
	WebElement chauffeurContact;

	@FindBy(xpath="//input[@id='chauffeurName']")
	WebElement chauffeurName;


	@FindBy(xpath="//input[@id='markUp']")
	WebElement CommercialValue;


	@FindBy(xpath="//input[@id='amount']")
	WebElement Amount;

	@FindBy(xpath="//input[@id='voucherCode']")
	WebElement VoucherCode;

	@FindBy(xpath="(//input[contains(@value,'Submit')])")
	WebElement CarSubmitbtn;


	@FindBy(xpath="//input[@id='insuarnceCharge']")
	WebElement InsuranceCharge;


	@FindBy(xpath="//input[@id='markUpFee']")
	WebElement CommercialVaueInsurance;

	@FindBy(xpath="//input[@id='serviceCharge']")
	WebElement ServiceCharge;



	@FindBy(xpath="//input[@id='visacharge']")
	WebElement VisaCharge;

	@FindBy(xpath="//select[@id='charge_class_type']")
	WebElement VisaTransactionType;


	@FindBy(xpath="//input[@id='markUpFee']")
	WebElement CommercialValueVisa;

	@FindBy(xpath="//input[@id='servicecharge']")
	WebElement ServiceChargeVisa;

	@FindBy(xpath="//input[@id='onlineAppCharge']")
	WebElement OnlineApplicationChargeVisa;

	@FindBy(xpath="//input[@id='courierCharge']")
	WebElement CourierCharge;

	@FindBy(xpath="//input[@id='handlingCharge']")
	WebElement HandlingCharge;

	@FindBy(xpath="//input[@id='photoCharge']")
	WebElement PhotoCharge;

	@FindBy(xpath="//input[@id='attestationCharge']")
	WebElement AttestationCharge;

	@FindBy(xpath="//input[@id='boardCharge']")
	WebElement BoardCharge;

	@FindBy(xpath="//select[@id='paymentType']")
	WebElement PaymentType;

	@FindBy(xpath="//select[@id='requestType']")
	WebElement Requesttypedpd;

	@FindBy(xpath="//select[@id='bookingStatus']")
	WebElement Bookingstatusdpd;

	@FindBy(xpath="//input[@name='searchTextdataTable']")
	WebElement Searchfield;

	@FindBy(xpath="//a[@title='Product Settings']")
	WebElement Productsetting;

	@FindBy(xpath="//ul//li//a[contains(text(),' Manage Corporate ')]")
	WebElement ManageCorporate;

	@FindBy(xpath="//a[@title='Admin']")
	WebElement Admin;
	
	@FindBy(xpath="//ul//li//a[contains(text(),' Manage BilTo')]")
	WebElement ManageBilTo;
	
	@FindBy(xpath="//ul//li//a[contains(text(),' Manage GST')]")
	WebElement ManageGST;
	
	@FindBy(xpath="//a[@title='Operations']")
	WebElement Operations;
	
	@FindBy(xpath="//div//ul//li//a[contains(text(),' Cancellation Queue ')]")
	WebElement CancellationQueue;
	
	@FindBy(xpath="(//a[contains(@title,'Cancel')])[2]")
	WebElement Cancelbtn;
	
	@FindBy(xpath="(//a[contains(@title,'Cancel')])[5]")
	WebElement FlightCancelbtn;
	
	@FindBy(xpath="//button[contains(text(),'Proceed')]")
	WebElement Proceedwhenopentherequest;
	
	@FindBy(xpath="//input[contains(@id,'CancellationCharge')]")
	WebElement CancellationCharge;
	
	@FindBy(xpath="//textarea[contains(@id,'cancelreason')]")
	WebElement CancellationComments;
	
	@FindBy(xpath="//input[contains(@value,'Submit')]")
	WebElement Submitbtnincacel;
	
	@FindBy(xpath="(//input[contains(@value,'Submit')])[1]")
	WebElement Submitbtnincacelforflight;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	WebElement Okbtn;
	
	@FindBy(xpath="//input[@id='splitPnr00']")
	WebElement SplitPNR;
	
	@FindBy(xpath="//input[@id='splitPnr10']")
	WebElement SplitPNR2;
	
	@FindBy(xpath="//input[@value='Next']")
	WebElement Nextbtn;
	
	
	
	
	public WebElement getSplitPNR2() {
		return SplitPNR2;
	}

	public WebElement getNextbtn() {
		return Nextbtn;
	}

	public WebElement getSplitPNR() {
		return SplitPNR;
	}

	public WebElement getFlightCancelbtn() {
		return FlightCancelbtn;
	}

	public WebElement getSubmitbtnincacelforflight() {
		return Submitbtnincacelforflight;
	}

	public WebElement getCancelbtn() {
		return Cancelbtn;
	}

	public WebElement getProceedwhenopentherequest() {
		return Proceedwhenopentherequest;
	}

	public WebElement getCancellationCharge() {
		return CancellationCharge;
	}

	public WebElement getCancellationComments() {
		return CancellationComments;
	}

	public WebElement getSubmitbtnincacel() {
		return Submitbtnincacel;
	}

	public WebElement getOkbtn() {
		return Okbtn;
	}

	public WebElement getOperations() {
		return Operations;
	}

	public WebElement getCancellationQueue() {
		return CancellationQueue;
	}

	public WebElement getManageGST() {
		return ManageGST;
	}

	public WebElement getAdmin() {
		return Admin;
	}

	public WebElement getManageBilTo() {
		return ManageBilTo;
	}

	public WebElement getProductsetting() {
		return Productsetting;
	}

	public WebElement getManageCorporate() {
		return ManageCorporate;
	}

	public WebElement getFullfilbtnHotel() {
		return FullfilbtnHotel;
	}

	public WebElement getSearchfield() {
		return Searchfield;
	}

	public WebElement getRequesttypedpd() {
		return Requesttypedpd;
	}

	public WebElement getBookingstatusdpd() {
		return Bookingstatusdpd;
	}

	public WebElement getFullfilbtnVisa() {
		return FullfilbtnVisa;
	}

	public WebElement getVisaCharge() {
		return VisaCharge;
	}

	public WebElement getVisaTransactionType() {
		return VisaTransactionType;
	}

	public WebElement getCommercialValueVisa() {
		return CommercialValueVisa;
	}

	public WebElement getServiceChargeVisa() {
		return ServiceChargeVisa;
	}

	public WebElement getOnlineApplicationChargeVisa() {
		return OnlineApplicationChargeVisa;
	}

	public WebElement getCourierCharge() {
		return CourierCharge;
	}

	public WebElement getHandlingCharge() {
		return HandlingCharge;
	}

	public WebElement getPhotoCharge() {
		return PhotoCharge;
	}

	public WebElement getAttestationCharge() {
		return AttestationCharge;
	}

	public WebElement getBoardCharge() {
		return BoardCharge;
	}

	public WebElement getPaymentType() {
		return PaymentType;
	}

	public WebElement getFullfilbtnInsurance() {
		return FullfilbtnInsurance;
	}

	public WebElement getInsuranceCharge() {
		return InsuranceCharge;
	}

	public WebElement getCommercialVaueInsurance() {
		return CommercialVaueInsurance;
	}

	public WebElement getServiceCharge() {
		return ServiceCharge;
	}

	public WebElement getAmount() {
		return Amount;
	}

	public WebElement getChauffeurName() {
		return chauffeurName;
	}

	public WebElement getCartype() {
		return Cartype;
	}

	public WebElement getCarModel() {
		return CarModel;
	}

	public WebElement getServiceType() {
		return ServiceType;
	}

	public WebElement getCarRegNo() {
		return CarRegNo;
	}

	public WebElement getChauffeurContact() {
		return chauffeurContact;
	}

	public WebElement getCommercialValue() {
		return CommercialValue;
	}

	public WebElement getVoucherCode() {
		return VoucherCode;
	}

	public WebElement getCarSubmitbtn() {
		return CarSubmitbtn;
	}

	public WebElement getContinueFullfilbtnCar() {
		return ContinueFullfilbtnCar;
	}

	public WebElement getFullfilbtnCar() {
		return FullfilbtnCar;
	}

	public WebElement getReservationreferencefieldReturn() {
		return ReservationreferencefieldReturn;
	}

	public WebElement getAirlinePNRReturn() {
		return AirlinePNRReturn;
	}

	public WebElement getTicketnoReturn() {
		return TicketnoReturn;
	}

	public WebElement getCancellfeeReturn() {
		return CancellfeeReturn;
	}

	public WebElement getAirlineloginiddpdReturn() {
		return AirlineloginiddpdReturn;
	}

	public WebElement getFaretypedpdReturn() {
		return FaretypedpdReturn;
	}

	public WebElement getReturn() {
		return Return;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getProceedbtn() {
		return Proceedbtn;
	}

	public WebElement getClosebtn() {
		return Closebtn;
	}

	public WebElement getExpanddetails() {
		return Expanddetails;
	}

	public WebElement getFullfilbtn() {
		return Fullfilbtn;
	}

	public WebElement getContinueFullfilbtn() {
		return ContinueFullfilbtn;
	}

	public WebElement getReservationreferencefield() {
		return Reservationreferencefield;
	}

	public WebElement getAirlinePNR() {
		return AirlinePNR;
	}

	public WebElement getTicketno() {
		return Ticketno;
	}

	public WebElement getCancellfee() {
		return Cancellfee;
	}

	public WebElement getAirlineloginiddpd() {
		return Airlineloginiddpd;
	}

	public WebElement getFaretypedpd() {
		return Faretypedpd;
	}

	public WebElement getSubmitbtn() {
		return Submitbtn;
	}

	public WebElement getFiltericon() {
		return Filtericon;
	}

	public WebElement getReferencebasedbtn() {
		return Referencebasedbtn;
	}

	public WebElement getReferencetypedpd() {
		return Referencetypedpd;
	}

	public WebElement getReferenceID() {
		return ReferenceID;
	}

	public WebElement getSearchbtn() {
		return Searchbtn;
	}


	public void FilterRequest(String ID) throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		Clicks(Filtericon);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[contains(text(),'Reference Based')]")));
		Clicks(Referencebasedbtn);
		Selectdropdownbyvisibletext(Referencetypedpd, "Order ID");
		SendKeyy(ReferenceID, ID);
		Clicks(Searchbtn);
		Thread.sleep(5000);
		WebElement status = driver.findElement(By.xpath("//tbody//tr[1]//td[7]"));
		String getstatus = status.getText().trim();
		System.out.println("The status is " + getstatus);
		if(getstatus.equalsIgnoreCase("Ticketed"))
		{
			System.out.println("The request has ticketed already");
		}
		else
		{
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			Clicks(Fullfilbtn);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue Fulfillment')]")));
			javascriptscrolldown(ContinueFullfilbtn);
			javascriptclick(ContinueFullfilbtn);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='reservation_ref_Onward']")));
			SendKeyy(Reservationreferencefield, "Testing");
			SendKeyy(AirlinePNR, "ABCD1234");
			SendKeyy(Ticketno, "123456789");
			try
			{
			SendKeyy(Cancellfee, "123");
			Selectdropdownbyvalue(Airlineloginiddpd, "3");
			}
			catch (Exception e) {
			}
			Selectdropdownbyvisibletext(Faretypedpd, "Corporate Fare");
			javascriptscrolldown(Submitbtn);
			Clicks(Submitbtn);
			try
			{
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Proceed')])[1]")));
				Clicks(Proceedbtn);
			}
			catch (Exception e) {
			}
			WebDriverWait w1 = new WebDriverWait(driver, 120);
			w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//font[contains(text(),'OTT ENTERPRISES PRIVATE LIMITED')]")));
			Clicks(Closebtn);
		}
	}


	public void FilterRequestRT(String ID) throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		Clicks(Filtericon);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[contains(text(),'Reference Based')]")));
		Clicks(Referencebasedbtn);
		Selectdropdownbyvisibletext(Referencetypedpd, "Order ID");
		SendKeyy(ReferenceID, ID);
		Clicks(Searchbtn);
		Thread.sleep(5000);
		WebElement status = driver.findElement(By.xpath("//tbody//tr[1]//td[7]"));
		String getstatus = status.getText().trim();
		System.out.println("The status is " + getstatus);
		if(getstatus.equalsIgnoreCase("Ticketed"))
		{
			System.out.println("The request has ticketed already");
		}
		else
		{
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			Clicks(Fullfilbtn);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue Fulfillment')]")));
			javascriptscrolldown(ContinueFullfilbtn);
			javascriptclick(ContinueFullfilbtn);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='reservation_ref_Onward']")));
			SendKeyy(Reservationreferencefield, "Testing");
			SendKeyy(AirlinePNR, "ABCD1234");
			SendKeyy(Ticketno, "123456789");
			try
			{
			SendKeyy(Cancellfee, "123");
			Selectdropdownbyvalue(Airlineloginiddpd, "3");
			}
			catch (Exception e) {
			}
			Selectdropdownbyvisibletext(Faretypedpd, "Corporate Fare");
			javascriptscrollup(Return);
			javascriptclick(Return);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='reservation_ref_Return']")));
			SendKeyy(ReservationreferencefieldReturn, "Testing");
			SendKeyy(AirlinePNRReturn, "ABCD1234");
			SendKeyy(TicketnoReturn, "123456789");
			try
			{
			SendKeyy(CancellfeeReturn, "123");
			Selectdropdownbyvalue(AirlineloginiddpdReturn, "3");
			}
			catch (Exception e) {
			}
			Selectdropdownbyvisibletext(FaretypedpdReturn, "Corporate Fare");
			javascriptscrolldown(Submitbtn);
			Clicks(Submitbtn);
			try
			{
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Proceed')])[1]")));
				Clicks(Proceedbtn);
			}
			catch (Exception e) {
			}
			WebDriverWait w1 = new WebDriverWait(driver, 100);
			w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//font[contains(text(),'OTT ENTERPRISES PRIVATE LIMITED')]")));
			Clicks(Closebtn);
		}
	}



	public void FilterRequestHotel(String ID) throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		Clicks(Filtericon);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[contains(text(),'Reference Based')]")));
		Clicks(Referencebasedbtn);
		Selectdropdownbyvisibletext(Referencetypedpd, "Order ID");
		SendKeyy(ReferenceID, ID);
		Clicks(Searchbtn);
		Thread.sleep(5000);
		WebElement status = driver.findElement(By.xpath("//tbody//tr[1]//td[7]"));
		String getstatus = status.getText().trim();
		System.out.println("The status is " + getstatus);
		if(getstatus.equalsIgnoreCase("Ticketed"))
		{
			System.out.println("The request has ticketed already");
		}
		else
		{
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			Clicks(FullfilbtnHotel);
			Thread.sleep(1000);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@value,'Continue Fulfillment')]")));
			javascriptscrolldown(ContinueFullfilbtnCar);
			javascriptclick(ContinueFullfilbtnCar);

			WebElement VoucherCode = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'vouchercode')]")));
			SendKeyy(VoucherCode, "123456");
			javascriptscrolldown(CarSubmitbtn);
			Clicks(CarSubmitbtn);
			try
			{
				WebElement OK = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Ok')]")));
				Clicks(OK);
			}
			catch (Exception e) {
			}
		}
	}



	public void FilterRequestCar(String ID) throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		Thread.sleep(500);
		Clicks(Filtericon);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[contains(text(),'Reference Based')]")));
		Thread.sleep(500);
		Clicks(Referencebasedbtn);
		Selectdropdownbyvisibletext(Referencetypedpd, "Order ID");
		SendKeyy(ReferenceID, ID);
		Clicks(Searchbtn);
		Thread.sleep(5000);
		WebElement status = driver.findElement(By.xpath("//tbody//tr[1]//td[7]"));
		String getstatus = status.getText().trim();
		System.out.println("The status is " + getstatus);
		if(getstatus.equalsIgnoreCase("Ticketed"))
		{
			System.out.println("The request has ticketed already");
		}
		else
		{
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			Clicks(FullfilbtnCar);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@value,'Continue Fulfillment')]")));
			javascriptscrolldown(ContinueFullfilbtnCar);
			javascriptclick(ContinueFullfilbtnCar);
			Selectdropdownbyvisibletext(Cartype, getdataxlsheet(0, 23, 8));
			Selectdropdownbyvisibletext(CarModel, getdataxlsheet(0, 23, 9));
			SendKeyy(ServiceType, getdataxlsheet(0, 23, 10));
			SendKeyy(CarRegNo, getdataxlsheet(0, 23, 11));
			SendKeyy(chauffeurContact, getdataxlsheet(0, 23, 12));
			SendKeyy(chauffeurName, getdataxlsheet(0, 23, 13));
			SendKeyy(Amount, getdataxlsheet(0, 23, 14));
			SendKeyy(CommercialValue, getdataxlsheet(0, 23, 15));
			SendKeyy(VoucherCode, getdataxlsheet(0, 23, 16));
			javascriptscrolldown(CarSubmitbtn);
			Clicks(CarSubmitbtn);
			try
			{
				WebElement OK = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Ok')]")));
				Clicks(OK);
			}
			catch (Exception e) {
			}
		}
	}

	public void FilterRequestInsurance(String ID) throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		Clicks(Filtericon);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[contains(text(),'Reference Based')]")));
		Clicks(Referencebasedbtn);
		Selectdropdownbyvisibletext(Referencetypedpd, "Order ID");
		SendKeyy(ReferenceID, ID);
		Clicks(Searchbtn);
		Thread.sleep(5000);
		WebElement status = driver.findElement(By.xpath("//tbody//tr[1]//td[7]"));
		String getstatus = status.getText().trim();
		System.out.println("The status is " + getstatus);
		if(getstatus.equalsIgnoreCase("Ticketed"))
		{
			System.out.println("The request has ticketed already");
		}
		else
		{
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			Clicks(FullfilbtnInsurance);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@value,'Continue Fulfillment')]")));
			javascriptscrolldown(ContinueFullfilbtnCar);
			javascriptclick(ContinueFullfilbtnCar);
			List<WebElement> Allcertificatenumbers = driver.findElements(By.xpath("//input[contains(@placeholder,'Certificate Number')]"));
			for(int i=0;i<Allcertificatenumbers.size();i++)
			{
				WebElement CertifacateNumer = Allcertificatenumbers.get(i);
				SendKeyy(CertifacateNumer, "1234567890");
			}
			SendKeyy(InsuranceCharge, getdataxlsheet(0, 35, 8));
			SendKeyy(CommercialVaueInsurance, getdataxlsheet(0, 35, 9));
			SendKeyy(ServiceCharge, getdataxlsheet(0, 35, 10));
			javascriptscrolldown(CarSubmitbtn);
			Clicks(CarSubmitbtn);
			try
			{
				WebElement OK = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Ok')]")));
				Clicks(OK);
			}
			catch (Exception e) {
			}
		}
	}


	public void FilterRequestVisa(String ID) throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		Clicks(Filtericon);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[contains(text(),'Reference Based')]")));
		Clicks(Referencebasedbtn);
		Selectdropdownbyvisibletext(Referencetypedpd, "Order ID");
		SendKeyy(ReferenceID, ID);
		Clicks(Searchbtn);
		Thread.sleep(5000);
		WebElement status = driver.findElement(By.xpath("//tbody//tr[1]//td[7]"));
		String getstatus = status.getText().trim();
		System.out.println("The status is " + getstatus);
		if(getstatus.equalsIgnoreCase("Ticketed"))
		{
			System.out.println("The request has ticketed already");
		}
		else
		{
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			Clicks(FullfilbtnVisa);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@value,'Continue Fulfillment')]")));
			javascriptscrolldown(ContinueFullfilbtnCar);
			javascriptclick(ContinueFullfilbtnCar);
			SendKeyy(VisaCharge, getdataxlsheet(0, 29, 9));
			Selectdropdownbyvisibletext(VisaTransactionType, getdataxlsheet(0, 29, 10));
			SendKeyy(CommercialValueVisa, getdataxlsheet(0, 29, 11));
			SendKeyy(ServiceChargeVisa, getdataxlsheet(0, 29, 12));
			SendKeyy(OnlineApplicationChargeVisa, getdataxlsheet(0, 29, 13));
			SendKeyy(CourierCharge, getdataxlsheet(0, 29, 14));
			SendKeyy(HandlingCharge, getdataxlsheet(0, 29, 15));
			SendKeyy(PhotoCharge, getdataxlsheet(0, 29, 16));
			SendKeyy(AttestationCharge, getdataxlsheet(0, 29, 17));
			SendKeyy(BoardCharge, getdataxlsheet(0, 29, 18));
			javascriptscrolldown(CarSubmitbtn);
			Clicks(CarSubmitbtn);
			try
			{
				WebElement OK = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Ok')]")));
				Clicks(OK);
			}
			catch (Exception e) {
			}
		}
	}


	public void FilterRequestCombinationstatuscheck(String ID) throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		Selectdropdownbyvisibletext(Requesttypedpd, "ALL");
		Selectdropdownbyvisibletext(Bookingstatusdpd, "ALL");
		Explictwait(Searchbtn);
		Clicks(Searchbtn);
		Thread.sleep(5000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='searchTextdataTable']")));
		SendKeyy(Searchfield, ID);
		Thread.sleep(5000);
		Explictwait(Expanddetails);
		Clicks(Expanddetails);
		Thread.sleep(1000);
		WebElement status = driver.findElement(By.xpath("//td[text()='Pending' or text()='Ticketing']"));
		String getstatus = status.getText().trim();
		System.out.println("The status is " + getstatus);
		excellwrite(0, 22, 7, getstatus);
		if(getstatus.equalsIgnoreCase("Ticketed"))
		{
			System.out.println("The request has ticketed already");
		}
		else {
			System.out.println("The request has not ticketed");
		}

	}




	public void FilterRequestCombinations(String ID) throws Throwable	

	{	
		if(getdata2xlsheet(0, 22, 7).equalsIgnoreCase("Pending"))
		{
			WebDriverWait w = new WebDriverWait(driver, 30);
			implicitwait();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
			Selectdropdownbyvisibletext(Requesttypedpd, "ALL");
			Selectdropdownbyvisibletext(Bookingstatusdpd, "ALL");
			Explictwait(Searchbtn);
			Clicks(Searchbtn);
			Thread.sleep(5000);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='searchTextdataTable']")));
			SendKeyy(Searchfield, ID);
			Thread.sleep(5000);
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			List<WebElement> Bookingids = driver.findElements(By.xpath("//div[contains(@class,'slider sub-table odd')]//tr//td[1]"));
			for(int i=0;i<Bookingids.size();i++)
			{
				WebElement Bookingid = driver.findElement(By.xpath("(//div[contains(@class,'slider sub-table odd')]//tr//td[1])["+(2*i+1)+"]" ));
				String Getbookingid = Bookingid.getText().trim();
				if(Getbookingid.equalsIgnoreCase(getdata2xlsheet(0, 22, 3)))
				{
					try
					{
						Clicks(Fullfilbtn);
						WebElement Confullbtn = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue Fulfillment')]")));
						javascriptscrolldown(Confullbtn);
						javascriptclick(Confullbtn);
						w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='reservation_ref_Onward']")));
						SendKeyy(Reservationreferencefield, "Testing");
						SendKeyy(AirlinePNR, "ABCD1234");
						SendKeyy(Ticketno, "123456789");
						//SendKeyy(Cancellfee, "123");
						//Selectdropdownbyvalue(Airlineloginiddpd, "3");
						WebElement Bookingclass = driver.findElement(By.xpath("//input[@id='bookingClass_Onward']"));
						SendKeyy(Bookingclass, "ABCDE");
						Selectdropdownbyvisibletext(Faretypedpd, "Corporate Fare");
						javascriptscrolldown(Submitbtn);
						Clicks(Submitbtn);
						try
						{
							w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Proceed')])[1]")));
							Clicks(Proceedbtn);
						}
						catch (Exception e) {
						}
						WebDriverWait w1 = new WebDriverWait(driver, 100);
						w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//font[contains(text(),'OTT ENTERPRISES PRIVATE LIMITED')]")));
						Clicks(Closebtn);
					}
					catch (Exception e) {
						// TODO: handle exception
					}
					break;
				}
			}

			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
			Selectdropdownbyvisibletext(Requesttypedpd, "ALL");
			Selectdropdownbyvisibletext(Bookingstatusdpd, "ALL");
			Explictwait(Searchbtn);
			Clicks(Searchbtn);
			Thread.sleep(5000);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='searchTextdataTable']")));
			SendKeyy(Searchfield, ID);
			Thread.sleep(5000);
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			for(int i=0;i<Bookingids.size();i++)
			{
				WebElement Bookingidv = driver.findElement(By.xpath("(//div[contains(@class,'slider sub-table odd')]//tr//td[1])["+(2*i+1)+"]" ));
				String Getbookingidv = Bookingidv.getText().trim();
				if(Getbookingidv.equalsIgnoreCase(getdata2xlsheet(0, 22, 4)))
				{ 
					try
					{
						WebElement fulfilbtn = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Fulfill'])[9]")));
						Clicks(fulfilbtn);
						w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@value,'Continue Fulfillment')]")));
						javascriptscrolldown(ContinueFullfilbtnCar);
						javascriptclick(ContinueFullfilbtnCar);
						Selectdropdownbyvisibletext(Cartype, getdataxlsheet(0, 23, 8));
						Selectdropdownbyvisibletext(CarModel, getdataxlsheet(0, 23, 9));
						SendKeyy(ServiceType, getdataxlsheet(0, 23, 10));
						SendKeyy(CarRegNo, getdataxlsheet(0, 23, 11));
						SendKeyy(chauffeurContact, getdataxlsheet(0, 23, 12));
						SendKeyy(chauffeurName, getdataxlsheet(0, 23, 13));
						SendKeyy(Amount, getdataxlsheet(0, 23, 14));
						SendKeyy(CommercialValue, getdataxlsheet(0, 23, 15));
						SendKeyy(VoucherCode, getdataxlsheet(0, 23, 16));
						javascriptscrolldown(CarSubmitbtn);
						Clicks(CarSubmitbtn);
						try
						{
							WebElement OK = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Ok')]")));
							Clicks(OK);
						}
						catch (Exception e) {
						}
					}
					catch (Exception e) {
						// TODO: handle exception
					}
					break;
				}}
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
			Selectdropdownbyvisibletext(Requesttypedpd, "ALL");
			Selectdropdownbyvisibletext(Bookingstatusdpd, "ALL");
			Explictwait(Searchbtn);
			Clicks(Searchbtn);
			Thread.sleep(5000);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='searchTextdataTable']")));
			SendKeyy(Searchfield, ID);
			Thread.sleep(5000);
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			for(int i=0;i<Bookingids.size();i++)
			{
				WebElement Bookingidq = driver.findElement(By.xpath("(//div[contains(@class,'slider sub-table odd')]//tr//td[1])[5]" ));
				String Getbookingidq = Bookingidq.getText().trim();
				System.out.println(Bookingidq);
				if(Getbookingidq.equalsIgnoreCase(getdata2xlsheet(0, 22, 6)))
				{  {
					WebElement fulfilbtn = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Fulfill'])[21]")));
					Clicks(fulfilbtn);
					w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@value,'Continue Fulfillment')]")));
					javascriptscrolldown(ContinueFullfilbtnCar);
					javascriptclick(ContinueFullfilbtnCar);
					WebElement Allcertificatenumbers = driver.findElement(By.xpath("//input[contains(@placeholder,'Certificate Number')]"));
					SendKeyy(Allcertificatenumbers, "1234567890");
					SendKeyy(InsuranceCharge, getdataxlsheet(0, 35, 8));
					SendKeyy(CommercialVaueInsurance, getdataxlsheet(0, 35, 9));
					SendKeyy(ServiceCharge, getdataxlsheet(0, 35, 10));
					javascriptscrolldown(CarSubmitbtn);
					Clicks(CarSubmitbtn);
					try
					{
						WebElement OK = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Ok')]")));
						Clicks(OK);
					}
					catch (Exception e){
					}
					break;
				}
				}	
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
				Selectdropdownbyvisibletext(Requesttypedpd, "ALL");
				Selectdropdownbyvisibletext(Bookingstatusdpd, "ALL");
				Explictwait(Searchbtn);
				Clicks(Searchbtn);
				Thread.sleep(5000);
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='searchTextdataTable']")));
				SendKeyy(Searchfield, ID);
				Thread.sleep(5000);
				Explictwait(Expanddetails);
				Clicks(Expanddetails);
				for(int j=0;i<Bookingids.size();j++)
				{
					WebElement Bookingidss = driver.findElement(By.xpath("((//div[contains(@class,'slider sub-table odd')]//tr//td)[27]//a[@title='Fulfill'])[6]" ));
					System.out.println(Bookingidss);
					String Getbookingids = Bookingidss.getText().trim();
					if(Getbookingids.equalsIgnoreCase(getdata2xlsheet(0, 22, 5)))
					{
						WebElement fulfilbtn = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//tr[contains(@class,'ng-scope')])[6]//a[@id='bookingList'])[12]")));
						Clicks(fulfilbtn);
						w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@value,'Continue Fulfillment')]")));
						javascriptscrolldown(ContinueFullfilbtnCar);
						javascriptclick(ContinueFullfilbtnCar);
						SendKeyy(VisaCharge, getdataxlsheet(0, 29, 9));
						Selectdropdownbyvisibletext(VisaTransactionType, getdataxlsheet(0, 29, 10));
						SendKeyy(CommercialValueVisa, getdataxlsheet(0, 29, 11));
						SendKeyy(ServiceChargeVisa, getdataxlsheet(0, 29, 12));
						SendKeyy(OnlineApplicationChargeVisa, getdataxlsheet(0, 29, 13));
						SendKeyy(CourierCharge, getdataxlsheet(0, 29, 14));
						SendKeyy(HandlingCharge, getdataxlsheet(0, 29, 15));
						SendKeyy(PhotoCharge, getdataxlsheet(0, 29, 16));
						SendKeyy(AttestationCharge, getdataxlsheet(0, 29, 17));
						SendKeyy(BoardCharge, getdataxlsheet(0, 29, 18));
						javascriptscrolldown(CarSubmitbtn);
						Clicks(CarSubmitbtn);
						try
						{
							WebElement OK = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Ok')]")));
							Clicks(OK);
						}
						catch (Exception e) {
						}	
						break;
					}}}}}


	public void selectManageCorporate() throws Throwable
	{
		
		WebDriverWait w = new WebDriverWait(driver, 30);
		implicitwait();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		javascriptclick(Productsetting);
		Thread.sleep(500);
		javascriptclick(ManageCorporate);
		
	}
	
	
	public void selectManageBilTo() throws Throwable
	{
		
		WebDriverWait w = new WebDriverWait(driver, 30);
		implicitwait();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		javascriptclick(Admin);
		Thread.sleep(500);
		javascriptclick(ManageBilTo);
		
	}
	
	public void selectManageGST() throws Throwable
	{
		
		WebDriverWait w = new WebDriverWait(driver, 30);
		implicitwait();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		javascriptclick(Admin);
		Thread.sleep(500);
		javascriptclick(ManageGST);
		
	}
	
	
	public void Carcancel(String ID) throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		//Clicks(Operations);
		Thread.sleep(500);
		javascriptclick(CancellationQueue);
		Thread.sleep(3000);
		WebElement filter = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//div//a//i[contains(@class,'fa fa-filter')]")));
		Clicks(filter);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[contains(text(),'Reference Based')]")));
		Clicks(Referencebasedbtn);
		Selectdropdownbyvisibletext(Referencetypedpd, "Order ID");
		SendKeyy(ReferenceID, ID);
		Clicks(Searchbtn);
		Thread.sleep(1000);
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			Explictwait(Cancelbtn);
			Clicks(Cancelbtn);
			try
			{
				Clicks(Proceedwhenopentherequest);
			}
			catch (Exception e) {
			}
			SendKeyy(CancellationCharge, "10");
			SendKeyy(CancellationComments, "Test");
			Clicks(Submitbtnincacel);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Ok')]")));
			Clicks(Okbtn);
		}
	


	public void Flightcancel(String ID) throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		//Clicks(Operations);
		Thread.sleep(500);
		javascriptclick(CancellationQueue);
		Thread.sleep(3000);
		WebElement filter = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//div//a//i[contains(@class,'fa fa-filter')]")));
		Clicks(filter);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[contains(text(),'Reference Based')]")));
		Clicks(Referencebasedbtn);
		Selectdropdownbyvisibletext(Referencetypedpd, "Order ID");
		SendKeyy(ReferenceID, ID);
		Clicks(Searchbtn);
		Thread.sleep(1000);
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			Explictwait(FlightCancelbtn);
			Clicks(FlightCancelbtn);
			try
			{
				Clicks(Proceedwhenopentherequest);
			}
			catch (Exception e) {
			}
			
			List<WebElement> Allcancelcharge = driver.findElements(By.xpath("//input[contains(@id,'cancellationCharge')]"));
			for(int i=0; i<Allcancelcharge.size();i++)
			{
				WebElement Cancelchargefield = Allcancelcharge.get(i);
				SendKeyy(Cancelchargefield, "10");
				break;
			}
			Thread.sleep(2000);
			Clicks(Submitbtnincacelforflight);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Ok')]")));
			Clicks(Okbtn);
		}
	
	
	
	public void CrosspaxFlightcancelRT(String ID) throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fil-icon')]")));
		//Clicks(Operations);
		Thread.sleep(500);
		javascriptclick(CancellationQueue);
		Thread.sleep(3000);
		WebElement filter = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//div//a//i[contains(@class,'fa fa-filter')]")));
		Clicks(filter);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[contains(text(),'Reference Based')]")));
		Clicks(Referencebasedbtn);
		Selectdropdownbyvisibletext(Referencetypedpd, "Order ID");
		SendKeyy(ReferenceID, ID);
		Clicks(Searchbtn);
		Thread.sleep(1000);
			Explictwait(Expanddetails);
			Clicks(Expanddetails);
			Explictwait(FlightCancelbtn);
			Clicks(FlightCancelbtn);
			try
			{
				Clicks(Proceedwhenopentherequest);
			}
			catch (Exception e) {
			}
			
			List<WebElement> Allcancelcharge = driver.findElements(By.xpath("//input[contains(@id,'cancellationCharge')]"));
			for(int i=0; i<Allcancelcharge.size();i++)
			{
				WebElement Cancelchargefield = Allcancelcharge.get(i);
				SendKeyy(Cancelchargefield, "10");
				break;
			}
			Thread.sleep(2000); 
			SendKeyy(SplitPNR, "123456");
			WebElement Nextbtn = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Next']")));
			Clicks(Nextbtn);
			SendKeyy(SplitPNR2, "123456");
			Clicks(Submitbtnincacelforflight);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Ok')]")));
			Clicks(Okbtn);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void logout() throws Throwable
	{
		implicitwait();
		try
		{
			Clicks(logoutbtn);
		}
		catch (Exception e) {
			javascriptclick(logoutbtn);
		}

	}



}
