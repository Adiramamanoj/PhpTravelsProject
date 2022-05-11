package flights;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import genericLibrary.JavaScriptUtil;
import pomRepo.DashBoardPage;
import pomRepo.FlightsPage;

public class TC_Flights_001Test extends Base_Class {
	
	ExcelUtil eUtil= new ExcelUtil();
	
	@Test
	public void bookAFlight() {
		
		String expectedFlightsPageTittle = eutil.readAnyDataFromExcelInString("Sheet1", 5, 0);
		String fromFlight = eutil.readAnyDataFromExcelInString("Sheet1", 5, 1);
		String toFlight = eutil.readAnyDataFromExcelInString("Sheet1", 5, 2);
		double adultsNum = eutil.readNumberDataFromExcel("Sheet1", 5, 4);
		double childsNum = eutil.readNumberDataFromExcel("Sheet1", 5, 5);
		String FlightTypeBussiness = eutil.readAnyDataFromExcelInString("Sheet1", 5, 3);
		
		DashBoardPage dashPage= new DashBoardPage(driver);
		dashPage.getHomePageButton().click();
		dashPage.getFlightsPageButton().click();
		Assert.assertEquals(driver.getTitle(), expectedFlightsPageTittle, "FlightPage is not displayed successfully");
		Reporter.log("Flights Page is succesfully Displyed", true);
		
		FlightsPage flights= new FlightsPage(driver);
		JavaScriptUtil js= new JavaScriptUtil(driver);
		js.jsScrollBy(0, 150);
		flights.getFromFlightListBox().sendKeys(fromFlight);
		flights.getFromFlightOption().click();
		flights.getToFlightListBox().sendKeys(toFlight);
		flights.getToFlightOption().click();
		flights.getDepartureDatePopUp().click();
		flights.getDepartureDate().click();
		flights.getPassengersDetailsListBox().click();
		flights.getAdultsDetailsTextOption().clear();
		flights.getAdultsDetailsTextOption().sendKeys(""+ adultsNum);
		flights.getChildsDetailsTextOption().clear();
		flights.getChildsDetailsTextOption().sendKeys(""+ childsNum);
		flights.getPassengersDetailsListBox().click();
		
		WebElement flightType = flights.getFlightTypeListBox();
		Select select= new Select(flightType);
		select.selectByValue(FlightTypeBussiness);
		
		flights.getSearchFlightsbutton().click();
		
	}

}
