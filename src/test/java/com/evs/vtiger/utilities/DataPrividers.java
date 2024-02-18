package com.evs.vtiger.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataPrividers {
	
	
	@DataProvider(name="credential")
	public String[][] getAllData() throws IOException {
		
		
		String path ="src\\test\\resources\\logindata.xlsx";
		
		XLUtility xl=new XLUtility(path);		
		
	int rowcount= xl.getRowCount("TestData");
	
	int colcount= xl.getCellCount("TestData", 1);
		
	String data[][]=new String[rowcount][colcount];
	
	
	for (int i = 1; i <=rowcount; i++) {
		
		for(int j=0;j<colcount;j++) {
			data[i-1][j]=xl.getCellData("TestData", i, j);
		}
	}
	
	return data;
	
	
	
	}
	
	
	

}
