package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends WebPage{

	
	@FindBy(id="ui-id-1")
	public WebElement home;
	
	@FindBy(id="ui-id-2")
	public WebElement tab1;
	
	@FindBy(id="ui-id-3")
	public WebElement tab2;
	
	@FindBy(id="ui-id-4")
	public WebElement tab3;
	
	@FindBy(id="ui-id-5")
	public WebElement tab4;
	
	@FindBy(css="a[title='Logout']")
	public WebElement logoutButton;

	@FindBy(css="a[title='Inbox']")
	public WebElement inboxTab;
	
	
	
	public void clickOnLogout() {
		logoutButton.click();
	}
	public String getDashboardText(){
		String text=driver.findElement(By.className("sectionHeaderDash")).getText();
		return text;
	}
	public void clickOnPatientsTab() {
		inboxTab.click();
	}
	
	
}
