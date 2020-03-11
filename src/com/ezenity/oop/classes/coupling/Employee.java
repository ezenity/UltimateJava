package com.ezenity.oop.classes.coupling;

/**
 * Coupling
 *
 * When we have multiple access modifiers that are public this makes our couple amount larger. Since we are not using the getter methods
 * we can go ahead and make them private. This reduces the coupling amount and makes an easier user interface.
 */
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Please add a hourly rate above 0.");

        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
         throw new IllegalArgumentException("Please add a base salary above 0.");

        this.baseSalary = baseSalary;
    }

    /*
     * Let's make an assumption. Let's say that the baseSalary & hourlyRate are fixed for one year but, the extraHours vary
     * depending on the month. So instead we want to pass it as an argument to this method.
     */
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
}
