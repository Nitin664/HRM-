package PracticeTest;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {
	WebDriver driver;
	public void openBrowser() throws IOException, InterruptedException, AWTException {
		System.setProperty("window.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.get("https://api.jquery.com/dblclick/");
		driver.get("https://toolsqa.com/selenium-training#enroll-form");
	//	driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println("browser launch successfully");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#buttons-container > div > div > div")).click();
		 System.out.println("Successfully clicked");
		
	}

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WindowHandle handle = new WindowHandle();
		handle.openBrowser();
	}

}
