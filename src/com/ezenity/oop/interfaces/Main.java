package com.ezenity.oop.interfaces;

import com.ezenity.oop.interfaces.injection.constructor.TaxCalculator2018;
import com.ezenity.oop.interfaces.injection.constructor.TaxReport;
import com.ezenity.oop.interfaces.injection.method.TaxCalculator;
import com.ezenity.oop.interfaces.injection.setter.TaxCalculator2019;

/**
 * Interfaces
 * <p>
 * This section talks about:
 * <ul>
 *     <li>What interfaces are?</li>
 *     <ul>
 *         <li>
 *             We use interfaces to build loosely-coupled, extensible, testable applications. Some examples are:
 *             <ul>
 *                 <li>Data Compression</li>
 *                 <li>Encryption</li>
 *                 <li>Sorting</li>
 *                 <li>Searching</li>
 *             </ul>
 *         </li>
 *         <li>
 *             Contains method declarations with no implementations (has no code)
 *         </li>
 *     </ul>
 *     <li>Why we need interfaces</li>
 *     <li>How to use interfaces "properly"</li>
 *     <li>Dependency Injection</li>
 *     <lu>
 *         <li>
 *             Our classes should not instantiate their dependencies.
 *         </li>
 *     </lu>
 * </ul>
 * <b>Interface Segregation Principle</b>
 * <lu>
 *     <li>Divide big interfaces into smaller ones</li>
 * </lu>
 */
public class Main {

    public static void main(String[] args) {
        /*
         * CONSTRUCTOR INJECTION
         *
         * This is what's called a 'Poor mans dependency injections'
         *
         * If we had say 1k classes with these types of injections, it'll make your program
         * ugly and hard to maintain. There is a framework that fixes this issue, and the
         * framework is called 'Spring'.
         */
        var calculatorConstructor = new TaxCalculator2018(100_000);
        var reportConstructor = new TaxReport(calculatorConstructor);


        /*
         * SETTER INJECTION
         */
        var calculatorSetter = new com.ezenity.oop.interfaces.injection.setter.TaxCalculator2018(100_000);
        var reportSetter = new com.ezenity.oop.interfaces.injection.setter.TaxReport(calculatorSetter);
        reportSetter.show();

        /*
         * This is an example of the setter injection. This is a more common approach to injecting using
         * the setter feature.
         */
        reportSetter.setCalculator(new TaxCalculator2019());
        reportSetter.show();

        /*
         * METHOD INJECTION
         */
        var calculatorMethod = new com.ezenity.oop.interfaces.injection.method.TaxCalculator2018(100_000);
        var reportMethod = new com.ezenity.oop.interfaces.injection.method.TaxReport();
        reportMethod.show(calculatorMethod);
        reportMethod.show(new com.ezenity.oop.interfaces.injection.method.TaxCalculator2019());


    }
}
