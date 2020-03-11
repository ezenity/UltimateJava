package com.ezenity.oop.classes.encapsulation;

/**
 * Encapsulation
 * <p>
 * Definition: Bundle the data and methods that operate on the data in a single unit(class) or object(field).
 * <p>
 * Mosh Definition: Encapsulation is the first principle of object-oriented programming.
 *                  It suggests that we should bundle the data and operations on the data
 *                  inside a single unit (class).
 */
public class Main {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Encapsulation");
        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wageEncap = employee.calculateWage(10);
        System.out.println(wageEncap);
    }
}
