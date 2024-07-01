package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomeElements {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.selectorshub.com/iframe-in-shadow-dom/");
		
//		driver.findElement(By.id("pizza")).sendKeys("veg pizza");
		
		String jsScript =" return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement pizza = (WebElement)js.executeScript(jsScript);
		pizza.sendKeys("veg pizza");
	}

}
