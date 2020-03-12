package com.ezenity.oop.refactoringObjectOrientedDesign.theSolution;

import java.text.NumberFormat;

public class MortgageReport {
    /**
     * This method will convert the amount to currency and out the formatted value
     *
     * @param principal Get loan amount
     * @param annualInterest  Get loan interest rate
     * @param years Get loan year length
     */
    public static void getMortgage(int principal, float annualInterest, byte years){
        double mortgage = Main.calculateMortgage(principal, annualInterest, years);
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
    public static void getMortgagePayment(int principal, float annualInterest, byte years){
        System.out.println("\nPAYMENT SCHEDULE\n---------------");
        for (short month = 1; month <= years * Main.MONTHS_IN_YEARS; month++){
            double mortgageBalance = Main.calculateMortgageBalance(principal,annualInterest,years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(mortgageBalance));
        }
    }
}
