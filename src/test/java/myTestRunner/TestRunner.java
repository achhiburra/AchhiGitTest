package myTestRunner;

import org.junit.Rule;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
//@CucumberOptions(
		//features = "features",
	//	glue = "stepDefinition",
	//	dryRun=true
	//	tags = {"@Run"}
	////)


public class TestRunner {

public static WebDriver driver;
	
	@BeforeTest
	public void beforeSetup() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.gecko.driver", "D:\\Achhi\\Automation\\AchhiPersonal\\Automation\\Drivers\\webDriverExecutor\\webdriver-chrome-driver.exe");
		 driver = new FirefoxDriver();
		// driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	}
	
	

	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
	
	@Test
	public void openbrowser() {
		System.out.println("Hello world");
		System.out.println("Hello world2");
		
	}
	
}
