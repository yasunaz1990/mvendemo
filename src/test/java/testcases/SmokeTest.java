package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnnotatePage;
import pages.HomePage;
import pages.LandingPage;
import pages.LearnPage;
import utility.Browser;

public class SmokeTest {


    @Test
    public void verify_homepage() {
        // Test Data
        // Test Steps
        Browser.open();
        LandingPage landingPage = new LandingPage();
        landingPage.open();
        landingPage.gotoHomePage();

        HomePage homePage = new HomePage();
        boolean actual = homePage.isDisplayed();
        Browser.close();

        // Test Assertion
        Assert.assertTrue(actual, "Home page is not displayed, investigate");
    }


    @Test
    public void verify_learn_page_is_accessible() {
        // Test Data
        // Test Steps
        Browser.open();
        LandingPage landingPage = new LandingPage();
        landingPage.open();
        landingPage.gotoHomePage();

        HomePage homePage = new HomePage();
        homePage.gotoLearnPage();

        LearnPage learnPage = new LearnPage();
        boolean actual = learnPage.isPageDisplayed();
        Browser.close();

        // Test Assertion
        Assert.assertTrue(actual);
    }



    @Test
    public void verify_annoation() {
        Browser.open();
        LandingPage landingPage = new LandingPage();
        landingPage.open();
        landingPage.gotoHomePage();

        HomePage homePage = new HomePage();
        homePage.gotoAnnoatePage();

        AnnotatePage annotatePage = new AnnotatePage();
        annotatePage.doAnnotations();
    }

}
