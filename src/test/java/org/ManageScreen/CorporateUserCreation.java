package org.ManageScreen;

import org.Classfiles.DashboardPage;
import org.Classfiles.LoginPage;
import org.Classfiles.ManageEmployeeProfilePage;
import org.Utilities.BaseClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CorporateUserCreation extends BaseClass {


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
	public void CorporateUser() throws Throwable
	{
		implicitwait();
		LoginPage l = new LoginPage();
		l.Corporateadminlogin();
		DashboardPage D = new DashboardPage();
		D.ManageProfile();
		ManageEmployeeProfilePage M = new ManageEmployeeProfilePage();
		M.CorporateAdmin(6);
		D.Logout();
	}

}



