package seleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver launchBrowser(String browserName) {

		System.out.println("Launching " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "FirefoxDriver":
			driver = new FirefoxDriver();
			break;
		default:
			throw new BrowserException("invalid browser name" + browserName);

		}
		return driver;

	}

	public void launchUrl(String url) {

		if (url == null) {
			throw new BrowserException("invalid url" + url);
		}
		if (url.isBlank() || url.isEmpty()) {
			throw new BrowserException("blank/empty url " + url);
		}

		if (url.indexOf("http") != 0) {
			throw new BrowserException("url is not containig (http)s" + url);
		}
		driver.get(url.trim());
	}

	public String getPageTitle() {
		String title =driver.getTitle();
		if(title==null) {
			System.out.println("getting null title");
			return null;
		}
		return title;
	}
	
	public String getPageCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}
