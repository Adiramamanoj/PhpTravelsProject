package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {

	
	public FlightsPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "autocomplete") private WebElement fromFlightListBox;
	
	@FindBy(xpath = "//strong[text()=' Goa']") private WebElement fromFlightOption;
	
	@FindBy(id = "autocomplete2") private WebElement ToFlightListBox;
	
	@FindBy(xpath = "//strong[text()=' Bangalore']") private WebElement ToFlightOption;
	
	@FindBy(id = "departure") private WebElement departureDatePopUp;
	
	@FindBy(xpath = "(//th[text()='April 2022'])[3]/../../..//td[text()='26']") private WebElement departureDate;
	
	@FindBy(xpath = "//label[text()='Passengers']/..//a[@role='button']") private WebElement passengersDetailsListBox;
	
	@FindBy(id = "fadults") private WebElement adultsDetailsTextOption;
	
	@FindBy(id = "fchilds") private WebElement ChildsDetailsTextOption;
	
	@FindBy(id = "flight_type") private WebElement FlightTypeListBox;
	
	@FindBy(id = "flights-search") private WebElement searchFlightsbutton;

	public WebElement getFromFlightListBox() {
		return fromFlightListBox;
	}

	public WebElement getToFlightListBox() {
		return ToFlightListBox;
	}

	public WebElement getDepartureDatePopUp() {
		return departureDatePopUp;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public WebElement getPassengersDetailsListBox() {
		return passengersDetailsListBox;
	}

	public WebElement getAdultsDetailsTextOption() {
		return adultsDetailsTextOption;
	}

	public WebElement getChildsDetailsTextOption() {
		return ChildsDetailsTextOption;
	}

	public WebElement getFlightTypeListBox() {
		return FlightTypeListBox;
	}

	public WebElement getSearchFlightsbutton() {
		return searchFlightsbutton;
	}

	public WebElement getFromFlightOption() {
		return fromFlightOption;
	}

	public WebElement getToFlightOption() {
		return ToFlightOption;
	}
	
	
	
	
}
