package com.mavan_day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Data_driven2 {
	
public static void	read_particular_data() throws IOException  {
	
	
	
	
	File read=new File("C:\\Users\\DELL\\eclipse-workspace\\mavan_day1\\src\\fruit.xlsx");
	
	FileInputStream write=new FileInputStream(read);
	Workbook work=new XSSFWorkbook(write);
	Sheet sheetAt = work.getSheetAt(0);
	Row row = sheetAt.getRow(2);
	Cell cell = row.getCell(1);
	CellType cellType = cell.getCellType();
	if (cellType.equals(cellType.STRING)) {
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
	}
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int num=(int)numericCellValue;
			System.out.println(num);
			
		}
		
	}
public static void main(String[] args) throws IOException {
	read_particular_data();
	
}

	
}

	


 
	
        