package com.ezenity.controlFlow;

/**
 * Summary
 * <p>
 * Comparison Operators
 * <p>
 * Logical Operators
 * <p>
 * Conditional Statements
 * <p>
 * Loops
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
    }
}
