package org.Classfiles;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage extends BaseClass {


	public ConfirmationPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//p[contains(@class,'cls-order-id')])[1]")
	WebElement OrderID;

	@FindBy(xpath="//span[contains(@class,'package-id')]")
	WebElement PackageID;

	public WebElement getOrderID() {
		return OrderID;
	}

	public WebElement getPackageID() {
		return PackageID;
	}
	
	
	public void FlightbookingGetdetails(int row) throws Throwable
	{
		WebDriverWait w = new WebDriverWait(driver, 40);
		WebElement OrderID = w.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='order-id pull-right'])[1]")));
		String orderID = OrderID.getText().trim().replaceAll("[^0-9]", "");
		System.out.println(orderID);
		excellwrite(0, row, 2, orderID);
		String Package = PackageID.getText().trim();
		System.out.println("The Package ID " + Package);
		excellwrite(0, row, 3, Package);
		try
		{
			WebElement proceedpayment =  driver.findElement(By.xpath("//button[@id='proceed']"));
			Clicks(proceedpayment);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void HotelbookingGetdetails(int row) throws Throwable
	{
		WebDriverWait w = new WebDriverWait(driver, 40);
		WebElement OrderID = w.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(@class,'cls-order-id')])[1]")));
		String orderID = OrderID.getText().trim().replaceAll("[^0-9]", "");
		System.out.println(orderID);
		excellwrite(0, row, 2, orderID);
		String Package = PackageID.getText().trim();
		System.out.println("The Package ID " + Package);
		excellwrite(0, row, 3, Package);
	}
	
	public void VisabookingGetdetails(int row) throws Throwable
	{
		WebDriverWait w = new WebDriverWait(driver, 40);
		WebElement OrderID = w.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'insurance-order-id visa-order')]")));
		String orderID = OrderID.getText().trim().replaceAll("[^0-9]", "");
		System.out.println(orderID);
		excellwrite(0, row, 2, orderID);
		String Package = PackageID.getText().trim();
		System.out.println("The Package ID " + Package);
		excellwrite(0, row, 3, Package);
	}
	
	public void InsurancebookingGetdetails(int row) throws Throwable
	{
		WebDriverWait w = new WebDriverWait(driver, 40);
		WebElement OrderID = w.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'insurance-order-id')]")));
		String orderID = OrderID.getText().trim().replaceAll("[^0-9]", "");
		System.out.println(orderID);
		excellwrite(0, row, 2, orderID);
		String Package = PackageID.getText().trim();
		System.out.println("The Package ID " + Package);
		excellwrite(0, row, 3, Package);
	}
	
	public void Combinationdetails(int row) throws Throwable
	{
		WebDriverWait w = new WebDriverWait(driver, 40);
		WebElement PackageID = w.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'package-id')]")));
		String Package = PackageID.getText().trim();
		System.out.println("The Package ID " + Package);
		excellwrite(0, row, 2, Package);
		WebElement FlightorderID = driver.findElement(By.xpath("(//div[@class='itinerary-details flight']//span[contains(@class,'order-id')])[1]"));
		String flightorderID = FlightorderID.getText().trim().replaceAll("[^0-9]", "");
		excellwrite(0, row, 3, flightorderID);
		WebElement CarorderID = driver.findElement(By.xpath("(//div[@class='itinerary-details car']//span[contains(@class,'order-id')])[1]"));
		String carorderID = CarorderID.getText().trim().replaceAll("[^0-9]", "");
		excellwrite(0, row, 4, carorderID);
		WebElement VisaorderID = driver.findElement(By.xpath("//div[contains(@class,'insurance-order-id visa-order')]"));
		String visaorderID = VisaorderID.getText().trim().replaceAll("[^0-9]", "");
		excellwrite(0, row, 5, visaorderID);
		WebElement InsuranceorderID = driver.findElement(By.xpath("(//div[contains(@class,'insurance-order-id')])[2]"));
		String insuranceorderID = InsuranceorderID.getText().trim().replaceAll("[^0-9]", "");
		excellwrite(0, row, 6, insuranceorderID);
	}


}
