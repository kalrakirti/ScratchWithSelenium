package seleniumSessions;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
//			target property will be  target ='blank'  for this always
			
			driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
			
			
			Set<String> windows = driver.getWindowHandles();
			
			List<String> lis = new ArrayList<String>(windows);
			
			String parentWindowId = lis.get(0);
			System.out.println("parentWindo id is " +parentWindowId);
			String childWindowId = lis.get(1);
			System.out.println("child window id is "+childWindowId);
			driver.close();
	}

}
