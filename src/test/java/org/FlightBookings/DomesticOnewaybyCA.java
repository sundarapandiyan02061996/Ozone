package org.FlightBookings;

import org.Classfiles.ConfirmationPage;
import org.Classfiles.DashboardPage;
import org.Classfiles.FiltersandFlightSelectPage;
import org.Classfiles.LoginPage;
import org.Classfiles.MyCardPage;
import org.Classfiles.PriceSummaryPage;
import org.Classfiles.RequestFormPageforAir;
import org.Classfiles.WalletPage;
import org.Utilities.BaseClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DomesticOnewaybyCA extends BaseClass {
	
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
		l.Corporateadminlogin();
		DashboardPage D = new DashboardPage();
		D.SelectAir();
		RequestFormPageforAir R = new RequestFormPageforAir();
		R.RequestFormfillingOW(2);
		FiltersandFlightSelectPage F = new FiltersandFlightSelectPage();
		F.FilterselectionOW();
		MyCardPage M = new  MyCardPage();
		M.AddCard();
		PriceSummaryPage P = new PriceSummaryPage();
		P.pricesummaryDomestic();
		WalletPage W = new WalletPage();
		W.Depositpayment();
		ConfirmationPage C = new ConfirmationPage();
		C.FlightbookingGetdetails(1);
		D.Logout();
	}

}
