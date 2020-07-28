package testcases;


// Test Class
// Purpose of the class:
//      To group similar test cases

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LandingPage;
import pages.LoginPage;
import utility.Browser;
import utility.UIActions;

public class TrelloAuthenticationTest {

    @Test
    public void shortVersion() {
        // Test Data
        String expected = "There isn't an account for this email";

        // Test Steps
        Browser.open();
        LandingPage landingPage = new LandingPage();
        landingPage.open();
        landingPage.clickLoginLink();

        LoginPage loginPage = new LoginPage();
        loginPage.doInvalidLogin();
        String actual = loginPage.extractErrorMessage();
        Browser.close();

        // Assert
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void invalid_credential__displays_warning() {
        // Test Data
        Faker data = new Faker();
        String url = "https://trello.com/";
        String email = data.internet().emailAddress();
        String password = data.internet().password();
        String expected = "There isn't an account for this email";

        // Test Steps
        Browser.open();
        UIActions i= new UIActions();
        i.gotoSite(url);
        i.click("Log In");
        i.waitfor(1);
        By email_input = By.cssSelector("input#user");
        i.write(email_input, email);
        i.waitfor(1);
        By pass_input = By.cssSelector("input#password");
        i.write(pass_input, password);

        By login_button = By.cssSelector("input#login");
        i.click(login_button);
        i.waitfor(2);

        By error_message = By.cssSelector("div#error > .error-message");
        String actual = i.element(error_message).getText();
        Browser.close();

        // Assertions
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void invalid_credential_password_reset() {
        // Test Data
        Faker data = new Faker();
        String url = "https://trello.com/";
        String email = data.internet().emailAddress();
        String pass = data.internet().password();
        String expected = "There wasn't an account for that email";

        // Test Steps
        Browser.open();
        UIActions i= new UIActions();
        i.gotoSite(url);
        i.click("Log In");
        i.waitfor(1);

        By forgot_link = By.linkText("Can't log in?");
        i.click(forgot_link);
        i.waitfor(1);

        By recovery_email_input = By.cssSelector("input#email");
        i.write(recovery_email_input, email);
        i.waitfor(1);

        By recover_button = By.cssSelector("input#submit");
        i.click(recover_button);

        By error_message = By.cssSelector("div#error > .error-message");
        String actual = i.element(error_message).getText();
        Browser.close();

        // Assertion
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void invalid_work_credential_displays_warning() {
        // Test Data
        Faker data = new Faker();
        String url = "https://trello.com/";
        String email = data.internet().emailAddress();
        String workUsername = data.name().username();
        String expected = "This username cannot log in with SSO";


        // Test Steps
        Browser.open();
        UIActions i= new UIActions();
        i.gotoSite(url);
        i.click("Log In");
        i.waitfor(1);

        By sso_login_link = By.linkText("Log in with SSO");
        i.click(sso_login_link);
        i.waitfor(1);
        By email_input = By.cssSelector("input#user");
        i.write(email_input, email);
        i.waitfor(2);

        By sso_login_button = By.cssSelector("[value='Log in with SSO']");
        i.click(sso_login_button);
        i.waitfor(1);
        i.write(email_input, workUsername);
        i.waitfor(1);

        By login_button = By.cssSelector("input#login");
        i.click(login_button);

        By error_message = By.cssSelector("div#error > .error-message");
        String actual = i.element(error_message).getText();
        Browser.close();

        // Assertion
        Assert.assertEquals(actual, expected);
    }

}
