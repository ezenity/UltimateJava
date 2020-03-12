package com.ezenity.oop.refactoringObjectOrientedDesign.theSolution;


import java.text.NumberFormat;

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
    final static byte MONTHS_IN_YEARS = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args){
        int principal = (int) Console.readNumber("Principal",1_000,1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate",1,30);
        byte years = (byte) Console.readNumber("Period (Years)",1,30);

        getMortgage(principal,annualInterest,years);
        getMortgagePayment(principal,annualInterest,years);
    }

    /**
     * This method calculates the mortgage based off the given user inputs
     *
     * @param principal Get loan amount
     * @param annualInterest Get loan interest rate
     * @param years Get loan year length
     * @return Return mortgage monthly payment amount
     */
    public static double calculateMortgage(int principal, float annualInterest, byte years){
        short numberOfPayments = (short) (years * MONTHS_IN_YEARS);
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    /**
     * This method will calculate the mortgage balance
     *
     * @param principal Get loan amount
     * @param annualInterest Get loan annual interest rate
     * @param years Get loan year length
     * @param mortgagePayments Get loan payment month
     * @return Return mortgage balance
     */
    public static double calculateMortgageBalance(int principal, float annualInterest, byte years, short mortgagePayments){
        short numberOfPayments = (short) (years * MONTHS_IN_YEARS);
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;

        double mortgageBalance = principal
                * ( (Math.pow(1 + monthlyInterest,numberOfPayments)) - (Math.pow(1 + monthlyInterest, mortgagePayments)) )
                / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1);

        return mortgageBalance;
    }

    /**
     * This method will convert the amount to currency and out the formatted value
     *
     * @param principal Get loan amount
     * @param annualInterest  Get loan interest rate
     * @param years Get loan year length
     */
    private static void getMortgage(int principal, float annualInterest, byte years){
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MORTGAGE\n---------" + mortgageFormatted);
    }

    /**
     * This method will output the remaining balance for the given loan
     *
     * @param principal Get loan amount
     * @param annualInterest Get loan interest rate
     * @param years Get loan year length
     */
    private static void getMortgagePayment(int principal, float annualInterest, byte years){
        System.out.println("\nPAYMENT SCHEDULE\n---------------");
        for (short month = 1; month <= years * MONTHS_IN_YEARS; month++){
            double mortgageBalance = calculateMortgageBalance(principal,annualInterest,years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(mortgageBalance));
        }
    }
}
