package myTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {

		
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
		Assert.assertTrue(url.contains("naveenautomationlabs"),"url does not match");
	}
	
	@Test(description ="checking Logo")
	public void loginPageLogoTest() {
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Boolean flag =driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
		System.out.println("Logo is visible?  :"+flag);
		Assert.assertEquals(flag,true,"----logo missing----");
	}
	

}
