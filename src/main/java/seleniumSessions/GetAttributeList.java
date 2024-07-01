package seleniumSessions;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeList {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
//		By image = By.tagName("img");
//		getElememntAttList(image,"src");
//		System.out.println("-----alt");
//		getElememntAttList(image,"alt");
//		System.out.println("-----style");
//		getElememntAttList(image,"style");
		
		By links = By.tagName("a");
		getElememntAttList(links,"href");
		getElememntAttList(links,"title");
		
//		driver.close();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
			}

	public static List<String> getElememntAttList(By locator, String attName ) {
		
		List<WebElement> imageList = getElements(locator);
		List<String>	attValList = new ArrayList<String> () ;
		
		for(WebElement e:imageList) {
			String attVal = e.getAttribute(attName);
			if(attVal != null && attVal.length()!=0) {
				attValList.add(attVal );
			System.out.println(attValList);
		}
		}
			return attValList;		
	}
}
