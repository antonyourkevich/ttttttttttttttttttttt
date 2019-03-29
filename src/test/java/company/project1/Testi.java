package company.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testi {
	
	
	
	private WebDriver driver;
	private MainPageofBooking booking;
	private String URL = "http://www.booking.com";
	
	
	
	
	public Testi()
	{
		
			driver = new ChromeDriver();
			booking = new MainPageofBooking(driver);
		
		
	}


	@Given("^I am on a page with url \"([^\"]*)\"$")
	public void test0() {
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
		
		
		
		
	

	
	

	@When("^I enter city and calendar \"([^\"]*)\" in search field$")
	private void test1() {
		booking.enterCity();
		booking.calendar();
		
	}


	@And("^I enter starting date and finish date$")
	private void test2() {

		booking.startingDate();
		booking.finishDate();
		
	}

	
	@And("^I check the dates$")
	private void test3() {
		booking.checking();
        Assert.assertTrue(booking.getHotelList().size() > 0, "нет отелей ");
		
	}


	@And("^I check that there are any some hotels$")
	private void test4() {
		booking.checking();
        Assert.assertTrue(booking.getHotelList().size() > 0, "нет отелей ");
		
	}
	
	
	@Then("^I sort out by the rating  $")
	private void test5() {
		
			booking.sortByRaiting();
			driver.quit();
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 booking.getHotelList().get(0).click();
			
		
		
	}

	
	
	
}
