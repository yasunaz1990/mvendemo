package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UIActions;

public class LandingPage extends UIActions {
    //------ELEMENTS-------//
    private By enter_button = xpath("//div[@id='div_slideshow']//button");


    //------METHODS-------//
    public LandingPage open() {
        gotoSite("https://ailab.acr.org/");
        maximizeWindow();
        return this;
    }

    public HomePage gotoHomePage() {
        click(enter_button);
        return new HomePage();
    }
}

