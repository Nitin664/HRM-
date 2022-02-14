package MouseAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotUsingEvent {
	WebDriver driver;
	public void openBrowser() throws IOException, InterruptedException, AWTException {
		System.setProperty("window.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.get("https://api.jquery.com/dblclick/");
		driver.get("http://demo.automationtesting.in/Register.html");
	//	driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println("browser launch successfully");
		Thread.sleep(3000);
		ClipboardOwner owner = null;
		String filepath = "C:\\Users\\Nitin\\Pictures\\testfile.jpg";
		System.out.println("Successfully click");
		StringSelection Selection = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, owner);
		Robot robot = new Robot();
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	     System.out.println("Successfully upload");
	}
		
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		RobotUsingEvent ent = new RobotUsingEvent();
		ent.openBrowser();
	}

}
