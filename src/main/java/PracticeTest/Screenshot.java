package PracticeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;	

public class Screenshot {
	WebDriver driver;
	
	public void openBrowser() throws IOException, InterruptedException{
		System.setProperty("window.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		  System.out.println("browser launch successfully");
		  
		driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[1]/a")).click();
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Nitin\\Pictures\\testfile.jpg"));
		 System.out.println("ScreenShot Successfully capture");
		}
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Screenshot scan = new Screenshot();
		scan.openBrowser();
	}

}
