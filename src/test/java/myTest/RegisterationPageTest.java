package myTest;

import java.util.UUID;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterationPageTest extends BaseTest {

	public String getrandomEmail() {
		String emailId = "opencart"+System.currentTimeMillis()+"@gmail.com";
//		String emailId = "opencart"+UUID.randomUUID()+"gmail.com";
		return emailId;
	}
	
	@DataProvider
	public Object[][] getRegisterationData() {
		return new Object[][] { { "Kaavi", "Sel", "2341567289", "kabi@123" }
//				{ "Ami", "Sel",  "2341567289", "kabi@123" },
//				{ "Pavi", "Sel",  "2341567289", "kabi@123" },
//				{ "Lavi", "Sel",  "2341567289", "kabi@123" }
		};
	}

	@Test(dataProvider = "getRegisterationData",invocationCount=2)
	public void registerTest(String firstName, String lastName, String telephone, String pwd) throws InterruptedException {
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(getrandomEmail());
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(telephone);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@placeholder='Password Confirm']")).sendKeys(pwd);
		driver.findElement(By.xpath("//label[@class='radio-inline']/input[@value='1']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='No']")).click(); //// label[@class='radio-inline']/input[@value='0']
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();

		Assert.assertEquals(text, "Your Account Has Been Created!");
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();

	}
}
