package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage {

	@FindBy(xpath="//a[text()='Laptops']")
	private WebElement laptop;
	
	public dashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void laptop() {
		laptop.click();
	}

	public WebElement getLaptop() {
		return laptop;
	}
}
