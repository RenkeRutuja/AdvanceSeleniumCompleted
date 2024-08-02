package extentReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginFunctionWithCorrectCredential {
	@Test
	
	public void CorrectCredentials() throws InterruptedException {
		  ExtentSparkReporter spark = new ExtentSparkReporter("./Report/sampleReport.html");
		  spark.config().setDocumentTitle("sampleReport");
		  spark.config().setDocumentTitle("Rutuja");
		  spark.config().setTheme(Theme.DARK);
		//  create the extent report
		  ExtentReports report = new ExtentReports();
		//  configure extent report
		  report.setSystemInfo("Os", "Window-10");
		  report.setSystemInfo("Browser", "Chrome-100");
		//  attach the spark reporter to extent report
		  report.attachReporter(spark);
		  ExtentTest test = report.createTest("BasicReport");
		  test.log(Status.INFO, "report is successfully created");
		  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		Thread.sleep(2000);
		
		WebElement community_poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		
		
		}

}
