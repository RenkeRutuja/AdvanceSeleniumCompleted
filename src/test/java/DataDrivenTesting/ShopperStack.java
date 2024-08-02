package DataDrivenTesting;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ShopperStack {
		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
			
			FileInputStream fis =new FileInputStream("C:\\Users\\expert\\Desktop\\TestData\\Shopperstack1.xlsx");
			Workbook wb=WorkbookFactory.create(fis);{
			org.apache.poi.ss.usermodel.Sheet sheet=  (org.apache.poi.ss.usermodel.Sheet) wb.getSheet("Sheet1");
			String firstname=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getCell(0).toString();
			String lastname=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getCell(1).toString();
			String phno=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getCell(2).toString();
			String email=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getCell(3).toString();
			String password=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getCell(4).toString();
			String conpassword=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getCell(5).toString();
			System.out.println(firstname);
			System.out.println(lastname);
			System.out.println(phno);
			System.out.println(email);
			System.out.println(password);
			System.out.println(conpassword);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.shoppersstack.com/user-signin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='Create Account']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("First Name")).sendKeys(firstname);
			driver.findElement(By.id("Last Name")).sendKeys(lastname);
			driver.findElement(By.id("Female")).click();
			driver.findElement(By.id("Phone Number")).sendKeys(phno);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.id("Confirm Password")).sendKeys(conpassword);
			WebElement agree=driver.findElement(By.id("Terms and Conditions"));
			agree.click();
			driver.findElement(By.xpath("//button[@class='signup_bn5__l1dQe']")).click();
			}
		}

}
