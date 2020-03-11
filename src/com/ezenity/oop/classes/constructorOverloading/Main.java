package com.ezenity.oop.classes.constructorOverloading;

/**
 * Constructor Overloading
 *
 * Since technically constructors are methods, you can also do Method Overloading
 */
public class Main {
    public static void main(String[] args){
        var employee = new Employee(50_000);
        int wage = employee.calculateWage(); // Coupling point
        System.out.println(wage);
    }
}
