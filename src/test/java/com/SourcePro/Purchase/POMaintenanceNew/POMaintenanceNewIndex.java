package com.SourcePro.Purchase.POMaintenanceNew;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SourcePro.Init.Common;
import com.SourcePro.Init.SeleniumInit;
import com.SourcePro.Utility.TestData;

public class POMaintenanceNewIndex extends SeleniumInit {

	@Test
	public void add_POMaintenanceNew() throws IOException, AWTException {

		int numOfFailure = 0;
		int step = 1;

		logStep(step++, "Open URL : " + testUrl);

		// Main Test Parameters
		String POBasis, POType, Group, Site, PODate, Vendor, Buyer, RateStructure, ItemCode_1, WarehouseCode_1,
				QtyPUOM_1, QtyPUOM_2, ItemCode_2, WarehouseCode_2, Qty_2_PUOM_1, Qty_2_PUOM_2, RateCode, TaxValue;

		logStep(step++, "Fill PO Maintenanace New");

		// For Data Driven
		File f = new File("UploadData/POMaintenanceNew.xlsx");
		String POMaintenanceNewExcel = f.getAbsolutePath();

		ArrayList<String> POBasisExcel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "PO Basis");
		ArrayList<String> POTypeExcel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "PO Type");
		ArrayList<String> GroupExcel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Group");
		ArrayList<String> SiteExcel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Site");
		ArrayList<String> PODateExcel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "PO Date");
		ArrayList<String> VendorExcel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Vendor");
		ArrayList<String> BuyerExcel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Buyer");
		ArrayList<String> RateStructureExcel = TestData.getColumnData(POMaintenanceNewExcel, "TestData",
				"Rate Structure");
		ArrayList<String> ItemCode_1Excel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Item Code 1");
		ArrayList<String> WarehouseCode_1Excel = TestData.getColumnData(POMaintenanceNewExcel, "TestData",
				"Warehouse Code 1");
		ArrayList<String> QtyPUOM_1Excel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Qty PUOM 1");
		ArrayList<String> QtyPUOM_2Excel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Qty PUOM 2");
		ArrayList<String> ItemCode_2Excel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Item Code 2");
		ArrayList<String> WarehouseCode_2Excel = TestData.getColumnData(POMaintenanceNewExcel, "TestData",
				"Warehouse Code 2");
		ArrayList<String> Qty_2_PUOM_1Excel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Qty 2 PUOM 1");
		ArrayList<String> Qty_2_PUOM_2Excel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Qty 2 PUOM 2");
		ArrayList<String> RateCodeExcel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Rate code");
		ArrayList<String> TaxValueExcel = TestData.getColumnData(POMaintenanceNewExcel, "TestData", "Tax Value");

		POBasis = POBasisExcel.get(0);
		POType = POTypeExcel.get(0);
		Group = GroupExcel.get(0);
		Site = SiteExcel.get(0);
		PODate = PODateExcel.get(0);
		Vendor = VendorExcel.get(0);
		Buyer = BuyerExcel.get(0);
		RateStructure = RateStructureExcel.get(0);
		ItemCode_1 = ItemCode_1Excel.get(0);
		WarehouseCode_1 = WarehouseCode_1Excel.get(0);
		QtyPUOM_1 = QtyPUOM_1Excel.get(0);
		QtyPUOM_2 = QtyPUOM_2Excel.get(0);
		ItemCode_2 = ItemCode_2Excel.get(0);
		WarehouseCode_2 = WarehouseCode_2Excel.get(0);
		Qty_2_PUOM_1 = Qty_2_PUOM_1Excel.get(0);
		Qty_2_PUOM_2 = Qty_2_PUOM_2Excel.get(0);
		RateCode = RateCodeExcel.get(0);
		TaxValue = TaxValueExcel.get(0);

		logStep(step++, "Click on Purchase menu.");
		commonMethodsVerification = commonMethodsIndexPage.clickOnMenu("Purchase");

		logStep(step++, "Click on PO Maintenance New sub menu.");
		commonMethodsVerification = commonMethodsIndexPage.clickOnMenuWithChild("PO Maintenance New");

		log("Verify table loaded succesfully.");
		if (itemMasterBasicDetailEntryVerification.verifyTableLoad()) {
			logStatus(1, "Table loaded succesfully. ");
		} else {
			logStatus(2, "Table not loaded. ");
			numOfFailure++;
		}

		logStep(step++, "Click on add new in PO Maintenance New.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addBtn_POMaintenanceNew();

		logStep(step++, "Select PO Basis.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.select_POBasis_POMaintenanceNew(POBasis);
		log("Selected value is: "+POBasis);
		
		logStep(step++, "Select PO Type.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.select_POType_POMaintenanceNew(POType);
		log("Selected value is: "+POType);

		logStep(step++, "Select Group.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.select_Group_POMaintenanceNew(Group);
		log("Selected value is: "+Group);

		logStep(step++, "Select Site.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.select_Site_POMaintenanceNew(Site);
		log("Selected value is: "+Site);	

		logStep(step++, "Select PO Date.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.select_PO_Date_POMaintenanceNew(PODate);
		log("Selected value is: "+PODate);	
		
		logStep(step++, "Click on Next button in Purchase Order Information.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.nextBtn_1_POMaintenanceNew();
		
		// Vendor
		logStep(step++, "Select Vendor.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.select_Vendor_POMaintenanceNew(Vendor);
		log("Selected value is: "+Vendor);	
		
		logStep(step++, "Select Buyer.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.select_Buyer_POMaintenanceNew(Buyer);
		log("Selected value is: "+Buyer);	
		
		logStep(step++, "Click on Next button in Vendor Information.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.nextBtn_2_POMaintenanceNew();
		
		logStep(step++, "Select Rate Structure.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.select_RateStructure_POMaintenanceNew(RateStructure);
		log("Selected value is: "+RateStructure);	
		
		logStep(step++, "Click on Next button in Purchase Order Delivery Details .");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.nextBtn_3_POMaintenanceNew();
		
		logStep(step++, "Click on Add new button.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_1_POMaintenanceNew();
		
		logStep(step++, "Enter Item Code.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.add_ItemCode_1_POMaintenanceNew(ItemCode_1);
		log("Entered value is: "+ItemCode_1);	

		logStep(step++, "Enter Warehouse Code.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.add_WarehouseCode_1_POMaintenanceNew(WarehouseCode_1);
		log("Entered value is: "+WarehouseCode_1);	

		logStep(step++, "Select first item code from the table.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.selectItemCodeTable_1_POMaintenanceNew(ItemCode_1);
		
		logStep(step++, "Clicked on Child Add New Button.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_ItemCode_1_POMaintenanceNew();
		
		logStep(step++, "Enter PUOM Qty.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.enterPUOM_QTY_ItemCode_1_POMaintenanceNew(QtyPUOM_1);
		
		logStep(step++, "Clicked on Child Add New Button.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_ItemCode_1_POMaintenanceNew();
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_ItemCode_1_POMaintenanceNew();
		
		logStep(step++, "Enter PUOM Qty.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.enterPUOM_QTY_ItemCode_1_POMaintenanceNew(QtyPUOM_2);

		logStep(step++, "Click on Add new button.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_1_POMaintenanceNew();
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_1_POMaintenanceNew();

		logStep(step++, "Enter second Item Code.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.add_ItemCode_1_POMaintenanceNew(ItemCode_2);
		log("Entered value is: "+ItemCode_2);	
		
		logStep(step++, "Enter second Warehouse Code.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.add_WarehouseCode_2_POMaintenanceNew(WarehouseCode_2);
		log("Entered value is: "+WarehouseCode_2);	

		logStep(step++, "Select first item code from the table.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.selectItemCodeTable_1_POMaintenanceNew(ItemCode_2);
		
		logStep(step++, "Clicked on Child Add New Button.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_ItemCode_1_POMaintenanceNew();
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_ItemCode_1_POMaintenanceNew();

		logStep(step++, "Enter second PUOM Qty.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.enterPUOM_QTY_ItemCode_1_POMaintenanceNew(Qty_2_PUOM_1);
		log("Entered value is: "+Qty_2_PUOM_1);	

		logStep(step++, "Clicked on Child Add New Button.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_ItemCode_1_POMaintenanceNew();
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_ItemCode_1_POMaintenanceNew();
		
		logStep(step++, "Enter second PUOM Qty.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.enterPUOM_QTY_ItemCode_1_POMaintenanceNew(Qty_2_PUOM_2);
		log("Entered value is: "+Qty_2_PUOM_2);	
		
		logStep(step++, "Click on Next button in Item and Indent Detail.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.nextBtn_4_POMaintenanceNew();
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.nextBtn_4_POMaintenanceNew();
		
		logStep(step++, "Select Rate Code.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.selectRateCode_POMaintenanceNew(RateCode);
		log("Selected value is: "+RateCode);	
		
		logStep(step++, "Enter Tax Value.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addTaxValue_POMaintenanceNew(RateCode,TaxValue);
		log("Entered value is: "+TaxValue);	
		
		logStep(step++, "Clicked on Next in Rate Calculation .");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_RateCalculation_POMaintenanceNew();
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.addNewBtn_RateCalculation_POMaintenanceNew();
		
		logStep(step++, "Clicked on Save Button.");
		pOMaintenanceNewVerification = pOMaintenanceNewIndexPage.saveBTN_POMaintenanceNew();

		if(commonMethodsVerification.verifySuccessMessage("Successfully"))
		{
			logStatus(1,"Notification Message displayed successfully");
		}
		else{
			logStatus(2,"Notification Message is not displayed.");
			numOfFailure++;
		}

		String str = pOMaintenanceNewIndexPage.getPO_OrderValue();
		String[] arrOfStr = str.split(" ");
		log("PO document number : "+arrOfStr[2]);

		String[] number = arrOfStr[2].split("/");
      	String po_GeneratedNumber = number[3]; 


		log("Verify table loaded succesfully.");
		if (itemMasterBasicDetailEntryVerification.verifyTableLoad()) {
			logStatus(1, "Table loaded succesfully. ");
		} else {
			logStatus(2, "Table not loaded. ");
			numOfFailure++;
		}  

		log("Verify PO Number is available.");
		if (itemMasterBasicDetailEntryVerification.verifyPONummber(po_GeneratedNumber)) {
			logStatus(1, " PO Number loaded succesfully. ");
		} else {
			logStatus(2, " PO Number not loaded. ");
			numOfFailure++;
		}  




		
		
		

		
		




	}
}
