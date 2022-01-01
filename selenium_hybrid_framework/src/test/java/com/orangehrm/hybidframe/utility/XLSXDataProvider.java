package com.orangehrm.hybidframe.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXDataProvider {
	XSSFWorkbook wb;

	// TODO Auto-generated method stub
	public XLSXDataProvider() {
		try {
			File fs = new File("./TestData/testData.xlsx");
			FileInputStream fins = new FileInputStream(fs);
			wb = new XSSFWorkbook(fins);
		}

		catch (Exception e) {
			System.out.println("Excel file not found >>" + e.getMessage());
		}

	}

	public String getStringCellData(String sheetname, int row, int col) {
		return wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	}

	public int getNumericCellData(String sheetname, int row, int col) {
		return (int) wb.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
	}

	public String getStringCellData(int SheetIndex, int row, int col) {
		return wb.getSheetAt(SheetIndex).getRow(row).getCell(col).getStringCellValue();

	}

	public int getNumericCellData(int SheetIndex, int row, int col) {
		return (int) wb.getSheetAt(SheetIndex).getRow(row).getCell(col).getNumericCellValue();
	}

}
