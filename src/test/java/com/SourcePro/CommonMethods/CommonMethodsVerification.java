package com.SourcePro.CommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SourcePro.Init.AbstractPage;


public class CommonMethodsVerification extends AbstractPage {

	public CommonMethodsVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//p[@class='notifier__notification-message']")
	WebElement successMsg;
	
	public Boolean verifySuccessMessage(String value)
	{
		if(successMsg.getText().contains(value))
			return true;
		else
			return false;
	}

}
