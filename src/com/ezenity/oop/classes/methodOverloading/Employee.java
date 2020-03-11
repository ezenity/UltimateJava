package com.ezenity.oop.classes.methodOverloading;

/**
 * Method Overloading
 *
 * For the calculateWage() method we went ahead and duplicated it and removed the parameters along with the unused information. Then
 * we went ahead and overloaded the calculateWage() method to return and applied 0.
 */
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        /*
         * Using the two solutions below can still give us an issue because we can still pass a zero
         */
        //this.baseSalary = baseSalary;
        //this.hourlyRate = hourlyRate;
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
        if (baseSalary <= 0)
         throw new IllegalArgumentException("Please add a base salary above 0.");

        this.baseSalary = baseSalary;
    }

    /*
     * Let's make an assumption. Let's say that the baseSalary & hourlyRate are fixed for one year but, the extraHours vary
     * depending on the month. So instead we want to pass it as an argument to this method.
     */
    public int calculateWage(int extraHours){
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    public int calculateWage(){
        return calculateWage(0);
    }
}
