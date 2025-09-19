package seleniumAutomation;

import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import seleniumAutomationObject.WindowHandleExample2Object;

public class WindowHandleExample2 {

	static Logger logger=Logger.getLogger(WindowHandleExample2.class);
	public static void main(String[] args) throws InterruptedException {
		BasicConfigurator.configure();
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/window");

		//Click on the Multiple windows button
		WindowHandleExample2Object MultipleWindow=PageFactory.initElements(driver, WindowHandleExample2Object.class);
		MultipleWindow.getMultipleButton().click();
		
		//print all window title 
		//close the windows
		Set<String> AllwindowOpened=driver.getWindowHandles();
		for (String windHandle : AllwindowOpened) {
			driver.switchTo().window(windHandle);
			logger.info("Title of the winodw:\n"+driver.getTitle());
			driver.close();
		}
		
	}

}
