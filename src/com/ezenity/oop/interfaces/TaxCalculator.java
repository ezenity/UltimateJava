package com.ezenity.oop.interfaces;

/**
 * <b>Tightly-coupled Code example</b>
 * <p>
 * If we add a new parameter to the constructor then all its dependency classes will give a compilation
 * error and will need modification
 * <p>
 * Let's say we wanted to change the percentage of the calculateTax() method, this will require all the
 * depended on classes to be recompiled.
 */
public class TaxCalculator {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
