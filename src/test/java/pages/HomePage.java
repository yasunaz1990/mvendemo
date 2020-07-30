package pages;

import org.openqa.selenium.By;
import utility.UIActions;

public class HomePage extends UIActions {
    //------ELEMENTS-------//
    private By welcome_banner = css(".col-md-12.mt-10 h1");
    private By start_learning_button = css("button#btnLearn");
    private By annoate_tab = css("li:nth-of-type(4) > .nav-button-wrapper > .site-menu-title");
    private By run_tab = xpath("//span[text()='Run']");



    //------METHODS-------//
    public boolean isDisplayed() {
        boolean result = element(welcome_banner).isDisplayed();
        return result;
    }

    public void gotoLearnPage() {
        click(start_learning_button);
    }

    public void gotoAnnoatePage() {
        click(annoate_tab);
    }

    public void gotoRunPage() {
        click(run_tab);
    }
}
