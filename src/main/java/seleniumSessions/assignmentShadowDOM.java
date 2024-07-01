package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentShadowDOM {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		Thread.sleep(2000);

//		driver.switchTo().frame("pact1");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String frameJS = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
//		String  destinyJS = "return document.querySelector(\"#glaf\")";
		
		WebElement frame =(WebElement)js.executeScript(frameJS);
		driver.switchTo().frame(frame);
//		WebElement destiny =(WebElement)js.executeScript(destinyJS);
//		js.e
		
		
//		destiny.sendKeys("Waheguru");
		
		driver.findElement(By.id("glaf")).sendKeys("Yes inside frame");
	}

}
