package seleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSessions {

	public static void main(String[] args) {
		
//		Open the driver
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();

//		Launch the browser
		driver.get("https://www.amazon.com");
//		driver.get("www.google.com"); //invalid arguement exception	
		
//		get title
		String title = driver.getTitle();
		System.out.println("page tile is : " +title);
		
		if(title.equals("Amazon")) {
			System.out.println("title is correct");
		}
		else
			System.out.println("Incorrect title");
		
//		Get the url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.contains("google.com")) {
			System.out.println("correct url");
		}
		else
			System.out.println("incorrect url");
		
		
		//Automation steps + validation/checkpoints = automation testing.
		
//		Close the browser
		driver.close();
		System.out.println("browser closed");
		}

}
