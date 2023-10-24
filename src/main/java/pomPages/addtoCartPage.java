package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtoCartPage {

	@FindBy(xpath="//a[text()='Add to cart']")
	private WebElement cartbtn;
	
	@FindBy(id="cartur")
	private WebElement cart;
	
	public addtoCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void cartbtn(){
		cartbtn.click();
	}
	
	public void cart() {
		cart.click();
	}
	
}
