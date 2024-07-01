package myTest;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test(description = "checking page title")
	public void googleloginPagetitleTest() {
//		driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
		System.out.println("page title is :" + actualTitle);
		Assert.assertEquals(actualTitle, "Google", "----title is not matched----");
	}

	
	
}
