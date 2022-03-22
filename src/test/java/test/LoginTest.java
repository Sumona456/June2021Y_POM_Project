package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	

@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		
		
		
	LoginPage login = PageFactory.initElements(driver, LoginPage.class ); 	
		login.insertUserName("demo@techfios.com");	
		login.insertPassword("abc123");
		login.clickSigninButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboard();
	}
//BrowserFactory.tearDown();
}
