package lab;

import org.openqa.selenium.By;
import utility.Browser;
import utility.UIActions;

public class TrelloSignUp {

    public static void main(String[] args) {

        // Open a browser
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

        if(isDisplayedOrNot == true) {
            System.out.println("Test has passed, we are on Sign Up page");
        }
        else {
            System.out.println("Test has failed");
        }

        Browser.close();
    }


}
