package com.ezenity.oop.refactoringObjectOrientedDesign.theSolution;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    /**
     * This method will convert the amount to currency and out the formatted value
     */
    public void getMortgage(){
        double mortgage = calculator.calculateMortgage();

        String mortgageFormatted = currency.format(mortgage);
        System.out.println("MORTGAGE\n---------\n" + "Monthly Payment: " + mortgageFormatted);
    }

    /**
     * This method will output the remaining balance for the given loan
     *
     */
    public void getMortgagePayment(){
        System.out.println("\nPAYMENT SCHEDULE\n---------------");

        for (double mortgageBalance : calculator.getRemainingBalances())
            System.out.println(currency.format(mortgageBalance));
    }
}
