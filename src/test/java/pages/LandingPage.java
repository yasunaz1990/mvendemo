package pages;

import org.openqa.selenium.By;
import utility.UIActions;

public class LandingPage extends UIActions {

    // Fields -- Elements
    private By login_link = By.linkText("Log In");



    // Methods -- User's action
    public void open() {
        gotoSite("https://trello.com/");
    }


    public void clickLoginLink() {
        click(login_link);
    }
}

