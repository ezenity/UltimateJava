package com.ezenity.controlFlow;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Summary
 * <p>
 * How to control the flow and execution of your programs
 * <p>
 * Comparison Operators
 * <ul>
 *     <li>
 *         Used for comparing primitive values
 *     </li>
 * </ul>
 * <p>
 * Logical Operators
 * <ul>
 *     <li>
 *         AND
 *     </li>
 *     <li>
 *         OR
 *     </li>
 *     <li>
 *         NOT
 *     </li>
 * </ul>
 * <p>
 * Control Flow Statements
 * <ul>
 *     <li>
 *         Conditional Statements: If Statement & Switch Statements for making decisions in our programs
 *     </li>
 *     <li>
 *         Loops: For executing code repeatedly
 *         <ul>
 *             <li>For Loops</li>
 *             <li>While Loops</li>
 *             <li>Do While Loops</li>
 *             <li>For Each Loops</li>
 *         </ul>
 *     </li>
 * </ul>
 * <p>
 * Break and Continue
 * <ul>
 *     <li>
 *         For breaking or jumping to the beginning of the loop
 *     </li>
 * </ul>
 */
public class Main {

    public static void main(String[] args){
        /*
         * Comparison Operators
         *
         * We use these operators to compare primitive values. An example would be: "Are x 7 y equal or not?" To do this we use the equality operator: ==
         *  Operators
         *      Equality Operator: ==
         *      Inequality Operator: !=
         *      Greater Than: >
         *      Greater Than or Equal To: >=
         *      Less Than: <
         *      Less Than or Equal To: <=
         */
        System.out.println();
        System.out.println("Comparison Operators");
        int comparisonX = 1;
        int comparisonY = 1;
        System.out.println(comparisonX == comparisonY); // When run, returns true. This is a boolean expression.
        /*
         * Logical Operators
         *
         * Logical operators allows you to combine multiple boolean expressions to get a specific outcome. Keep in mind that when reading expressions it is read from
         * left to right.
         *  Operators
         *      AND: &&
         *          This operator checks to see if all the expressions are true and will return true, if not will return false
         *      OR: ||
         *          This operator checks to see if at least one expression is true. If one expression is true it will return true.
         */
        System.out.println();
        System.out.println("Logical Operators");
        // AND Operator
        int logicalAndTemperature = 22;
        boolean logicalAndIsWarm = logicalAndTemperature > 20 && logicalAndTemperature < 30;
        System.out.println(logicalAndIsWarm);
        // OR Operator
        boolean logicalOrHasHighIncome = true;
        boolean logicalOrHasGoodCredit = true;
        boolean logicalOrHasCriminalRecord = false;
        boolean logicalOrIsEligible = (logicalOrHasHighIncome || logicalOrHasGoodCredit) && !logicalOrHasCriminalRecord;
        System.out.println(logicalOrIsEligible);
        /*
         * If Statements
         *
         * If statements allows us to build programs based on certain conditions.
         *
         * Here is a text example below:
         *      If temperature is greater than 30
         *          It's a hot day
         *          Drink plenty of water
         *      Otherwise, if it's between 20 and 30
         *          It's a nice day
         *      Otherwise
         *          It's cold
         * Here is a code example below:
         *       int ifStateTemp = 32;
         *       if (ifStateTemp > 30){
         *           System.out.println("It's a hot day");
         *           System.out.println("Drink plenty of water");
         *      } else if (ifStateTemp > 20 && ifStateTemp <= 30) {
         *           System.out.println("It's a nice day");
         *       } else {
         *           System.out.println("It's cold");
         *       }
         *
         * Below will simplify the above code to remove noise. If you noticed we have removed the curly braces from the other clauses (if statements). Then only time
         * we are required to add the curly braces are when we have multiple statements. another PRO for using the style is that it makes reading your statement easier.
         * We also remove the logical operator "ifStateTemp <= 30" because the first expression check if the temperature is greater than 30. If it is not then it
         * goes to the next clause, which means that the temperature is equal to or less than 30.
         */
        System.out.println();
        System.out.println("If Statements");
        int ifStateTemp = 32;
        if (ifStateTemp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (ifStateTemp > 20)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");
        /*
         * Simplifying If Statements
         *
         * Writing code like this is considered very amateurish and professional developers do not write their code like this.
         *
         *      int ifSimplifiedIncome = 120_000;
         *      boolean ifSimplifiedhasHighIncome = false;
         *
         *       if (ifSimplifiedIncome > 100_000)
         *           ifSimplifiedhasHighIncome = true;
         *       else
         *           ifSimplifiedhasHighIncome = false;
         *
         *        System.out.println(ifSimplifiedhasHighIncome);
         *
         * Below you will see a simplified version where professional developers utilize
         */
        System.out.println();
        System.out.println("Simplifying If Statements");
        int ifSimplifiedIncome = 120_000;
        // You don't need () but by using the () it makes it clear the this is a boolean expression
        boolean ifSimplifiedhasHighIncome = (ifSimplifiedIncome > 100_000);
        System.out.println(ifSimplifiedhasHighIncome);
        /*
         * The Ternary Operator
         *
         * With the Ternary operator we are able to create conditions on one line. Since our variable is a String we are not able to use the simplified if statement. By using
         * the Ternary operator we can keep our program clean and very professional.
         *  Operator Example
         *      CONDITION_HERE ? TRUE_OPTION : FALSE_OPTION;
         *
         * See example below
         */
        System.out.println();
        System.out.println("Ternary Operator");
        int ternaryIncome = 120_000;
        String ternaryClassName = ternaryIncome > 100_000 ? "First" : "Economy";
        System.out.println(ternaryClassName);
        /*
         * Switch Statements
         *
         * Below is an example of how to use a switch statement instead of the if statement. Both of which will give the same outcome. Using switch statements is sometimes cleaner
         * than using an if statement.
         *
         * With switch statements you want to add the "break;" after your code is completed. The "break;" will break out of the code block and execute. If none of the switch cases
         * are true the switch statement will run the default and exit out of the block so no need for a "break;". If you wanted to run multiple cases you can remove the "break;"
         * from that case, and it will move on to the next case.
         *
         * Switch statements can also use number types, except for long type.
         *      Byte, Short, Int
         *
         */
        System.out.println();
        System.out.println("Switch Statements");
        String switchRole = "admin";

        switch (switchRole){
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }

        if (switchRole == "admin")
            System.out.println("You're an admin");
        else if (switchRole == "moderator")
            System.out.println("You're a moderator");
        else
            System.out.println("You're a guest");
        /*
         * Exercise: FizzBuzz
         *
         * Number divisible by 5 = fizz
         * Number divisible by 3 = Buzz
         * Number divisible by both 5 and 3 = fizzBuzz
         * Number not divisible by 5 or 3 = same number printed
         */
        System.out.println();
        System.out.println("Exercise: FizzBuzz");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int exerciseFizzBuzzInput = scanner.nextInt();

        int exFizz = (exerciseFizzBuzzInput % 5 == 0) ? 1 : 0;
        int exBuzz = (exerciseFizzBuzzInput % 3 == 0) ? 1 : 0;

        if (exerciseFizzBuzzInput > 127)
            System.out.println("Please input a value from -127 to 127");
        else
            if (exFizz == 1 && exBuzz == 1)
                System.out.println("fizzBuzz");
            else if (exFizz == 1)
                System.out.println("fizz");
            else if (exBuzz == 1)
                System.out.println("Buzz");
            else
                System.out.println(exerciseFizzBuzzInput);

        /*
         * Exercise: FizzBuzz (Mosh Solution)
         */
        System.out.println();
        System.out.println("Exercise: FizzBuzz (Mosh Solution)");

        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
        /*
         *
         * For Loops
         *
         * For loops are good for when you want to repeat one or more statements. With a for loop you need to do 3 things to properly run a for loop.
         *
         * for (counter variable; boolean expression; increment){}
         *      Counter Variable: We use variable names like -> "i, j, k"
         *      Boolean Expression: Determines how many times this loop is going to be executed -> "i < 5"
         *          So as long as i is less than 5 the loop will be executed
         *      Increment: We increment by one -> "i++"
         *
         *
         *
         */
        System.out.println();
        System.out.println("For Loop");
        // Increment Basic
        for (int i = 0;i < 5; i++)
            System.out.println("Hello World ");
            System.out.println();
        // Increment & print "i"
        for (int i = 0;i < 5; i++)
            System.out.println("Hello World " + i);
            System.out.println();
        // Decrement & print i
        for (int i = 5;i > 0; i--)
            System.out.println("Hello World " + i);
        /*
         * While Loops
         *
         * While loops are similar to for loops in terms to their functionality, however they are different when it comes to syntax. The below example outputs the same however the for loop is lighter.
         *
         * It is better to use a "while loop" when we do not know how many times we want to repeat something.
         *       for (int i = 0;i < 5; i++)
         *           System.out.println("Hello World " + i);
         *
         *       int i = 0;
         *       while (i > 0){
         *           System.out.println("Hello World " + i);
         *           i--;
         *       }
         */
        System.out.println();
        System.out.println("While Loop");
        // Scanner object created here in Mosh example
            // Scanner object is outside the "while loop", so it doesn't keep recreating itself
        String input = "";
        while (!input.equalsIgnoreCase("quit")){
            System.out.print("Input: ");
            input = scanner.next();
            System.out.println(input);
        }
        /*
         * Do..While Loop
         *
         * Do..While Loop is similar to a "While Loop", but it gets executed at least once even if the statement is false.
         */
        System.out.println();
        System.out.println("Do..While Loops");
        do {
            System.out.print("Input: ");
            input = scanner.next();
            System.out.println(input);
        } while (!input.equalsIgnoreCase("quit"));
        /*
         * Break And Continue Statements
         *
         * Break: Terminates a loop
         * Continue: Moves control to the beginning of the loop
         *
         * If you are using a "while(true){}" make sure you have a "break;" inside your block
         */
        System.out.println();
        System.out.println("Break And Continue Statements");
        // Scanner object created here in Mosh example (Scanner above in code)
            // Scanner object is outside the "while loop", so it doesn't keep recreating itself
        // input String is created here in Mosh example (Input above in code)
        // while (!input.equalsIgnoreCase("quit")){ // Not needed since we have an if statement below for checking "quit"
        while (true){ // This loop will always run true until the break statement is enabled
            System.out.print("Input: ");
            input = scanner.next();
            /*
             * The "continue" will start the while loop over from the beginning and not execute any code after it
             */
            if (input.equalsIgnoreCase("pass"))
                continue;
            /*
             * There is any cleaner way implementing this so that the "quit" oes not get printed to console
             *
             *   if (!input.equalsIgnoreCase("quit"))
             *       System.out.println(input);
             *
             */
            if (input.equalsIgnoreCase("quit"))
                break; // Applying the break; will exit out of the while loop block
            System.out.println(input);
        }
        /*
         * For-Each Loop
         *
         * We use the for-each loop to iterate over arrays or collections.
         *
         */
        System.out.println();
        System.out.println("For-Each Loop");
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        System.out.println();
        /*
         * One problem with this is that we can only loop forward and not backward. This is where a for loop is handy.
         *
         * Another problem with this is that we can only get the value of the array and not the index.
         */
        for (String fruit : fruits)
            System.out.println(fruit);
        /*
         * Iterate backwards with for loop
         *
         *   i = index
         *   fruits = values
         */
        for (int i = fruits.length; i > 0; i--)
            System.out.println(fruits[i]);
    }
}
