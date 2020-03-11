package com.ezenity.oop.classes.staticMembers;

/**
 * Static Members
 *
 * In OOP a class can have two types of members:
 *      Instance members: Belongs to instances or objects
 *              To obtain them we can create an object and call them with that variable like: employee.instance
 *
 *      Static members: Belongs to a class not an object
 *              We use these when we want to present a concept that should be in a single place. An example would
 *              be "numberOfEmployees"
 *          numberOfEmployees;
 *              this concept does not belong to each individual employee.
 *
 * So, we use static fields in situations where a value is independent of objects and, we are going to share it across al objects.
 *
 * Why is the main method a static?
 *      This is so that the JRE can call this method without having to create a new object.
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
