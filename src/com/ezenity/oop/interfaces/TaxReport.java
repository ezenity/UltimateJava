package com.ezenity.oop.interfaces;

/**
 * <b>Tightly-coupled Code example</b>
 */
public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport() {
        calculator = new TaxCalculator(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
