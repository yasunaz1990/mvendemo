package pages;

import org.openqa.selenium.By;
import utility.UIActions;

public class EvaluationPage extends UIActions {
    //------ELEMENTS-------//
    private By usecase_dropdown = css("select#useCases");
    private By pneumonia_option = css("select#useCases > option[value='3']");
    private By dataset_dropdown = css("select#useCaseSelect");
    private By mysite_dataset = css("[value='My Site - Pneumonia Dataset']");
    private By pneumonia_model = xpath("//span[text()='Pneumonia Model from Company 1']");
    private By evaluate_models_button = xpath("//button[text()='Evaluate Models']");
    private By evaluation_result_text = xpath("//div[contains(text(), 'AUC')]");

    //------METHODS-------//
    public boolean doEvaluateModel() {
        click(usecase_dropdown);
        click(pneumonia_option);
        click(dataset_dropdown);
        click(mysite_dataset);
        click(pneumonia_model);
        click(evaluate_models_button);
        return element(evaluation_result_text).isDisplayed();
    }
}
