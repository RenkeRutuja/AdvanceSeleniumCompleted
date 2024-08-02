package Testng2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShoesSneakers {
	
	@Test(groups = "regression")
	public void Sneaker() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.sneakers.com/");
		Thread.sleep(1000);
		driver.close();
		
	}

}
