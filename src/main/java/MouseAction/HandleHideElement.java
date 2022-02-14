package MouseAction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHideElement {
	
	WebDriver driver;

	public void openBrowser() throws IOException, InterruptedException {
		System.setProperty("window.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.get("https://api.jquery.com/dblclick/");
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		System.out.println("browser launch successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id, 'displayed-text')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'displayed-text']")).sendKeys("Program");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id, 'show-textbox')]")).click();
		
	}
	
	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		HandleHideElement hide = new HandleHideElement();
		hide.openBrowser();
	}

}
