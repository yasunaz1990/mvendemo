package testcases;


// Test Class
// Purpose of the class:
//      To group similar test cases

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import utility.Browser;
import utility.Step;
import utility.UIActions;

public class TrelloAuthenticationTest {


    @Test
    public void invalid_credential__displays_warning() {
        //--- Test Data ---//
        String siteUrl  = "https://trello.com/";
        String email    = "nmuhtaraedvfcadsf@gmailc.om";
        String password = "password123!";
        String expected = "There is not an account for the email you have provided.";

        //--- Test Step ---//
        Browser.open();
        UIActions i = new UIActions();
        i.gotoSite(siteUrl);
        i.waitfor(1);
        i.click( By.cssSelector(".btn-link") );
        i.write( By.cssSelector("#user"),   email);
        i.write( By.cssSelector("#password"), password);
        i.waitfor(2);
        i.click( By.cssSelector("[value='Log in']") );
        String actual = i.element( By.cssSelector("div#error > .error-message") ).getText();
        Browser.close();

        //--- Test Assertion ---//
        Assert.assertEquals(actual, expected);
    }
}
