package testSample;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import base.setUp_tearDown;
import driverUtils.utilTools;
import pomPages.addtoCartPage;
import pomPages.dashboardPage;
import pomPages.orderPage;
import pomPages.popupPage;
import pomPages.storeIndexPage;

public class firstScenario extends setUp_tearDown{
	public dashboardPage dp;
	public utilTools ut;
	public storeIndexPage sip;
	public addtoCartPage acp;
	public orderPage op;
	public popupPage pp;
	
@Test
public void test() throws IOException, InterruptedException, AWTException {
	dp= new dashboardPage(setUp_tearDown.driver);
	ut= new utilTools();
	int x = dp.getLaptop().getLocation().getX();
	int y = dp.getLaptop().getLocation().getY();
	ut.scroll(setUp_tearDown.driver,x,y);
	Thread.sleep(3000);
	ut.snap(setUp_tearDown.driver);
	dp.laptop();
	ut.scroll(setUp_tearDown.driver,x,y);
	Thread.sleep(3000);
	ut.snap(setUp_tearDown.driver);
	
	sip= new storeIndexPage(driver);
	sip.laptop();
	Thread.sleep(3000);
	ut.snap(driver);
	
	acp= new addtoCartPage(driver);
	acp.cartbtn();
	ut.notifypopup();
	acp.cart();
	Thread.sleep(3000);
	ut.snap(driver);
	
	op= new orderPage(driver);
	op.orderbtn();
	
	pp= new popupPage(driver);
	pp.name(ut.property("name"));
	pp.country(ut.property("country"));
	pp.city(ut.property("city"));
	pp.credit(ut.property("credit"));
	pp.month(ut.property("month"));
	pp.year(ut.property("year"));
	pp.purchase();
	Thread.sleep(3000);
	ut.snap(driver);
}
}
