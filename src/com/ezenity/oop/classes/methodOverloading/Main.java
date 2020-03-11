package com.ezenity.oop.classes.methodOverloading;

/**
 * Method Overloading
 *<p>
 * Definition: Creating different implementations of it with different parameters
 * <p>
 * If we look at the calculateWage() method we see that we are using 10 for extra hours. What if we
 * have a value of 0 because the employee did not work are extra hours. We would not apply any value
 * then. This is what we would call "Method Overloading"
 */
public class Main {
    public static void main(String[] args){
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(); // Coupling point
        System.out.println(wage);
    }
}
