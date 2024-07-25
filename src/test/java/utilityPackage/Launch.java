package utilityPackage;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch extends EasemytripListener{

	public void launch() {
		driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(10));
	}
}