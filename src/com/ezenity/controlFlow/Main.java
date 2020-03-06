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

    }
}
