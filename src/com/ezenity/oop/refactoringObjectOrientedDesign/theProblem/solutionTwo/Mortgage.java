package com.ezenity.oop.refactoringObjectOrientedDesign.theProblem.solutionTwo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    private final byte MONTHS_IN_YEARS = 12;
    private final byte PERCENT = 100;
    private int principal;
    private float annualInterest;
    private byte years;

    /**
     * This method will calculate using two formulas to gather the total monthly payments and, the balance
     * for the loan in increments and then output the results on the console.
     */
    public void getMortgageInfo(){
        getMortgage(getPrincipal(), getAnnualInterest(), getYears());
        getMortgagePayment(getPrincipal(), getAnnualInterest(), getYears());
    }

    /**
     * This method will check to see if the correct loan amount was inputted and apply it to the
     * principal field
     *
     * @param principal Set loan amount
     */
    public void setPrincipal(int principal) {
        if (principal < 1000 || principal > 1_000_000)
            throw new IllegalArgumentException("Please enter a value between 1,000 & 1,000,000 for your principal");

        this.principal = principal;
    }

    /**
     * This method will check to see if the correct loan annual interest rate was inputted and then
     * apply it to the annualInterest field
     *
     * @param annualInterest Set loan annual interest rate
     */
    public void setAnnualInterest(float annualInterest) {
        if (annualInterest < 0)
            throw new IllegalArgumentException("Please enter a value between 1 & 30 for your annual interest rate.");

        this.annualInterest = annualInterest;
    }

    /**
     * This method will check to see if the correct amount is inputted and then apply the amount to years field
     *
     * @param years Set loan years amount
     */
    public void setYears(byte years) {
        if (years < 0)
            throw new IllegalArgumentException("Please enter a value between 1 & 30 for your loan period.");

        this.years = years;
    }

    /**
     * Gets the loan total amount wanting to use
     *
     * @return Return loan amount
     */
    private int getPrincipal() {
        return principal;
    }

    /**
     * Get the loan annual interest rate
     *
     * @return Return loan annual interest rate
     */
    private float getAnnualInterest() {
        return annualInterest;
    }

    /**
     * Get number of years for the loan
     *
     * @return Return years
     */
    private byte getYears() {
        return years;
    }

    /**
     * This method calculates the mortgage based off the given user inputs
     *
     * @param principal Get loan amount
     * @param annualInterest Get loan interest rate
     * @param years Get loan year length
     * @return Return mortgage monthly payment amount
     */
    private double calculateMortgage(int principal, float annualInterest, byte years){
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
    private double calculateMortgageBalance(int principal, float annualInterest, byte years, short mortgagePayments){
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
    private void getMortgage(int principal, float annualInterest, byte years){
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
    private void getMortgagePayment(int principal, float annualInterest, byte years){
        System.out.println("\nPAYMENT SCHEDULE\n---------------");
        for (short month = 1; month <= years * MONTHS_IN_YEARS; month++){
            double mortgageBalance = calculateMortgageBalance(principal,annualInterest,years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(mortgageBalance));
        }
    }
}
