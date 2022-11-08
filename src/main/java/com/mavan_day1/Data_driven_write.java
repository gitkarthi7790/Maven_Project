package com.mavan_day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven_write {
	
	public static void write_data() throws IOException {
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\mavan_day1\\data.xlsx");
		
		FileInputStream fil = new FileInputStream(f);
		
		
		Workbook w =new XSSFWorkbook(fil);
		
		Sheet createSheet = w.createSheet("Karthi");
		 Row createRow = createSheet.createRow(0);
		 Cell createCell = createRow.createCell(0);
		 
		 createCell.setCellValue("VTK");
		 w.getSheet("karthi").getRow(0).createCell(1).setCellValue("100cr");
		 w.getSheet("karthi").getRow(0).createCell(2).setCellValue("HIT");
		 
		 //
		 w.getSheet("karthi").createRow(1).createCell(0).setCellValue("VIKRAM");
		 w.getSheet("karthi").getRow(1).createCell(1).setCellValue("500cr");
		 
		 w.getSheet("karthi").getRow(1).createCell(2).setCellValue("BLOCK BUSTER");
		 
		 
		 
	FileOutputStream out=new FileOutputStream(f);
	    w.write(out);//workbook name refname
	    w.close();
		
		
	}
	



	public static void main(String[] args) throws IOException {
		write_data();
		
		

	}

}
