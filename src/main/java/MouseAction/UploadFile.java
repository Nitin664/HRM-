package MouseAction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	WebDriver driver;

	public void openBrowser() throws IOException, InterruptedException {
		System.setProperty("window.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.get("https://api.jquery.com/dblclick/");
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		System.out.println("browser launch successfully");
		Thread.sleep(3000);
		String filepath = "C:\\Users\\Nitin\\workspace\\SeleniumPraticeTest\\filedata\\testfile.jpg";
	  //driver.findElement(By.xpath("//*[@id='uploadfile_0']")).sendKeys(filepath);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementByxpath('//*[@id='uploadfile_0']').value = '"+filepath+"';");
		System.out.println("file uploaded successfully");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		UploadFile file = new UploadFile();
		file.openBrowser();	

	}	

}


/*JavascriptExecutor js = (JavascriptExecutor)d; //Scrolling using JavascriptExecutor
js.executeScript("window.scrollBy(0,380)");*/