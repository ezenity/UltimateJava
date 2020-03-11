package com.ezenity.oop.classes.abstraction;

/**
 * Abstraction
 * <p>
 * Reduce complexity by hiding unnecessary details in our classes
 * <p>
 * Metaphor
 * <ul>
 *     <li>
 *         A TV Remote: Inside the TV remote there is a mother board with a lot of complex details however we do not
 *                      interact with this motherboard. It has so much complexity there we don't really understand that and don't want to. We
 *                      just want to change the channel, change the volume and so on. This is what we call abstraction. So with abstraction
 *                      we want to hide the implementation detail of the class and test it like a black box. We don't care what is inside,
 *                      we just care about the simple interface that we can work with, like the buttons on the remote.
 *     </li>
 * </ul>
 */
public class Main {
    public static void main(String[] args){
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
