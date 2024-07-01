package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectDropdownValue {

	static WebDriver driver;

	public static void main(String[] args) {

//		1) Select a value from dropdown without using select class methods 
//		2) Select a value from dropdown without using select class

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		
		//multipe attribute should be there with select tag
		By flamingo = By.xpath("//*[@id=\'post-291\']/div/div[2]/select");
		Select select = new Select(driver.findElement(flamingo));
		
		System.out.println(select.isMultiple());
		
		if(select.isMultiple()) {
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Lesser flamingo");
			
		}
		
		//deselect values
		
		select.deselectByVisibleText("American flamingo");
		
	
		

	}

}
