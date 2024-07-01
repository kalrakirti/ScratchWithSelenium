package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type=file  will be there
		String file ="";
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\KIRTI\\Desktop\\letter.docx");
		
		
	}

}
