package org.GeneralScenarios;

import org.Classfiles.BookingQueuePage;
import org.Classfiles.CardPendingApprovalPage;
import org.Classfiles.ConfirmationPage;
import org.Classfiles.DashboardPage;
import org.Classfiles.LoginPage;
import org.Classfiles.MyCardPage;
import org.Classfiles.PriceSummaryPage;
import org.Classfiles.RequestFormPageforVisa;
import org.Utilities.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_14_VisabookingbyCU extends BaseClass {
	
	
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
		   driver.quit();
		}	
	}
	
	@Test(priority=1)
	public void visabookingCU() throws Throwable
	{
		implicitwait();
		LoginPage l = new LoginPage();
		l.Corporateuserlogin();
		DashboardPage D = new DashboardPage();
		D.SelectVisa();
		RequestFormPageforVisa R = new RequestFormPageforVisa();
		R.VisaRequestFormfillingCU(30);
		MyCardPage M = new  MyCardPage();
		M.AddCard();
		PriceSummaryPage P = new PriceSummaryPage();
		P.pricesummaryDomesticbyCU();	
		ConfirmationPage C = new ConfirmationPage();
		C.VisabookingGetdetails(17);
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
		C.ViewTransactionhistory(getdata2xlsheet(0, 17, 3));
		PriceSummaryPage P = new PriceSummaryPage();
		P.Approve();
		P.pricesummaryDomestic();
		D.Logout();
		
	}
	
	@Test(priority=3)
	public void Ticketing() throws Throwable
	{
		implicitwait();
		GetbackendURL();
		LoginPage l = new LoginPage();
		l.AgencyUser();	
		BookingQueuePage B = new BookingQueuePage();
		B.FilterRequestVisa(getdata2xlsheet(0, 17, 2));
		B.logout();
	}

	
	

}
