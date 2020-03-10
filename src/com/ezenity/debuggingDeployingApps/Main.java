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
        /*
         * Packaging(Deploy) Java Applications
         *
         * The core focus here is deploying console or command line applications. Deploying mobile applications or web applications regard
         * additional steps that go beyond the scope of this video.
         *
         * If you are wanting to give this program to someone else to use you need to package your program into a JAR file.
         *      JAR = Java Archive
         *          It is a package format that contains all of your code for distribution.
         * By having a JAR file you can give it to anyone that has a JRE installed on their computer.
         *
         * To create a JAR follow the listed steps below:
         *      File
         *      Project Structure...
         *      Artifacts: An assemble, or a combination of project assets that we put together
         *          Click "+"
         *              JAR: Select from modules with dependencies (FOR THIS DEMO)
         *              Android Application:
         *              JavaFx Application: JavaFx is a platform for create desktop applications
         *              JavaFx Pre-loader:
         *              Other:
         *      Create JAR from Modules (Window)
         *          Module: Another level of abstraction above packages
         *          Main Class: Select Main class
         *          JAR files from libraries: if this project had other libraries, you could decide what to do with those libraries
         *
         * Now that we have a JAR Artifact created we need to build it with the following steps below:
         *      Build
         *      Build Artifacts
         *          Actions:
         *              "Build" it
         *              "Rebuild" it: Is the combination of 'Clean' and 'Build'. If something is not working properly, it is good to rebuild an artifact
         *              "Clean" it: removes all files in the directory that contains this JAR file
         *
         *
         */
        System.out.println("Hello World");
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
