package MouseAction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	WebDriver driver;

	public void openBrowser() throws IOException, InterruptedException {
		System.setProperty("window.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.get("https://api.jquery.com/dblclick/");
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		System.out.println("browser launch successfully");
		
		Actions action = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement To = driver.findElement(By.xpath("//*[@id='amt7']"));
		
		Action dragAndDrop = action.clickAndHold(from)
							.moveToElement(To)
							.release(To).build();
		dragAndDrop.perform();
		
	}
         public static void main(String[] args) throws IOException, InterruptedException {
        	 
        	 DragandDrop move = new DragandDrop();
        	 move.openBrowser();
		}
         
}      