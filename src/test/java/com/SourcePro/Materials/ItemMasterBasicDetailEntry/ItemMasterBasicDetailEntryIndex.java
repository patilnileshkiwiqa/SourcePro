package com.SourcePro.Materials.ItemMasterBasicDetailEntry;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SourcePro.Init.Common;
import com.SourcePro.Init.SeleniumInit;
import com.SourcePro.Utility.TestData;
import com.Temp.Demo;

public class ItemMasterBasicDetailEntryIndex extends SeleniumInit {

	@Test
	public void ItemMasterBasicDetailEntryAdd() throws IOException, AWTException{

		int numOfFailure=0;
		int step=1;
		
		String ItemCode, ItemDescription, ItemClass, ItemType, UnitOfMeasurement, LinkedItems, LinkedItemsCode, 
		DrawingFile, DrawingFilePath, UpdatedItemDescription;
		
		
		//For Data Driven
		File f = new File("UploadData/ItemMasterBasicDetailEntry.xlsx");
		String ItemMasterBasicDetailEntryExcelPath = f.getAbsolutePath();

		ArrayList<String> ItemDescriptionExcel = TestData.getColumnData(ItemMasterBasicDetailEntryExcelPath, "TestData", "Item Description");
		ArrayList<String> ItemClassExcel = TestData.getColumnData(ItemMasterBasicDetailEntryExcelPath, "TestData", "Item Class");
		ArrayList<String> ItemTypeExcel = TestData.getColumnData(ItemMasterBasicDetailEntryExcelPath, "TestData", "Item Type");
		ArrayList<String> UnitOfMeasurementExcel = TestData.getColumnData(ItemMasterBasicDetailEntryExcelPath, "TestData", "Unit Of Measurement");
		ArrayList<String> LinkedItemsExcel = TestData.getColumnData(ItemMasterBasicDetailEntryExcelPath, "TestData", "Linked Items");
		ArrayList<String> LinkedItemsCodeExcel = TestData.getColumnData(ItemMasterBasicDetailEntryExcelPath, "TestData", "Linked Items Code");
		ArrayList<String> DrawingFileExcel = TestData.getColumnData(ItemMasterBasicDetailEntryExcelPath, "TestData", "Drawing File");
		ArrayList<String> DrawingFilePathExcel = TestData.getColumnData(ItemMasterBasicDetailEntryExcelPath, "TestData", "Drawing File Path");
		ArrayList<String> UpdatedItemDescriptionExcel = TestData.getColumnData(ItemMasterBasicDetailEntryExcelPath, "TestData", "Updated Item Description");
		
		ItemCode = "KIWIQA"+Demo.generateRandomChars(8);
		ItemDescription = ItemDescriptionExcel.get(0);
		ItemClass = ItemClassExcel.get(0);
		ItemType = ItemTypeExcel.get(0);
		UnitOfMeasurement = UnitOfMeasurementExcel.get(0);
		LinkedItems = LinkedItemsExcel.get(0);
		LinkedItemsCode = LinkedItemsCodeExcel.get(0);
		DrawingFile = DrawingFileExcel.get(0);
		DrawingFilePath = DrawingFilePathExcel.get(0);
		UpdatedItemDescription = UpdatedItemDescriptionExcel.get(0);

		
		logStep(step++,"Click on Materials menu.");
		commonMethodsVerification = commonMethodsIndexPage.clickOnMenu("Materials");

		logStep(step++,"Click on Item Master Basic Detail - Entry sub menu.");
		commonMethodsVerification = commonMethodsIndexPage.clickOnMenuWithChild("Item Master Basic Detail - Entry");

		log("Verify table loaded succesfully.");
		if(itemMasterBasicDetailEntryVerification.verifyTableLoad())
		{
			logStatus(1,"Table loaded succesfully. ");
		}
		else{
			logStatus(2,"Table not loaded. ");
			numOfFailure++;
		}
		
		logStep(step++,"Click on add new in Item Master Basic Detail - Entry.");
		itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addNewItemMasterBasicDetailEntry();
		
		logStep(step++,"Enter Item Code.");
		itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addItemCode_NewItemMasterBasicDetailEntry(ItemCode);
		log("Entered value is: "+ItemCode);

		logStep(step++,"Enter Item Description.");
		itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addItemDescription_NewItemMasterBasicDetailEntry(ItemDescription);
		log("Entered value is: "+ItemDescription);
		
		logStep(step++,"Enter Item Class.");
		itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addItemClass_NewItemMasterBasicDetailEntry(ItemClass);
		log("Selected value is: "+ItemClass);
		
		logStep(step++,"Enter Item Type.");
		itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addItemType_NewItemMasterBasicDetailEntry(ItemType);
		log("Selected value is: "+ItemType);
		
		logStep(step++,"Enter Unit Of Measurement.");
		itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addItemUnitOfMeasurement_NewItemMasterBasicDetailEntry(UnitOfMeasurement);
		log("Selected value is: "+UnitOfMeasurement);
		
		if(LinkedItems.equalsIgnoreCase("true"))
		{
			logStep(step++,"Select Linked Items and enter linked item code.");
			itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addLinkedItemsCode_NewItemMasterBasicDetailEntry(LinkedItemsCode);
		}
			
		
		File f1 = new File("UploadData/"+DrawingFilePath);
		String DrawingFileExcelPath = f1.getAbsolutePath();
		
		if(DrawingFile.equalsIgnoreCase("true")) 
		{
			logStep(step++,"Select Drawing File.");
			itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addDrawingFile_NewItemMasterBasicDetailEntry(DrawingFileExcelPath);
	
		}
		
		log("Verify file uploaded succesfully.");
		if(itemMasterBasicDetailEntryVerification.verifyFileUpLoaded(DrawingFilePath))
		{
			logStatus(1,"File uploaded succesfully. ");
		}
		else{
			logStatus(2,"File not uploaded. ");
			numOfFailure++;
		}
		
		logStep(step++,"Click on Save button.");
		itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addSaveBtn_NewItemMasterBasicDetailEntry();
		
		log("Verify created item succesfully.");
		if(itemMasterBasicDetailEntryVerification.verifyItemCreated(ItemCode))
		{
			logStatus(1,"Item created succesfully. ");
		}
		else{
			logStatus(2,"Item not created. ");
			numOfFailure++;
		}

		log("Edit created item.");
		logStep(step++,"Search newly created item.");
		itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addSearch_NewItemMasterBasicDetailEntry(ItemCode);
	
		logStep(step++,"Click on newly created item.");
		itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addEditIcon_NewItemMasterBasicDetailEntry();
	
		logStep(step++,"Enter Updated Item Description.");
		itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.editItemDescription_NewItemMasterBasicDetailEntry(UpdatedItemDescription);
		log("Entered value is: "+UpdatedItemDescription);
		
		logStep(step++,"Click on Save button.");
		itemMasterBasicDetailEntryVerification = itemMasterBasicDetailEntryIndexPage.addSaveBtn_NewItemMasterBasicDetailEntry();
		
		log("Verify created item succesfully.");
		if(itemMasterBasicDetailEntryVerification.verifyItemCreated(ItemCode))
		{
			logStatus(1,"Item updated succesfully. ");
		}
		else{
			logStatus(2,"Item not updated. ");
			numOfFailure++;
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		} 
		
		
		
	}
}
