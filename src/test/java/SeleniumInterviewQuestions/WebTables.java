package SeleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumResources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//retrive the specific coluname
		String cellname=driver.findElement(By.xpath("//table//tbody//tr[5]//td[5]")).getText();
		System.out.println(cellname);
		
		//column name
		List<WebElement> colname=driver.findElements(By.xpath("//table//tbody//tr[1]//th"));
		
		
		for(WebElement colnames:colname) {
			
			System.out.println(colnames.getText());
			//System.out.println(colname.size());
		}
		
		//retrive the data from table
		
		String table= driver.findElement(By.xpath("//table[@style='width:100%']//tr//td")).getText();
		System.out.println("cloumn name is "+table);
		
		//howmany rows ina table
		
		int rows= driver.findElements(By.xpath("//table[@style='width:100%']//tbody//tr")).size();
		System.out.println("total no of rows: "+ rows);
		
		
		//how many colmns in a table
		
		int cols= driver.findElements(By.xpath("//table[@style='width:100%']//tbody//th")).size();
		System.out.println("total no of colmsn:"+cols);
		
		//how many cels in a table
		int cells= driver.findElements(By.xpath("//table[@style='width:100%']//tbody//td")).size();
		
		System.out.println("total no of cells:"+cells);
		
		//retrive the total data
		
		for(int r=1;r<=rows;r++)
		{
		for(int c=1;c<cols;c++) {
			
	//String value=driver.findElement(By.xpath("//table[@style='width:100%']//tbody//tr["+r+"]/th["+c+"]")).getText();
	String value=driver.findElement(By.xpath("//tbody/tr["+r+"]")).getText();
			
	System.out.println(value+"  ");
	
		}
			System.out.println();
		}
		
		
		//particular combination of rows and columns
		
		String name=driver.findElement(By.xpath("//tbody/tr[4]")).getText();
		System.out.println(name);
		
		if(name.equals("joey")) 
		{
			String age=driver.findElement(By.xpath("//tbody/tr[3]//td[4]")).getText();
			String ocupation=driver.findElement(By.xpath("//tbody/tr[4]//td[5]")).getText();
			System.out.println(name+"  "+age+"  "+ocupation);
			
		}
		
		driver.close();
	}

}
