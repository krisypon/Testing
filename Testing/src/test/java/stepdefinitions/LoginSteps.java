package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import po.po;

public class LoginSteps {
	private WebDriver driver;
	static po LoginPage;;

	public LoginSteps() {
		this.driver = Hooks.driver;
		LoginPage = PageFactory.initElements(Hooks.driver, po.class);
	}

	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() {
		driver.get("http://www.demoshop24.com/index.php?route=account/login");
	}

	// @When("I login as a user")
	// public void i_login_as_a_user() {
	// LoginPage.login();
	// }

	@When("I login as a user")
	public void i_login_as_a_user(List<Map<String, String>> list) {
		for (int i = 0; i < list.size(); i++) {
			LoginPage.getEmail(list.get(i).get("Email"));
			LoginPage.getPass(list.get(i).get("Password"));
			LoginPage.loginbutton.click();
			if (i + 1 != list.size()) {
				assertEquals(driver.getCurrentUrl(), "http://www.demoshop24.com/index.php?route=account/account");
				driver.get("http://www.demoshop24.com/index.php?route=account/logout");
				driver.get("http://www.demoshop24.com/index.php?route=account/login");
			}
		}
	}

	@Then("I am on account page")
	public void i_am_on_account_page() {
		assertEquals(driver.getCurrentUrl(), "http://www.demoshop24.com/index.php?route=account/account");
	}

	@Given("I am on the registration page")
	public void i_am_on_the_registration_page() {
		driver.get("http://www.demoshop24.com/index.php?route=account/register");
	}

	@When("I fill the form")
	public void i_fill_the_form() {
		LoginPage.register();
	}

	@Then("I am registred as new user")
	public void i_am_registred_as_new_user() {
		assertEquals(driver.getCurrentUrl(), "http://www.demoshop24.com/index.php?route=account/success");
	}

	@When("I leave blank field with *")
	public void i_leave_blank_field_with() {
		LoginPage.NoFName();
		assertEquals(driver.getCurrentUrl(), "http://www.demoshop24.com/index.php?route=account/register");
		LoginPage.NoLName();
		assertEquals(driver.getCurrentUrl(), "http://www.demoshop24.com/index.php?route=account/register");
		LoginPage.NoEmail();
		assertEquals(driver.getCurrentUrl(), "http://www.demoshop24.com/index.php?route=account/register");
		LoginPage.NoPhone();
		assertEquals(driver.getCurrentUrl(), "http://www.demoshop24.com/index.php?route=account/register");
		LoginPage.NoPassword();
		assertEquals(driver.getCurrentUrl(), "http://www.demoshop24.com/index.php?route=account/register");
		LoginPage.NoConfirm();
		assertEquals(driver.getCurrentUrl(), "http://www.demoshop24.com/index.php?route=account/register");
	}

	@When("I do not agree with Privacy Policy")
	public void i_do_not_agree_with_Privacy_Policy() {
		LoginPage.NoAgree();
	}

	@Then("I am not registred as new user")
	public void i_am_not_registred_as_new_user() {
		assertEquals(driver.getCurrentUrl(), "http://www.demoshop24.com/index.php?route=account/register");
	}

	@When("I fill the form with short password")
	public void i_fill_the_form_with_short_password() {
		LoginPage.ShortPassword();
	}

	@When("I fill the form with long password")
	public void i_fill_the_form_with_long_password() {
		LoginPage.LongPassword();
	}
}
