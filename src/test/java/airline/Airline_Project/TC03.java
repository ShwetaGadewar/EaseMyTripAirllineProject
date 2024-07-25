package airline.Airline_Project;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.EasemytripListener;
import utilityPackage.Launch;

@Listeners(EasemytripListener.class)
public class TC03 extends EasemytripListener {
	@Test
	public void login_fail() throws InterruptedException {
		Launch launch = new Launch();
		launch.launch();

		HomePage a1 = new HomePage(driver);
		a1.sign_up();
		a1.customer_login();

		LoginPage a2 = new LoginPage(driver);
		a2.wrong_number();
		a2.continu();
		Assert.assertTrue(a2.assertion());

	}
}
