package seleniumAutomationObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowHandleExample2Object {
	
	@FindBy(id="multi")
	private WebElement MultipleButton;
	
	public WebElement getMultipleButton()
	{
		return MultipleButton;
	}

}
