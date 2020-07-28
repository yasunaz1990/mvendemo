package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import utility.UIActions;

public class LoginPage extends UIActions {

    // Fields -- elements
    private By email_input = By.cssSelector("input#user");
    private By pass_input = By.cssSelector("input#password");
    private By login_button = By.cssSelector("input#login");
    private By error_message = By.cssSelector("div#error > .error-message");

    // Methods -- User's action
    public void doInvalidLogin() {
        Faker data = new Faker();
        String email = data.internet().emailAddress();
        String password = data.internet().password();
        write(email_input, email);
        waitfor(1);
        write(pass_input, password);
        waitfor(1);
        click(login_button);
    }

    public String extractErrorMessage() {
        String actual = element(error_message).getText();
        return actual;
    }

}
