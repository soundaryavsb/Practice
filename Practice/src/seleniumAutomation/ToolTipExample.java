package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {
//********Not work*****************//
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		WebElement YoutubeIcon=driver.findElement(By.id("logo"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		String Tooltiptext=(String)executor.executeScript("return arguments[0].getAttribute('title')", YoutubeIcon);
		System.out.println(Tooltiptext);
	}

}
