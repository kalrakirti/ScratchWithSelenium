package seleniumSessions;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		Thread.sleep(4000);
		By rightClickBtn = By.xpath("//span[text()='right click me']");

		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(rightClickBtn)).perform();
		
		By opt =By.cssSelector("ul.context-menu-list >li.context-menu-icon span");
		
		List<WebElement> option = driver.findElements(opt);
		
		
		for(WebElement e :option) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Copy")) {
			e.click();
//			driver.switchTo().alert().accept();
			}
			
		}
		
	}

}
