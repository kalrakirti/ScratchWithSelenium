package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBGColor {

		static WebDriver driver;

		public static void main(String[] args) {

			driver = new ChromeDriver();
			driver.get("https://classic.crmpro.com/");
			
			WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
			

			System.out.println(loginBtn.getCssValue("backgroundColor"));
			loginBtn.getCssValue("background");

	}

}
