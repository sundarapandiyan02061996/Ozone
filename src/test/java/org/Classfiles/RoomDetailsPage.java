package org.Classfiles;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RoomDetailsPage extends BaseClass {
	
	public RoomDetailsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(@class,'cls-hotel-tablet-list')]//button[contains(text(),'Show rooms')]")
	WebElement Showroombtn;

	public WebElement getShowroombtn() {
		return Showroombtn;
	}
	

	public void Selectroom() throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'cls-hotel-tablet-list')]//button[contains(text(),'Show rooms')])[2]")));
		javascriptclick(Showroombtn);
		Thread.sleep(4000);
		
	}

}
