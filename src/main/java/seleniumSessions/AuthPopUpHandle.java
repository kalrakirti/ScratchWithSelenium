package seleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {

	
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String userName ="admin";
		String pwd ="admin";
		driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		

	}

}
