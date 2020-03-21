package com.ezenity.oop.interfaces;

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
 */
public class Main {

    public static void main(String[] args) {
        /*
         * This is what's called a 'Poor mans dependency injections'
         *
         * If we had say 1k classes with these types of injections, it'll make your program
         * ugly and hard to maintain. There is a framework that fixes this issue, and the
         * framework is called 'Spring'.
         */
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
    }
}
