package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromFromulaCell {

	public static void main(String[] args) throws FileNotFoundException  {
		
		
		String location="C:\\Users\\Naga Babu\\Desktop\\IICS Dev.xlsx";
		
		FileInputStream fio= new FileInputStream(location);
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		//for loop
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<=rows;r++){
			
			XSSFRow row=sheet.getRow(r);
			
			
			for(int c=0;c<=cols;c++) 
			{
				
			
				XSSFCell cell=row.getCell(c);
			}
		}
		
		
		

	}

}
