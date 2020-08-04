package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import pages.*;
import org.testng.asserts.SoftAssert;
import pages.*;
import utility.Browser;

public class SmokeTest {


    @Test(enabled = false)
    public void verify_homepage() {
        // Test Data
        System.out.printf("Hey Jenkins fam, test is indeed running");
        // Test Steps
        Browser.open();
        boolean actual = new LandingPage()
                .open()
                .gotoHomePage()
                .isDisplayed();
        Browser.close();
        // Test Assertion
        Assert.assertTrue(actual);
    }


    @Test(enabled = false)
    public void verify_learn_page_is_accessible() {
        // Test Data
        // Test Steps
        LandingPage landingPage = new LandingPage();
        landingPage.open();
        landingPage.gotoHomePage();

        HomePage homePage = new HomePage();
        homePage.gotoLearnPage();

        LearnPage learnPage = new LearnPage();
        boolean actual = learnPage.isPageDisplayed();

        // Test Assertion
        Assert.assertTrue(actual);
    }



    @Test(enabled = false)
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


    @Test(enabled = false)
    public void verify_create_model() {
       // Test Data
        // Test Steps
        // Assertion
        SoftAssert sAssert = new SoftAssert();
        sAssert.assertEquals(110, 10);
        sAssert.assertEquals(10, 10);
        sAssert.assertEquals("word", "world");
        sAssert.assertAll();
    }


    @Test(enabled = false)
    public void verify_create_model_e2e() {
        //..your test code here
    }

}
