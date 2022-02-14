package MouseAction;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DoubleClick {
	WebDriver driver;

	public void openBrowser() throws IOException, InterruptedException {
		System.setProperty("window.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.get("https://api.jquery.com/dblclick/");
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		System.out.println("browser launch successfully");
		Thread.sleep(6000);
	//	driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//*[@id='authentication']/span"));
		act.contextClick(link).build().perform();
		/*Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.cssSelector("html>body>div"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", link);
		WebElement lnk = driver.findElement(By.cssSelector("#authentication > button"));
		action.doubleClick(lnk).build().perform();
		Thread.sleep(6000);
		Alert alert = driver.switchTo().alert();
		alert.accept();*/
		System.out.println("Right click sucess: "+link);
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		DoubleClick link = new DoubleClick();
		link.openBrowser();
		

	}

}
