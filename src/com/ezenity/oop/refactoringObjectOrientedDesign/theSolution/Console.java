package com.ezenity.oop.refactoringObjectOrientedDesign.theSolution;

import java.util.Scanner;

public class Console {
    /**
     * This method is a generic while loop for gathering a min and max number with a custom string output
     *
     * @param prompt String output
     * @param min Minimum number
     * @param max Maximum number
     * @return Return user value input
     */
    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(prompt + ": ");
            value = scanner.nextDouble();

            if (value >= min && value <= max)
                break;

            System.out.println("Enter a value between " + min + " and " + max);
        }

        return value;
    }
}
