package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();

		//1. Get number of header
		List<WebElement> ShoppingHeader=driver.findElements(By.xpath("//*[@id='shopping']//th"));
		System.out.println("Number of headers in shopping table: "+ShoppingHeader.size());
		
		//1.1 Get number of header
		WebElement Shopping=driver.findElement(By.id("shopping"));
		List<WebElement> ShoppingHeader1=Shopping.findElements(By.tagName("th"));
		System.out.println("Number of headers in shopping table - Way 2: "+ShoppingHeader1.size());
		//2. Get Number of rows
		List<WebElement> ShoppingRow=driver.findElements(By.xpath("//*[@id='shopping']//tr/td[1]"));
		System.out.println("Number of Row in shopping table: "+ShoppingRow.size());
		
		//3. Add The price and compare it with Total
		WebElement Price;
		String PriceElement;
		int PriceTotal = 0;
		for (WebElement row : ShoppingRow) {
			//Add all the item price except Total
			if(!row.getText().equals("Total"))
			{
				//Get the next following data from the item for get the price	
				PriceElement="//td[normalize-space()='"+row.getText()+"']//following::td[1]";
				Price=driver.findElement(By.xpath(PriceElement));
				//Covert the String price to integer for adding the price 
				int PriceValue=Integer.parseInt(Price.getText());
				PriceTotal+=PriceValue;
			}
		}
		
		//Get the Total value from the table 1 for compare the manually calculated Total
		WebElement Total=driver.findElement(By.xpath("//td[normalize-space()='Total']//following::td[1]"));
		int TotalValue=Integer.parseInt(Total.getText());
		if(PriceTotal==TotalValue)
		{
			System.out.println("\nManual Price Total: "+PriceTotal+"\nTable Total: "+TotalValue+"\nThe total is correct");
		}
		else
		{
			System.out.println("Manual Price Total: "+PriceTotal+"\nTable Total: "+TotalValue+"\nThe total is not correct");
		}
		driver.quit();


	}

}
