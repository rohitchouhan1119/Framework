package Pages;



import org.openqa.selenium.support.PageFactory;



public class BaseObject extends Base{
	
	private static WebPage webPage=null;
	private static LoginPage loginPage=null;
	private static HomePage homePage=null;
	private static InstallationPage installationPage=null;

	
	
	public void initWebPage(WebPage page) {
		PageFactory.initElements(driver, page);
	}
	
	// create getPage method for all the apages in the application
	
	public WebPage getWebPage() {
		if(webPage==null)
			webPage=new WebPage();
		initWebPage(webPage);
		return webPage;
	}
	
	public LoginPage getLoginPage() {
		if(loginPage==null)
			loginPage=new LoginPage();
		initWebPage(loginPage);
		return loginPage;
	}

	public HomePage getHomePage() {
		if(homePage==null)
			homePage=new HomePage();
		initWebPage(homePage);
		return homePage;
	}
	
	
	
	
	public InstallationPage getInstallationPage() {
		if(installationPage==null)
			installationPage=new InstallationPage();
		initWebPage(installationPage);
		return installationPage;
	}
	
	
}
