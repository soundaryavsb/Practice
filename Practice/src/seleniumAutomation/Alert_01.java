package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();

		//Simple Alert
		WebElement Simple=driver.findElement(By.id("j_idt88:j_idt91"));
		Simple.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//Confirm Alert
		WebElement Confirm=driver.findElement(By.id("j_idt88:j_idt93"));
		Confirm.click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
		//Prompt Alert
		WebElement Prompt=driver.findElement(By.id("j_idt88:j_idt104"));
		Prompt.click();
		driver.switchTo().alert().sendKeys("Soundarya");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//Model Button
		WebElement Model=driver.findElement(By.id("j_idt88:j_idt100"));
		Model.click();
		Thread.sleep(1000);
		WebElement ModelX=driver.findElement(By.xpath("//span[@id='j_idt88:j_idt101_title']/following-sibling::a[1]"));
		ModelX.click();
		
		//Sweet Button
		WebElement Sweet=driver.findElement(By.id("j_idt88:j_idt95"));
		Sweet.click();
		Thread.sleep(1000);
		WebElement SweetDismiss=driver.findElement(By.id("j_idt88:j_idt98"));
		SweetDismiss.click();
		Thread.sleep(1000);
		Sweet.click();
		Thread.sleep(1000);
		WebElement SweetX=driver.findElement(By.xpath("//span[@id='j_idt88:j_idt96_title']/following-sibling::a[1]"));
		SweetX.click();
	}

}
