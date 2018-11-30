package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {

	public static Properties prop;
	public static FileInputStream fis;
	public static final String propertyFilePath="File path - config.properties";

public static String getPropertyData(String filePath,String key) {
	
	try {
		fis=new FileInputStream(filePath);
		prop=new Properties();
		prop.load(fis);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
		return prop.getProperty(key);
	}
public String getReportConfigPath(){
	String reportConfigPath = prop.getProperty("reportConfigPath");
	if(reportConfigPath!= null) return reportConfigPath;
	else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
}
	

	
	
}
