package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDateUsingCollection {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("empdata");
		
		ArrayList<Object[]> empdata= new ArrayList<Object[]>();
		empdata.add(new Object[]{"empid","Name","Job"});
		empdata.add(new Object[] {101,"naga","Engg"});
		empdata.add(new Object[] {102,"babu","law"});
		empdata.add(new Object[] {103,"nagababu","market"});
		
		//using for each
		
		int rowcount=0;
		
		for(Object emp[]:empdata)
		{
			
		XSSFRow row=sheet.createRow(rowcount++);
		int columncount=0;
		
		for(Object value:emp)
		{
			XSSFCell cell=row.createCell(columncount++);
			
			
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
