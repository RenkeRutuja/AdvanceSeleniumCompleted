package Testng2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShoesNike {
	@Test(groups = "regression")
	public void nike() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.nike.com/");
		Thread.sleep(1000);
		driver.close();
		
	}

}
