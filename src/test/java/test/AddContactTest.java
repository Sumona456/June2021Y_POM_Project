package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	WebDriver driver;
	
@Test

public void valisUserShouldBeAbleToAddCustomers() {
	
	driver = BrowserFactory.init();	
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	login.insertUserName("demo@techfios.com");
	login.insertPassword("abc123");
	login.clickSigninButton();
	
	DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
	dashboard.verifyDashboard();
	dashboard.clickCustomerButton();
	dashboard.clickAddCustomerButton();
	
	AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
	addContactPage.insertFullName("TestNg");
	addContactPage.selectCompany("Techfios");
	addContactPage.insertEmail("abc234@techfios,com");
	addContactPage.insertPhone("35252523");
	//addContactPage.insertAddress(address);
	//addContactPage.insertCity(city);
	//addContactPage.insertState(state);
	//addContactPage.selectZip(zip);
	addContactPage.selectCountry("Angola");
	//addContactPage.clickOnSubmitButton();
}
}	

