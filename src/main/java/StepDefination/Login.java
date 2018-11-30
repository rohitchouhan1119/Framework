package StepDefination;




import org.apache.log4j.Logger;
import org.junit.Assert;

import Pages.BaseObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class Login extends BaseObject{
	
	private static final String ERROR_MESSAGE="Invalid username/password pair";
	
	private static Logger log=Logger.getLogger("MyLogger");
	
	@Given("^gmail app login page is open$")
	public void gmail_app_login_page_is_open() throws Throwable {
		log.debug("opening URL");
	
	getWebPage().openURL();
	
	}

	@When("^I enter \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$")
	public void i_enter_UserName_and_password(String UserName,String password) throws Throwable {
		log.debug("Entering credential");
		getLoginPage().enterUserName(UserName);
		getLoginPage().enterPassword(password);
	    
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		log.debug("click on login");
	    getLoginPage().clickLoginButton();
	    
	    
	}
	@Then("^installation page is opened$")
	public void installation_page_is_opened() throws Throwable {
		log.debug("opening installation page");
		getInstallationPage().clickOnDevLargeLink();
	}
	
	@Then("^dashboard text is displayed$")
	public void dashboard_text_is_displayed() throws Throwable {
		log.debug("opening dashboard page");
	    String text=getHomePage().getDashboardText();
	    
	    Assert.assertTrue(text.toLowerCase().contains("dashboard"));
	}
	@Then("^click on logout button$")
	public void click_on_logout_button() throws Throwable {
		log.debug("click on logout ");
	    getHomePage().clickOnLogout();
	    closeWindow();
	}
	@Then("^warning message is dispalyed$")
	public void warning_message_is_dispalyed() throws Throwable {
		
		String message=getLoginPage().getWarningMessage();
	   System.out.println(message);
	   Assert.assertEquals(message,ERROR_MESSAGE);
	   log.debug("Warning Message is displayed : "+message);
	   closeWindow();
	}
	
}
