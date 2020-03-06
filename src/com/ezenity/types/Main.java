package com.ezenity.types;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * int is a type
         * age is a identifier
         * 30 is initializing the identifier
         *
         * You can initialize variables on the same line but it
         * is not good practice and hard to read
         *
         * EXAMPLE: int age = 30, temperature = 20;
         *
         * It is better to initialize on separate lines
         * EXAMPLE:
         *  int age = 30;
         *  int temperature = 20;
         *
         */
        System.out.println("Variables");
        int age = 30;
        age = 35;
	    System.out.println(age);

	    /*
	     * Copying one variable to another
         */
        System.out.println();
        System.out.println("Copying a variable to another");
	    int myAge = 30;
	    int herAge = myAge;
        System.out.println(herAge);

        /*
         * Various Types in Java
         *
         * Primitive: For storing simple values
         *      EXAMPLES: Numbers, Characters, Booleans
         * Reference: For storing complex objects
         *      EXAMPLES: Date, Mail Message
         *
         *
         *  TYPE        BYTES       RANGE           DESCRIPTION
         *  bte         1           -128, 127
         *  short       2           -32k, 32k
         *  int         4           -2B, 2B
         *  long        8                           Stores whole numbers with no decimal point
         *  float       4                           Stores whole numbers with decimal point
         *  double      8                           Stores whole numbers with decimal point
         *  char                    A, B, C, ...    Store letters and international letters
         *  boolean     1           true / false
         *
         *
         */
        System.out.println();
        System.out.println("Primitive Type: byte");
        byte ageByte = 30;
        System.out.println(ageByte);
        /*
         * You can use an underscore ( _ ) to make large whole numbers readable
         *
         * If we make the value 3B then int reads an error to fix this we can change
         * the type to long, however an error is still displayed. Java compiler still
         * looks at whole numbers as integers. To fix this you can add a "L" to the
         * end of the whole number.
         *
         * EXAMPLE OF ERROR:
         *      int viewsCount = 3_123_456_789;
         *
         * EXAMPLE OF SOLUTION BELOW:
         */
        System.out.println();
        System.out.println("Primitive Type: long");
        long viewsCount = 3_123_456_789L;
        System.out.println(viewsCount);
        /*
         * If we wanted to add a example of using decimals we can use double.
         * EXAMPLE:
         *      double price = 10.99;
         *
         * since our value is small we want to use a different type with a small byte memory, float
         * Change the double to float gives us an error because the compiler still reads our
         * value as a double. To fix this error we can add the letter "F" at the end of the value.
         */
        System.out.println();
        System.out.println("Primitive type: float");
        float price = 10.99F;
        System.out.println(price);
        /*
         * When using the char type we always want to make sure the value is surrounded by single quotes ''
         * Double quotes "" are for String types
         */
        System.out.println();
        System.out.println("Primitive Type: char");
        char letter = 'A';
        System.out.println(letter);
        /*
         * When using the boolean type you either have the option of True or False, which can be used
         * for various checks within your application.
         */
        System.out.println();
        System.out.println("Primitive Type: boolean");
        boolean isEligible = true;
        System.out.println(isEligible);

        /*
         *
         * Primitive types we do not need to allocate memory since it is allocated and released by the
         * Java Runtime Environment. When dealing with Reference Types (nowReferenceType), you should always
         * allocate memory. We do not need to release this memory. Java Runtime will automatically do this
         * for us.
         *
         * To allocate memory for a Reference Type variable you can add the "new" operator.
         *
         * The nowReferenceType variable is an instance of the Date() class. the Date() class is a template
         * for creating new objects (new instances) in your application.
         *
         * An object is an instance of a class.
         *
         * Reference Types contains members that can be accessed for further use. Primitive Types do not have
         * members but rather has code snippets to generate code.
         *
         *
         *  TYPE        BYTES       RANGE           DESCRIPTION
         */
        System.out.println();
        System.out.println("Allocating Memory");
        byte agePrimitiveType = 30;
        Date nowReferenceType = new Date();
        //nowReferenceType.getTime();
        /*
         * Short cut to get the following code line:
         *      System.out.println();
         *
         * SHORTCUT: sout
         * Then press TAB
         */
        System.out.println(nowReferenceType);
        /*
         * Primitive vs Reference type
         *
         * There is a large difference between memory management using these two types
         *
         * Reference Types are copied by the references
         * Primitive Types are copied by their value, and these values are completely independent of each other.
         */
        System.out.println();
        System.out.println("Memory management: Independent");
        /*
         * Primitive Type
         *
         * X & Y and independent of each other since they are at different memory location. For example if we
         * changed the value of X, Y will not be affected.
         */
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        System.out.println();
        System.out.println("Memory management: ");
        /*
         * Reference Type
         *
         * pointOne creates the X & Y inside a new object shown below. When JRE runs the pointOne object it will
         * allocate one memory location, Point(1,1). Then it will generate a separate memory location for both pointOne
         * and pointTwo that will reference the memory location for the object Point(1,1).
         *
         * The two variables, pointOne & pointTwo, are referencing the same object, Point(1,1). The benefit to this is
         * when one of the variables update the object it'll be visible to all other variables.
         */
        Point pointOne = new Point(1, 1);
        Point pointTwo = pointOne;
        pointOne.x = 2;
        System.out.println(pointTwo);
        pointOne.x = 4;
        System.out.println(pointTwo);
        /*
         * Strings
         *
         * When using the String type we get a redundant message since there is a shorter hand using Strings. Instead of
         * using the following:
         *      String messageString = new String("Hello World");
         * You can use this instead, which is the same:
         *      String messageString = "Hello World";
         * Now you may think this looks like a Primitive Type since we are not using an operator but this is just a shorthand
         * to initialize the String variable. Strings are Reference Types in Java.
         */
        System.out.println();
        System.out.println("Reference Type: String");
        String messageString = new String("Hello World" + "!!");
        System.out.println(messageString);
        System.out.println(messageString.endsWith("!!")); // Will look for the value at the end of the String, which will return true or false
        System.out.println(messageString.startsWith("!!")); // Will look for the value at the beginning of your String, Which will return true or false
        System.out.println(messageString.length()); // Will output the amount of characters in your String , Space is included in the characters
        System.out.println(messageString.indexOf("H")); // This will return the first instances of the inputted value
        System.out.println(messageString.indexOf("e")); // This will return the first instances of the inputted value
        System.out.println(messageString.indexOf("d")); // This will return the first instances of the inputted value
        System.out.println(messageString.indexOf("skye")); // Since "skye" is not within our String, we receive a '-1'
        /*
         * The replace() method allows you to change the characters with other characters. replace() method have two parameters, 1st parameter is
         * the value you want to change. The 2nd parameter is what you want your new value to be.
         *
         * Parameters: Are the holes that we define in our method
         *      target & replacement
         * Arguments: Are the actually values that we pass to these methods
         *      "!" & "&"
         *
         * NOTE:
         * The replace() method does not change our current String, it returns a new String. Strings are immutable, we cannot mutate them. So, any
         * methods that modify a String, will always return a new String object.
         */
        System.out.println(messageString.replace("!","*"));
        System.out.println(messageString);
        System.out.println(messageString.toLowerCase()); // Converts all characters to lower case, which will return a new String object
        System.out.println(messageString.toUpperCase()); // Converts all characters to upper case, which will return a new String object
        System.out.println(messageString.trim()); // Will remove all white spaces (Space) at the end or beginning of the String
        /*
         * Escape Sequences
         *
         * When trying to add special characters into your string you get compilation errors. To fix these compilation errors you can use
         * the following samples below:
         *
         * Tab: \t
         *      This will add a tab inside your String
         * New Line: \n
         *      This will add a new line to your String after the "\n" escape sequence
         * Backslash: \\
         *       This will add a blackslash to your String
         * Double Quotes: \" TEXT \"
         *       This will add double quotes to your String
         *
         * Can see examples below
         */
        System.out.println();
        System.out.println("Escape Sequences");
        String messageDoubleQuotes = "Hello \"Ant\"";
        System.out.println(messageDoubleQuotes);

        String messageBackslash = "c:\\Windows\\...";
        System.out.println(messageBackslash);

        String messageNewLine = "c:\nWindows\\...";
        System.out.println(messageNewLine);

        String messageTab = "c:\tWindows\\...";
        System.out.println(messageTab);
        /*
         * Arrays
         *
         * You use Arrays to store a list of items. For example, you can have a list of numbers, a list of people
         * and so on.
         *
         * To create an Array you want to add [] to the end of the type you are utilizing as shown below. Since Arrays are reference types,
         * you will want to use the "new" operator and then repeat the type again and then specify the size or length of your Array. Example
         * is below.
         *
         * You can access these Arrays by using an index "numbersArray[0]" 0 being the first element/item in your Array. If you use an
         * invalid index, say for example numbersArray[10], you will receive a compilation error (Exception). Exceptions are Java's way to
         * report errors. We received this Exception because our Array only has 5 elements/items.
         *
         * Now let's say we want to print out our elements/items, we can do so by doing "System.out.println(numbersArray);". However, you will
         * get a weird String and not your actual Array values. This String is the address of the object in memory (Its memory location). Let's
         * say we had another Array, and we print that, the String will be different since it will be located in a different memory space.
         *
         * To seethe actual value which is in the array we will want to use the Java Class Arrays{}. The Arrays{} class provides something that
         * is called "Method Overload". One method called "toString()" provides various parameters such as "float, int, byte, etc.." which you
         * can utilize to get the output you are requiring.
         *
         * When you output the Arrays' element we will see something like [1, 2, 0, 0]. 1 & are initialized, and the rest are set to 0 by default
         * because we are dealing with an integer array. If we had a boolean array, all elements/items get set to false by default. If we
         * had a String array all elements/items will get set to an empty string.
         *
         * Below we have two examples of how to utilize an Array, Old Syntax and New Syntax. If we know ahead of time what the values are we can
         * utilize the New Syntax.
         *
         * With the New Syntax, we can input the Array values in a {} which will also determine the Array length. Also keep in mind that in Java
         * Arrays have a fixed size. Once an Array has been created, we cannot add or remove additional elements/items to them, this is what we call
         * a fixed length. To add or remove elements/items from an Array you would want to use one ofthe collection classes which will be touched
         * on later in this course.
         *
         * Let's say your Array is not sorted and is in random order: {2,3,5,1,4}. If you would like to sort these numbers you can easily do so by
         * using the sort() method inside the Arrays{} class.
         *
         */
        System.out.println();
        System.out.println("Arrays");
        // OLD SYNTAX
        int[] numbersArrayOldSyntax = new int[5];
        numbersArrayOldSyntax[0] = 1; // 1st Index
        numbersArrayOldSyntax[1] = 2; // 2nd Index
        // numbersArray[10] = 3; // Gives Exception error since we do not have 10 elements/items in our Array
        System.out.println(numbersArrayOldSyntax); // Gives us the memory location for the Array
        System.out.println(Arrays.toString(numbersArrayOldSyntax)); // Outputs the Array elements/items
        // NEW SYNTAX
        int[] numbersArrayNewSyntax = {2,3,5,1,4};
        System.out.println(numbersArrayNewSyntax); // Gives us the memory location for the Array
        System.out.println(numbersArrayNewSyntax.length); // Gives us the amount of elements/items in the array (Array Length)
        Arrays.sort(numbersArrayNewSyntax); // Sort the elements/items in the Array
        System.out.println(Arrays.toString(numbersArrayNewSyntax)); // Print out the sorted elements/items in the Array
        /*
         * Multi-Dimensional Arrays
         *
         * You can create a 2-Dimensional array to create a matrix.
         * You can create a 3-Dimensional array to store data for a cube
         *
         * These can be useful for scientific computations.
         */
        System.out.println();
        System.out.println("Multi-Dimensional Arrays");
        // Single Dimensional Array
        int[] numbersArraySingle = new int[5]; // Single Dimensional Array
        // 2-Dimensional Array
        int[][] numbersArrayTwoDim = new int[2][3]; // 2x3 matrix  (2 rows and 3 columns)
        numbersArrayTwoDim[0][0] = 1; // Index the first row and first column
        System.out.println(Arrays.toString(numbersArrayTwoDim)); // Since we are working with a 2-Dimensional Array we will receive a memory location
        System.out.println(Arrays.deepToString(numbersArrayTwoDim)); // Prints out the 2-Dimensional Array elements/items
        // 3-Dimensional Array
        int[][][] numbersArrayThreeDim = new int[2][1][10]; // The third [] specifies the length of this dimension
        numbersArrayThreeDim[0][0][0] = 1;
        System.out.println(Arrays.deepToString(numbersArrayThreeDim));
        // 2-Dimensional Array: New Syntax
        int[][] numbersArrayTwoDimNew = { {1,2,3}, {4,5,6}, {7,7,7,7}};
        System.out.println(Arrays.deepToString(numbersArrayTwoDimNew));
        //
        int[][][] numbersArrayThreeDimNew = { { {2,3,4} }, { {5,5,5} }, { {8,8,8,5,6,7,8} } };
        System.out.println(Arrays.deepToString(numbersArrayThreeDimNew));
        /*
         * Constants
         *
         * With variables, we can change them later on throughout the lifetime of our program/application. However, let's say we have a variable we do not
         * want changing for example pi. We use pi to calculate the area of a circle. If we later tried to change "pi" this will cause unforeseen errors
         * inside our application. To fix this we can use constants.
         *
         * Constants initialize the variable so that we may not modify it later in our program. When we are using constants the variable will always
         * be UPPER_CASE. to treat a variable as a constant we want to add the word "final" in front of the variable type.
         */
        System.out.println();
        System.out.println("Constants");
        final float PI = 3.14F;
        System.out.println(PI);
        // pi = 1; // When trying to change the value we get an error since pi is a constant.
        /*
         * Arithmetic Expressions
         *
         * In Java, we have the same arithmetic expressions we have in math, for example:
         *  Addition: +
         *  Subtraction: -
         *  Multiplication: *
         *  Division: /
         *  Modulo(Remainder of Division): %
         *
         * In Java, dividing two whole numbers will output another whole number. If we wanted to get the decimal in a division, we need to convert the whole number
         * into a float or a double. To do this we need to cast the type in front of the value.
         *
         * The values being used in the arithmetic expression are called "Operands".
         *
         * Increment & Decrement Operators
         *      Increment: ++
         *      Decrement: --
         *
         * you can increment a value using ++ in front (Pre-Fix) of the variable or behind (Post-Fix) the variable. This will increase the value by one, same results.
         * However, if we use this on the right side of an assignment operator, we will get different results.
         *
         * If we add a Post-Fix Increment, the value will get copied first to the new assigned variable and then will be increased: Look at example "resultXThree & resultY".
         * if we add a Pre-Fix Increment, the value will get incremented and then it will be copied to the new assigned variable: Look at example "resultXFour & resultYTwo".
         *
         * Augmented/Compound Assignment Operators
         *      +=
         *      -=
         *      *=
         *      /=
         *
         */
        System.out.println();
        System.out.println("Arithmetic Expressions");
        int resultExpressionAdd = 10 + 3;
        int resultExpressionSubtract = 10 - 3;
        int resultExpressionMulti = 10 * 3;
        int resultExpressionDivision = 10 / 3;
        int resultExpressionRemainder = 10 % 3;
        System.out.println(resultExpressionAdd);
        System.out.println(resultExpressionSubtract);
        System.out.println(resultExpressionMulti);
        System.out.println(resultExpressionDivision);
        System.out.println(resultExpressionRemainder);
        // Division convert Example
        double resultExpressionDivisionConvert = (double)10 / (double)3;
        System.out.println(resultExpressionDivisionConvert);
        // Post-Fix Increment
        int resultX = 1;
        resultX++; // Post-Fix Increment Operator
        System.out.println(resultX);
        // Pre-Fix Increment
        int resultXTwo = 1;
        ++resultXTwo; // Pre-Fix Increment Operator
        System.out.println(resultXTwo);
        // Assignment Operator: Post-Fix
        int resultXThree = 1;
        int resultY = resultXThree++;
        System.out.println(resultXThree);
        System.out.println(resultY);
        // Assignment Operator: Pre-Fix
        int resultXFour = 1;
        int resultYTwo = ++resultXFour;
        System.out.println(resultXFour);
        System.out.println(resultYTwo);
        // Increment by more: Arithmetic Expression
        int resultXMore = 1;
        resultXMore = resultXMore + 2;
        System.out.println(resultXMore);
        // Increment by more: Augmented/Compound assignment Operator
        int resultXMoreTwo = 1;
        resultXMoreTwo += 2;
        System.out.println(resultXMoreTwo);
        /*
         * Order of Operations
         *
         * In the variable "xOrder" the value is "16" because "*" takes priority over "+". If we wanted to change the order of operation and make "+" priority, we
         * can use parenthesis(). Check out xOrderTwo for an example.
         *
         * List of Operations in priority order
         *      ()
         *      * /
         *      + -
         *
         * Keep in mind that the order of operations are reads left to right so if our value have something like: 9 + 9 * 5 / 2  The * will be utilized first then the division then the addition
         */
        System.out.println();
        System.out.println("Order of Operations");
        int xOrder = 10 + 3 * 2;
        System.out.println(xOrder);
        int xOrderTwo = (10 +3) * 2;
        System.out.println(xOrderTwo);
        /*
         * Casting & Type Conversion
         *
         * When we are working with integers implicit (auto) casting occurs when we will not lose data, no chance of data being lost. We can also do Explicit casting which can be viewed in example
         * "castingYDoubleTwo". However, we cannot cast a String to a Number and cannot cast a Number to a String. Instead, we need to use a wrapper class. Check out the example "castingString".
         *
         * The main reason why we would need to parse a string into a number is because whenever we are creating anything (Mobile App, Web App, etc) the user will always provide a string regards
         * of how it was obtained. This will also use to convert the necessary data to continue with our program.
         */
        System.out.println();
        System.out.println("Casting & Type Conversion");
        // Implicit(auto) casting
        // byte > short > int > long > float > double
        short castingX = 1;
        int castingY = castingX + 2;
        System.out.println(castingY);
        // Implicit(auto) casting
        double castingXDouble = 1.1;
        double castingYDouble = castingXDouble + 2; // 2 is casted into a double and is now 2.0
        System.out.println(castingYDouble);
        // Implicit(auto) casting: We want no decimals and want a whole number
        double castingXDoubleTwo = 1.1;
        int castingYDoubleTwo = (int)castingXDoubleTwo + 2; // Explicit casting "int" to the "double" variable "castingXDoubleTwo"
        System.out.println(castingYDoubleTwo);
        // Wrapper Class utilization
        String castingString = "1";
        int convertingString = Integer.parseInt(castingString); // Wrapper cast for the "int" primitive type
        int castinYString = convertingString + 2;
        System.out.println(castinYString);
        /*
         * The Math Class
         *
         *  Round() = Allows you to round a float or double number to a whole number
         *  ceil() = Returns the smallest integer that is greater or equal to the provided number
         *  floor() = Returns the largest integer that is smaller or equal to the provided number
         *  max() = Returns the greater of two values
         *  min() = Returns the smallest of two values
         *  random() = Generates a random float value between 0 - 1 by default
         *
         */
        System.out.println();
        System.out.println("The Math Class");
        int resultMathRound = Math.round(1.1F);
        System.out.println(resultMathRound);

        int resultMathCeil = (int)Math.ceil(1.1F);
        System.out.println(resultMathCeil);

        int resultMathFloor = (int)Math.floor(1.1F);
        System.out.println(resultMathFloor);

        int resultMathMax = Math.max(1,2);
        System.out.println(resultMathMax);

        int resultMathMin = Math.min(1,2);
        System.out.println(resultMathMin);

        double resultMathRandom = Math.random(); // Float Example: Default 0 - 1
        System.out.println(resultMathRandom);

        double resultMathRandomTwo = Math.random() * 100; // Float Example: 0 - 100
        System.out.println(resultMathRandomTwo);

        double resultMathRandomRound = Math.round(Math.random() * 100); // Integer Example: 0 - 100
        System.out.println(resultMathRandomRound);
        /*
         * Now with the example above we are still receiving a decimal 0.0 so if we change double to int we get a compilation error.
         *      int resultMathRandomRound = Math.round(Math.random() * 100);
         * Why, because the round() method returns a long, but we are declaring an integer. This would be one of the cases where we cannot do implicit(auto) casting. The reason
         * for this is that we have a value that is 8 bytes of memory, and we want to store that variable into 4 bytes of memory. However, we can use explicit casting because we
         * know that the results of this expression is a number between 0 - 100.
         *
         */
        int resultMathRandomRoundExplicit = (int) Math.round(Math.random() * 100);
        System.out.println(resultMathRandomRoundExplicit);
        /*
         * Now let's say we don't use the round() method.
         *      int resultMathRandomRoundExplicitTwo = (int) Math.random() * 100;
         * Now every time we print "resultMathRandomRoundExplicit" variable we get a "0" value. The reason is that we are casting to the result of the Math.random() method, not the
         * entire expression. To fix this we can wrap the expression in parentheses.
         */
        int resultMathRandomRoundExplicitTwo = (int) (Math.random() * 100);
        System.out.println(resultMathRandomRoundExplicitTwo);
        /*
         * Formatting Numbers
         *
         * Image we want to display numbers a certain way with the correct formatting:
         *      123456789 = $123,456,789
         *      0.1 = 10%
         * We can format these using the NumberFormat{} class, which is inside the Java.text package. In this package we have a lot of classes for handling text, dates, numbers, and so on.
         *
         *      NumberFormat formattingCurrency = new NumberFormat();
         * Now if you noticed you will get a compilation error with the above example, because it is an Abstract class. You cannot use a new operator to create an instance of them. Think
         * of them as a half-baked cake, and you are required to complete the cake with the Abstract Class methods. Will learn more later in course. Instead, we can use something that is
         * called a "Factory Method".
         *
         * Factory Method: Creates new objects like a factory (person definition)
         * Method Chaining: We are chaining multiple methods together (View variable percentStringChaining for an example)
         *
         *
         *
         */
        System.out.println();
        System.out.println("Formatting Numbers");
        // Currency Formatting
        NumberFormat formattingCurrency = NumberFormat.getCurrencyInstance();
        String currencyString = formattingCurrency.format(1234567.891);
        System.out.println(currencyString);
        // Percent Formatting
        NumberFormat formattingPercent = NumberFormat.getPercentInstance();
        String percentString = formattingPercent.format(0.1);
        System.out.println(percentString);
        // Method Chaining
        String percentStringChaining = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(percentStringChaining);
        /*
         * Reading Input
         *
         * You can read input for a user using the Scanner{} class
         */
        System.out.println();
        System.out.println("Reading Input");
        // Initialize the Scanner variable
        Scanner scanner = new Scanner(System.in);
        /*
         * Weird bug so added this example first to get it functional in console
         */
        System.out.flush();
        System.out.print("Name Two: ");
        String scannerNameTwo = scanner.nextLine().trim(); // Adding trim() method removes any unnecessary white spaces in the user input
        System.out.println("You are " + scannerNameTwo);
        // Concatenating a String
        System.out.print("Age: "); // Use print() method so that the inputted value stays on the same line
        byte scannerAge = scanner.nextByte();
        System.out.println("You are " + scannerAge); // Concatenating a String with a Byte
        /*
         * When we type our name "Anthony" it will output your name "Anthony" however, if you want to add your full name say, "Anthony MacAllister" Only "Anthony" wil lbe displayed. Each String
         * is called a token. Token 1 "Anthony" & Token 2 "MacAllister". Every time we call the next() method, it only reads one token. To call both Tokens we can use the nextLine() method.
         */
        // Calling one token
        System.out.print("Name: ");
        String scannerName = scanner.next();
        System.out.println("You are " + scannerName);
        // Calling all tokens
            // A weird bug, so added it as first input option


        /*
         * Project: Mortgage Calculator
         *
         * Principal: Amount of loan
         * Annual Interest Rate (AIR):
         * Period (Years):
         * Mortgage: $
         *
         * Formula: M = P * r(1 + r) POWER n
         *      M = Monthly Payment
         *      P = Principal
         *      r =  Monthly interest rate (divide by your annual interest rate by 21)
         *      n = number of payments
         *
         *  100,000 *  NEW_AIR (1 + NEW_AIR) * Period
         *
         * AIR / 100  (to get the percent for the NEW_AIR value)
         * NEW_AIR / 12 (This gets you the monthly interest rate)
         *
         */

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Project: Mortgage Calculator");
        // Principal
        System.out.print("Principal: ");
        int projectPrinciple = scanner.nextInt();
        // AIR
        System.out.print("Annual Interest Rate: ");
        float projectAnnualRate = scanner.nextFloat();
        float projectAnnualRateDivided = projectAnnualRate / 100;
        float projectAIRD = projectAnnualRateDivided / 12; // Monthly Interest Rate
        // Period
        System.out.print("Period (Years): ");
        byte projectPeriod = scanner.nextByte();
        int projectPeriodMultiple = projectPeriod * 12;
        //int projectPeriodMultiple = (int) Math.pow(projectPeriod, 12);
        // MATH
        //int projectMonthlyRate = (int) ((projectAnnualRate / 100) / 12);
        //int projectMortgage = (projectPrinciple * projectMonthlyRate) + (1 + projectMonthlyRate) * (projectPeriod);
        double projectMortgage =
                projectPrinciple *
                        (projectAIRD * Math.pow(1 + projectAIRD, projectPeriodMultiple)) /
                        (Math.pow(1 + projectAIRD, projectPeriodMultiple) - 1);

        String projectCurrencyString = formattingCurrency.format(projectMortgage);

        // Mortgage
        System.out.print("Mortgage: " + projectCurrencyString);

        /*
         * Project: Mortgage Calculator
         *
         * Mosh Example
         */
        System.out.println();
        System.out.println();
        System.out.println("Mosh Mortgage Calculator");
        final byte MONTHS_IN_YEARS = 12; // Constant
        final byte PERCENT = 100; // Constant

        // Scanner scanner = new Scanner(System.in); // Used this exact variable above

        System.out.print("Principal: ");
        /*
         * We did not use "short" type because it has a max of 32k and that is not enough. If a person wanted to finance 1 million dollars this would be a problem. Since we used int
         * we can store a value up to 2 billion.
         */
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        /*
         * For the interest rate we could use double or float however, since float uses less memory and is sufficient, it is the better option.
         */
        float annualInterest = scanner.nextFloat();
        /*
         * Avoid magic numbers when possible so that the next developer can understand what the variables are being used for.
         *
         * Magic numbers would be the 12 and 100 in the example below:
         *      float monthlyInterest = annualInterest / 100 / 12;
         */
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;

        System.out.print("Period (Years): ");
        /*
         * When it comes to how many years a mortgage can be obtained for, byte is the ideal option to use. Byte has a max of 127 which we will never reach will utilize a mortgage period.
         */
        byte years = scanner.nextByte();
        /*
         * Pretty self explanatory.
         */
        int numberOfPayments = years * MONTHS_IN_YEARS;

        /*
         * Here we will use double since Float is not sufficient. The formal for the equation below is like so:
         *               r(1 + r)n
         *      M = P ----------------
         *              (1 + r)n - 1
         *
         *
         *                              monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
         *      Mortgage = Principal ----------------------------------------------------------------------
         *                                    Math.pow(1 + monthlyInterest, numberOfPayments) -1
         *
         * Keep in mind that this program is a simple example and does have a number of problems. The first problem would be input validation. To fix this problem you can use
         * conditional statements to valid the value the user is inputting.
         *
         */
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);





    }
}
