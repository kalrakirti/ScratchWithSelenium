package seleniumSessions;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeRegistraionPage {

	public static void main(String[] args) {

		ReadProperties propReader = new ReadProperties();
		Properties prop = propReader.initProp();
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");

		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.launchBrowser(browser);
		br.launchUrl(url);

		By myAccount = By.xpath("//a[@title='My Account']");
		By login = By.linkText("Login");
		By register = By.xpath("//a[text()='Register']");
		By firstName = By.cssSelector("#input-firstname");
		By lastName = By.xpath("//input[@name='lastname']");
		By email = By.xpath("//input[@type='email']");
		By telephone = By.xpath("//input[@type='tel']");
		By password = By.xpath("//input[@placeholder='Password']");
		By confirmPassword = By.xpath("//input[@placeholder='Password Confirm']");
		By radioYes = By.xpath("//label[@class='radio-inline']/input[@value='1']");
		By radioNo = By.xpath("//label[normalize-space()='No']"); //// label[@class='radio-inline']/input[@value='0']
		By termsAgree = By.xpath("//input[@name='agree']");
		By continuebtn = By.xpath("//input[@value='Continue']");
		By heading = By.xpath("//h1[contains(text(),'Your Account Has')]");
		By para1 = By.xpath("//p[contains(text(),'Congratulations!')]");
		By para2 = By.xpath("//p[contains(text(),'You can now')]");
		By para3 = By.xpath("//p[contains(text(),'If you have ANY')]");
		By para4 = By.xpath("//p[contains(text(),'A confirmation')]");
		By continueLink = By.linkText("Continue");

		ElementUtil eUtil = new ElementUtil(driver);

		eUtil.doClick(myAccount);
		eUtil.doClick(register);

		eUtil.doSendKeys(firstName, "Kid");
		eUtil.doSendKeys(lastName, "K");
		eUtil.doSendKeys(email, "kkirti1133@yahoo.in");
		eUtil.doSendKeys(telephone, "2341234567");
		eUtil.doSendKeys(password, "abc@123");
		eUtil.doSendKeys(confirmPassword, "abc@123");
		eUtil.doClick(radioYes);
		eUtil.doClick(radioNo);
		eUtil.doClick(termsAgree);
		eUtil.doClick(continuebtn);

		eUtil.doGetText(heading);

		System.out.println(
				eUtil.doGetText(para1) + eUtil.doGetText(para2) + eUtil.doGetText(para3) + eUtil.doGetText(para4));
		
		
		
		eUtil.doClick(continueLink);
	}

}
