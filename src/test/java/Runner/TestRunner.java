package Runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import common.Utils;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/resources/Feature"},
		glue= {"com.optima.cucumber.stepdefination"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/Cucumber-Report.html"})

public class TestRunner {
	
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File(Utils.getPropertyData(Utils.propertyFilePath, "reportConfigPath")));
	 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
     Reporter.setSystemInfo("Selenium", "3.7.0");
     Reporter.setSystemInfo("Maven", "3.5.2");
     Reporter.setSystemInfo("Java Version", "1.8.0_151");
	 }
}
