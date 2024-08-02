package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.DwsLogin;

public class LoginFunction {
	@Test
	
	public void main() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		DwsLogin ref = new DwsLogin(driver);
		Thread.sleep(2000);
		
		ref.login_link();
		ref.username("rutujarenke2001@gmail.com");
		ref.password("rutuja@55");
		ref.login_button();
		
		
	}
	
	
}
