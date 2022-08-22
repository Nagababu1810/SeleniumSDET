package SeleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hiddendropdowns {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumResources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("apple pro");
		Thread.sleep(2000);
		
		List<WebElement> suggestions= driver.findElements(By.xpath("//div[contains(@class,'lrtEPN')]"));

		for(WebElement e:suggestions) 
		{
			System.out.println(e.getText());
			
		}
		
		driver.close();
	}
	
	

}
