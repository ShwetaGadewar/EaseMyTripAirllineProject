package airline.Airline_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(id = "txtEmail")
	WebElement mobilenumber;

	public void email() {
		mobilenumber.sendKeys("shwetasgadewar@gmail.com");
	}

	public void wrong_number() {
		mobilenumber.sendKeys("91759433181");
	}

	public boolean assertion() {
		boolean ansr = mobilenumber.isDisplayed();
		return ansr;
	}

	@FindBy(id = "shwotp")
	WebElement continuebutton;

	public void continu() {
		continuebutton.click();
	}

	@FindBy(id = "txtEmail2")
	WebElement password;

	public void password() {
		password.sendKeys("Myluck@123");
	}

	@FindBy(xpath = "(//input[@class='_btnLogin'])[3]")
	WebElement login;

	public void login() {

		login.click();
	}

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
