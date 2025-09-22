package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample_02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);

		//Way 2:
		WebElement datebox=driver.findElement(By.id("datepicker"));
		datebox.click();
		//click next
		WebElement NextButon=driver.findElement(By.xpath("//a[@title='Next']"));
		NextButon.click();
		//click date
		WebElement DataAs15=driver.findElement(By.xpath("//a[contains(text(),'15')]"));
		DataAs15.click();
		
		Thread.sleep(1000);
		driver.quit();

	}

}
