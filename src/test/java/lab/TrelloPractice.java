package lab;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import utility.Browser;
import utility.UIActions;

public class TrelloPractice {

    public static void main(String[] args) {

        Faker faker = new Faker();
        String fakeCardNumber = faker.business().creditCardNumber();  // method, object creation changes
        System.out.println(fakeCardNumber);


        Browser.open();    // Chrome browser being open

        UIActions i = new UIActions();
        i.gotoSite("https://trello.com/");
        i.waitfor(3);

        // By:  represent element location information on DOM
     //   By login_button = By.xpath("//a[text()='Log In']");
        By login_button = By.linkText("Log In");
        i.click(login_button);
        i.waitfor(5);


        Browser.close();

    }
}