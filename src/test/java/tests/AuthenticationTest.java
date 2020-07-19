package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.Browser;
import utility.UIActions;

// Test Class; test case container
public class AuthenticationTest {

    @Test(enabled = false)
    public void PBTW_T10() {
        // ========== Test Data ============== //
        Faker fakeData = new Faker();
        String emailAddress = fakeData.internet().emailAddress();
        String passwordPhrase = fakeData.internet().password();
        String expected = "There isn't an account for this email hahahahah";

        // ========== Test Steps ============== //
        // Open a browser
        Browser.open();
        UIActions i = new UIActions();
        i.gotoSite("https://trello.com");
        i.maximizeWindow();


        // Clicking Log In link
        By login_link = By.linkText("Log In");
        i.click(login_link);


        // Enter username
        By email_input = By.cssSelector("input#user");
        i.write(email_input, emailAddress);
        i.waitfor(1);


        // Enter password
        By passord_input = By.cssSelector("input#password");
        i.write(passord_input, passwordPhrase);
        i.waitfor(1);

        // Click Login button
        By login_button = By.cssSelector("input#login");
        i.click(login_button);


        // Extract that Error message
        By error_text = By.cssSelector("div#error > p");    // By: location
        String actual = i.element(error_text).getText();
        Browser.close();

        //=========== Test Assertions =============//
        Assert.assertEquals(actual, expected);
    }


    @Test(enabled = false)
    public void PBTW_T11() {

        Browser.open();
        UIActions i = new UIActions();

        i.gotoSite("https://trello.com");
        i.maximizeWindow();
        i.waitfor(1);

        // click sign up button
        By signUp_button =  By.linkText("Sign Up");
        i.click(signUp_button);
        i.waitfor(1);

        // provide an email address
        By email_input = By.id("email");
        i.write(email_input, "nijat@alphaleaftech.com");
        i.waitfor(1);

        // click continue button
        By continue_button = By.id("signup-submit");
        i.click(continue_button);
        i.waitfor(1);

        // Sign Up button exist
        By signup_blue_button = By.cssSelector("button#signup-submit");
        boolean isDisplayedOrNot = i.element(signup_blue_button).isDisplayed();
        Browser.close();


        Assert.assertTrue(isDisplayedOrNot);

    }

}


// 1.  Create a TEST CLASS: class with ~Test postfix
// 2.  Create a method:     public void methodName()
// 3.  Label your method with @Test