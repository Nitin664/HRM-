package PracticeTest;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Subelement {
	WebDriver driver;
	   
		public void openBrowser() throws IOException, InterruptedException{
			System.setProperty("window.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.tutorialspoint.com/index.htm");
			driver.manage().window().maximize();
			  System.out.println("browser launch successfully");
			  Thread.sleep(3000);
			  ArrayList list = new ArrayList();
			  driver.findElement(By.xpath("//input[@type='text']"));
			  System.out.println("The number of elements is: "+list.size());
			  
	}
		public static void main(String[] args) throws IOException, InterruptedException {
			Subelement sub = new Subelement();
			sub.openBrowser();
		}

}
