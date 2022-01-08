package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL3 {
	public static void main(String[] args) throws IOException {

		File excelLoc = new File("D:\\Workspace\\FrameWork\\EXCEL\\Hello.xlsx");

		Workbook w = new XSSFWorkbook();
		
		Sheet sheet = w.createSheet();
		Row createRow = sheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("RANJITHKUMAR");
		
		FileOutputStream output = new FileOutputStream(excelLoc);
		
		w.write(output);
		


}}
