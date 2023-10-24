package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class popupPage {

	@FindBy(id="name")
	private WebElement name;
	@FindBy(id="country")
	private WebElement country;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(id="card")
	private WebElement credit;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(xpath="(//button[@type='button'])[9]")
	private WebElement purchase;
	
	public popupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void name(String x) {
		name.sendKeys(x);
	}
	public void country(String x) {
		country.sendKeys(x);
	}
	public void city(String x) {
		city.sendKeys(x);
	}
	public void credit(String x) {
		credit.sendKeys(x);
	}
	public void month(String x) {
		month.sendKeys(x);
	}
	public void year(String x) {
		year.sendKeys(x);
	}
	public void purchase() {
		purchase.click();
	}
}
