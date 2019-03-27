package company.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testi {
	
	
	
	private WebDriver driver;
	private MainPageofBooking booking;
	private String URL = "http://www.booking.com";
	
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		booking = new MainPageofBooking(driver);
	}

	@Test
	public void test1() {
		driver.manage().window().maximize();
		driver.get(URL);
		booking.enterCity();
		booking.calendar();
		booking.startingDate();
		booking.finishDate();
		booking.checking();
        Assert.assertTrue(booking.getHotelList().size() > 0, "нет отелей ");
	}

	@Test
	public void test2() {
		driver.manage().window().maximize();
		driver.get(URL);
		booking.enterCity();
		booking.calendar();
		booking.startingDate();
		booking.finishDate(); 
		booking.checking();
	    booking.sortByRaiting();
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 booking.getHotelList().get(0).click();
	
	}

	
	
	
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

}
