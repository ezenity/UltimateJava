package com.ezenity.oop.refactoringObjectOrientedDesign.theProblem.solutionTwo;

/**
 * Refactoring to an Object-oriented Design
 *
 * This section, we are going to look at some hardcoding techniques.
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
        // int principal = (int) readNumber("Principal",1_000,1_000_000);
        // float annualInterest = (float) readNumber("Annual Interest Rate",1,30);
        // byte years = (byte) readNumber("Period (Years)",1,30);

        // getMortgage(principal,annualInterest,years);
        // getMortgagePayment(principal,annualInterest,years);

        // Principal, Interest Rate, Years
        //var mortgage = new Mortgage(200_000, 4, (byte) 30);
        var mortgage = new Mortgage();
        mortgage.setPrincipal(200_000);
        mortgage.setAnnualInterest((float) 3.92);
        mortgage.setYears((byte) 30);

        mortgage.getMortgageInfo();

    }
}
