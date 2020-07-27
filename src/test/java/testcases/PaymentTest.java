package testcases;

import org.testng.annotations.Test;

public class PaymentTest {


    @Test(groups = {"smoke","reg"})
    public void validate_card() {
        System.out.println("validate_card");
    }


   //@Test(groups = {"smoke","regression"})
    public void valid_card_payment() {
        //....
    }


    @Test(groups = "smoke", dependsOnMethods= "validate_card")
    public void invalid_card_payment() {

    }
}
