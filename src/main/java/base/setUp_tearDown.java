package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import driverUtils.utilTools;

public class setUp_tearDown {
	public static WebDriver driver =new ChromeDriver();
	public utilTools uT=new utilTools();
//	System.setProperty("webdriver.chrome.driver","D:\\selenium chromedriver\\chromedriver-win64\\chromedriver.exe");

	@BeforeTest
	public void setup() throws IOException {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(uT.property("url"));
		uT.timeout(driver);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
