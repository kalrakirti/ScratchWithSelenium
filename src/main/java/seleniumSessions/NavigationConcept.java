package seleniumSessions;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		driver =new ChromeDriver();
		
//		driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		
//		2 method of calling navigate.to method
		driver.navigate().to(new URL("https://www.google.com"));
		
		
		System.out.println(driver.getTitle());

//		driver.navigate().to("https://www.flipKart.com");
//		System.out.println(driver.getTitle());
		
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		
		driver.navigate().forward();
//		System.out.println(driver.getTitle());
//		
//		driver.navigate().refresh();//refresh the page
	}

}
