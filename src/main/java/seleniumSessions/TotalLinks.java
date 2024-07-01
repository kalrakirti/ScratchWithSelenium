package seleniumSessions;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");

//		html tag>=a

		List<WebElement> linkslist = driver.findElements(By.tagName("a"));

		System.out.println(linkslist.size());

//		for (int i = 0; i < linkslist.size(); i++) {
//			WebElement e = linkslist.get(i);
//			String text = e.getText();
//
//			if (text.length() != 0) {
//				System.out.println(text);
//			}
//		}

//		for (WebElement e : linkslist) {
//			String text = e.getText();
//
//			if (text.length() != 0) {
//				System.out.println(text);
//			}
//	}

			By image = By.tagName("img");
			By links = By.tagName("a");
			
//			List<String> imgList =getElementsText(links);
//			System.out.println(imgList);
			
			List<String> linksList =  getElementsText(links);
			System.out.println(linksList);
			
			System.out.println(linksList.contains("My Account"));

		
		
//		driver.close();
	
	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);
	}

//	WAF : to fetch the text of each link,store it in some list and return 
//	name : getElementTextList
//	param : By locator
//	return List<String>

	public static List<String> getElementsText(By locator) {

		List<WebElement>elelist =getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		for( WebElement e :elelist) {
			String text = e.getText();
			if(text.length()!= 0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

}
