package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement Course=driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete']/button"));
		Course.click();
		Thread.sleep(500);
		List<WebElement> CourseList=driver.findElements(By.xpath("//*[@id='j_idt87:auto-complete_panel']/ul/li"));
		System.out.println(CourseList.size());
		for (WebElement list : CourseList) {
			if(list.getText().contains("Selenium"))
			{
				System.out.println("if condition: "+list.getText());
				list.click();
				break;
			}
			else
			{
				System.out.println("else condition: "+list.getText());
			}
		}
	}

}
