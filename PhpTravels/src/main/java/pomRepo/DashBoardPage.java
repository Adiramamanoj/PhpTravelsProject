package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//button[contains(text(),'Account')]") private WebElement account;
	
	@FindBy(linkText="Logout") private WebElement logout;
	
	@FindBy(linkText = "Home") private WebElement homePageButton;
	
	@FindBy(xpath = "//span[text()=' flights']") private WebElement flightsPageButton;

	public WebElement getAccount() {
		return account;
	}


	public WebElement getLogout() {
		return logout;
	}


	public WebElement getHomePageButton() {
		return homePageButton;
	}


	public WebElement getFlightsPageButton() {
		return flightsPageButton;
	}
	
	
}
