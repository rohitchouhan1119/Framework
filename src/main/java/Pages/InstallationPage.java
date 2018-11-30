package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class InstallationPage extends WebPage {

	@FindBy(partialLinkText=" text for link")
	public WebElement firstLink;
	
	@FindBy(partialLinkText="text for link")
	public WebElement secondLink;
	
	@FindBy(partialLinkText="text for link")
	public WebElement thirdLink;
	
	
	public void clickOnHscDevLink() {
		firstLink.click();
	}
	public void clickOnDevLargeLink() {
		secondLink.click();
	}
	public void clickOnDevLarge2Link() {
		thirdLink.click();
	}
}
