package testNGSessiosns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartLoginTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}
	
	@Test(description ="checking page title")
	public void loginPagetitleTest() {
		String actualTitle =driver.getTitle();
		System.out.println("page title is :"+actualTitle);
		Assert.assertEquals(actualTitle,"Account Login","----title is not matched----");
	}
	
	@Test(description ="checking page current url")
	public void loginPageUrlTest() {
		String url =driver.getCurrentUrl();
		System.out.println("current url is :"+url);
		Assert.assertTrue(url.contains("route=account/login"),"url does not match");
	}
	
	@Test(description ="checking Logo")
	public void loginPageLogoTest() {
		Boolean flag =driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
		System.out.println("Logo is visible?  :"+flag);
		Assert.assertEquals(flag,"True","----logo missing----");
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}
	

}
