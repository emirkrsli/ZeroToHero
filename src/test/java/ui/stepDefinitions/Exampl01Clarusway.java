package ui.stepDefinitions;

import io.cucumber.java.en.*;
import ui.exceptions.InvalidDriverException;
import ui.pages.ClaruswayUiTest01.LoggedPage;
import ui.pages.ClaruswayUiTest01.LoginPageClaruswayExample01;
import utilities.Driver;

public class Exampl01Clarusway {


//    Test Case1: Positive Login Test
//    Open page https://practicetestautomation.com/practice-test-login/
//    Type username student into Username field
//    Type password Password123 into Password field
//    Puch Submit button.
//    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
//    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
//    Verify button Log out is displayed on the new page.

    LoginPageClaruswayExample01 loginPageClaruswayExample01 = new LoginPageClaruswayExample01();
    LoggedPage loggedPage = new LoggedPage();
    public Exampl01Clarusway() throws InvalidDriverException {
    }

    @Given("Open page https:\\/\\/practicetestautomation.com\\/practice-test-login\\/")
    public void open_page_https_practicetestautomation_com_practice_test_login() throws InvalidDriverException {
        Driver.getDriver().get("https://practicetestautomation.com/practice-test-login/");

    }
    @Given("Type {string} student into Username field")
    public void type_student_into_username_field(String string) {
        loginPageClaruswayExample01.sendUsername(string);

    }
    @When("Type {string} Password123 into Password field")
    public void type_password123_into_password_field(String string) {
        loginPageClaruswayExample01.sendPassword(string);
    }
    @When("Puch Submit button.")
    public void puch_submit_button() {
        loginPageClaruswayExample01.clickSubmitButton();
    }
    @Then("Verify new page URL contains practicetestautomation.com\\/logged-in-successfully\\/")
    public void verify_new_page_url_contains_practicetestautomation_com_logged_in_successfully() {
        loggedPage.AssertSuscces();
    }
    @Then("Verify new page contains expected text \\({string} or {string})")
    public void verify_new_page_contains_expected_text_or(String string, String string2) {
    loggedPage.AssertenMassege();
        System.out.println("Congratulations");
    }
    @Then("Verify button Log out is displayed on the new page.")
    public void verify_button_log_out_is_displayed_on_the_new_page() {


    }



}
