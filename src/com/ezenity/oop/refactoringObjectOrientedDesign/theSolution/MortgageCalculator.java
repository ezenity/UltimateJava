package com.ezenity.oop.refactoringObjectOrientedDesign.theSolution;

public class MortgageCalculator {
    private final static byte MONTHS_IN_YEARS = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    /**
     * This method calculates the mortgage based off the given user inputs
     *
     * @return Return mortgage monthly payment amount
     */
    public double calculateMortgage(){
        float numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    /**
     * This method will calculate the mortgage balance
     *
     * @param mortgagePayments Get loan payment month
     * @return Return mortgage balance
     */
    public double calculateMortgageBalance(short mortgagePayments){
        float numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();

        double mortgageBalance = principal
                * ( (Math.pow(1 + monthlyInterest,numberOfPayments)) - (Math.pow(1 + monthlyInterest, mortgagePayments)) )
                / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1);

        return mortgageBalance;
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];

        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateMortgageBalance(month);

        return balances;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEARS;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEARS;
    }
}
