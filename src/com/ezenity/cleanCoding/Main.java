package com.ezenity.cleanCoding;

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
     * What if our method returns a value. First change the return type from void to the value type, in our case it is String. Then add a return statement infront
     * of the String you want to return.
     */
    public static String greetUserValue(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;
    }
}
