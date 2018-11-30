package Pages;

import common.Utils;

//import java.util.concurrent.TimeUnit;

public class WebPage extends Base{
	
	public void openURL() {

		getWebDriver().get(Utils.getPropertyData(Utils.propertyFilePath, "URL"));
		//getWebDriver().manage().window().maximize();
		//getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}	
}
