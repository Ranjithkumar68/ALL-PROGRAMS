package org.tcs;

import java.io.IOException;

import org.library.LibGlobal;

public class example {
public static void main(String[] args) throws IOException {
	LibGlobal l = new LibGlobal();
	
l.writeExcel("D:\\Workspace\\Ranjith\\EXCEL\\adactin.xlsx", "ranjith"	, 0, 5);
}
}
