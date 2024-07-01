package seleniumSessions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadProperties {
	public static final String CONFIG_PATH ="./src/main/java/config/config.properties";
	Properties prop;
	public Properties initProp() {
		try {
			FileInputStream file = new FileInputStream(CONFIG_PATH);
			prop =new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;	
		
	}
}
