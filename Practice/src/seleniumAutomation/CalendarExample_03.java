package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarExample_03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/calendar");
		driver.manage().window().maximize();
		
		WebElement DateBox=driver.findElement(By.xpath("//input[@type='date']"));

		//Way 01:
//		DateBox.sendKeys("27061998");

		//Way 02:
		DateBox.click();
		
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();
		actions.sendKeys(Keys.TAB).perform();
		actions.sendKeys(Keys.LEFT).sendKeys(Keys.LEFT).sendKeys(Keys.ENTER).perform();
		
	}

}
