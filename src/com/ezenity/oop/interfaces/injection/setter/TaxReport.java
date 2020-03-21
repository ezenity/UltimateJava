package com.ezenity.oop.interfaces.injection.setter;

/**
 * <b>Tightly-coupled Code example</b>
 * <p>
 * <b>Dependency Injection</b>
 * <p>
 * In this class we are instantiating the calculator but, we want to create what is called
 * "Separation of Concerns". We want to give the roll of creating the TaxCalculator2018 to another class
 * and make the report class a calculator object. We call this dependency injection. A few ways
 * to inject a dependency is:
 * <lu>
 *     <li>Constructor Injection</li>
 *     <li>Setter Injection</li>
 *     <li>Method Injection</li>
 * </lu>
 */
public class TaxReport {
//    private TaxCalculator2018 calculator; // Concrete implementations of a calculator
    private TaxCalculator calculator;

    /**
     * This method is an example of 'constructor injection'.
     *
     * @param calculator
     */
    public TaxReport(TaxCalculator calculator) {
//        calculator = new TaxCalculator2018(100_000);
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    /**
     * This method is an example of the 'Setter Injection'. The benefit of this type of injection
     * is that we can change the dependencies throughout the lifetime of our program.
     *
     * @param calculator
     */
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
