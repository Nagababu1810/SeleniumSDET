package SeleniumInterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumResources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		// single window
		String mainwindow=driver.getWindowHandle();
		//System.out.println(mainwindow);
		
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		//Total windows
		Set<String> mainwindows=driver.getWindowHandles();
		
		//1. iteroatr method
		
		/*Iterator<String>it= mainwindows.iterator();
		String partwind=it.next();
		String childwind=it.next();
		
		System.out.println("parentwindow is"+partwind);
		System.out.println("childwindow is"+childwind);*/
		
		//2. using list and array list
		
		List<String> windowslist=new ArrayList(mainwindows);
		
		String parentwin=windowslist.get(0);
		String childwin1=windowslist.get(1);
		String childwin2=windowslist.get(2);
		String childwin3=windowslist.get(3);
		String childwin4=windowslist.get(4);
		
		
		System.out.println("parent window"+parentwin);
		System.out.println("child window1"+childwin1);
		System.out.println("child window2"+childwin2);
		System.out.println("child window3"+childwin3);
		System.out.println("child window4"+childwin4);
		
		
		// how to use windows id for switching
		
		//driver.switchTo().window(parentwin);
		//System.err.println("parent window title"+driver.getTitle());
		
		//driver.switchTo().window(childwin4);
		//System.out.println("child windw title"+driver.getTitle());
		
		
		for(String windows:windowslist)
		{
			String title=driver.switchTo().window(childwin4).getTitle();
			//System.out.println("child windw title"+driver.getTitle());
			if(title.equals("Sign Up | LinkedIn"))
			{
				driver.close();
			}
			
		}
		
	}

}
