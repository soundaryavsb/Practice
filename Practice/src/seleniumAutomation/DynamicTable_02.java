package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable_02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();

		
		//Get the LastName and Mark him as Present
		//Get the table
		WebElement Table2=driver.findElement(By.id("simpletable"));
		//get each rows
		List<WebElement> rows=Table2.findElements(By.cssSelector("tbody tr"));
		//compare and check the last name as present
		for (int i=0;i<rows.size();i++)
		{
			//get each data from rows
			List<WebElement> data=rows.get(i).findElements(By.tagName("td"));
			String lastName=data.get(1).getText();
			System.out.println(lastName);
			//compare last name
			if(lastName.equals("Raj"))
			{
				System.out.println("Yes, Raj is present");
				//get the location of the respective check box
				WebElement Last=data.get(3).findElement(By.tagName("input"));
				Last.click();
				break;
			}
			else
			{
				System.out.println("No, Raj is not present");
			}
		}

		Thread.sleep(1000);
		driver.quit();

	}

}
