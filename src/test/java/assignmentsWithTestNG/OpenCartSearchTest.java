package assignmentsWithTestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import myTest.BaseTest;
import seleniumSessions.ElementUtil;

public class OpenCartSearchTest extends BaseTest {

	ElementUtil eleUtil;
	By email = By.id("input-email");
	By password = By.id("input-password");
	By loginBtn = By.xpath("//input[@type='submit']");
	By searchText = By.xpath("//input[@placeholder='Search']");
	By searchBtn = By.xpath("//*[@id=\"search\"]/span/button");
	By qty = By.cssSelector("#input-quantity");
	By addToCartBtn = By.xpath("//button[@id='button-cart']");
	By cartItem = By.id("cart-total");
	By success = By.cssSelector(".alert-success");
	

	@DataProvider
	public Object[][] searchData() {
		return new Object[][] {
			{ "Macbook", "MacBook Air", 1 }, 
			{ "samsung", "Samsung SyncMaster 941BW", 1 },
				{ "iPhone", "iPhone", 3 }};
	}

	
	@Parameters({ "userName", "pwd" })
	@Test()
	public void LoginOpenCart(String userName, String pwd) {
		eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email, userName);
		eleUtil.doSendKeys(password, pwd);
		eleUtil.doClick(loginBtn);
		String text = driver.getTitle();
		Assert.assertEquals(text, "My Account");
	}

	
	
	@Test(dataProvider = "searchData")
	public void searchOpenCart(String searchProduct,String SelectProduct,int quantity)   {
//		String count[] =eleUtil.doGetText(cartItem).split(" ");
//		int  initialCartVal = Integer.valueOf(count[0]);
//		System.out.println("initial value is "+initialCartVal);
		driver.findElement(searchText).clear();
		eleUtil.doSendKeys(searchText, searchProduct	);
		eleUtil.doClick(searchBtn);
		eleUtil.doClick(By.linkText(SelectProduct));
		driver.findElement(qty).clear();
		eleUtil.doSendKeys(qty, String.valueOf(quantity));
		eleUtil.doClick(addToCartBtn);
//		Thread.sleep(2000);
		String ch[] =eleUtil.doGetText(cartItem).split(" ");
//		int item = Integer.valueOf(ch[0]);
//		System.out.println("item value :"+item);
//		initialCartVal= initialCartVal+quantity;
//		System.out.println("after adding item"+initialCartVal);
		String text =eleUtil.doGetText(success);
//		System.out.println(text);
		Assert.assertTrue(text.contains("Success"));}
}
