package SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsopterations {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumResources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Actions act= new Actions(driver);
		WebElement admin=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		System.out.println(admin.getText());
		act.moveToElement(admin).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='User Management']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Users']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.id("menu_admin_Job"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Organization']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Qualifications']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Nationalities']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Corporate Branding']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Configuration']"))).perform();
		
		

	}

}
