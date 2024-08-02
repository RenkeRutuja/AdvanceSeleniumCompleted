package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BikeUnicorn {
	@Test(groups = "smoke")
	public void unicorn() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bikewale.com/honda-bikes/unicorn/");
		Thread.sleep(1000);
		driver.close();
		
	}
}
