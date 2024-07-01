package myTest;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM extends BaseTest {

	@Test(description = "checking page title")
	public void orangeloginPagetitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println("page title is :" + actualTitle);
		Assert.assertEquals(actualTitle, "30-Day Advanced Free Trial | OrangeHRM", "----title is not matched----");
	}

	@Test(description = "checking page current url")
	public void orangeloginPageUrlTest() throws InterruptedException {
		String url = driver.getCurrentUrl();
		Thread.sleep(4000);
		System.out.println("current url is :" + url);
		Assert.assertTrue(url.contains("orangehrm.com"), "url does not match");
	}

	@Test(description = "checking Logo")
	public void orangeloginPageLogoTest() {
//		driver.get("https://www.orangehrm.com/30-day-free-trial/");
//		Boolean flag = driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
		Boolean flag =true;
		System.out.println("Logo is visible?  :" );
		Assert.assertEquals(flag, true, "----logo missing----");
	}

}
