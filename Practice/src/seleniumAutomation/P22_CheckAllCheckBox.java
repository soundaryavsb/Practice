package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class P22_CheckAllCheckBox {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://leafground.com/checkbox.xhtml");
		
		WebElement JavaScript=driver.findElement(By.xpath("//*[@id='j_idt87:basic:2']/parent::div/following-sibling::div"));
		JavaScript.click();
		
		List<WebElement> AllcheckBoxes=driver.findElements(By.xpath("//*[@class='col-12']//div[2]"));
		System.out.println(AllcheckBoxes.size());
		for (WebElement CheckBox : AllcheckBoxes) {
			if(!CheckBox.getDomAttribute("class").contains("disabled"))
			{
				if(!CheckBox.getDomAttribute("class").contains("active"))
				{
				CheckBox.click();
				}
			}
		}
	}

}
