package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL {
	public static void main(String[] args) throws IOException {

		File excelLoc = new File("D:\\Workspace\\FrameWork\\EXCEL\\sample.xlsx");

		FileInputStream stream = new FileInputStream(excelLoc);

		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("DATA");

//		Row r = s.getRow(0);
//		
//		Cell c = r.getCell(0);
//		
//		System.out.println(c);
//		
//		System.out.println(s.getPhysicalNumberOfRows());
//		System.out.println(r.getPhysicalNumberOfCells());

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r1 = s.getRow(i);
			for (int j = 0; j < r1.getPhysicalNumberOfCells(); j++) {
					Cell c = r1.getCell(j);
				int cellType = c.getCellType();
				 if (cellType==1) {
						String stringCellValue = c.getStringCellValue();
						System.out.println(stringCellValue);	
					}if (cellType==0) {
						double numericCellValue = c.getNumericCellValue();
						long l = (long)numericCellValue;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
						}
					
				
			}
			
		}

	}

}
