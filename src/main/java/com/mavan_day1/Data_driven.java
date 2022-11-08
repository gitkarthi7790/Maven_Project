package com.mavan_day1;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven {

	public static void read_all_data() throws IOException {
		
		
		
		
	
		File k=new File("C:\\Users\\DELL\\eclipse-workspace\\mavan_day1\\data.xlsx");
		FileInputStream web=new FileInputStream(k);
		
             Workbook karthi = new XSSFWorkbook(web);
             Sheet sheetAt = karthi.getSheetAt(1);
             int Number = sheetAt.getPhysicalNumberOfRows();
             
             for (int i = 0; i < Number; i++) {
            	 Row row=sheetAt.getRow(i);
            	 int Cell = row.getPhysicalNumberOfCells();
            	 for (int j = 0; j <Cell ; j++) {            		 
            	Cell cells=row.getCell(j);
            	CellType cellType = cells.getCellType();
            	if (cellType.equals(cellType.STRING)) {
            		
					String Value = cells.getStringCellValue();
					System.out.println(Value);
					
				}
            	else if(cellType.equals(cellType.NUMERIC)) {
            		double numericCellValue = cells.getNumericCellValue();
            		int num=(int) numericCellValue;
            		System.out.println(num);
            	}
					
				}
            	 
				
			}
				
			}
	

	
	public static void main(String[] args) throws IOException {

		read_all_data();
		
	}

}
