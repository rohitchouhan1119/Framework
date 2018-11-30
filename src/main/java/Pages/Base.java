package Pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Utils;

public class Base extends Utils {
	
	
public static WebDriver driver;

	
	public static WebDriver getWebDriver(){
		// set enviroment varible in the system as chromedriverpath and mention local path of driver.exe
		System.setProperty("webdriver.chrome.driver",System.getenv("chromeDriverPath"));
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public void closeWindow() {
	driver.close();
	}
	

}
