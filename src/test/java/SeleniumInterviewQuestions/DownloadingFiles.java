package SeleniumInterviewQuestions;

import java.awt.Window;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadingFiles {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		//String location= "C:\\Users\\Naga Babu\\eclipse-workspace\\SeleniumSDET\\downloads";
		String location=System.getProperty("user.dir")+"\\downloads\\";
		
		HashMap preferences= new HashMap();
		preferences.put("download.default_directory", location);
		
		ChromeOptions options= new ChromeOptions();
		
		options.setExperimentalOption("prefs", preferences);
		options.addArguments("test-type");
		options.addArguments("disable-popup-blocking");
		
		
		WebDriverManager.chromedriver().setup();
				//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumResources\\chromedriver.exe");
				driver= new ChromeDriver(options);
				driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
				driver.manage().window().maximize();
				
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");

				driver.findElement(By.xpath("//tbody//tr[1]//td[5]//a[1]")).click();
				
				//Alert alert=driver.switchTo().alert();
				//alert.dismiss();
				
				//driver.findElement(By.id("page-top")).click();)
				driver.findElement(By.id("page-top")).click();
				
						
	
	
	}

}
