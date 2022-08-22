package SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperations {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumResources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		WebElement textbox=driver.findElement(By.name("q"));
		//WebElement textbox=driver.findElement(By.xpath("//div[@class='UUbT9'and @style jsname='UUbT9']"));
		act.sendKeys("naveen automation labs").perform();
		//textbox.sendKeys("Naveen automation labs");
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();


	}

}