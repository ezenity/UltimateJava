package com.ezenity.oop.interfaces;

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
    private TaxCalculator2018 calculator;

    public TaxReport() {
        calculator = new TaxCalculator2018(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
