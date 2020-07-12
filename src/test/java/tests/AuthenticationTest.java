package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.Browser;
import utility.UIActions;

// Test Class; test case container
public class AuthenticationTest {

    @Test
    public void PBTW_T10() {
        // Test Data
        Faker fakeData = new Faker();
        String emailAddress = fakeData.internet().emailAddress();
        String passwordPhrase = fakeData.internet().password();

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
        String erroMessageFromUI = i.element(error_text).getText();
        Browser.close();


        String expected = "There isn't an account for this email";
        boolean comparisonResult = erroMessageFromUI.equalsIgnoreCase(expected);


        Assert.assertTrue(comparisonResult);
    }


    @Test
    public void PBTW_T11() {

        Browser.open();
        Browser.close();
    }

}
