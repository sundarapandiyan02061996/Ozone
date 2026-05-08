package org.CarBooking;

import org.Classfiles.CardPendingApprovalPage;
import org.Classfiles.ConfirmationPage;
import org.Classfiles.DashboardPage;
import org.Classfiles.LoginPage;
import org.Classfiles.MyCardPage;
import org.Classfiles.PriceSummaryPage;
import org.Classfiles.RequestFormpageforCar;
import org.Classfiles.WalletPage;
import org.Utilities.BaseClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarbookingbyCU extends BaseClass {
	
	
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
	public void CarbookingCU() throws Throwable
	{
		implicitwait();
		LoginPage l = new LoginPage();
		l.Corporateuserlogin();
		DashboardPage D = new DashboardPage();
		D.SelectCar();
		RequestFormpageforCar R = new RequestFormpageforCar();
		R.CarRequestformCA(24);
		MyCardPage M = new  MyCardPage();
		M.AddCard();
		PriceSummaryPage P = new PriceSummaryPage();
		P.pricesummaryDomesticbyCU();
		ConfirmationPage C = new ConfirmationPage();
		C.FlightbookingGetdetails(14);
		D.Logout();
	}
	
	@Test(priority=2)
	public void ApprovetheBooking() throws Throwable
	{
		implicitwait();
		LoginPage l = new LoginPage();
		l.ApproveUserlogin();
		DashboardPage D = new DashboardPage();
		D.SelectPendindApproval();
		CardPendingApprovalPage C = new CardPendingApprovalPage();
		C.ViewTransactionhistory(getdata2xlsheet(0, 14, 3));
		PriceSummaryPage P = new PriceSummaryPage();
		P.Approve();
		P.pricesummaryDomestic();
		D.Logout();
		
	}


}
