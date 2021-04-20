package org.excelfunction;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunction {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook w = new  XSSFWorkbook();
		XSSFSheet newsheet = w.createSheet("MarchBatch");
		
		String[][] completedata ={{"yuvarj","27","13 dec"},{"vaishali","22"},{"vignesh","24"},{"fayaz","23"}};
		
		int rowcount= 0;
		
		for (String[] onenyonearray : completedata) //[array[0],array[1],array[2]]
		{
			//row
			XSSFRow row=newsheet.createRow(rowcount++);  //0 //1 //2
			int colcount=0;
			for (String string : onenyonearray) {
				System.out.println(string);
				//col
				XSSFCell createCell = row.createCell(colcount++);
				createCell.setCellValue(string);
				
			}
		
		FileOutputStream op = new FileOutputStream("./data/NewExcel.xlsx");
		w.write(op);
		op.close();
		}
	}
}
				 

	

