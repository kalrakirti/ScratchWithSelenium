package seleniumSessions;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
//		target property will be  target ='blank'  for this always
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		String parentWindowId =	driver.getWindowHandle();
		
		WebElement twitter =driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement facebook =driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement linkedIn =driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement youTube =driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));

		
		
//		twitter.click();
		
		
////		1)Fetch the window Id 
//		Set<String> windows = driver.getWindowHandles();
//		
//		Iterator<String> it = windows.iterator();
//		
//		String parentWindowId = it.next();
//		System.out.println("parentWindo id is " +parentWindowId);
//		String childWindowId = it.next();
//		System.out.println("child window id is "+childWindowId);
//		
//		
////		2 Switching work 
//		
//		driver.switchTo().window(childWindowId);
//		System.out.println(driver.getCurrentUrl());
//		Thread.sleep(3000);
//		driver.close();
//		
//		driver.switchTo().window(parentWindowId);
//		System.out.println(driver.getTitle());
//
//		driver.close();
		
		

		twitter.click();
		facebook.click();
		linkedIn.click();
		youTube.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		
		while(it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getCurrentUrl());
			if(!windowID .equals( parentWindowId)) {
			driver.close();
			}
		}
//		System.out.println(driver.getTitle()); //erroe no such window target window already closed
		driver.switchTo().window(parentWindowId);
		
		
	}

}
