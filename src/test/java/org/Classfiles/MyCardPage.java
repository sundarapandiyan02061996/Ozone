package org.Classfiles;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCardPage extends BaseClass {
	
	
	public MyCardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Hotel']")
	WebElement Hotel;
	
	@FindBy(xpath="//a[@title='Car']")
	WebElement Car;
	
	@FindBy(xpath="//a[@title='Visa']")
	WebElement Visa;
	
	@FindBy(xpath="//a[@title='Insurance']")
	WebElement Insurance;
	
	@FindBy(xpath="//a[@title='Flight']")
	WebElement Flight;
	
	
	
	
	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getCar() {
		return Car;
	}

	public WebElement getVisa() {
		return Visa;
	}

	public WebElement getInsurance() {
		return Insurance;
	}

	public WebElement getFlight() {
		return Flight;
	}

	public void AddCard()
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 60);
		WebElement Submitbtn = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Pay to submit')]")));
		Clicks(Submitbtn);
	}
	
	public void AddHotel()
	{
		Explictwait(Hotel);
		Clicks(Hotel);
	}
	public void AddCar()
	{
		Explictwait(Car);
		Clicks(Car);
	}
	
	public void AddVisa()
	{
		Explictwait(Visa);
		Clicks(Visa);
	}
	
	public void AddInsurance()
	{
		Explictwait(Insurance);
		Clicks(Insurance);
	}

}
