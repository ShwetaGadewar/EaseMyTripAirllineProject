package airline.Airline_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PayementPage {
	WebDriver driver;

	@FindBy(xpath="(//span[.='Net Banking'])[1]")
	WebElement netbanking;

	public void net_banking() {
		netbanking.click();

	}

	@FindBy(xpath ="//input[@id='rdoSBIB']")
	WebElement sbi;

	public void state_bank() {
		sbi.click();
	}
	
	@FindBy(xpath="(//a[@class='pymtflx'])[1]")
	WebElement creditcard;

	public void credit_card()
	{
		creditcard.click();

	}
	
	@FindBy(xpath="(//input[@class='inp-mnu2'])[1]")
	WebElement cardnumber;

	public void card_number()
	{
		cardnumber.sendKeys("2345678987654323");

	}
	@FindBy(xpath="(//input[@class='inp-mnu2'])[2]")
	WebElement cardname;

	public void card_holder_name()
	{
		cardname.sendKeys("Shweta");

	}
	@FindBy(xpath="//input[@id='CCCVV']")
	WebElement cvv;

	public void CVV()
	{
		cvv.sendKeys("786");

	}
	@FindBy(xpath="//select[@id='CCMM']")
	WebElement month;

	public void month()
	{
		Select s1=new Select(month);
		s1.selectByVisibleText("April (28)");
	}
	@FindBy(xpath="//select[@id='CCYYYY']")
	WebElement year;

	public void year()
	{
		Select s1=new Select(year);
		s1.selectByVisibleText("2025");
	}
	@FindBy(xpath= "(//div[@class='mk-pym'])[1]")
	WebElement makepayment;

	public void make_payment() 
	{
		makepayment.click();
	}

	public PayementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
