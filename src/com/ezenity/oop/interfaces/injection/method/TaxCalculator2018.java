package com.ezenity.oop.interfaces.injection.method;

/**
 * <b>Tightly-coupled Code example</b>
 * <p>
 * If we add a new parameter to the constructor then all its dependency classes will give a compilation
 * error and will need modification
 * <p>
 * Let's say we wanted to change the percentage of the calculateTax() method, this will require all the
 * depended on classes to be recompiled.
 */
public class TaxCalculator2018 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    /**
     * This method has the '@Override' annotation to inform the java compiler that this is an
     * overriding method from the 'TaxCalculator' interface. The benefits of adding this annotation is that
     * if we would to remove this method from the interface it will inform developers that this method
     * is no longer available within that interface.
     *
     * This method will calculate the tax for 2018 for 30%
     *
     * @return Return taxable income.
     */
    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
