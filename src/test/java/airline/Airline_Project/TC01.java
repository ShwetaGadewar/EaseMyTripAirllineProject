package airline.Airline_Project;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.EasemytripListener;
import utilityPackage.Launch;
@Listeners(EasemytripListener.class)
public class TC01 extends EasemytripListener{
	
@Test
public void registrationEasemytrip() throws InterruptedException {
		
		Launch launch = new Launch();
		launch.launch();
		
		HomePage a1=new HomePage(driver);
	 	a1.sign_up();
	 	a1.customer_login();
	 	
	 	RegistrationPage a2=new RegistrationPage(driver);
	 	a2.mobile_number();
	 	a2.continu();
	 	Thread.sleep(5000);
	 	a2.createaccount();
	 	Assert.assertTrue(true);
		
}
}