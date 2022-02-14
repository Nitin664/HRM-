package PracticeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
	
WebDriver driver;
	
	public void openBrowser() throws IOException, InterruptedException{
		System.setProperty("window.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://apachcm.exelatech.com/");
		driver.manage().window().maximize();
		  System.out.println("browser launch successfully");
		 Thread.sleep(3000); 
		    driver.findElement(By.xpath("//input[@id = 'inputUserName']")).sendKeys("506402");
		    Thread.sleep(5000);
		    System.out.println("Enter Username");
		    driver.findElement(By.xpath("//input[@name= 'UserPassword']")).sendKeys("qwerty");
		    Thread.sleep(4000);
		    System.out.println("Enter password");
		    driver.findElement(By.xpath("//*[contains(@id,'btn')]")).click();
		    System.out.println("click on btn"); 
		  
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		XpathPractice xpath = new XpathPractice();
		xpath.openBrowser();
		
		
	}
	
}
