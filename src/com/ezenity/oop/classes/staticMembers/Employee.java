package com.ezenity.oop.classes.staticMembers;

/**
 * Static Members
 *
 * After we declare our instance fields, we declare our static fields
 *
 * Note:
 *  We can only access static methods of other static methods. For example, if we wanted
 *  to access he calculateWage() method inside our static printNumberOfEmployees() method
 *  we would need to create a new object first then call the method, like so:
 *
 *  public static void printNumberOfEmployees() {
 *      System.out.println(numberOfEmployees);
 *      new Employee().calculateWage();
 *  }
 */
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        /*
         * Every time we create an employee, we want to increase our numberOfEmployees and to do this
         * we will increment by one
         */
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Please add a hourly rate above 0.");

        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
         throw new IllegalArgumentException("Please add a base salary above 0.");

        this.baseSalary = baseSalary;
    }

    public int calculateWage(int extraHours){
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    public int calculateWage(){
        return calculateWage(0);
    }
}
