package com.ezenity.oop.classes.gettersAndSetters;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    // public int extraHours;

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Please add a hourly rate above 0.");

        this.hourlyRate = hourlyRate;
    }

    public int getBaseSalary() {
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
