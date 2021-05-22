package VerifyGitVersion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.After;
//import cucumber.api.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GitTest {
	
	public static WebDriver driver;
	
	
	@Before
	public void beforeSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.close();
		
	}
	
	@Test
	public void openbrowser() {
		System.out.println("Hello world");
		driver.get("www.facebook.com");
	}
	

}
