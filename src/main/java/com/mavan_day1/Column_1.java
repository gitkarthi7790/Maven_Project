package com.mavan_day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Column_1 {

	public static void write_column() throws IOException {

		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\mavan_day1\\data.xlsx");
        FileInputStream fil = new FileInputStream(f);		

		Workbook w = new XSSFWorkbook(fil);
		Sheet sheetAt = w.getSheetAt(0);
	
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < physicalNumberOfRows; i++) {

			Row row = sheetAt.getRow(i);
		    Cell cell = row.getCell(1);
			System.out.println(cell);
		}
	
		
	
	}
	public static void main(String[] args) throws IOException {
		write_column();
	}
}
