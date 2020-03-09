package com.ezenity.cleanCoding;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Clean Coding
 *
 * "Any fool can write code that computers can understand. Good Programmers write code that humans can understand."
 * -Martin Fowler
 *
 * This section is about how to make your code clean and readable for humans and not just computers. You will also learn
 * new techniques for changing the structure of the code and making it clean  and beautiful.
 */
public class Main {

    public static void main(String[] args){
        /*
         * Clean Coding
         *
         * As you write code, it is important to keep it clean and organized. For example your house, if it is messy and
         * full of stuff all over the place you're going to have a difficult time looking for something you're looking for.
         * However, if your house is clean and neat you will be able to find stuff easily and fast. We use this same concept
         * in coding as your program grows larger. By breaking down your code into smaller chunks it makes the program
         * easier to read and understand. Another great use for this is that it can be utilized potentially in other programs.
         * This also makes your program more maintainable and easier to extend. In the section you will learn some basics
         * on clean coding and if you would like and in depth course you make check out Mosh's other choruses he has avaialbe
         * for clean coding.
         *
         * In this section we will modify the Mortgage Calculator Project since it is messy and smelly.
         */

        /*
         * Creating Methods: Sample One
         *
         * With the course, the examples Mosh give, he made everything into one method "public static void main(){}" This is okay
         * for programs that small amounts of code like 10 lines. Anything that is more should be breaking down into different methods
         * to easily maintain it.
         */
        System.out.println("=| Creating Methods |=");
        greetUserNoValue("Anthony", "MacAllister");
        /*
         * Creating Methods: Sample Two
         *
         * Now when we call the new method that returns a String we get a new value. all we need to do is simple store it in a variable.
         */
        String creatingMethodsMessage = greetUserValue("Anthony", "MacAllister");
        System.out.println(creatingMethodsMessage);
        /*
         * Refactoring
         *
         * Definition: Changing the structure of the code without changing its behavior.
         *
         * For this example Mosh used the Mortgage Calculator to display how you should refactor your code. With the previous implementation
         * the Mortgage Calculator has about 44 lines of code. This is way too long. Typically, methods should only have about 5-10 lines of code
         * and now more than 20.
         *
         * When refactoring code, you should look for two things. One is the concepts, or the lines of code that always go together. The second is
         * what is repetitive in your code.
         *
         * Concept (Codes together)
         *      The monthly interest, and the number of payments. It is being calculated for the mortgage, and it is currently being spread all over the place
         *      even though it is being utilized for our mortgage variable. We want to bring these lines together in a separate method for calculating the mortgage.
         *
         * Repetitive Patterns
         *      The while loops are being repeated. How you ask a question is very repetitive. You have the question, then read some value, then perform data
         *      validation and if the data is invalid we type an error message. The only thing that is different is the question label, range of values, and
         *      error message.
         *
         */
        System.out.println();
        System.out.println("=| Refactoring |=");
        /*
         * Extracting Methods
         *
         *
         */
        /*
         * Project: Mortgage Calculator
         */
        System.out.println();
        System.out.println();
        System.out.println("Project: Mortgage Calculator");
        /*
         * We declared these variables so that it can be utilized outside the while loop blocks
         */
        int principal = 0;
        float annualInterest = 0;
        byte years = 0;
        /*
         * Now if you can see that the two variables below are greyed out and that is because they are no longer being used. Why, because we moved them to the calculateMortgage method
         * so, we can go and removed them but for a demo propose I will comment them out.
         */
        // float monthlyInterest = 0;
        // int numberOfPayments = 0;
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
            annualInterest = scanner.nextFloat();

            if (annualInterest >= 1 && annualInterest <= 30)
                break;
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
            years = scanner.nextByte();

            if (years >= 1 && years <= 30)
                break;
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

        /*
         * Extracting Methods
         *
         * Now we need to calculate our mortgage, so we can now call our calculateMortgage method and add the necessary parameters. Now if you can notice, we have a compilation error
         * for both annualInterest and years. Why you ask, because both of these variables are declared in our "while loops". They are not available in this code. To fix this error,
         * we need to move this deceleration to the type of the method, so it can be accessed outside the "while loop".
         *
         * Went ahead and added the appropriate variables and initialized it with a 0 value;
         *
         * In the mortgageFormatted String the "mortgage" variable returns a compilation error because we no longer have a variable available since it is now inside our Mortgage
         * Calculation method. To fix this, we need to make our calculateMortgage() method call a variable.
         */
        double mortgage = calculateMortgage(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


    }

    /*
     * Creating Methods: Sample One
     *
     * When creating a method you start it with an "Access Modifier", Then static or nothing, then return type, then method name, then
     * parameters() and finally body {}
     *
     * Access Modifiers
     *      public
     *      private
     *      protected
     *
     * Static: is a method that belongs to a class and not an object.
     *
     * Return Type
     *      void: States that this method does not return values.
     *
     */
    public static void greetUserNoValue(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);

    }

    /*
     * Creating Methods: Sample Two
     *
     * What if our method returns a value. First change the return type from void to the value type, in our case it is String. Then add a return statement in front
     * of the String you want to return.
     */
    public static String greetUserValue(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;
    }

    /*
     * Extracting Methods
     *
     * Here we are going to create a method for calculating the mortgage. Since our Mortgage variable is a double that is what we will make our method return type. To
     * make this a functional method we need to add parameters. We need principle, annual interest (Better than monthly interest, since we calculated the monthly
     * interest from the annual interest), and finally number of years(Once we have the number of years, we can calculate the number of payments).
     *
     * We jsut now copied the mortgage variable to this method, but you can see that the monthlyInterest & numberOfPayments variables have a compilation error.
     * To fix this we need to get the proper variables from the main method.
     *
     * Now that we moved the numberOfPayments variable to this method we cleaned up our while loop and make the validation check cleaner. Now our numberOfPayments
     * variable has a new compilation error "MONTHS_IN_YEARS". Since we defined this constant in our main method we also need to define it in our calculateMortgage method.
     *
     * We had two constants in our main method and since we use both of these constants in the calculation of our mortgage, we went ahead and moved both to this method.
     *
     * Now we only have one compilation error left, the monthlyInterest. So we went ahead and copied it from our main method and cleaned up the code for the validation statement.
     *
     * Once we have all the necessary code, we can return the calculation.
     *
     * Now if you look we have all the logic in one place. Previously it was spread all over the place in different loops inside the main method. We also could not reuse this logic.
     * Now tomorrow if we made a new program and needed to calculate a mortgage we can do so without needing to cherry pick the line of code and paste them into that new program.
     *
     *
     */
    public static double calculateMortgage(int principal, float annualInterest, byte years){
        final byte MONTHS_IN_YEARS = 12; // Constant
        final byte PERCENT = 100; // Constant
        /*
         * Mosh noticed an error with creating the numberOfPayments. We do not need a float here and instead we could use a "short" type. However, we do receive an compilation error.
         * Why, because by default the expression is an integer. To fix this issue, we need to cast the results to a "short".
         *
         * However, once we applied short in the beginning of the expression we still receive a compilation error. This is because the short is only being casted to years and not
         * the entire expression. To fix this we need to wrap our expression in () and then cast the short to the ().
         *
         */
        short numberOfPayments = (short) (years * MONTHS_IN_YEARS);
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

}
