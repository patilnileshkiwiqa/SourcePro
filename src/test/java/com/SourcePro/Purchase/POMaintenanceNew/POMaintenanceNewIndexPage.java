package com.SourcePro.Purchase.POMaintenanceNew;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SourcePro.Init.AbstractPage;
import com.SourcePro.Init.Common;
import com.SourcePro.Materials.ItemMasterBasicDetailEntry.ItemMasterBasicDetailEntryVerification;

public class POMaintenanceNewIndexPage extends AbstractPage {

	public POMaintenanceNewIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// PO Maintenance New

	@FindBy(xpath = "//button[text()='Add New ']//i")
	WebElement addBtn_POMaintenance;

	public POMaintenanceNewVerification addBtn_POMaintenanceNew() {

		Common.clickableElement(addBtn_POMaintenance, driver);
		Common.clickOn(driver, addBtn_POMaintenance);
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//div[label[text()='PO Basis']]//input")
	WebElement select_POBasis_POMaintenanceNew;

	public POMaintenanceNewVerification select_POBasis_POMaintenanceNew(String value) {

		Common.clickableElement(select_POBasis_POMaintenanceNew, driver);
		Common.type(select_POBasis_POMaintenanceNew, value);

		// Common.pause(1);
		String xpath = "//span[text()='" + value + "']";

		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//div[label[text()='PO Type']]//input")
	WebElement select_POType_POMaintenanceNew;

	public POMaintenanceNewVerification select_POType_POMaintenanceNew(String value) {
		Common.clickableElement(select_POType_POMaintenanceNew, driver);
		Common.type(select_POType_POMaintenanceNew, value);

		// Common.pause(1);
		String xpath = "//span[text()='" + value + "' and @class='ng-option-label']";

		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//div[label[text()='Group']]//input")
	WebElement select_Group_POMaintenanceNew;

	public POMaintenanceNewVerification select_Group_POMaintenanceNew(String value) {
		Common.clickableElement(select_Group_POMaintenanceNew, driver);
		Common.type(select_Group_POMaintenanceNew, value);

		// Common.pause(1);
		String xpath = "//span[text()='" + value + "' and @class='ng-option-label']";

		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//div[label[text()='Site']]//input")
	WebElement select_Site_POMaintenanceNew;

	public POMaintenanceNewVerification select_Site_POMaintenanceNew(String value) {
		Common.clickableElement(select_Site_POMaintenanceNew, driver);
		Common.type(select_Site_POMaintenanceNew, value);

		// Common.pause(1);
		String xpath = "//span[text()='" + value + "' and @class='ng-option-label']";

		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "(//div[contains(@class, 'icon-calendar')])[1]")
	WebElement dateIcon_POMaintenanceNew;

	public POMaintenanceNewVerification 	select_PO_Date_POMaintenanceNew(String value) {

		Common.clickableElement(dateIcon_POMaintenanceNew, driver);
		Common.pause(2);
		Common.mouseHover(driver, dateIcon_POMaintenanceNew);
		Common.clickOn(driver, dateIcon_POMaintenanceNew);
		Common.clickOn(driver, driver.findElement(By.xpath("(//td[text()='29'])[1]")));
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//button[text()='Next ']")
	WebElement nextBtn_1_POMaintenanceNew;

	public POMaintenanceNewVerification nextBtn_1_POMaintenanceNew() {

		Common.clickableElement(nextBtn_1_POMaintenanceNew, driver);
		Common.clickOn(driver, nextBtn_1_POMaintenanceNew);	
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//jqxinput//input")
	WebElement select_Vendor_POMaintenanceNew;

	public POMaintenanceNewVerification select_Vendor_POMaintenanceNew(String value) {

		Common.clickableElement(select_Vendor_POMaintenanceNew, driver);
		Common.type(select_Vendor_POMaintenanceNew, value);
		select_Vendor_POMaintenanceNew.sendKeys(Keys.ENTER);
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//div[label[text()='Buyer']]//input")
	WebElement select_Buyer_POMaintenanceNew;

	public POMaintenanceNewVerification select_Buyer_POMaintenanceNew(String value) {
		Common.scrollUpToElement(driver, select_Buyer_POMaintenanceNew);
		Common.clickableElement(select_Buyer_POMaintenanceNew, driver);
		Common.type(select_Buyer_POMaintenanceNew, value);

		// Common.pause(1);
		String xpath = "//span[text()='" + value + "' and @class='ng-option-label']";

		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//div[@id='ngb-panel-1']//button[text()='Next ']")
	WebElement nextBtn_2_POMaintenanceNew;

	public POMaintenanceNewVerification nextBtn_2_POMaintenanceNew() {

		Common.pause(3);
		Common.mouseHover(driver, nextBtn_2_POMaintenanceNew);
		Common.clickableElement(nextBtn_2_POMaintenanceNew, driver);
		Common.clickOn(driver, nextBtn_2_POMaintenanceNew);
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//div[label[text()='Rate Structure']]//input")
	WebElement select_RateStructure_POMaintenanceNew;

	public POMaintenanceNewVerification select_RateStructure_POMaintenanceNew(String value) {
		Common.clickableElement(select_RateStructure_POMaintenanceNew, driver);
		Common.type(select_RateStructure_POMaintenanceNew, value);

		// Common.pause(1);
		String xpath = "//span[text()='" + value + "' and @class='ng-option-label']";

		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//div[@id='ngb-panel-2']//button[text()='Next ']")
	WebElement nextBtn_3_POMaintenanceNew;

	public POMaintenanceNewVerification nextBtn_3_POMaintenanceNew() {

		Common.clickableElement(nextBtn_3_POMaintenanceNew, driver);
		Common.clickOn(driver, nextBtn_3_POMaintenanceNew);
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//div[@id='ngb-panel-4']//button[normalize-space()='Add New']")
	WebElement addNewBtn_1_POMaintenanceNew;

	public POMaintenanceNewVerification addNewBtn_1_POMaintenanceNew() {
		Common.clickableElement(addNewBtn_1_POMaintenanceNew, driver);
		Common.clickOn(driver, addNewBtn_1_POMaintenanceNew);
		Common.pause(2);
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//div[@columnindex='5']//input")
	WebElement add_ItemCode_1_POMaintenanceNew;

	public POMaintenanceNewVerification add_ItemCode_1_POMaintenanceNew(String value) {
		Common.clickableElement(add_ItemCode_1_POMaintenanceNew, driver);
		Common.type(add_ItemCode_1_POMaintenanceNew, value);
		add_ItemCode_1_POMaintenanceNew.sendKeys(Keys.ENTER);
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//div[@columnindex='8']//div[@class='jqx-grid-cell-left-align']")
	WebElement add_WarehouseCode_1_POMaintenanceNew;
	
	public POMaintenanceNewVerification add_WarehouseCode_1_POMaintenanceNew(String value) {
		Common.pause(5);
		Common.clickableElement(add_WarehouseCode_1_POMaintenanceNew, driver);
		Common.clickOn(driver, add_WarehouseCode_1_POMaintenanceNew);
		
		Common.pause(5);
		String xpath = "//span[text()='" + value + "']";
		
		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new POMaintenanceNewVerification(driver);
	}
	
    
	public POMaintenanceNewVerification selectItemCodeTable_1_POMaintenanceNew(String value) {
		
		String xpath = "//div[@columnindex='5']//div[contains(text(),'"+value+"')]";
		Common.clickableElement(driver.findElement(By.xpath(xpath)), driver);
		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new POMaintenanceNewVerification(driver);
    }

	@FindBy(id = "childadd")
	WebElement addNewBtn_ItemCode_1_POMaintenanceNew;
	
	public POMaintenanceNewVerification addNewBtn_ItemCode_1_POMaintenanceNew() {
		Common.clickableElement(addNewBtn_ItemCode_1_POMaintenanceNew, driver);
		Common.clickOn(driver, addNewBtn_ItemCode_1_POMaintenanceNew);
		return new POMaintenanceNewVerification(driver);
	}
	
	@FindBy(xpath = "//div[contains(@id,'contenttable')]//input[@type='textarea']")
	WebElement enterPUOM_QTY_ItemCode_1_POMaintenanceNew;
	
	public POMaintenanceNewVerification enterPUOM_QTY_ItemCode_1_POMaintenanceNew(String value) {
		Common.pause(3);
		Common.clickableElement(enterPUOM_QTY_ItemCode_1_POMaintenanceNew, driver);
		enterPUOM_QTY_ItemCode_1_POMaintenanceNew.sendKeys(value);
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "(//div[@columnindex='8']//div[@class='jqx-grid-cell-left-align'])[2]")
	WebElement add_WarehouseCode_2_POMaintenanceNew;
	
	public POMaintenanceNewVerification add_WarehouseCode_2_POMaintenanceNew(String value) {
		Common.clickableElement(add_WarehouseCode_2_POMaintenanceNew, driver);
		Common.clickOn(driver, add_WarehouseCode_2_POMaintenanceNew);
		
		String xpath = "//span[text()='" + value + "']";
		
		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new POMaintenanceNewVerification(driver);
	}
	
	
	@FindBy(xpath = "//button[text()='Next']//i")
	WebElement nextBtn_4_POMaintenanceNew;

	public POMaintenanceNewVerification nextBtn_4_POMaintenanceNew() {
		
		Common.clickableElement(nextBtn_4_POMaintenanceNew, driver);
		Common.clickOn(driver, nextBtn_4_POMaintenanceNew);
		return new POMaintenanceNewVerification(driver);
	}
	
	public POMaintenanceNewVerification selectRateCode_POMaintenanceNew(String value) {
		String xpath = "//div[text()='" + value + "']";
		
		Common.scrollUpToElement(driver, driver.findElement(By.xpath(xpath)));
		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new POMaintenanceNewVerification(driver);
	}
	
	
	@FindBy(xpath = "//div[@id='ngb-panel-5']//div[contains(@id,'contenttablejqxWidget')]//input")
	WebElement addTaxValue_POMaintenanceNew;
    public POMaintenanceNewVerification addTaxValue_POMaintenanceNew(String ratecode , String value) {
		
		String xpath = "//div[@role='row']//div[div[text()='" + ratecode + "']]/..//div[@columnindex='6']";
		Common.pause(1);
		Common.clickableElement(driver.findElement(By.xpath(xpath)), driver);
		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		addTaxValue_POMaintenanceNew.sendKeys(value);
		
		return new POMaintenanceNewVerification(driver);
    }
	
	@FindBy(xpath = "//div[@id='ngb-panel-5']//button[normalize-space()='Next']")
	WebElement addNewBtn_RateCalculation_POMaintenanceNew;
	
	public POMaintenanceNewVerification addNewBtn_RateCalculation_POMaintenanceNew() {
		Common.clickableElement(addNewBtn_RateCalculation_POMaintenanceNew, driver);
		Common.clickOn(driver, addNewBtn_RateCalculation_POMaintenanceNew);
		Common.pause(2);
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveBTN_POMaintenanceNew;
	
	public POMaintenanceNewVerification saveBTN_POMaintenanceNew() {
		Common.clickableElement(saveBTN_POMaintenanceNew, driver);
		Common.clickOn(driver, saveBTN_POMaintenanceNew);
		return new POMaintenanceNewVerification(driver);
	}

	@FindBy(xpath="//p[@class='notifier__notification-message']")
	WebElement po_OrderValue;

	public String getPO_OrderValue() {
		String valueis =  po_OrderValue.getText();
		return valueis;
	}
	
	
}
