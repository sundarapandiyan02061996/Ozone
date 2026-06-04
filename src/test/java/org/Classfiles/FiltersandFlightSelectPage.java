package org.Classfiles;

import java.io.IOException;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

public class FiltersandFlightSelectPage extends BaseClass {


	public FiltersandFlightSelectPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="((//div[contains(@class,'cls-fs-tabledata')])[1]//div[contains(@class,'avail-fare')])[1]")
	WebElement Refundablefare;

	@FindBy(xpath="((//div[contains(@class,'cls-fs-tabledata')])[1]//div[contains(@class,'avail-fare')])[2]")
	WebElement NonRefundablefare;

	@FindBy(xpath="((//div[contains(@class,'cls-fs-tabledata')])[1]//div[contains(@class,'avail-fare')])[3]")
	WebElement CorporateFare;

	@FindBy(xpath="((//div[contains(@class,'cls-fs-tabledata')])[1]//div[contains(@class,'avail-fare')])[3]")
	WebElement SpecialFare;
	
	@FindBy(xpath="((//div[contains(@id,'responseDivFlightSearch2')]//div[contains(@class,'cls-fs-tabledata')])[1]//div[contains(@class,'avail-fare')])[1]")
	WebElement RefundablefareRT;

	@FindBy(xpath="((//div[contains(@id,'responseDivFlightSearch2')]//div[contains(@class,'cls-fs-tabledata')])[1]//div[contains(@class,'avail-fare')])[2]")
	WebElement NonRefundablefareRT;

	@FindBy(xpath="((//div[contains(@id,'responseDivFlightSearch2')]//div[contains(@class,'cls-fs-tabledata')])[1]//div[contains(@class,'avail-fare')])[3]")
	WebElement CorporateFareRT;

	@FindBy(xpath="((//div[contains(@id,'responseDivFlightSearch2')]//div[contains(@class,'cls-fs-tabledata')])[1]//div[contains(@class,'avail-fare')])[4]")
	WebElement SpecialFareRT;

	@FindBy(xpath="(//button[contains(@id,'selectflightbtn')])[1]")
	WebElement SelectFlight;

	@FindBy(xpath="(//button[contains(@id,'selectflightbtn')])[2]")
	WebElement SelectFlightRT;
	
	@FindBy(xpath="//button[contains(text(),'Add to Cart')]")
	WebElement AddtoCard;

	

	public WebElement getRefundablefareRT() {
		return RefundablefareRT;
	}

	public WebElement getNonRefundablefareRT() {
		return NonRefundablefareRT;
	}

	public WebElement getCorporateFareRT() {
		return CorporateFareRT;
	}

	public WebElement getSpecialFareRT() {
		return SpecialFareRT;
	}

	public WebElement getAddtoCard() {
		return AddtoCard;
	}

	public WebElement getSelectFlight() {
		return SelectFlight;
	}

	public WebElement getRefundablefare() {
		return Refundablefare;
	}

	public WebElement getNonRefundablefare() {
		return NonRefundablefare;
	}

	public WebElement getCorporateFare() {
		return CorporateFare;
	}

	public WebElement getSpecialFare() {
		return SpecialFare;
	}

	public void FilterselectionOW(int Credntialrow , int testcaserow) throws Throwable
	{
		implicitwait();
		waitForPageLoad();
		WebDriverWait w = new WebDriverWait(driver, 100);
		WebElement Sectordetails = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'sec-org ng-binding')])[2]")));
		Thread.sleep(2000);
		try
		{
			WebElement Airlines = driver.findElement(By.xpath("//span[contains(@title,'"+getdataxlsheet(0, 2, 9)+"')]"));
			javascriptclick(Airlines);
		}
		catch (Exception e) {
			System.out.println("The expected airline is not available OR you selected No value filter");
		}
		try
		{
			WebElement SelectStop = driver.findElement(By.xpath("//li[contains(@class,'cls-filter-li')]//span[contains(text(),'"+getdataxlsheet(0, 2, 10)+"')]"));
			javascriptclick(SelectStop);
		}
		catch (Exception e) {
			System.out.println("The expected airline is not available OR you selected No value filter");
		}

		float Total = 0;
		if(getdataxlsheet(0, Credntialrow, 11).equalsIgnoreCase("Refundable Fare"))
		{
			System.out.println(getdataxlsheet(0, Credntialrow, 11));
			Clicks(Refundablefare);	
			Thread.sleep(1000);
			WebElement Paxcount = driver.findElement(By.xpath("(//span[contains(@class,'cls-onward-passcount ')])[1]"));
			String pax = Paxcount.getText().trim().replaceAll("[^0-9]", "");
			int noofpax = Integer.parseInt(pax);
			//BaseFare
			WebElement Basefare = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-binding ng-scope')])[1]"));
			String text = Basefare.getText().trim();
			String fare = text.replaceAll(".*?INR\\s*", "").split("x")[0].replaceAll(",", "").trim();
			float farevalue = Float.parseFloat(fare);
			System.out.println("The Basefare value is : " +  fare);
			excellwrite(0, testcaserow, 4, fare);
			//Tax
			WebElement Tax = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-binding ng-scope')])[2]"));
			String Taxtext = Tax.getText().trim();
			String Taxfare = Taxtext.replaceAll(".*?INR\\s*", "").split("x")[0].replaceAll(",", "").trim();
			float Taxvalue = Float.parseFloat(Taxfare);
			System.out.println("The Tax value is : " +  Taxfare);
			excellwrite(0, testcaserow, 5, Taxfare);
			//Total
			WebElement Totalvalue = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-scope')])"));
			String Totaltext = Totalvalue.getText().trim();
			String Totalfare = Totaltext.replaceAll(".*?INR\\s*", "").replaceAll(",", "").trim();
			float Totalvaluee = Float.parseFloat(Totalfare);
			System.out.println("The Tool Total value is : " +  Totalfare);
			excellwrite(0, testcaserow, 6, Totalfare);
			//Grand Total
			WebElement GrandTotal = driver.findElement(By.xpath("(//div[contains(@class,'cls-fs-grand-total')])[1]//span[contains(@class,'lang-ar-fare')]"));
			String GrandTotaltext = GrandTotal.getText().trim();
			String GrantTotalfare = GrandTotaltext.replaceAll(".*?INR\\s*", "").replaceAll(",", "").trim();
			float GrandTotalvaluee = Float.parseFloat(GrantTotalfare);
			System.out.println("The Grand Total value is : " +  GrandTotalvaluee);
			excellwrite(0, testcaserow, 7, GrantTotalfare);
			//Validation
			float basefare = farevalue * noofpax;
			float TotalTaxfare = Taxvalue * noofpax;
			Total = basefare + TotalTaxfare;
			String Totalval = String.valueOf(Total);
			System.out.println("The Actual total value is :" + Total );
			excellwrite(0, testcaserow, 8, Totalval);
			Assertion A = new Assertion();
			A.assertEquals(Totalvaluee, Total, 0.01f,"Total fare mismatch. UI Total = " + Totalvaluee +", Calculated Total = " + Total);
			A.assertEquals(GrandTotalvaluee, Total, 0.01f,"Grand Total mismatch. UI Total = " + GrandTotalvaluee +", Calculated Total = " + Total);
			javascriptclick(SelectFlight);
		}
		else
		{
			System.out.println(getdataxlsheet(0,Credntialrow, 11));
			Clicks(SpecialFare);
			Thread.sleep(1000);
			WebElement Paxcount = driver.findElement(By.xpath("(//span[contains(@class,'cls-onward-passcount ')])[1]"));
			String pax = Paxcount.getText().trim().replaceAll("[^0-9]", "");
			int noofpax = Integer.parseInt(pax);
			
			//BaseFare
			WebElement Basefare = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-binding ng-scope')])[1]"));
			String text = Basefare.getText().trim();
			String fare = text.replaceAll(".*?INR\\s*", "").split("x")[0].replaceAll(",", "").trim();
			float farevalue = Float.parseFloat(fare);
			System.out.println("The Basefare value is : " +  fare);
			excellwrite(0, testcaserow, 4, fare);
			//Tax
			WebElement Tax = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-binding ng-scope')])[2]"));
			String Taxtext = Tax.getText().trim();
			String Taxfare = Taxtext.replaceAll(".*?INR\\s*", "").split("x")[0].replaceAll(",", "").trim();
			float Taxvalue = Float.parseFloat(Taxfare);
			System.out.println("The Tax value is : " +  Taxfare);
			excellwrite(0, testcaserow, 5, Taxfare);
			//Total
			WebElement Totalvalue = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-scope')])"));
			String Totaltext = Totalvalue.getText().trim();
			String Totalfare = Totaltext.replaceAll(".*?INR\\s*", "").replaceAll(",", "").trim();
			float Totalvaluee = Float.parseFloat(Totalfare);
			System.out.println("The Tool Total value is : " +  Totalfare);
			excellwrite(0, testcaserow, 6, Totalfare);
			//Grand Total
			WebElement GrandTotal = driver.findElement(By.xpath("(//div[contains(@class,'cls-fs-grand-total')])[1]//span[contains(@class,'lang-ar-fare')]"));
			String GrandTotaltext = GrandTotal.getText().trim();
			String GrantTotalfare = GrandTotaltext.replaceAll(".*?INR\\s*", "").replaceAll(",", "").trim();
			float GrandTotalvaluee = Float.parseFloat(GrantTotalfare);
			System.out.println("The Grand Total value is : " +  GrandTotalvaluee);
			excellwrite(0, testcaserow, 7, GrantTotalfare);
			//Validation
			float basefare = farevalue * noofpax;
			float TotalTaxfare = Taxvalue * noofpax;
			Total = basefare + TotalTaxfare;
			String Totalval = String.valueOf(Total);
			System.out.println("The Actual total value is :" + Total );
			excellwrite(0, testcaserow, 8, Totalval);
			Assertion A = new Assertion();
			A.assertEquals(Totalvaluee, Total, 0.01f,"Total fare mismatch. UI Total = " + Totalvaluee +", Calculated Total = " + Total);
			A.assertEquals(GrandTotalvaluee, Total, 0.01f,"Grand Total mismatch. UI Total = " + GrandTotalvaluee +", Calculated Total = " + Total);
			
			Thread.sleep(1000);
			javascriptclick(SelectFlight);
		}
		Thread.sleep(1000);
		WebElement footertotalvalue = driver.findElement(By.xpath("//div[contains(@class,'selected-flight')]//span[contains(@class,'f-fare ng-binding')]"));
		String FooterTotaltext = footertotalvalue.getText().trim();
		String FooterTotalfare = FooterTotaltext.replaceAll(".*?INR\\s*", "").replaceAll(",", "").trim();
		float Footerotalvaluee = Float.parseFloat(FooterTotalfare);
		System.out.println("The Footer Total value is : " +  FooterTotalfare);
		excellwrite(0, testcaserow, 9, FooterTotalfare);
		Assertion A = new Assertion();
		A.assertEquals(Footerotalvaluee, Total, 0.01f,"Footer Total mismatch. UI Total = " + Footerotalvaluee +", Calculated Total = " + Total);
		Clicks(AddtoCard);
		try
		{
			WebElement OK = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
			Clicks(OK);
			WebElement Reason = driver.findElement(By.xpath("//select[@id='oneWayFlight']"));
			Selectdropdownbyindex(Reason, 1);	
			Thread.sleep(1000);
			Clicks(AddtoCard);
		}
		catch (Exception e) {
			System.out.println("Selected mimimu fare");
		}
		
	}
	
	public void FilterselectionRT(int Credntialrow) throws Throwable
	{
		implicitwait();
		waitForPageLoad();
		WebDriverWait w = new WebDriverWait(driver, 90);
		WebElement Sectordetails = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'sec-org ng-binding')])[1]")));
		Thread.sleep(2000);
		try
		{
			WebElement Airlines = driver.findElement(By.xpath("//span[contains(@title,'"+getdataxlsheet(0, 3, 9)+"')]"));
			javascriptclick(Airlines);
		}
		catch (Exception e) {
			System.out.println("The expected airline is not available OR you selected No value filter");
		}
		try
		{
			WebElement SelectStop = driver.findElement(By.xpath("//li[contains(@class,'cls-filter-li')]//span[contains(text(),'"+getdataxlsheet(0, 3, 10)+"')]"));
			javascriptclick(SelectStop);
		}
		catch (Exception e) {
			System.out.println("The expected stop is not available OR you selected No value filter");
		}

		float Total = 0;
		if(getdataxlsheet(0, Credntialrow, 11).equalsIgnoreCase("Refundable Fare"))
		{
			System.out.println(getdataxlsheet(0, Credntialrow, 11));
			Clicks(Refundablefare);	
			Thread.sleep(1000);
			javascriptclick(SelectFlight);
		}
		else
		{
			System.out.println(getdataxlsheet(0, Credntialrow, 11));
			Clicks(SpecialFare);
			Thread.sleep(1000);
			javascriptclick(SelectFlight);
		}
			
		try
		{
			WebElement Airlines = driver.findElement(By.xpath("(//span[contains(@title,'"+getdataxlsheet(0, 3, 12)+"')])[2]"));
			javascriptclick(Airlines);
		}
		catch (Exception e) {
			System.out.println("The expected Return airline is not available OR you selected No value filter");
		}
		try
		{
			WebElement SelectStop = driver.findElement(By.xpath("(//li[contains(@class,'cls-filter-li')]//span[contains(text(),'"+getdataxlsheet(0, 3, 13)+"')])[2]"));
			javascriptclick(SelectStop);
		}
		catch (Exception e) {
			System.out.println("The expected return stop is not available OR you selected No value filter");
		}

		if(getdataxlsheet(0, 3, 14).equalsIgnoreCase("Refundable Fare"))
		{
			System.out.println(getdataxlsheet(0, 3, 14));
			javascriptclick(RefundablefareRT);	
			Thread.sleep(1000);
			javascriptclick(SelectFlightRT);
		}
		else if(getdataxlsheet(0, 3, 14).equalsIgnoreCase("Non Refundable Fare"))
		{
			try
			{
				System.out.println(getdataxlsheet(0, 3, 14));
				javascriptclick(NonRefundablefareRT);	
				Thread.sleep(1000);
				javascriptclick(SelectFlightRT);
			}
			catch (Exception e) {
				javascriptclick(RefundablefareRT);
				Thread.sleep(1000);
				javascriptclick(SelectFlightRT);
			}
		}
		else if (getdataxlsheet(0, 3, 14).equalsIgnoreCase("Corporate Fare"))
		{
			System.out.println(getdataxlsheet(0, 3, 14));
			javascriptclick(CorporateFareRT);	
			Thread.sleep(1000);
			javascriptclick(SelectFlightRT);
		}
		else
		{
			System.out.println(getdataxlsheet(0, 3, 14));
			javascriptclick(SpecialFareRT);
			Thread.sleep(1000);
			javascriptclick(SelectFlightRT);
		}
		Thread.sleep(1000);
		Clicks(AddtoCard);
		try
		{
			WebElement OK = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
			Clicks(OK);
			WebElement Reason = driver.findElement(By.xpath("//select[@id='oneWayFlight']"));
			Selectdropdownbyindex(Reason, 1);	
			Thread.sleep(1000);
			Clicks(AddtoCard);
		}
		catch (Exception e) {
			System.out.println("Selected mimimu fare");
		}
		
	}
	
	
	public void InternationalFilterselectionOW(int Credntialrow , int testcaserow) throws Throwable
	{
		implicitwait();
		waitForPageLoad();
		WebDriverWait w = new WebDriverWait(driver, 100);
		WebElement Sectordetails = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'sec-org ng-binding')])[2]")));
		Thread.sleep(2000);
		try
		{
			WebElement Airlines = driver.findElement(By.xpath("//span[contains(@title,'"+getdataxlsheet(0, 4, 9)+"')]"));
			javascriptclick(Airlines);
		}
		catch (Exception e) {
			System.out.println("The expected airline is not available OR you selected No value filter");
		}
		try
		{
			WebElement SelectStop = driver.findElement(By.xpath("(//li[contains(@class,'cls-filter-li')])[5]//span[contains(text(),'"+getdataxlsheet(0, 4, 10)+"')]"));
			javascriptclick(SelectStop);
		}
		catch (Exception e) {
			System.out.println("The expected stop is not available OR you selected No value filter");
		}
		float Total = 0;
		if(getdataxlsheet(0, Credntialrow, 11).equalsIgnoreCase("Refundable Fare"))
		{
			System.out.println(getdataxlsheet(0, Credntialrow, 11));
			Clicks(Refundablefare);	
			Thread.sleep(1000);
			WebElement Paxcount = driver.findElement(By.xpath("(//span[contains(@class,'cls-onward-passcount ')])[1]"));
			String pax = Paxcount.getText().trim().replaceAll("[^0-9]", "");
			int noofpax = Integer.parseInt(pax);
			//BaseFare
			WebElement Basefare = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-binding ng-scope')])[1]"));
			String text = Basefare.getText().trim();
			String fare = text.replaceAll(".*?INR\\s*", "").split("x")[0].replaceAll(",", "").trim();
			float farevalue = Float.parseFloat(fare);
			System.out.println("The Basefare value is : " +  fare);
			excellwrite(0, testcaserow, 4, fare);
			//Tax
			WebElement Tax = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-binding ng-scope')])[2]"));
			String Taxtext = Tax.getText().trim();
			String Taxfare = Taxtext.replaceAll(".*?INR\\s*", "").split("x")[0].replaceAll(",", "").trim();
			float Taxvalue = Float.parseFloat(Taxfare);
			System.out.println("The Tax value is : " +  Taxfare);
			excellwrite(0, testcaserow, 5, Taxfare);
			//Total
			WebElement Totalvalue = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-scope')])"));
			String Totaltext = Totalvalue.getText().trim();
			String Totalfare = Totaltext.replaceAll(".*?INR\\s*", "").replaceAll(",", "").trim();
			float Totalvaluee = Float.parseFloat(Totalfare);
			System.out.println("The Tool Total value is : " +  Totalfare);
			excellwrite(0, testcaserow, 6, Totalfare);
			//Grand Total
			WebElement GrandTotal = driver.findElement(By.xpath("(//div[contains(@class,'cls-fs-grand-total')])[1]//span[contains(@class,'lang-ar-fare')]"));
			String GrandTotaltext = GrandTotal.getText().trim();
			String GrantTotalfare = GrandTotaltext.replaceAll(".*?INR\\s*", "").replaceAll(",", "").trim();
			float GrandTotalvaluee = Float.parseFloat(GrantTotalfare);
			System.out.println("The Grand Total value is : " +  GrandTotalvaluee);
			excellwrite(0, testcaserow, 7, GrantTotalfare);
			//Validation
			float basefare = farevalue * noofpax;
			float TotalTaxfare = Taxvalue * noofpax;
			Total = basefare + TotalTaxfare;
			String Totalval = String.valueOf(Total);
			System.out.println("The Actual total value is :" + Total );
			excellwrite(0, testcaserow, 8, Totalval);
			Assertion A = new Assertion();
			A.assertEquals(Totalvaluee, Total, 0.01f,"Total fare mismatch. UI Total = " + Totalvaluee +", Calculated Total = " + Total);
			A.assertEquals(GrandTotalvaluee, Total, 0.01f,"Grand Total mismatch. UI Total = " + GrandTotalvaluee +", Calculated Total = " + Total);
			Thread.sleep(1000);
			javascriptclick(SelectFlight);
		}
		else
		{
			System.out.println(getdataxlsheet(0, Credntialrow, 11));
			Clicks(SpecialFare);
			Thread.sleep(1000);
			Thread.sleep(1000);
			WebElement Paxcount = driver.findElement(By.xpath("(//span[contains(@class,'cls-onward-passcount ')])[1]"));
			String pax = Paxcount.getText().trim().replaceAll("[^0-9]", "");
			int noofpax = Integer.parseInt(pax);
			
			//BaseFare
			WebElement Basefare = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-binding ng-scope')])[1]"));
			String text = Basefare.getText().trim();
			String fare = text.replaceAll(".*?INR\\s*", "").split("x")[0].replaceAll(",", "").trim();
			float farevalue = Float.parseFloat(fare);
			System.out.println("The Basefare value is : " +  fare);
			excellwrite(0, testcaserow, 4, fare);
			//Tax
			WebElement Tax = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-binding ng-scope')])[2]"));
			String Taxtext = Tax.getText().trim();
			String Taxfare = Taxtext.replaceAll(".*?INR\\s*", "").split("x")[0].replaceAll(",", "").trim();
			float Taxvalue = Float.parseFloat(Taxfare);
			System.out.println("The Tax value is : " +  Taxfare);
			excellwrite(0, testcaserow, 5, Taxfare);
			//Total
			WebElement Totalvalue = driver.findElement(By.xpath("((//div[contains(@class,'cls-fs-faredetails')])[1]//div[contains(@class,'valu pull-left ng-scope')])"));
			String Totaltext = Totalvalue.getText().trim();
			String Totalfare = Totaltext.replaceAll(".*?INR\\s*", "").replaceAll(",", "").trim();
			float Totalvaluee = Float.parseFloat(Totalfare);
			System.out.println("The Tool Total value is : " +  Totalfare);
			excellwrite(0, testcaserow, 6, Totalfare);
			//Grand Total
			WebElement GrandTotal = driver.findElement(By.xpath("(//div[contains(@class,'cls-fs-grand-total')])[1]//span[contains(@class,'lang-ar-fare')]"));
			String GrandTotaltext = GrandTotal.getText().trim();
			String GrantTotalfare = GrandTotaltext.replaceAll(".*?INR\\s*", "").replaceAll(",", "").trim();
			float GrandTotalvaluee = Float.parseFloat(GrantTotalfare);
			System.out.println("The Grand Total value is : " +  GrandTotalvaluee);
			excellwrite(0, testcaserow, 7, GrantTotalfare);
			//Validation
			float basefare = farevalue * noofpax;
			float TotalTaxfare = Taxvalue * noofpax;
			Total = basefare + TotalTaxfare;
			String Totalval = String.valueOf(Total);
			System.out.println("The Actual total value is :" + Total );
			excellwrite(0, testcaserow, 8, Totalval);
			Assertion A = new Assertion();
			A.assertEquals(Totalvaluee, Total, 0.01f,"Total fare mismatch. UI Total = " + Totalvaluee +", Calculated Total = " + Total);
			A.assertEquals(GrandTotalvaluee, Total, 0.01f,"Grand Total mismatch. UI Total = " + GrandTotalvaluee +", Calculated Total = " + Total);
			Thread.sleep(1000);
			javascriptclick(SelectFlight);
		}
		Thread.sleep(1000);
		WebElement footertotalvalue = driver.findElement(By.xpath("//div[contains(@class,'selected-flight')]//span[contains(@class,'f-fare ng-binding')]"));
		String FooterTotaltext = footertotalvalue.getText().trim();
		String FooterTotalfare = FooterTotaltext.replaceAll(".*?INR\\s*", "").replaceAll(",", "").trim();
		float Footerotalvaluee = Float.parseFloat(FooterTotalfare);
		System.out.println("The Footer Total value is : " +  FooterTotalfare);
		excellwrite(0, testcaserow, 9, FooterTotalfare);
		Assertion A = new Assertion();
		A.assertEquals(Footerotalvaluee, Total, 0.01f,"Footer Total mismatch. UI Total = " + Footerotalvaluee +", Calculated Total = " + Total);
		Clicks(AddtoCard);
		
		try
		{
			WebElement OK = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
			Clicks(OK);
			WebElement Reason = driver.findElement(By.xpath("//select[@id='oneWayFlight']"));
			Selectdropdownbyindex(Reason, 1);	
			Thread.sleep(1000);
			Clicks(AddtoCard);
		}
		catch (Exception e) {
			System.out.println("Selected mimimu fare");
		}
		
	}
	
	
	public void InternationalFilterselectionRT() throws Throwable
	{
		implicitwait();
		waitForPageLoad();
		WebDriverWait w = new WebDriverWait(driver, 100);
		WebElement Sectordetails = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'sec-org ng-binding')])[2]")));
		Thread.sleep(2000);
		try
		{
			WebElement Airlines = driver.findElement(By.xpath("//span[contains(@title,'"+getdataxlsheet(0, 5, 9)+"')]"));
			javascriptclick(Airlines);
		}
		catch (Exception e) {
			System.out.println("The expected airline is not available OR you selected No value filter");
		}
		try
		{
			WebElement SelectStop = driver.findElement(By.xpath("(//li[contains(@class,'cls-filter-li')])[5]//span[contains(text(),'"+getdataxlsheet(0, 5, 10)+"')]"));
			javascriptclick(SelectStop);
		}
		catch (Exception e) {
			System.out.println("The expected stop is not available OR you selected No value filter");
		}

		if(getdataxlsheet(0, 5, 11).equalsIgnoreCase("Refundable Fare"))
		{
			System.out.println(getdataxlsheet(0, 5, 11));
			Clicks(Refundablefare);	
			Thread.sleep(1000);
			javascriptclick(SelectFlight);
		}
		else
		{
			System.out.println(getdataxlsheet(0, 5, 11));
			Clicks(SpecialFare);
			Thread.sleep(1000);
			javascriptclick(SelectFlight);
		}
		Thread.sleep(1000);
		Clicks(AddtoCard);
		
		try
		{
			WebElement OK = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
			Clicks(OK);
			WebElement Reason = driver.findElement(By.xpath("//select[@id='oneWayFlight']"));
			Selectdropdownbyindex(Reason, 1);	
			Thread.sleep(1000);
			Clicks(AddtoCard);
		}
		catch (Exception e) {
			System.out.println("Selected mimimu fare");
		}
	}	
	
	public void FilterselectionOW() throws Throwable
	{
		implicitwait();
		waitForPageLoad();
		WebDriverWait w = new WebDriverWait(driver, 100);
		WebElement Sectordetails = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'sec-org ng-binding')])[2]")));
		Thread.sleep(2000);
		try
		{
			WebElement Airlines = driver.findElement(By.xpath("//span[contains(@title,'"+getdataxlsheet(0, 2, 9)+"')]"));
			javascriptclick(Airlines);
		}
		catch (Exception e) {
			System.out.println("The expected airline is not available OR you selected No value filter");
		}
		try
		{
			WebElement SelectStop = driver.findElement(By.xpath("//li[contains(@class,'cls-filter-li')]//span[contains(text(),'"+getdataxlsheet(0, 2, 10)+"')]"));
			javascriptclick(SelectStop);
		}
		catch (Exception e) {
			System.out.println("The expected airline is not available OR you selected No value filter");
		}

		if(getdataxlsheet(0, 2, 11).equalsIgnoreCase("Refundable Fare"))
		{
			System.out.println(getdataxlsheet(0, 2, 11));
			Clicks(Refundablefare);	
			Thread.sleep(1000);
			javascriptclick(SelectFlight);
		}
		else
		{
			System.out.println(getdataxlsheet(0,2, 11));
			Clicks(SpecialFare);
			Thread.sleep(1000);
			javascriptclick(SelectFlight);
		}
		Thread.sleep(1000);
		Clicks(AddtoCard);
		try
		{
			WebElement OK = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
			Clicks(OK);
			WebElement Reason = driver.findElement(By.xpath("//select[@id='oneWayFlight']"));
			Selectdropdownbyindex(Reason, 1);	
			Thread.sleep(1000);
			Clicks(AddtoCard);
		}
		catch (Exception e) {
			System.out.println("Selected mimimu fare");
		}
		
	}

}
