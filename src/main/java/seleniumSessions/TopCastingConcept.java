package seleniumSessions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingConcept {
	
	public static void main (String args[]) {
		
//		1) valid and recomendded
//		WebDriver driver = new ChromeDriver();
		
		
//		2) Not recomended , as only FE and FEs is there
//		SearchContext driver = new ChromeDriver();
		
//		3) valid and recomended, but we don't use bcz in future if new Driver comes and doesn't implement
//		RemoteWebdriver
//		RemoteWebDriver driver = new ChromeDriver();
		
//		4) valid and recomended --for remote execution (AWS,cloud server,VM) with Grid
//		WebDriver driver = new RemoteWebDriver(remoteAddress,capabilities)
		
//		5) not recomended
//		SearchContext driver = new RemoteWebDriver(remoteAddress,capabilities);
		
//		6) valid not recomennded , only valid for chrome and edge. 
//		ChromiumDriver driver = new ChromeDriver();
//		driver = new EdgeDriver();
//		driver = new FirefoxDriver();  gives error
		
//		7) not allowed
//		RemoteWebDriver driver = new ChromiumDriver();
		
		
		
	}

}
