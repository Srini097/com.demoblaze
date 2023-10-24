package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class storeIndexPage {

	@FindBy(partialLinkText="Dell i7")
	private WebElement laptop;
	
	public storeIndexPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void laptop() {
		laptop.click();
	}
}
