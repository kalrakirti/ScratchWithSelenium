package config;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRM {
	
	static WebDriver driver ;
	public static void main(String[] args) {

		driver= new ChromeDriver();
		driver.get("https://classic.freecrm.com");
		 //a[text()='shilpi sharma']/parent::td//following-sibling::td/a[@context='company']
		//a[text()='Mustafa Hanif']/parent::td//preceding-sibling::td/input[@type='checkbox']

		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
//		driver.findElement(By.xpath("//a[text()='Mustafa Hanif']/parent::td//preceding-sibling::td/child::input[@type='checkbox']")).click();
//		selectUser("neha sharma");
		System.out.println(getCompany("neha sharma"));
		selectMultiUser("neha sharma");
		
		
	}
	
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td//preceding-sibling::td/child::input[@type='checkbox']")).click();
		
	}
	
	public static String getCompany(String userName) {
		return driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td//following-sibling::td/a[@context='company']")).getText();
	}
	
	public static void selectMultiUser(String userName) {
		
		List<WebElement> users =driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td//preceding-sibling::td/child::input[@type='checkbox']"));
		
		for (WebElement e: users) {
			e.click();
		}
	}
		
		public static void SelectUserName(String userName,int index) {
			
			driver.findElements(By.xpath("(//a[text()='"+userName+"']/parent::td//preceding-sibling::td/child::input[@type='checkbox'])["+index+"]"));
			
						
		}
		
		public static void selectLatsUser(String userName) {
			driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td//preceding-sibling::td/child::input[@type='checkbox'])[last()]")).click();
			
		}
	}


