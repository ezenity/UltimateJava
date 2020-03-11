package com.ezenity.fundamentals.controlFlow;

import java.text.NumberFormat;
import java.util.Scanner;

public class Project {

    public static void main(String[] args){
        /*
         * Project: Mortgage Calculator
         */
        System.out.println();
        System.out.println();
        System.out.println("Project: Mortgage Calculator");
        final byte MONTHS_IN_YEARS = 12; // Constant
        final byte PERCENT = 100; // Constant
        /*
         * We declared these variables so that it can be utilized outside the while loop blocks
         */
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            /*
             * We did not use "short" type because it has a max of 32k and that is not enough.
             * If a person wanted to finance 1 million dollars this would be a problem. Since we used int
             * we can store a value up to 2 billion.
             */
            principal = scanner.nextInt();
            if (scanner.nextInt() >= 1_000 && scanner.nextInt() <= 1_000_000)
                break;
            System.out.println("Please enter an amount between $1k - $1M");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            /*
             * For the interest rate we could use double or float however, since float uses less memory and is sufficient, it is the better option.
             */
            float annualInterest = scanner.nextFloat();

            if (annualInterest >= 1 && annualInterest <= 30){
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;
                break;
            }
            /*
             * Avoid magic numbers when possible so that the next developer can understand what the variables are being used for.
             *
             * Magic numbers would be the 12 and 100 in the example below:
             *      float monthlyInterest = annualInterest / 100 / 12;
             */
            System.out.println("Enter a value greater than 0 and less than 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            /*
             * When it comes to how many years a mortgage can be obtained for, byte is the ideal option to use. Byte has a max of 127 which we will never reach will utilize a mortgage period.
             */
            byte years = scanner.nextByte();

            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEARS;
                break;
            }
            /*
             * Pretty self-explanatory.
             */
            System.out.println("Enter a value between 1 and 30.");
        }

            /*
             * Here we will use double since Float is not sufficient. The formal for the equation below is like so:
             *               r(1 + r)n
             *      M = P ----------------
             *              (1 + r)n - 1
             *
             *
             *                              monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
             *      Mortgage = Principal ----------------------------------------------------------------------
             *                                    Math.pow(1 + monthlyInterest, numberOfPayments) -1
             *
             * Keep in mind that this program is a simple example and does have a number of problems. The first problem would be input validation. To fix this problem you can use
             * conditional statements to valid the value the user is inputting.
             *
             */
            double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage: " + mortgageFormatted);
    }
}
