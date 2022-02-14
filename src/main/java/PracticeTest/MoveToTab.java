package PracticeTest;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToTab {
	WebDriver driver;
	public void openBrowser() throws IOException, InterruptedException, AWTException {
		System.setProperty("window.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.get("https://api.jquery.com/dblclick/");
		driver.get("https://demoqa.com/browser-windows");
	//	driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println("browser launch successfully");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[contains(@id,'tabButton')]")).click();
		 
		 ArrayList tabs = new ArrayList (driver.getWindowHandles());
		  System.out.println(tabs.size());
		  driver.switchTo().window((String) tabs.get(1)); 
		  
		  String element = driver.findElement(By.id("sampleHeading")).getText();
		   System.out.println("Value of this: "+element);
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		MoveToTab move = new MoveToTab();
		move.openBrowser();

	}

}
