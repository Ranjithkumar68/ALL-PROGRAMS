package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL2 {
	public static void main(String[] args) throws IOException {

		File excelLoc = new File("D:\\Workspace\\FrameWork\\EXCEL\\sample.xlsx");

		FileInputStream stream = new FileInputStream(excelLoc);

		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("automation");
		
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		
		if (value.equals("NAME")) {
			c.setCellValue("USERNAME");
		}
		FileOutputStream output = new FileOutputStream(excelLoc);
		
		w.write(output);
		
		
			
		
		
		
		
}
	}
