package com.ezenity.oop.classes;

public class Employee {
    public int baseSalary;
    public int hourlyRate;
    // public int extraHours;

    /*
     * Let's make an assumption. Let's say that the baseSalary & hourlyRate are fixed for one year but, the extraHours vary
     * depending on the month. So instead we want to pass it as an argument to this method.
     */
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
}
