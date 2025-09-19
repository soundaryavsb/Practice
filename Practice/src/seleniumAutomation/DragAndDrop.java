package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/droppable");
		driver.manage().window().maximize();
		
		WebElement Source=driver.findElement(By.id("draggable"));
		WebElement To=driver.findElement(By.id("droppable"));
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(Source).moveToElement(To).release(To).perform();
	}

}
