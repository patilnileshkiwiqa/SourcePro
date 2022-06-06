
package com.SourcePro.Materials.ItemMasterBasicDetailEntry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SourcePro.Init.AbstractPage;
import com.SourcePro.Init.Common;

public class ItemMasterBasicDetailEntryVerification extends AbstractPage {

	public ItemMasterBasicDetailEntryVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean verifyTableLoad() {

		String xpath = "//i[@class='icon-pencil']";
		Common.PresenceOfElement(By.xpath(xpath), driver);
		return !driver.findElements(By.xpath(xpath)).isEmpty();

	}
	
	public boolean verifyFileUpLoaded(String value) {

		String xpath = "//tbody//strong[text()='"+value+"']";
		Common.PresenceOfElement(By.xpath(xpath), driver);
		return !driver.findElements(By.xpath(xpath)).isEmpty();

	}
	
	
	public boolean verifyItemCreated(String value) {

		String xpath = "//div[contains(text(),'"+value.toUpperCase()+"')]";
		Common.PresenceOfElement(By.xpath(xpath), driver);
		Common.pause(4);
		return !driver.findElements(By.xpath(xpath)).isEmpty();


	}

	public boolean verifyPONummber(String value) {
		String xpath = "//div[text()='"+value+"']";
		Common.PresenceOfElement(By.xpath(xpath), driver);
		return !driver.findElements(By.xpath(xpath)).isEmpty();
	}

}
