package CommonPages;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
public class ConfigFileReader extends BasePage {
	
	
	public String getPropertyValue(String key) throws IOException {
		
		FileInputStream fs=new FileInputStream(".\\src\\TestResources\\commonData.properties");
		Properties prop = new Properties();
        prop.load(fs);
        String value=prop.getProperty(key);
		return value;
	}
}
