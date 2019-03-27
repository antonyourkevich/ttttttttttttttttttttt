package company.project1;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPageofBooking {
	WebDriver driver;
	
	private static final String URL = "https://www.booking.com";
	
	
	@FindBy(xpath = ("(.//i[@class=\"sb-date-field__chevron bicon-downchevron\"])[1]"))
	private WebElement window ;
	
	
	
	@FindBy(xpath = "(\".//input[@type=\\\"search\\\"]\")")
	private WebElement search ;
	

	@FindBy(xpath =" (\"   .//td[@data-id=\\\"1553299200000\\\"] ")   
	private WebElement date1 ;
	
	
	@FindBy(xpath = ".//td[@data-date=\"2019-03-10\"]")
	private WebElement date2 ;
	
	
	
	
	
	@FindBy(xpath = "//button/span[text()=\"Проверить цены\"]")
	private WebElement checkPrice;
	
	
	
	@FindBy(xpath = ".//span[@class[contains(.,'sr-hotel__name')]]") 
	private List<WebElement> hotel ;
	
	
	
	@FindBy(xpath = "  .//button[@id=\\\"sortbar_dropdown_button\\\"]      ")
	private WebElement sortirovka ;
	
	
	
	@FindBy(xpath = " (.//a[@class=\\\"sort_option \\\"])[7]\")   ")
	private WebElement raiting ;
	
	

	public MainPageofBooking(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getBookingUrl() {
		return URL;
	}

	public void calendar() {
		window.click();
	}

	public void startingDate() {
		date1.click();
	}

	public void finishDate() {
		date2.click();
	}

	public void enterCity() {
		search .clear();
		search .sendKeys("Москва");
	}

	public void checking() {
		checkPrice.click();
	}

	public List<WebElement> getHotelList() {
		return hotel;
	}

	public void sortByRaiting() {
		raiting.click();
	}
	
	public void rankDouble()
	{
		NumberFormat nf = NumberFormat.getInstance(Locale.FRENCH);
		try {
			double rankDouble = nf.parse(null).doubleValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	


}
