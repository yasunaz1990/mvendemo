package lab;


// Nijat
public class TaxReport {

    // Constructor Injection:
    // Ask from Constructor
    public TaxReport(){

    }

    // Method Dependency Injection
    public void showReport(TaxCalculator calcu){
        double owe = calcu.calculateTax();
        System.out.println("You'r tax was:" + owe);
    }
}
