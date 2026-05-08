package org.Classfiles;

import java.io.IOException;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	@FindBy(xpath="((//div[contains(@class,'cls-fs-tabledata')])[1]//div[contains(@class,'avail-fare')])[4]")
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

	public void FilterselectionOW() throws Throwable
	{
		implicitwait();
		waitForPageLoad();
		WebDriverWait w = new WebDriverWait(driver, 50);
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
			System.out.println(getdataxlsheet(0, 2, 11));
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
	
	public void FilterselectionRT() throws Throwable
	{
		implicitwait();
		waitForPageLoad();
		WebDriverWait w = new WebDriverWait(driver, 50);
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

		if(getdataxlsheet(0, 3, 11).equalsIgnoreCase("Refundable Fare"))
		{
			System.out.println(getdataxlsheet(0, 3, 11));
			Clicks(Refundablefare);	
			Thread.sleep(1000);
			javascriptclick(SelectFlight);
		}
		else
		{
			System.out.println(getdataxlsheet(0, 3, 11));
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
	
	
	public void InternationalFilterselectionOW() throws Throwable
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

		if(getdataxlsheet(0, 4, 11).equalsIgnoreCase("Refundable Fare"))
		{
			System.out.println(getdataxlsheet(0, 4, 11));
			Clicks(Refundablefare);	
			Thread.sleep(1000);
			javascriptclick(SelectFlight);
		}
		else
		{
			System.out.println(getdataxlsheet(0, 4, 11));
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

}
