package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandlingExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement TryitButton=driver.findElement(By.xpath("//*[@onclick='myFunction()']"));
		TryitButton.click();
		
		driver.switchTo().alert().sendKeys("Soundarya");
		driver.switchTo().alert().accept();
		

	}

}
