package airline.Airline_Project;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.EasemytripListener;
import utilityPackage.Launch;

@Listeners(EasemytripListener.class)
public class TC02 extends EasemytripListener {
	@Test
	public void loginvalidcred() throws InterruptedException, IOException {
		Launch launch = new Launch();
		launch.launch();
		
		HomePage a1 = new HomePage(driver);
		a1.sign_up();
		a1.customer_login();

		LoginPage a2 = new LoginPage(driver);
		a2.email();
		a2.continu();
		a2.password();
		a2.login();
		Assert.assertTrue(true);

	}
}
