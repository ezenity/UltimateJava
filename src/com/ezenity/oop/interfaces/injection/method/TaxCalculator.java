package com.ezenity.oop.interfaces.injection.method;

/**
 * <b>Creating an Interface</b>
 * <p>
 * This interface will determine what will need to be done. The methods will not have any code but
 * only declarations. Also, it is redundant to apply the public access modifier since each method
 * declared here will need to be accessed by other methods, so we can remove the 'public' access
 * modifier.
 */
public interface TaxCalculator {
    double calculateTax();
}
