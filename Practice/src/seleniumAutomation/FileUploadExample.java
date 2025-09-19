package seleniumAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		driver.manage().window().maximize();
	
		WebElement UploadButton=driver.findElement(By.id("j_idt88:j_idt89"));
		UploadButton.click();
		
		//Wait for open the file upload location from window
		Thread.sleep(2000);
		
		String fromFileLocation="C:\\Users\\D.Soundarya\\Downloads\\TestLeaf Logo.png";
		StringSelection contents=new StringSelection(fromFileLocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(contents, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
