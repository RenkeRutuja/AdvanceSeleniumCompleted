package vtiger;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import BaseClassApplication.BaseClass;
import POM.Vtiger;

@Listeners(com.crm.Listeners1.VtigerListner.class)

public class Task1 extends BaseClass{
	@Test
	public void createOrganisation() throws IOException {
		BaseClass ref=new BaseClass();
		ref.preCondition();
		ref.login();
	Vtiger ref1=new Vtiger(driver);
	ref1.clickOrganisation();
	ref1.clickCreateOrg();
	ref1.orgName("shriramaptops");
	}
	    
		
	

}
