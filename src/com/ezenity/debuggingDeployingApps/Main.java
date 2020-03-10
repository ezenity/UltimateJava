package com.ezenity.debuggingDeployingApps;

/**
 * Debugging and Deploying Applications
 * <ul>
 *     <li>Finding and fixing errors</li>
 *     <li>Types of errors</li>
 *     <li>Common Errors</li>
 *     <li>Debugging</li>
 *     <li>Packaging</li>
 * </ul>
 */
public class Main {

    public static void main(String[] args){
        /*
         * Types Of Errors
         *      Compile-time Errors/Syntax Errors: These errors happen when we do not follow the grammar or syntax of Java language
         *          Easily to find and fix
         *          Our IDE usually points out these errors
         *      Run-Time Errors: These errors happen when we run our applications.
         *          To find these errors we use a tool called a Debugger
         *
         * Good source for finding out error information is Google.com & stackoverflow.com
         */
        /*
         * Common Syntax Errors
         *      Forgetting to add the variable type
         *      Not adding () for things such as println()
         *      Adding the incorrect "" or ''
         *      Incorrectly adding variable names and not properly adding the case-sensitive variables
         *      Adding a name called class for a variable
         *      Incorrectly using the comparing sign
         *          Using = instead of ==
         *              Equals       is Equal to
         */
        /*
         * Debugging Java Applications
         *
         * Here we will create a simple for loop to print out the listed numbers on the console. However, this program has a bug.
         */
        System.out.println("Start");
        printNumbers(4);
        System.out.println("Finish");
    }

    /*
     * Debugging Java Applications Sample
     */
    private static void printNumbers(int number) {
        for (int i = 0; i <= number; i++){
            System.out.println(i);
        }
    }


}
