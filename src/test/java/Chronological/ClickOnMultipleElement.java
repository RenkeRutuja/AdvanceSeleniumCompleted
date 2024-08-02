package Chronological;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseClass.DWSBase;


public class ClickOnMultipleElement extends DWSBase{
	@Test
	public void elementclick() throws InterruptedException {
		String url = ("https://demowebshop.tricentis.com/");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li[1]/a"));
		for (WebElement web : links) {
			String current_url = driver.getCurrentUrl();
			if (url.equals(current_url)) {
				driver.navigate().back();
				Thread.sleep(2000);		
			}
			
			
		}
				
	}

}
