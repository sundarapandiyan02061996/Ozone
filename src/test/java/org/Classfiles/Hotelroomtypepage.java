package org.Classfiles;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hotelroomtypepage extends BaseClass {
	
	public  Hotelroomtypepage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//div[contains(@class,'cls-hoteldetails-modal')]//button[contains(text(),'Book room')])[1]")
	WebElement bookroom;

	@FindBy(xpath="//button[contains(text(),'Add to Cart')]")
	WebElement AddCart;
	
	@FindBy(xpath="//a[contains(@title,'click here to show/hide cancellation policy')]")
	WebElement ClickMoreDetails;

	public WebElement getBookroom() {
		return bookroom;
	}

	public WebElement getAddCart() {
		return AddCart;
	}
	
	public WebElement getClickMoreDetails() {
		return ClickMoreDetails;
	}




	public void roomtypes() throws Throwable
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Book room')])[2]")));
		javascriptclick(bookroom);
		Explictwait(ClickMoreDetails);
		javascriptclick(ClickMoreDetails);
		Explictwait(AddCart);
		javascriptclick(AddCart);
		
	}
	
	
}

