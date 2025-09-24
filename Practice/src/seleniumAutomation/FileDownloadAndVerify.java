package seleniumAutomation;

import java.io.File;
import java.io.FilenameFilter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadAndVerify {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		driver.manage().window().maximize();
		
		WebElement Download=driver.findElement(By.xpath("//*[@id='j_idt93:j_idt95']/span[2]"));
		Download.click();
		
		//Wait for download completion
		Thread.sleep(2000);
		File file=new File("C:\\Users\\D.Soundarya\\Downloads");
		File[] AllFiles=file.listFiles();
		
		int count=0;
		for (File fileName : AllFiles) {
			if(fileName.getName().equals("TestLeaf Logo.png"))
			{
				System.out.println("Yes, the file is downloaded");
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("File is not downloaded");
		}
		
		System.out.println("File Size: "+AllFiles.length);
		
		driver.quit();
	}

}
