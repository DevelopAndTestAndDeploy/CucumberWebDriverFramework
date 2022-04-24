package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Base_PO;
import pageObject.Login_PO;


public class Login_Steps extends Base_PO {

    private Login_PO login_po;

    public Login_Steps(Login_PO login_po) {
        this.login_po = login_po;

    }

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        login_po.navigateToWebDriverUniversity_Login_Page();
    }

    @When("I enter a username {}")
    public void i_enter_the_a_username(String username) {

        login_po.setUserName(username);
    }


    @And("I enter a password {}")
    public void i_enter_a_password(String password) {

        login_po.setPassword(password);
    }


    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        login_po.clickOn_Login_Button();

    }

    @Then("I should be presented with a successful login message")
    public void i_should_be_presented_with_a_successful_login_message() {
        login_po.validate_SuccessfulLogin_Message();
    }


    @Then("I should be presented with an unsuccessful login message")
    public void i_should_be_presented_with_an_unsuccessful_login_message() {
        login_po.validate_UnsuccessfulLogin_Message();
    }


    @Then("I should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message(String expectedMessage) {
        waitForAlert_And_ValidateText(expectedMessage);

    }


}
