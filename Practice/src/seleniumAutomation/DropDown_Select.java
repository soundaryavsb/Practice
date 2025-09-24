package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();

		WebElement FavoriteTool=driver.findElement(By.className("ui-selectonemenu"));
		
		//Using Select class
		Select select=new Select(FavoriteTool);
		
		select.selectByVisibleText("Selenium");
		Thread.sleep(1000);
		select.selectByIndex(2);
		Thread.sleep(1000);
		select.selectByContainsVisibleText("press");
		Thread.sleep(1000);
		
		//Get all Options from the list by using Select Class
		List<WebElement> FavoriteOptionsList=select.getOptions();
		System.out.println("Favorite List count: "+FavoriteOptionsList.size());
		for (WebElement Favorite : FavoriteOptionsList) {
			System.out.println("List: "+Favorite.getText());
		}
		
		//Give the value by using sendKeys
		FavoriteTool.sendKeys("Puppeteer");
		}
}
