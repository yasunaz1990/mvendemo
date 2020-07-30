package pages;

import org.openqa.selenium.By;
import utility.UIActions;

public class AnnotatePage extends UIActions {
    //------ELEMENTS-------//
    private By entierly_fat = css("li:nth-of-type(1) > div");
    private By next_button = css("button#nextStudyBtn");
    private By finish_button = css("button[title='Finish the contest']");
    private By confirmation_message = css("[class='pb-20'] > span:nth-of-type(1)");

    //------METHODS-------//

    public void doAnnotations(){
        click(entierly_fat);
        click(next_button);
        click(finish_button);
    }

    public boolean isConfirmationMessageDispalyed() {
        String confirmationMsg = element(confirmation_message).getText();
        boolean result = confirmationMsg.contains("Congratulations");
        return result;
    }
}
