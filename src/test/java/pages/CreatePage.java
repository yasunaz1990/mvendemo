package pages;

import org.openqa.selenium.By;
import utility.UIActions;

public class CreatePage extends UIActions {
    // List of Elements
    private By usecase_dropdown = css("select#useCases");
    private By breast_density_option = css("select#useCases > option[value='1']");
    private By trainig_data_dropdown = css("select#datapercentage");
    private By images_1000 = css("select#datapercentage > option[value='1000']");
    private By augmentation_dropdown = css("select#augmentation");
    private By none_option = css("select#augmentation > option[value='false']");
    private By start_processing_button = css("button#btnStartProcessing");




    private By accuracy_overview_text = css("div:nth-of-type(1) > .blue-100.example-title.flex-header > div");


    // List of User's Action ( methods )
    public void prepareData() {
        click(usecase_dropdown);
        click(breast_density_option);
        click(trainig_data_dropdown);
        click(images_1000);
        click(augmentation_dropdown);
        click(none_option);
        click(start_processing_button);
        waitfor(5);
    }

    public void configureModel() {

    }

    public void initiateTrainAndTest() {

    }

    public boolean verifyAccuracyOverview() {
        boolean result = element(accuracy_overview_text).isDisplayed();
        return result;
    }
}
