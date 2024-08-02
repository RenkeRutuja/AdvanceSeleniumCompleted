package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtility {

	public static String logindata(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\com.crm.advanceseleniumA6\\ConfigureFile\\LoginFunction.properties");
		prop.load(fis);
		String data = prop .getProperty(key);
		return data;	
	}
}
