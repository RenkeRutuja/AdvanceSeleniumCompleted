package Testng2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShoesWoodland {
	@Test(groups = "regression")
	public void wodland() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodlandworldwide.com/");
		Thread.sleep(1000);
		driver.close();
		
	}

}
