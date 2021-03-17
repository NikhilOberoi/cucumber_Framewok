package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class loggerHelper {
	
	public static Logger getLogger(String ClassName) {
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\main\\resources\\config_files\\log4j.properties");
		return Logger.getLogger(ClassName);
	}
}
