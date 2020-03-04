package com.ezenity.types;

import java.awt.*;
import java.util.Date;

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
    }
}
