package com.ezenity.oop.classes.coupling;

/**
 * Coupling
 * <p>
 * The level of dependency between classes. Basically how much a class is dependant or coupled to another class
 * <p>
 * Metaphor
 * <ul>
 *      <li>When you use your phone, you are coupled to your phone. The more you use your phone the more you are dependent on it.
 *      If your phone is taken away from you, it wil lbe difficult to live since you use it every day. This is coupling.</li>
 * </ul>
 * This can be the same for coding. We want to reduce the coupling between classes. However, on the contrary, there is no such
 * thing as no coupling or zero coupling because your program works together to perform a class. Our goal is to reduce the
 * coupling as much as we can.
 *
 */
public class Main {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Coupling");

        var employee = new Employee(); // Coupling point
        employee.setBaseSalary(50_000); // Coupling point
        employee.setHourlyRate(20); // Coupling point
        int wage = employee.calculateWage(10); // Coupling point
        System.out.println(wage);
    }
}
