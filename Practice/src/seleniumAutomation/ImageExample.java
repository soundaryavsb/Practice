package seleniumAutomation;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		driver.manage().window().maximize();
		
		WebElement Image1=driver.findElement(By.xpath("//*[@id='content']/div/img[1]"));
		WebElement Image3=driver.findElement(By.xpath("//*[@id='content']/div/img[3]"));
		
		//Check Broken Image
		String Image1Width=Image1.getDomProperty("naturalWidth");
		System.out.println("Image 1 width: "+Image1Width);
		if(Image1Width.equals("0"))
		{
			System.out.println("Image 1 is broken");	
		}
		else
		{
			System.out.println("Image 1 is not broken");
		}
		
		//Check Image not broken
		String Image3Width=Image3.getDomProperty("naturalWidth");
		System.out.println("Image 3 width: "+Image3Width);
		if(Image3Width.equals("0"))
		{
			System.out.println("Image 3 is broken");
		}
		else
		{
			System.out.println("Image 3 is not broken");
		}
	}

}
