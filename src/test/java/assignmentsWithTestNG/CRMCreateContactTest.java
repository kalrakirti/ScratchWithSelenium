package assignmentsWithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import myTest.BaseTest;
import seleniumSessions.ElementUtil;

public class CRMCreateContactTest extends BaseTest {

	ElementUtil eleUtil;
	Actions act;
	By user = By.name("username");
	By pass = By.name("password");
	By loginbtn = By.xpath("//input[@type='submit']");
	By contacts = By.linkText("CONTACTS");
	By dropdown = By.xpath("(//ul[@class='mlddm']/li)[4]//li");
	By title = By.name("title");
	By fName = By.id("first_name");
	By lName = By.id("surname");
	By save = By.xpath("//input[@value='Save']"); // and Create Another (same company)
	By header = By.xpath("//td[@class='tabs_header' and @align='left']");
	By actioon = By.name("do_action");
	By go = By.xpath("//input[@value='DO']");
	
	Select select ;
	@DataProvider
	public Object[][] data() {
		return new Object[][] { { "Mrs.", "king", "Jong" }, { "Prof.", "cheen", "Meen" }, { "Sir", "Yogi", "adit" } };

	}

	@Test()
	@Parameters({ "userName", "pwd" })
	public void aLogin(String userName, String pwd) {
		eleUtil = new ElementUtil(driver);
		eleUtil.waitForElementVisible(user, 3);
		eleUtil.doSendKeys(user, userName);
		eleUtil.doSendKeys(pass, pwd);
		eleUtil.doClick(loginbtn);
		driver.switchTo().frame("mainpanel");
	}

	@Test(dataProvider = "data")
	public void createContact(String ttl, String firstname, String lastname) {
		act = new Actions(driver);

		act.moveToElement(driver.findElement(contacts)).perform();
		List<WebElement> elements = driver.findElements(dropdown);

		for (WebElement e : elements) {
			System.out.println(e.getText());
			String text = e.getText();
			if (text.equals("New Contact")) {
				e.click();
				break;
			}
		}
		eleUtil.doSelectByVisibleText(title, ttl);
		eleUtil.doSendKeys(fName, firstname);
		eleUtil.doSendKeys(lName, lastname);
		eleUtil.doClick(save);
		String text = driver.findElement(header).getText();
		Assert.assertEquals(text, firstname + " " + lastname);
	}

	@Test(dataProvider = "data")
	public void deleteContact(String ttl, String firstname, String lastname) {
		By user = By.xpath("//a[text()='" + firstname + " " + lastname
				+ "']/parent::td/preceding-sibling::td/input[@type='checkbox']");
		
		List<WebElement> elements = eleUtil.getElements(user);
		select = new Select(driver.findElement(actioon));
		
		for(WebElement e : elements) {
			
			e.click();
			select.selectByValue("Delete Checked");
			eleUtil.doClick(go);
			
		}
		
		
	}

}