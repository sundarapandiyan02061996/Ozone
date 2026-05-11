package org.CombinationBooking;

import org.Classfiles.ConfirmationPage;
import org.Classfiles.DashboardPage;
import org.Classfiles.FiltersandFlightSelectPage;
import org.Classfiles.LoginPage;
import org.Classfiles.MyCardPage;
import org.Classfiles.PriceSummaryPage;
import org.Classfiles.RequestFormPageforAir;
import org.Classfiles.RequestFormPageforHotel;
import org.Classfiles.RequestFormPageforInsurance;
import org.Classfiles.RequestFormPageforVisa;
import org.Classfiles.RequestFormpageforCar;
import org.Classfiles.WalletPage;
import org.Utilities.BaseClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CombinationbookingbyCA extends BaseClass {
	
	@BeforeMethod
	private static void beforetest() throws Throwable
	{
		LaunchBrowser();
		Maximize();	
		GetURL();
	}
	
	
	@AfterMethod
	private static void Aftertest(ITestResult result) throws Throwable
	{
		 if (result.getStatus() == ITestResult.FAILURE) {
		    	String testName = result.getName();
		    	  String screenshotPath = Failedscreenshots(testName);
		    	  System.out.println("Screenshot saved: " + screenshotPath);

		    } else if (result.getStatus() == ITestResult.SUCCESS) {
		    	String testName = result.getName();
		    	  String screenshotPath = Passscreenshots(testName);
		    	  System.out.println("Screenshot saved: " + screenshotPath);

		}
		
	}
	
	@Test(priority=1)
	public void AirOWdomesticbooking() throws Throwable
	{
		implicitwait();
		LoginPage l = new LoginPage();
		RequestFormPageforAir Air  = new RequestFormPageforAir();
		RequestFormpageforCar car = new RequestFormpageforCar();
		RequestFormPageforVisa visa = new RequestFormPageforVisa();
		RequestFormPageforInsurance insurance = new RequestFormPageforInsurance();
		RequestFormPageforHotel hotel = new RequestFormPageforHotel();
		FiltersandFlightSelectPage F = new FiltersandFlightSelectPage();
		l.Corporateadminlogin();
		DashboardPage D = new DashboardPage();
		MyCardPage M = new  MyCardPage();
		D.SelectAir();
		Air.RequestFormfillingOW(2);
		F.FilterselectionOW();
		M.AddHotel();
		hotel.CobinationHotel(17);
		M.AddCar();
		car.CombinationCarRequestformCA(23);
		M.AddVisa();
		visa.CombinationVisaRequestFormfillingCA(29);
		M.AddInsurance();
		insurance.CombinationInsuranceRequestform(35);
		M.AddCard();
		PriceSummaryPage P = new PriceSummaryPage();
		P.Combinationpayment();
		WalletPage W = new WalletPage();
		W.Depositpayment();
		ConfirmationPage C = new ConfirmationPage();
		C.Combinationdetails(22);
		D.Logout();
	}

}
