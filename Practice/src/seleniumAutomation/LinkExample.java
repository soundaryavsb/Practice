package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		
		//Take me to dashboard
		WebElement GoToDashBoard=driver.findElement(By.partialLinkText("Dashboard"));
		GoToDashBoard.click();
		
		driver.navigate().back();
		
		//Find my destination
		WebElement FindMyDestination=driver.findElement(By.partialLinkText("Find the URL"));
		String DestinationURL=FindMyDestination.getDomAttribute("href");
		System.out.println(DestinationURL);
		
		//Broken?
		WebElement BrokenURL=driver.findElement(By.partialLinkText("Broken"));
		BrokenURL.click();
		String BrokenTitle=driver.getTitle();
		if(BrokenTitle.contains("404"))
		{
			System.out.println("Yes, The link is broken");
		}
		else
		{
			System.out.println("No, The link is not broken");
		}
		
		driver.navigate().back();
		
		//Duplicate Link - Go to dashboard
		WebElement GoToDashBoard1=driver.findElement(By.partialLinkText("Dashboard"));
		GoToDashBoard1.click();
		
		driver.navigate().back();
		
		//Count Links
		List<WebElement> AllLink=driver.findElements(By.tagName("a"));
		int LinkCount=AllLink.size();
		System.out.println("Link Count: "+LinkCount);
		
		
	}

}
