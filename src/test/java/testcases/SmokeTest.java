package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
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
        boolean actual = annotatePage.isConfirmationMessageDispalyed();
        Browser.close();

        // Test Assertion
        Assert.assertTrue(actual);
    }


    @Test
    public void verify_run_inference() {
        // Test Data
        // Test Steps
        Browser.open();
        LandingPage landingPage = new LandingPage();
        landingPage.open();
        landingPage.gotoHomePage();

        HomePage homePage = new HomePage();
        homePage.gotoRunPage();

        RunPage runPage = new RunPage();
        boolean actual = runPage.runPrediction();
        Browser.close();

        // Test Assertion
        Assert.assertTrue(actual);
    }


    @Test
    public void verify_pnumonia_evaluation() {
        // Test Data
        // Test Steps
        Browser.open();
        LandingPage landingPage = new LandingPage();
        landingPage.open();
        landingPage.gotoHomePage();

        HomePage homePage = new HomePage();
        homePage.gotoEvaluationPage();

        EvaluationPage evaluate = new EvaluationPage();
        boolean actual = evaluate.doEvaluateModel();
        Browser.close();

        // Test Assertion
        Assert.assertTrue(actual);
    }


    @Test
    public void verify_model_training() {
        // Test Data
        // Test Steps
        Browser.open();
        LandingPage landing = new LandingPage();
        landing.open();
        landing.gotoHomePage();

        HomePage home = new HomePage();
        home.gotoCreatePage();

        CreatePage create = new CreatePage();
        create.prepareData();
        create.configureModel();
        create.initiateTrainAndTest();
        boolean actual = create.verifyAccuracyOverview();
        Browser.close();

        // Test Assertion
        Assert.assertTrue(actual);
    }
}
