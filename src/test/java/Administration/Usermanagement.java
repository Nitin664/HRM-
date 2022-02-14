package Administration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import CRMAction.Action;

public class Usermanagement extends Action {

	public void openbrowser() throws InterruptedException {

		browserOpen();
		Login();
	}

	public void userCreate() throws InterruptedException {
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id='liulAdmin']/a/span[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='liOrganizationMaster']/a/span[2]")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Usermanagement user = new Usermanagement();
		user.openbrowser();
		
	}

}
