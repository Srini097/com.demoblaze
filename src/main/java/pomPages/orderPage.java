package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderPage {

	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement orderbtn;
	
	public orderPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void orderbtn() {
		orderbtn.click();
	}
}
