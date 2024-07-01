package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		
//		String header =driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
//		
//		String para = driver.findElement(By.xpath("//*[@id=\'content\']/div/div[1]/div/p[2]")).getText();
//		System.out.println(para);
//		System.out.println(driver.findElement(By.linkText("Forgotten Password")).getText());
		
		By forgtpwd = By.linkText("Forgotten Password");
		By headr = By.tagName("h2");
		By parag = By.xpath("//*[@id=\'content\']/div/div[1]/div/p[2]");
	
		ElementUtil eleUtil = new ElementUtil(driver);
		String h = eleUtil.doGetText(headr);
		System.out.println(h);
		
		String p = eleUtil.doGetText(parag);
		System.out.println(p);
		
	}
	
	

}
