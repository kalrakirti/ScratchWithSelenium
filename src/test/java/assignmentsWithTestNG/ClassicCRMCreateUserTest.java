package assignmentsWithTestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import myTest.BaseTest;
import seleniumSessions.ElementUtil;

public class ClassicCRMCreateUserTest extends BaseTest {

	ElementUtil eleUtil;
	By edition = By.id("payment_plan_id");
	By firstName=By.xpath("//input[@placeholder='First Name']");
	By lastName= By.xpath("//input[@placeholder='Last Name']");
	By email =By.xpath("//input[@placeholder='Email']");
	By confirmEmail = By.xpath("//input[@placeholder='Confirm Email']");
	By userName = By.xpath("//input[@placeholder='Username']");
	By password =By.xpath("//input[@placeholder='Password']");
	By confirmPassword= By.xpath("//input[@placeholder='Confirm Password']");
	By termsCheck = By.xpath("//input[@type='checkbox']");
	By submit = By.id("submitButton");
	
	By company = By.xpath("//input[@placeholder='Company']");
	By phone = By.xpath("//input[@placeholder='Phone']");
	By fax = By.xpath("//input[@placeholder='Fax']");
	By website = By.xpath("//input[@placeholder='Website']");
	By description = By.xpath("//textarea[@placeholder='Description']");
	By address = By.xpath("//textarea[@placeholder='Address']");
	By city = By.xpath("//input[@placeholder='City']");
	By state = By.id("state");
	By zip = By.id("postcode");
	By country = By.name("country");
	By copyAddress = By.name("copy_address");
	By continu = By.className("btnSubmit");
	By finish = By.name("finish");
	By registercompleteText =By.className("text_orange");
	
	
	@DataProvider
	public Object[][] usersTobeAdded() {
		return new Object[][] { { "addnana","el","addnana@gmail.com", "abc@123",
			"Cofor","2345123489","12342518","xyz@xyz.com","this is my test data", "test Address", "Missisauga", "Ontario","L6R 3P1","Canada"
			}
//			{ "def","sel","def1@gmail.com", "def@gmail.com" },
//			
//				{ "ghi","sel","ghi1@gmail.com", "ghi" }
			};

	}

	@Test(dataProvider = "usersTobeAdded")
	public void createUserCRM(String fname,String lname, String emailId,String pwd ,String compny ,
			String ph,String fx,String web,String desc, String Address, String City, String State,String Zip,String Country
			) throws InterruptedException {
		eleUtil = new ElementUtil(driver);
		eleUtil.doSelectByText(edition, "Free Edition");
		eleUtil.doSendKeys(firstName,fname);
		eleUtil.doSendKeys(lastName,lname);
		eleUtil.doSendKeys(email,emailId);
		eleUtil.doSendKeys(confirmEmail,emailId);
		eleUtil.doSendKeys(userName,fname+"2222a1567");
		eleUtil.doSendKeys(password,pwd);
		eleUtil.doSendKeys(confirmPassword,pwd);
		eleUtil.doClick(termsCheck);
		eleUtil.doClick(submit);
		eleUtil.doSendKeys(company, compny);
		eleUtil.doSendKeys(phone, ph);
		eleUtil.doSendKeys(fax, fx);
		eleUtil.doSendKeys(website, web);
		eleUtil.doSendKeys(email, emailId);
		eleUtil.doSendKeys(description, desc);
		eleUtil.doSendKeys(address, Address);
		eleUtil.doSendKeys(city, City);
		eleUtil.doSendKeys(state, State);
		eleUtil.doSendKeys(zip, Zip);
		eleUtil.doSelectByVisibleText(country, Country);
		eleUtil.doClick(copyAddress);
		eleUtil.doClick(continu);
		eleUtil.doClick(finish);
		String text = eleUtil.doGetText(registercompleteText);
		Assert.assertEquals(text,"Your account is now registered.");
		Thread.sleep(6000);
				
	}

}
