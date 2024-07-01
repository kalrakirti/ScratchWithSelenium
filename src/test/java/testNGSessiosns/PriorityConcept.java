package testNGSessiosns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityConcept {
	WebDriver driver;
//	default priority is 0

	
	@Test(priority =1)
	public void loginPageUrlTest() {
		System.out.println("test 1");
	}
	
	@Test(priority =3)
	public void loginPageLogoTest1() {
		System.out.println("test 3");
	}
	
	@Test(priority =-3)
	public void loginPageUrlTest2() {
		System.out.println("test -3");
	}
	
	@Test(priority =-1)
	public void loginPageLogoTest3() {
		System.out.println("test -1");
	}
	@Test(priority =1)
	public void loginPageUrlTest4() {
		System.out.println("test 1");
	}
	
	@Test()
	public void loginPageLogoTest5() {
		System.out.println("test 0");
	}

}
