package seleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitCloseConcept {

	public static void main(String[] args) {
//		Case 1 : Close
		
//		launch browser
		WebDriver driver = new ChromeDriver(); //ChromeDriver: chrome on windows (6bee2231838e6a5f077c510920d06f45)
		
//		open url
		driver.get("https://www.amazon.ca"); //ChromeDriver: chrome on windows (6bee2231838e6a5f077c510920d06f45)
		
//		get title
		System.out.println(driver.getTitle());//ChromeDriver: chrome on windows (6bee2231838e6a5f077c510920d06f45)
		
//		close driver
		driver.close();//ChromeDriver: chrome on windows (6bee2231838e6a5f077c510920d06f45)
		
//		access driver again
//		driver.getCurrentUrl();//ChromeDriver: chrome on windows (6bee2231838e6a5f077c510920d06f45)
//		org.openqa.selenium.NoSuchSessionException: invalid session id
		
//		driver =new ChromeDriver(); //
		
//		Case 2 : Quit
		
//		launch browser
		driver = new ChromeDriver(); //ChromeDriver: chrome on windows (8bbc0288e0f7bf8296957c34ce6c2343)
		
//		open url
		driver.get("https://www.amazon.ca"); //ChromeDriver: chrome on windows (8bbc0288e0f7bf8296957c34ce6c2343)
		
//		get title
		System.out.println(driver.getTitle());//ChromeDriver: chrome on windows (8bbc0288e0f7bf8296957c34ce6c2343)
		
//		close driver
		driver.quit();//ChromeDriver: chrome on windows (8bbc0288e0f7bf8296957c34ce6c2343)
		
		//after this session id is null.
		
//		access driver again
		driver.getCurrentUrl();//ChromeDriver: chrome on windows (6bee2231838e6a5f077c510920d06f45)
//		org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		driver =new ChromeDriver(); //
		
	}

}
