package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		List<WebElement> Iteams=driver.findElements(By.xpath("//*[@id='selectable']//li"));
		System.out.println(Iteams.size());
		
		Actions actions=new Actions(driver);
		//Way 1:
//		actions.keyDown(Keys.CONTROL).click(Iteams.get(0)).click(Iteams.get(1)).click(Iteams.get(2)).perform();
		//Way 2:
		actions.clickAndHold(Iteams.get(0)).clickAndHold(Iteams.get(1)).clickAndHold(Iteams.get(2)).perform();
	}

}
