package com.ezenity.oop.classes.staticMembers;

/**
 * Static Members
 * <p>
 * In OOP a class can have two types of members:
 * <ul>
 *      <li>Instance members: Belongs to instances or objects</li>
 *      <ul>
 *          <li>To obtain them we can create an object and call them with that variable like: employee.instance</li>
 *      </ul>
 *      <li>Static members: Belongs to a class not an object</li>
 *      <lu>
 *          <li>We use these when we want to present a concept that should be in a single place. An example would be "numberOfEmployees"</li>
 *          <li>numberOfEmployees: this concept does not belong to each individual employee.</li>
 *      </lu>
 * </ul>
 * So, we use static fields in situations where a value is independent of objects and, we are going to share it across al objects.
 * <p>
 * Why is the main method a static?
 * <ul>
 *     <li>This is so that the JRE can call this method without having to create a new object.</li>
 * </ul>
 */
public class Main {
    public static void main(String[] args){
        var employee = new Employee(50_000);
        System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
