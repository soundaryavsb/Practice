package seleniumAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import seleniumAutomationObject.WindowHandleObject;

public class WindowHandleExample {

	static Logger logger=Logger.getLogger(WindowHandleExample.class);
	public static void main(String[] args) throws InterruptedException {
		BasicConfigurator.configure();
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/window");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WindowHandleObject windowObject=PageFactory.initElements(driver, WindowHandleObject.class);
		
		String ParentWindow=driver.getWindowHandle();
		
//		click Open Home page button
		windowObject.getHomePage().click();
		logger.info("After click Home Page- Current Url:\n"+driver.getCurrentUrl());
		logger.info("Parent Window:\n"+ParentWindow);
		Set<String> AllWindow=driver.getWindowHandles();
		logger.info("All Window\n"+AllWindow);
		//Store the Set window details to list of Stiring for using get() method.
		List<String> listOfWindows=new ArrayList<String>(AllWindow);
		// Switch to new window
		driver.switchTo().window(listOfWindows.get(1));
		
		logger.info("Swiched To new Window:\n"+driver.getCurrentUrl());
		//close the parent window
		driver.switchTo().window(ParentWindow);
		driver.close();
		
		listOfWindows.clear();
		listOfWindows.addAll(driver.getWindowHandles());
		//Switch to new Window
		driver.switchTo().window(listOfWindows.get(0));
		logger.info("After closing parent window:\n"+driver.getCurrentUrl());
		Thread.sleep(2000);
		//close the new window
		driver.quit();
		
		//Multiple window
		driver.get("https://letcode.in/window");
		
		
		
	}

}
