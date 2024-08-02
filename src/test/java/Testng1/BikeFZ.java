package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BikeFZ {
	
	@Test(groups = "smoke")
	public void Fz() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bikewale.com/yamaha-bikes/fz/");
		Thread.sleep(1000);
		driver.close();
		
	}

}
