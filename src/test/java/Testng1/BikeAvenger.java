package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BikeAvenger {
	@Test(groups = "smoke")
	public void avenger() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bajajauto.com/bikes/avenger");
		Thread.sleep(1000);
		driver.close();
		
	}

}
