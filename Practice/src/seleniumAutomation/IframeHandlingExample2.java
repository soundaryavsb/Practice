package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandlingExample2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		
		WebElement MyFrame1=driver.findElement(By.id("firstFr"));
		driver.switchTo().frame(MyFrame1);
		WebElement FirstName=driver.findElement(By.name("fname"));
		WebElement LastName=driver.findElement(By.name("lname"));
		FirstName.sendKeys("Sona");
		LastName.sendKeys("Rana");
		
	
		driver.switchTo().frame(0);
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys("SonaRana@gmail.com");
		
		driver.switchTo().parentFrame();
		LastName.sendKeys("ly");
		
		driver.switchTo().defaultContent();
		WebElement WatchtutorialButton=driver.findElement(By.xpath("//button[text()='Watch tutorial']"));
		WatchtutorialButton.click();
		
	}

}
