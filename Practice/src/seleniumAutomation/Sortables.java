package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		List<WebElement> iteamsList=driver.findElements(By.xpath("//*[@id='sortable']/li"));
		System.out.println(iteamsList.size());
		
		Actions actions=new Actions(driver);
		
		WebElement item7Source=iteamsList.get(6);
		WebElement item7To=iteamsList.get(0);
		actions.clickAndHold(item7Source).moveToElement(item7To).release(item7To).perform();
		
		WebElement item6Source=iteamsList.get(5);
		WebElement item6To=iteamsList.get(0);
		actions.clickAndHold(item6Source).moveToElement(item6To).release(item6To).perform();
		
		WebElement item5Source=iteamsList.get(4);
		WebElement item5To=iteamsList.get(0);
		actions.clickAndHold(item5Source).moveToElement(item5To).release(item5To).perform();
		
		WebElement item4Source=iteamsList.get(3);
		WebElement item4To=iteamsList.get(0);
		actions.clickAndHold(item4Source).moveToElement(item4To).release(item4To).perform();
		
		WebElement item3Source=iteamsList.get(2);
		WebElement item3To=iteamsList.get(0);
		actions.clickAndHold(item3Source).moveToElement(item3To).release(item3To).perform();
		
		WebElement item2Source=iteamsList.get(1);
		WebElement item2To=iteamsList.get(0);
		actions.clickAndHold(item2Source).moveToElement(item2To).release(item2To).perform();
		

	}

}
