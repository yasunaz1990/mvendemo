package pages;

import org.openqa.selenium.By;
import utility.UIActions;

public class RunPage extends UIActions {
    //------ELEMENTS-------//
    private By secon_img = css("#imageList div:nth-of-type(2) .lazyloaded");
    private By run_prediction_button = css("button#btnPredictionModelDesktop");
    private By prediction_result = xpath("//h5/span[text()='Report Text']");


    //------METHODS-------//
    public boolean runPrediction() {
        click(secon_img);
        click(run_prediction_button);
        return element(prediction_result).isDisplayed();
    }
}
