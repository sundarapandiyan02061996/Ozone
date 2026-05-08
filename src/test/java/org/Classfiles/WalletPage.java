package org.Classfiles;

import org.Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WalletPage extends BaseClass {
	
	
	public WalletPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@id='paymenttab'])[2]")
	WebElement Deposit;
	
	@FindBy(xpath="(//button[@id='payButton'])")
	WebElement Paymentbutton;

	public WebElement getDeposit() {
		return Deposit;
	}

	public WebElement getPaymentbutton() {
		return Paymentbutton;
	}
	
	public void Depositpayment()
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 180);
		w.until(ExpectedConditions.elementToBeClickable(Deposit));
		javascriptclick(Deposit);
		javascriptclick(Paymentbutton);
	}

}
