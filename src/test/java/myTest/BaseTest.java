package myTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import seleniumSessions.BrowserException;
 
public class BaseTest {
	protected WebDriver driver;

	@Parameters({ "browser" ,"url"})
	@BeforeTest
	public void setup(String browserName,String url) {

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
		default:
			System.out.println("plz give right browser");
			throw new BrowserException(""); //why can not reach this code
			
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
