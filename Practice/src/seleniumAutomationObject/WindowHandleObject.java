package seleniumAutomationObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowHandleObject {

	@FindBy(id="home")
	private WebElement HomePage;
	
	public WebElement getHomePage()
	{
		return HomePage;
	}
}
