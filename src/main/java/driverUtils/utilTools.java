package driverUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.setUp_tearDown;
import genericLibrary.proofShots;

public class utilTools {

//	public setUp_tearDown st= new setUp_tearDown();
	public String property(String name) throws IOException {
		Properties p= new Properties();
		FileInputStream fis= new FileInputStream(proofShots.file);
		p.load(fis);
		return p.getProperty(name);
	}
	
	public void timeout(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void scroll(WebDriver driver,int x, int y) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	int name=1;
	public void snap(WebDriver driver) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File ram=ts.getScreenshotAs(OutputType.FILE);
		File src= new File(proofShots.photo+name+".png");
		FileUtils.copyFile(ram, src);
		++name;
	}
	
	public void notifypopup() throws AWTException {
//		driver.switchTo().alert().accept();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
