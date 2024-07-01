package seleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BottomLinksGoogle {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		By bottomLinks =By.xpath("//div[@jscontroller='NzU6V']//a[@class='pHiOh']");
//		By bottomLinks =By.xpath("//div[@jscontroller='NzU6V']"); //generic gives Settings

		
		List<WebElement> links = driver.findElements(bottomLinks);

		for(WebElement e : links) {
			String text = e.getText();
			if (text.equals("Settings")) {
				System.out.println("Settings is part of JS controller");
				e.click();
				break;
			}
			System.out.println(text);
		}
		
		
//		2 Opencart footer links
//		driver.get("https://naveenautomationlabs.com/opencart/");
////		By footerLinks=By.xpath("//footer//div[contains(@class,'col')]//a");
//		By footerLinks=By.xpath("//footer//div[contains(@class,'col')]"); //contains header
//		
//		
//		List<WebElement> links = driver.findElements(footerLinks);
//
//		System.out.println(links.size());
//		for(WebElement e : links) {
//			String text = e.getText();
//			if (text.equals("Settings")) {
//				System.out.println("Settings is part of JS controller");
//			}
//			System.out.println(text);
//		}
		
	}

}
