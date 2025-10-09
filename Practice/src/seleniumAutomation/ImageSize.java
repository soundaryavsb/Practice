package seleniumAutomation;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageSize {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		driver.manage().window().maximize();
		
		WebElement Image3=driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[3]"));
		Dimension Image3Size=Image3.getSize();
		System.out.println("Image 3 Size:"+Image3Size);
		int Image3Width=Image3Size.getWidth();
		int Image3Height=Image3Size.getHeight();
		System.out.println("Image 3 Width: "+Image3Width);
		System.out.println("Image 3 Height: "+Image3Height);
		Thread.sleep(1000);
		driver.close();

	}

}
