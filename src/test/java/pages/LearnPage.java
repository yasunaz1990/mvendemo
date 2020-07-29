package pages;

import org.openqa.selenium.By;
import utility.UIActions;

public class LearnPage extends UIActions  {

    //------ELEMENTS-------//
    private By learn_ai_banner = css("[class='ml-35']");

    //------METHODS-------//
    public boolean isPageDisplayed() {
        boolean result = element(learn_ai_banner).isDisplayed();
        return result;
    }

}
