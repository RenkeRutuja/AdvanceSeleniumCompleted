package DataDrivenTesting;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis =new FileInputStream("C:\\Users\\Lenovo\\Downloads\\TestData\\DwsLogin.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet=  wb.getSheet("Sheet1");
		String email=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getCell(0).toString();
		String password=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getCell(1).toString();
		System.out.println(email);
		System.out.println(password);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();




		}
}
