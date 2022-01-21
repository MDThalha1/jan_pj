package com.Project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	
	public static void Write() throws Throwable {
		File f=new File("C:\\Users\\Mt\\eclipse-workspace\\Project1\\Excel\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		w.createSheet("DataS").createRow(0).createCell(0).setCellValue("username");
		w.getSheet("DataS").getRow(0).createCell(1).setCellValue("Password");
		w.getSheet("DataS").createRow(1).createCell(0).setCellValue("thalha");
		w.getSheet("DataS").getRow(1).createCell(1).setCellValue("1234");
		FileOutputStream fis=new FileOutputStream(f);
		w.write(fis);
		System.out.println("Data Succesfully Written");
	}
	public static void main(String[] args) throws Throwable {
		Write();
	}

}
