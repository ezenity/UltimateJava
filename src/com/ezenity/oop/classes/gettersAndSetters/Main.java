package com.ezenity.oop.classes.gettersAndSetters;

/**
 * Classes Intro
 * <ul>
 *     <li>Encapsulation</li>
 *     <li>Abstraction</li>
 *     <li>Constructors</li>
 *     <li>Getters / Setters</li>
 *     <li>Method Overloading</li>
 * </ul>
 */
public class Main {
    public static void main(String[] args){
        /*
         * Getters & Setters
         *
         * Now let's say that we see the employees baseSalary to -1 this would not allow our program to run properly. To fix this we could
         * add an if() statement to check if the value is greater than 0 but then problem with this is that we will need to always add the
         * if() statement when calling the employee object. To fix this we can create setters and getters.
         */
        System.out.println();
        System.out.println("Getters & Setters");
        var employee = new Employee();
        // employee.setBaseSalary(-1);
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);


    }
}
