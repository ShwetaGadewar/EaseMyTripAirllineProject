package airline.Airline_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;

	@FindBy(id = "txtEmail")
	WebElement email;

	public void mobile_number() {
		email.sendKeys("shweta16.gadewar@gmail.com");
	}

	@FindBy(id = "shwotp")
	WebElement continuebutton;

	public void continu() {
		continuebutton.click();
	}

	@FindBy(id = "OtpLgnBtn")
	WebElement createaccount;

	public void createaccount() {
		createaccount.click();
	}

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
