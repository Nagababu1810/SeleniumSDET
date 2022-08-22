package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadingFiles {
	
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {
		
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumResources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@class='btn block resume-btn btn-orange mt20']")).click();
		
		//driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Naga Babu\\Downloads\\Nagababu-4 plus yrs Exp.doc");
		
		//using javascript executore
		
		WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", button);
		
		
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		//driver.findElement(By.id("file-upload")).click();
		
		//put path to file in a clipboard
		StringSelection ss= new StringSelection("C:\\Users\\Naga Babu\\Downloads\\Nagababu-4 plus yrs Exp.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
	//past the path
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//Enter
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		

	}

}
