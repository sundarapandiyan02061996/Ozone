package org.GeneralScenarios;

import org.Classfiles.BookingQueuePage;
import org.Classfiles.ConfirmationPage;
import org.Classfiles.DashboardPage;
import org.Classfiles.FiltersandFlightSelectPage;
import org.Classfiles.Hotelroomtypepage;
import org.Classfiles.LoginPage;
import org.Classfiles.MyCardPage;
import org.Classfiles.PriceSummaryPage;
import org.Classfiles.RequestFormPageforAir;
import org.Classfiles.RequestFormPageforHotel;
import org.Classfiles.RoomDetailsPage;
import org.Classfiles.WalletPage;
import org.Utilities.BaseClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_09_HotelbookingbyCAuser extends BaseClass {
	
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
	public void HotelbookingCA() throws Throwable
	{
		implicitwait();
		LoginPage l = new LoginPage();
		l.Corporateadminlogin();
		DashboardPage D = new DashboardPage();
		D.Selecthotel();
		RequestFormPageforHotel R = new RequestFormPageforHotel();
		R.HotelRequestform(17);
		RoomDetailsPage room = new RoomDetailsPage();
		room.Selectroom();
		Hotelroomtypepage H = new Hotelroomtypepage();
		H.roomtypes();
		MyCardPage M = new  MyCardPage();
		M.AddCard();
		PriceSummaryPage P = new PriceSummaryPage();
		P.pricesummaryDomestic();
		WalletPage W = new WalletPage();
		W.Depositpayment();
		ConfirmationPage C = new ConfirmationPage();
		C.HotelbookingGetdetails(10);
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
		B.FilterRequestHotel(getdata2xlsheet(0, 10, 2));
		B.logout();
	}


}
