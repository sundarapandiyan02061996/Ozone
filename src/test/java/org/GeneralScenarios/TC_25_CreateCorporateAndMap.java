package org.GeneralScenarios;

import org.Classfiles.BookingQueuePage;
import org.Classfiles.GSTpage;
import org.Classfiles.LoginPage;
import org.Classfiles.ManageBilToPage;
import org.Classfiles.ManageCorporatePage;
import org.Utilities.BaseClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_25_CreateCorporateAndMap extends BaseClass {
	
	
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
	public void CreateCorporate() throws Throwable
	{
		implicitwait();
		GetbackendURL();
		LoginPage l = new LoginPage();
		l.AgencyUser();	
		BookingQueuePage B = new BookingQueuePage();
		B.selectManageCorporate();
		ManageCorporatePage M = new ManageCorporatePage();
		M.CorporateRegister(2);
		B.logout();
	}
	


	@Test(priority=2)
	public void ApproveTheCorporate() throws Throwable
	{
		implicitwait();
		GetbackendURL();
		LoginPage l = new LoginPage();
		l.AgencyUser();	
		BookingQueuePage B = new BookingQueuePage();
		B.selectManageCorporate();
		ManageCorporatePage M = new ManageCorporatePage();
		M.ApproveCorporate(2);
		B.logout();
	}
	
	@Test(priority=3)
	public void MapBilTo() throws Throwable
	{
		implicitwait();
		GetbackendURL();
		LoginPage l = new LoginPage();
		l.AgencyUser();	
		BookingQueuePage B = new BookingQueuePage();
		B.selectManageBilTo();
		ManageBilToPage M = new ManageBilToPage();
		M.AddBilTo();
		B.logout();
	}
	
	@Test(priority=4)
	public void MapGST() throws Throwable
	{
		implicitwait();
		GetbackendURL();
		LoginPage l = new LoginPage();
		l.AgencyUser();	
		BookingQueuePage B = new BookingQueuePage();
		B.selectManageGST();
		GSTpage G = new GSTpage();
		G.MapGST();
		B.logout();
	}
	

}
