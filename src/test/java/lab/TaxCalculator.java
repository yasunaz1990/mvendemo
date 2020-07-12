package lab;

// Zoey: Provider
public class TaxCalculator {

    private double taxableIncome;


    public TaxCalculator(int year) {
        taxableIncome = 200000;
    }

    /**
     * Very sophisticated method
     * that calculates complex tax
     * @return
     */
    public double calculateTax() {
        return taxableIncome * 0.30;
    }
}
