package SeleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBoxes {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumResources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//1 check one box
		
		//driver.findElement(By.id("monday")).click();
		
		
		//2 want to select all the check boxes
		
		List<WebElement> chkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
		//System.out.println("Total no of checkboxes are:"+ chkboxes.size());
		
		/*for(int i=0;i<chkboxes.size();i++) 
		{
			
			chkboxes.get(i).click();
		}*/
		
		/*for(WebElement chkbox:chkboxes)
		{
			chkbox.click();
		}*/
		
		
		//3 check the multiple chekboxes check boxes
		
		/*for(WebElement chkbox:chkboxes)
			
			
		{
			String chkboxname=chkbox.getAttribute("id");
			if(chkboxname.equals("monday") ||chkboxname.equals("friday"))
			{
				chkbox.click();
			}
		}*/
		
		
		//4 select the last 3 check boxe
		
		int Totalnumberofboxes=chkboxes.size();
		
		/*for(int i=Totalnumberofboxes-4;i<Totalnumberofboxes;i++) {
			
			chkboxes.get(i).click();
		}*/
		
		//5  first 3 checks
		for(int i=0;i<=Totalnumberofboxes;i++) {
			
			if(i<3) {
				
				chkboxes.get(i).click();
			}
		}
		
		
		
		
		
	}
}
