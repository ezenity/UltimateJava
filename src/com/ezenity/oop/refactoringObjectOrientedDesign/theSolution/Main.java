package com.ezenity.oop.refactoringObjectOrientedDesign.theSolution;


/**
 * Refactoring Towards an Object-oriented Design
 *
 *
 * Project: Payment Schedule
 *
 * We will extend the Mortgage Calculator and change how we present the final out put. We will also add a new addition that will display
 * the total monthly payments left and call it "Payment Schedule".
 * <p></p>
 * This will allow us to see the balance left for each month until the loan is paid off.
 * <p></p>
 * To calculate the remain balance we want to use this formula:
 *  Source: https://www.mtgprofessor.com/formulas.htm
 *      B = L[(1 + c)^n - (1 + c)^p] / [(1 + c )^n - 1]
 *
 *      B: Balance
 *      L: Loan Amount (Principal)
 *      C: Month Interest
 *      N: Number of Payments
 *      P: Number of Payments Made
 */
public class Main {

    public static void main(String[] args){
        int principal = (int) Console.readNumber("Principal",1_000,1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate",1,30);
        byte years = (byte) Console.readNumber("Period (Years)",1,30);


        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);
        report.getMortgage();
        report.getMortgagePayment();
    }

}
