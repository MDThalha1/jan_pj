package com.Project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.sun.org.apache.xpath.internal.operations.Equals;


public class Read_Excel {
	public static void data_Readexcel() throws Throwable {
		File f=new File("C:\\Users\\Mt\\eclipse-workspace\\Project1\\Excel\\Book1.xlsx");
		//Fille Inut Stream
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheetAt(0);
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
		CellType cellType = c.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String scv = c.getStringCellValue();
			System.out.println(scv);
			
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double num = c.getNumericCellValue();
			System.out.println(num);	
		}
}
	public static void main(String[] args) throws Throwable {
		data_Readexcel();
		multiple_Data();
	}
	public static void multiple_Data() throws Throwable {
		File f=new File("C:\\Users\\Mt\\eclipse-workspace\\Project1\\Excel\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheetAt(0);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells() ; j++) {
				Cell c = row.getCell(j);
				CellType cellType = c.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String str = c.getStringCellValue();
				System.out.println(str);
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double num = c.getNumericCellValue();
				System.out.println(num);
			}
			}
		}	
			}	
	}