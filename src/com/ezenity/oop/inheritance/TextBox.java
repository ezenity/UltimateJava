package com.ezenity.oop.inheritance;

/**
 * This class has a public access modifier. This means weather or not other classes in this project
 * can access this class or not.
 *
 * public basically means that it is visible in all other classes in this project.
 */
public class TextBox extends UIControl {
    /*
     * When creating your fields, we use the camel casing notation. Camel casing has the first letter of every word
     * capitalized except the first word. Typically, when creating programs, we do not make field public but rather
     * private or protected.
     */
    // public String text; // field - Gives NPE when we do not setText()
    //public String text = ""; // field - This fixes the NPE inside the Main class
    private String text = ""; // Adding abstraction principle.

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    @Override
    public String toString() {
        return text;
    }
    /*
     * We use the "this" keyword when we have both the field and parameter named the same since it can be confusing. the
     * "this" keyword is a reference to the print object.
     */
    public void setText(String text){
        this.text = text;
    }

    /*
     * Here we don't need to use the "this" keyword since we have no paramters and the text keyword is pretty clear where it
     * is being used from.
     */
    public void clear() {
        text = "";
    }
}
