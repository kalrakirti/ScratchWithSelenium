package seleniumSessions;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class OpenCartest {

	public static void main(String[] args) {
//		String browser = "chrome";
		
		ReadProperties propReader = new ReadProperties();
		Properties prop =propReader.initProp();
		String browser =prop.getProperty("browser");
		String url = prop.getProperty("url");
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser(browser); //using same session id that is why returned webDriver
		br.launchUrl(url);
		
		//validation point
		String title = br.getPageTitle();
		
		if(title.equals("Your Store")){
				System.out.println("correct url");
	}
		else
			System.out.println("wrong url");
		
		String appUrl = br.getPageCurrentUrl();
		if(appUrl.contains("opencart")){ 
			System.out.println("correct url");
}
	else
		System.out.println("wrong url");
	
		br.quitBrowser();
	}
	
}
