package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Dws_Register;

public class Register_Dws {
	@Test
	public void main() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		Dws_Register ref=new Dws_Register(driver);
		ref.register_button();
		ref.radio1();
		ref.radio2();
		ref.firstName("Rutuja");
		ref.lastName("Renke");
		ref.email("rutujarenke2001@gmail.com");
		ref.password("rutuja@55");
		ref.cPassword("rutuja@55");
		ref.register();
		driver.close();
		
		
	}

}

