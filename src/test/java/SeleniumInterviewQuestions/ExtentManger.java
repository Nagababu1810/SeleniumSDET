package SeleniumInterviewQuestions;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentManger {

	public static WebDriver driver;
	public ExtentReports extent;
	public ExtentTest test;
	public ExtentSparkReporter htmlSparkReporter;
	
	@BeforeTest
	public void setExtent()
	{
		
		htmlSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"./ExtentReport/Myreport.html");
		
		htmlSparkReporter.config().setDocumentTitle("Automation Report");
		htmlSparkReporter.config().setReportName("Functional Testcases");
		htmlSparkReporter.config().setTheme(Theme.DARK);
		
		
		extent= new ExtentReports();
		
		extent.attachReporter(htmlSparkReporter);
		extent.setSystemInfo("windows", "os");
		extent.setSystemInfo("selenium", "4.1.1");
		extent.setSystemInfo("Tester","Nagababu");
		extent.setSystemInfo("browser","chrome");
		
	}
	@AfterTest
	public void endreport() 
	{
		extent.flush();
		
	}
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void login() {
		
		test=extent.createTest("checking login functinality");
		
		driver.findElement(By.name("uid")).sendKeys("mngr420192");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("quhYbUt");
		driver.findElement(By.name("btnLogin")).click();
		
		
	}
	@Test(priority=01)
	public void title() {
		
		test=extent.createTest("checking the title of the page");
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Guru99 Bank Home Page");
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			test.log(Status.FAIL, "Test case failed "+result.getName());//to add name in extent report
			test.log(Status.FAIL, "This test case failed "+ result.getThrowable()); //add error and expection 
			
			String Screenshotpath=ExtentManger.getScreenshot(driver,result.getName());
			
			test.addScreenCaptureFromPath(Screenshotpath);
		}
		else if(result.getStatus()==ITestResult.SKIP){
			
			test.log(Status.SKIP, "Test case skipped "+result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS,"Test case passed "+result.getName());
			test.log(Status.PASS,"The testcase passed "+result.getThrowable());
		}
		driver.close();
		}
		
	
	
	public static String getScreenshot(WebDriver driver, String ScreenshotName) throws IOException {
		
		Date dt= new Date();
		System.out.println(dt);
		DateFormat df= new SimpleDateFormat("yyyy_mm_dd_hh_ss");
	String Screenshotdate=df.format(dt);
		
		//TakesScreenshot ts= (TakesScreenshot)driver;
		//File Source=ts.getScreenshotAs(OutputType.FILE);
		//String destionation=System.getProperty("user.dir")+"./Screenshots/"+".png";
		//FileHandler.copy(Source, destionation);
		
		String destination =System.getProperty("user.dir")+"./Screenshots/"+ScreenshotName +Screenshotdate+".png";
		File filedestination= new File(destination);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			//FileUtils.copyFile(src, destination);
		FileHandler.copy(src, filedestination);
		
		return destination;
		
	}
	
		
	}

