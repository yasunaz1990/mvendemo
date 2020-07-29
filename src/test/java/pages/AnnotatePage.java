package pages;

import org.openqa.selenium.By;
import utility.UIActions;

public class AnnotatePage extends UIActions {
    //------ELEMENTS-------//
    private By entierly_fat = css("li:nth-of-type(1) > div");
    private By next_button = css("button#nextStudyBtn");
    private By finish_button = css("button[title='Finish the contest']");

    //------METHODS-------//

    public void doAnnotations(){
        click(entierly_fat);
        click(next_button);
        click(finish_button);
    }
}
