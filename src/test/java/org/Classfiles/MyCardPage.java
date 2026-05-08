package org.Classfiles;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCardPage extends BaseClass {
	
	
	public MyCardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddCard()
	{
		implicitwait();
		WebDriverWait w = new WebDriverWait(driver, 60);
		WebElement Submitbtn = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Pay to submit')]")));
		Clicks(Submitbtn);
	}

}
