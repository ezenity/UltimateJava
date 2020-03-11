package com.ezenity.oop.classes.constructors;

/**
 * Constructors
 * <p>
 * Now what if we forget to call the two set methods, then our fields will be set to 0. This is considering bad coding,
 * and we want to reduce this, reduce the guess work.
 *
 * Metaphor
 *      That is like having a magic remote where you are required to press 'A' then 'B' before you can change
 *      the channel. This is not practical.
 *
 * To fix this we want to put the new Object we create in an "initial valid state". Basically pass the Employee{} field values
 * inside the "new Employee()" variable, like so:
 *      new Employee(50_000, 20)
 *
 * To do this we need to create a constructor.
 *  Constructor: A special method that is call when we create a new object.
 *          The job of a constructor is to initialize our fields to the default values. Default values are as followed:
 *                  Numbers: 0
 *                  Booleans: false
 *                  Reference Types: null
 */
public class Main {
    public static void main(String[] args){
        var employee = new Employee(50_000, 20); // Coupling point
        // employee.setBaseSalary(50_000); // Coupling point
        // employee.setHourlyRate(20); // Coupling point
        int wage = employee.calculateWage(10); // Coupling point
        System.out.println(wage);
    }
}
