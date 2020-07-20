package tests.regression;

import org.testng.annotations.Test;

public class OptionDemoTwoTest {

    @Test
    public void test20() {
        System.out.println("Test20 code");
    }

    @Test
    public void test21() {
        System.out.println("Test21 code");
    }

    @Test
    public void test22() {
        System.out.println("Test22 code");
    }

    @Test
    public void test23() {
        System.out.println("Test23 code");
    }
}

//  groups="reg"
//  groups={"smoke", "reg"}

//  mvn test -Dgroups="smoke"         invokes all the test case with group label "smoke"
//  mvn test -Dgroups="smoke", "reg"  invokes all the test cases with group lable "smoke" and "reg"

//  mvn test -Dgroups="smoke","reg"   8