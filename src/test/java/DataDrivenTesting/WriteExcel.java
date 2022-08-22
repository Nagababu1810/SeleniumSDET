package DataDrivenTesting;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
	
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("emp info");
		
		
		Object empdata[][]= {    {"EMPID","Name","Age"},
								{101,"Nagababu",25},
								{102,"Babu",52},
								{103,"Naga",31}
								
		};
		
		//using for loop
		
		int rows=empdata.length;
		int cols=empdata[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=0;r<=rows;r++) {
			
		XSSFRow row=sheet.createRow(r);
		
		for(int c=0;c<=cols;c++) 
		{
			XSSFCell cell=row.createCell(c);
			Object value=empdata[r][c];
			
			if(value instanceof String)
			cell.setCellValue((String)value);
			if(value instanceof Integer)
			cell.setCellValue((Integer)value);
			if(value instanceof Boolean)
				cell.setCellValue((Boolean)value);
		}
		}
				
		
		FileOutputStream fio= new FileOutputStream(".\\TextData\\write.xlsx");
		workbook.write(fio);
		fio.close();
		System.out.println("employee file succefully written");
		

	}

}
