package com.ezenity.oop.classes.creatingObjects;

/**
 * Creating Objects
 * <p>
 * Here we will create a TextBox variable and instantiate it with the TextBox() class. This means we are creating a
 * new instance of this class. As you can see we have a repetitive TextBox keyword, and we can replace this with "var".
 * The var keyword allows local variable type inference, this basically means we do not need to declare it (The Java compiler
 * will detect the type of the variable based on what is instantiated. . This feature
 * was added in Java 10.
 * <ul>
 *     <li>Demo:</li>
 *     <lu>
 *         <li>TextBox textBox1 = new TextBox(); // old</li>
 *         <li>var textBox1 = new TextBox(); // new</li>
 *     </lu>
 * </ul>
 */
public class Main {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Creating Objects");
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);

        /*
         * Now when we run textBox3 we receive a null. Why, because by default when we do not initialize our fields they are set to null.
         * Nulls can be dangerous because it can lead to compilation errors such as NPE (Null pointer Exception)
         */
        var textBox3 = new TextBox();
        System.out.println(textBox3.text);
        /*
         * The example below shows how dangerous it can be. Since the 'text' String field is not initialized the first time around
         * we will receive a NPE which will crash our program. To fix this issue, you initialize the 'text' String field to an empty String.
         * However, if you want to see the NPE remove the `= ""` from the 'text' field inside the TextBox{} class.
         */
        System.out.println(textBox3.text.toUpperCase());


    }
}
