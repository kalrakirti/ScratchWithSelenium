package seleniumSessions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pseudoelementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String firstName = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content');";

		String firstNameColor = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('color');";

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String mandtFieldText = js.executeScript(firstName).toString();
		String mandtFieldColor = js.executeScript(firstNameColor).toString();
		System.out.println(mandtFieldText);
		System.out.println(mandtFieldColor);

		if (mandtFieldText.contains("*")) {
			System.out.println("correct field");
		}

	}

}
