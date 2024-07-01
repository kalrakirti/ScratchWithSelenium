package config;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		
		//a[text()='Mustafa Hanif']/parent::td//preceding-sibling::td/input[@type='checkbox']
		 //a[text()='shilpi sharma']/parent::td//following-sibling::td/a[@context='company']
		

//		(//a[text()='Rakesh King']/parent::td/following-sibling::td)[last()-1]
//		recomended following ->
		//a[text()='Rakesh King']/parent::td/following-sibling::td/a[contains(@href,'mailto')]
		
		
		//input[@name='email']/preceding::a
		//input[@name='email']/following::a
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
////		driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
//		.click();
		
		selectUserCheckBox("Kevin.Mathews");
		
		
		

	}
	
	public static List<String> getUserDetails(String userName) {
		
		List<WebElement> elements = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> datalist = new ArrayList<String>();
		
		for(WebElement e: elements) {
			String text = e.getText();
			datalist.add(e.getText());
			System.out.println(e.getText());
		}
		return datalist;
		
	}

	public static void selectUserCheckBox(String userName) {
		
	
		driver.findElement(
		By.xpath("//a[text()='"+userName+"']/ancestor::tr//input[@type='checkbox']"))
		.click();
		
	}
}
