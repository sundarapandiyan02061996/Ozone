package org.GeneralScenarios;

import org.Classfiles.CardPendingApprovalPage;
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

public class TC_08_InternationalRoundTripCU extends BaseClass {
	
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
	public void AirRTInternationalbooking() throws Throwable
	{
		implicitwait();
		LoginPage l = new LoginPage();
		l.Corporateuserlogin();
		DashboardPage D = new DashboardPage();
		D.SelectAir();
		RequestFormPageforAir R = new RequestFormPageforAir();
		R.RequestFormfillingInternationalRT(11);
		FiltersandFlightSelectPage F = new FiltersandFlightSelectPage();
		F.InternationalFilterselectionRT();
		MyCardPage M = new  MyCardPage();
		M.AddCard();
		PriceSummaryPage P = new PriceSummaryPage();
		P.pricesummaryInternataionalCU();
		ConfirmationPage C = new ConfirmationPage();
		C.FlightbookingGetdetails(8);
		D.Logout();
	}
	
	@Test(priority=2)
	public void ApprovetheRequest() throws Throwable
	{
		implicitwait();
		LoginPage l = new LoginPage();
		l.ApproveUserlogin();
		DashboardPage D = new DashboardPage();
		D.SelectPendindApproval();
		CardPendingApprovalPage C = new CardPendingApprovalPage();
		C.ViewTransactionhistory(getdata2xlsheet(0, 8, 3));
		PriceSummaryPage P = new PriceSummaryPage();
		P.Approve();
		P.pricesummaryDomestic();
		WalletPage W = new WalletPage();
		W.Depositpayment();
		D.Logout();
		
	}


}
