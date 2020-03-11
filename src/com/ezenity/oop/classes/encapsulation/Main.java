package com.ezenity.oop.classes.encapsulation;

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
         * Encapsulation
         *
         *      Definition: Bundle the data and methods that operate on the data in a single unit(class) or object(field).
         */
        System.out.println();
        System.out.println("Encapsulation");
        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wageEncap = employee.calculateWage(10);
        System.out.println(wageEncap);
    }
}
