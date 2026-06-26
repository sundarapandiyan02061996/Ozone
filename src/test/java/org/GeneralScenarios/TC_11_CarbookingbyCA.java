package org.GeneralScenarios;

import org.Classfiles.BookingQueuePage;
import org.Classfiles.ConfirmationPage;
import org.Classfiles.DashboardPage;
import org.Classfiles.FiltersandFlightSelectPage;
import org.Classfiles.LoginPage;
import org.Classfiles.MyCardPage;
import org.Classfiles.PriceSummaryPage;
import org.Classfiles.RequestFormPageforAir;
import org.Classfiles.RequestFormpageforCar;
import org.Classfiles.WalletPage;
import org.Utilities.BaseClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_11_CarbookingbyCA extends BaseClass {

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



}
