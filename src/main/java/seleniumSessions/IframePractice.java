package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframePractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		
		By image = By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']");
		By proposal = By.xpath("//input[@name ='RESULT_TextField-1']");
		By location =By.xpath("//label[text()='Location']/following::input");
		By date =By.xpath("//label[@id='q4_label']/following::input[@placeholder='mm/dd/yyyy']");
		By desc = By.xpath("//textarea[contains(@name,'RESULT_Text')]");
		By uploadFile =By.xpath("//input[@type='file']");
		By firstName = By.cssSelector("#RESULT_TextField-8");
		By lastName = By.id("RESULT_TextField-9");
		By street = By.id("RESULT_TextField-10");
		By city = By.id("RESULT_TextField-12");
		By zip = By.id("RESULT_TextField-14");
		By phone = By.id("RESULT_TextField-15");
		By email = By.xpath("//input[@type='email']");
		By submit = By.xpath("//input[@type='submit']");
		By state = By.xpath("//select");
		
		
		driver.findElement(image).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(proposal).sendKeys("TestProposal");
		driver.findElement(location).sendKeys("Canada");
		driver.findElement(date).sendKeys("12/12/12");
		driver.findElement(desc).sendKeys("Hi I am testing");
		driver.findElement(uploadFile).sendKeys("C:\\Users\\KIRTI\\Desktop\\letter.docx");
		driver.findElement(firstName).sendKeys("Kid");
		driver.findElement(lastName).sendKeys("K");
		driver.findElement(street).sendKeys("west cost blvd");
		driver.findElement(city).sendKeys("Brampton");
		driver.findElement(zip).sendKeys("L6r 3S2");
		driver.findElement(phone).sendKeys("2309815501");
		driver.findElement(email).sendKeys("kkirti33@yahoo.in");
		Select select = new Select(driver.findElement(state));
		select.selectByVisibleText("Ohio");
		driver.findElement(submit).click();
		
		
		
		
		
//		driver.switchTo().defaultContent();
		
	}

}
