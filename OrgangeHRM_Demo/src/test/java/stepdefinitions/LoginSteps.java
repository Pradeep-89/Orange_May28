package stepdefinitions;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {

		DriverFactory.getDriver()
		.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		String hometit = homePage.getHomePageTitle();
		System.out.println("Page title is: " + hometit);
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_password(String username, String password) {
		loginPage.enterunpw(username, password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}


}


