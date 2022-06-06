package com.SourcePro.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SourcePro.Init.AbstractPage;
import com.SourcePro.Init.Common;


public class LoginVerification extends AbstractPage {

	public LoginVerification(WebDriver driver) {
		super(driver);

	}

	public Boolean verifyloginurl() 
	{
		Common.pause(1);
		String xpath = "//h4[text()='Applications']";

		if(driver.findElements(By.xpath(xpath)).size()==1)
			return true;
		else
			return false;	
	}
}

