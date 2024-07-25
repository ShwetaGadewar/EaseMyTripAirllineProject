package airline.Airline_Project;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.EasemytripListener;
import utilityPackage.Launch;
@Listeners(EasemytripListener.class)
public class TC04 extends EasemytripListener{
	@Test
	public void oneway_flight() throws InterruptedException
	{
		Launch launch = new Launch();
		launch.launch();

		HomePage a1 = new HomePage(driver);
		a1.sign_up();
		a1.customer_login();
		LoginPage a2=new LoginPage(driver);
	 	a2.email();
	 	a2.continu();
	    a2.password();
	    a2.login();
		a1.from_feild();
		a1.from_search();
		a1.searchiconfrom();
		a1.to_field();
		a1.to_search();
		a1.searchiconto();
		a1.date();
		a1.select_date();
		a1.traveller_class();
		a1.economy();
		a1.done();
		a1.search();
		Thread.sleep(10000);
	
		
	 	
	}
}
