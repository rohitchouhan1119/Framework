package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends WebPage{
	
	
	@FindBy(css="input[id='username']")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(name="login")
	public WebElement loginButton;
	

		
	@FindBy(id="loginError")
	public WebElement warningText;
	

	public void enterUserName(String text) {
		username.sendKeys(text);
	}
	public void enterPassword(String text) {
		password.sendKeys(text);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public String getWarningMessage() {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		String text=wait.until(ExpectedConditions.elementToBeClickable(By.id("loginError"))).getText();
		//=warningText.getText();
		return text;
	}
}
