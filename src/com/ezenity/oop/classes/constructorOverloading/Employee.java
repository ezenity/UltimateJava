package com.ezenity.oop.classes.constructorOverloading;

/**
 * Constructor Overloading
 *
 * by this this "this" keyword we are using the Employee() method and its parameters since we cannot
 * call the Employee() method.
 */
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Please add a hourly rate above 0.");

        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary < 0)
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
