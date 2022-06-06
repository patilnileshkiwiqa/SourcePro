package com.SourcePro.Materials.ItemMasterBasicDetailEntry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SourcePro.Init.AbstractPage;
import com.SourcePro.Init.Common;

public class ItemMasterBasicDetailEntryIndexPage extends AbstractPage {

	public ItemMasterBasicDetailEntryIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button//i")
	WebElement addNewItemMasterBasicDetailEntry;

	public ItemMasterBasicDetailEntryVerification addNewItemMasterBasicDetailEntry() {

		Common.clickableElement(addNewItemMasterBasicDetailEntry, driver);
		Common.clickOn(driver, addNewItemMasterBasicDetailEntry);
		return new ItemMasterBasicDetailEntryVerification(driver);
	}

	@FindBy(id = "itemCode")
	WebElement addItemCode_NewItemMasterBasicDetailEntry;

	public ItemMasterBasicDetailEntryVerification addItemCode_NewItemMasterBasicDetailEntry(String value) {

		Common.clickableElement(addItemCode_NewItemMasterBasicDetailEntry, driver);
		Common.type(addItemCode_NewItemMasterBasicDetailEntry, value);
		return new ItemMasterBasicDetailEntryVerification(driver);
	}

	@FindBy(id = "ItemDesc1")
	WebElement addItemDescription_NewItemMasterBasicDetailEntry;

	public ItemMasterBasicDetailEntryVerification addItemDescription_NewItemMasterBasicDetailEntry(String value) {

		Common.clickableElement(addItemDescription_NewItemMasterBasicDetailEntry, driver);
		Common.type(addItemDescription_NewItemMasterBasicDetailEntry, value);
		return new ItemMasterBasicDetailEntryVerification(driver);
	}
	
	public ItemMasterBasicDetailEntryVerification editItemDescription_NewItemMasterBasicDetailEntry(String value) {

		Common.clickableElement(addItemDescription_NewItemMasterBasicDetailEntry, driver);
		Common.FocusOnEle(driver, addItemDescription_NewItemMasterBasicDetailEntry);
		addItemDescription_NewItemMasterBasicDetailEntry.clear();
		addItemDescription_NewItemMasterBasicDetailEntry.sendKeys(value);
		return new ItemMasterBasicDetailEntryVerification(driver);
	}

	@FindBy(xpath = "//div[label[text()='Item Class']]//input")
	WebElement addItemClass_NewItemMasterBasicDetailEntry;

	public ItemMasterBasicDetailEntryVerification addItemClass_NewItemMasterBasicDetailEntry(String value) {

		Common.clickableElement(addItemClass_NewItemMasterBasicDetailEntry, driver);
		Common.type(addItemClass_NewItemMasterBasicDetailEntry, value);

		Common.pause(1);
		String xpath = "//span[text()='" + value + "']";

		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new ItemMasterBasicDetailEntryVerification(driver);
	}

	@FindBy(xpath = "//div[label[text()='Item Type']]//input")
	WebElement addItemType_NewItemMasterBasicDetailEntry;

	public ItemMasterBasicDetailEntryVerification addItemType_NewItemMasterBasicDetailEntry(String value) {

		Common.clickableElement(addItemType_NewItemMasterBasicDetailEntry, driver);
		Common.type(addItemType_NewItemMasterBasicDetailEntry, value);

		Common.pause(1);
		String xpath = "//span[text()='" + value + "']";

		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new ItemMasterBasicDetailEntryVerification(driver);
	}

	@FindBy(xpath = "//div[label[@for='unitofMeasureID']]//input")
	WebElement addItemUnitofMeasurement_NewItemMasterBasicDetailEntry;

	public ItemMasterBasicDetailEntryVerification addItemUnitOfMeasurement_NewItemMasterBasicDetailEntry(String value) {

		Common.clickableElement(addItemUnitofMeasurement_NewItemMasterBasicDetailEntry, driver);
		Common.type(addItemUnitofMeasurement_NewItemMasterBasicDetailEntry, value);

		Common.pause(1);
		String xpath = "//span[text()='" + value + "']";

		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		return new ItemMasterBasicDetailEntryVerification(driver);
	}

	@FindBy(xpath = "//button[text()='Add New']//i")
	WebElement addLinkedItemsCodeBTN_NewItemMasterBasicDetailEntry;
	@FindBy(xpath = "(//input[@type='button'])[2]")
	WebElement addLinkedItemsCodeSearchBTN_NewItemMasterBasicDetailEntry;
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement addLinkedItemsCodeSearchBox_NewItemMasterBasicDetailEntry;
	@FindBy(xpath = "//button//i[@class='icon-search mr-0']")
	WebElement addLinkedItemsCodeSearchBoxBtn_NewItemMasterBasicDetailEntry;
	@FindBy(xpath = "//button[text()='Continue']")
	WebElement addLinkedItemsCodeContinueBtn_NewItemMasterBasicDetailEntry;
	
	public ItemMasterBasicDetailEntryVerification addLinkedItemsCode_NewItemMasterBasicDetailEntry(String value) {

		Common.scrollUpToElement(driver, addLinkedItemsCodeBTN_NewItemMasterBasicDetailEntry);
		Common.clickableElement(addLinkedItemsCodeBTN_NewItemMasterBasicDetailEntry, driver);
		Common.clickOn(driver, addLinkedItemsCodeBTN_NewItemMasterBasicDetailEntry);
		Common.pause(2);
		Common.jsClick(driver, addLinkedItemsCodeSearchBTN_NewItemMasterBasicDetailEntry);
		Common.PresenceOfElement(By.xpath("//h4"), driver);
		Common.type(addLinkedItemsCodeSearchBox_NewItemMasterBasicDetailEntry, value);
		Common.clickOn(driver, addLinkedItemsCodeSearchBoxBtn_NewItemMasterBasicDetailEntry);
		
		String xpath = "//div[text()='"+value+"']";
		
		Common.PresenceOfElement(By.xpath(xpath), driver);
		Common.clickOn(driver, driver.findElement(By.xpath(xpath)));
		Common.clickOn(driver, addLinkedItemsCodeContinueBtn_NewItemMasterBasicDetailEntry);
		
		return new ItemMasterBasicDetailEntryVerification(driver);

	}

	@FindBy(xpath = "//button[normalize-space()='Drawing Files']")
	WebElement addDrawingFileBtn_NewItemMasterBasicDetailEntry;
	@FindBy(xpath = "//label//input[@type='file']")
	WebElement addDrawingFile_NewItemMasterBasicDetailEntry;
	
	public ItemMasterBasicDetailEntryVerification addDrawingFile_NewItemMasterBasicDetailEntry(String drawingFilePath) {
		
		Common.clickOn(driver, addDrawingFileBtn_NewItemMasterBasicDetailEntry);
		addDrawingFile_NewItemMasterBasicDetailEntry.sendKeys(drawingFilePath);
		return new ItemMasterBasicDetailEntryVerification(driver);

	}

	@FindBy(xpath = "//button[text()='Save']//i")
	WebElement addSaveBtn_NewItemMasterBasicDetailEntry;
	
	public ItemMasterBasicDetailEntryVerification addSaveBtn_NewItemMasterBasicDetailEntry() {
		
		Common.clickableElement(addSaveBtn_NewItemMasterBasicDetailEntry, driver);
		Common.jsClick(driver, addSaveBtn_NewItemMasterBasicDetailEntry);
		return new ItemMasterBasicDetailEntryVerification(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Search Item']")
	WebElement addSearch_NewItemMasterBasicDetailEntry;
	
	public ItemMasterBasicDetailEntryVerification addSearch_NewItemMasterBasicDetailEntry(String value) {
		
		Common.pause(3);
		Common.clickableElement(addSearch_NewItemMasterBasicDetailEntry, driver);
		Common.type(addSearch_NewItemMasterBasicDetailEntry, value);
		addSearch_NewItemMasterBasicDetailEntry.sendKeys(Keys.ENTER);
		return new ItemMasterBasicDetailEntryVerification(driver);
	}

	@FindBy(xpath = "//a//i[@class='icon-pencil']")
	WebElement addEditIcon_NewItemMasterBasicDetailEntry;
	
	public ItemMasterBasicDetailEntryVerification addEditIcon_NewItemMasterBasicDetailEntry() {
		Common.clickableElement(addEditIcon_NewItemMasterBasicDetailEntry, driver);
		Common.jsClick(driver, addEditIcon_NewItemMasterBasicDetailEntry);
		return new ItemMasterBasicDetailEntryVerification(driver);
	}

}
