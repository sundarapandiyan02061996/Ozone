package org.GeneralScenarios;

import org.Classfiles.BookingQueuePage;
import org.Classfiles.ConfirmationPage;
import org.Classfiles.DashboardPage;
import org.Classfiles.LoginPage;
import org.Classfiles.MyBookingListPage;
import org.Classfiles.MyCardPage;
import org.Classfiles.RequestFormpageforCar;
import org.Utilities.BaseClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_21_CarCancellation extends BaseClass {
	
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
	public void CarbookingCA() throws Throwable
	{
		implicitwait();
		LoginPage l = new LoginPage();
		l.Corporateadminlogin();
		DashboardPage D = new DashboardPage();
		D.SelectCar();
		RequestFormpageforCar R = new RequestFormpageforCar();
		R.CarRequestformCA(23);
		MyCardPage M = new  MyCardPage();
		M.AddCard();
		ConfirmationPage C = new ConfirmationPage();
		C.FlightbookingGetdetails(13);
		D.Logout();
	}

	@Test(priority=2)
	public void Ticketing() throws Throwable
	{
		implicitwait();
		GetbackendURL();
		LoginPage l = new LoginPage();
		l.AgencyUser();	
		BookingQueuePage B = new BookingQueuePage();
		B.FilterRequestCar(getdata2xlsheet(0, 13, 2));
		B.logout();
	}
	
	@Test(priority=3)
	public void CarCencellationbyCA() throws Throwable
	{
		implicitwait();
		LoginPage l = new LoginPage();
		l.Corporateadminlogin();
		DashboardPage D = new DashboardPage();
		D.Mybooking();
		MyBookingListPage M = new MyBookingListPage();
		M.Cancelbooking(13);
		D.Logout();
	}
	
	@Test(priority=4)
		public void CancellationConfirmbyCU() throws Throwable
		{
			implicitwait();
			GetbackendURL();
			LoginPage l = new LoginPage();
			l.AgencyUser();	
			BookingQueuePage B = new BookingQueuePage();
			B.Carcancel(getdata2xlsheet(0, 13, 2));
			B.logout();
		}


}
