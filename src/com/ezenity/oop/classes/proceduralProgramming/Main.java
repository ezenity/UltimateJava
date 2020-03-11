package com.ezenity.oop.classes.proceduralProgramming;

/**
 * Procedural Programming
 * <p>
 * The below example is what we call procedural programming, and it is not actually Object-oriented programming. Methods that typically
 * have a lot of parameters are not Object-oriented programming. This makes reusability harder. It is harder to maintain this type of
 * coding style and, you have to go all over the place and look at so much code to figure out what you need to change.
 */
public class Main {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Procedural Programming");
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourly = 20;

        int wage = calculateWage(baseSalary,extraHours,hourly);
        System.out.println(wage);
    }

    /**
     * Procedural Programming
     * <p>
     * Gets the calculating for a wage
     *
     * @param baseSalary Get base salary
     * @param extraHours Get extra worked hours
     * @param hourlyRate Get hour rate
     * @return Return total
     */
    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
