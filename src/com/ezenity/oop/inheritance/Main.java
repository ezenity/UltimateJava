package com.ezenity.oop.inheritance;

/**
 * Inheritance
 * <p>
 * Third principle in Object-oriented Programming.
 * <p>
 * This section will cover Constructors, Access Modifiers, Overriding Methods, Comparing Objects,
 * and Polymorphism.
 *
 * We use inheritance where we want to consolidate reused code in one location. We will basically create
 * a single class that will have these behaviours where other classes will inherit these controls.
 *
 * This single class can be called any of the following:
 * <lu>
 *     <li>Base</li>
 *     <li>Super</li>
 *     <li>Parent</li>
 * </lu>
 * Where the class that will inherit this single class could be called any of the following:
 * <ul>
 *     <li>Sub</li>
 *     <li>Child</li>
 * </ul>
 *
 */
public class Main {

    public static void main(String[] args) {
        //var control = new UIControl();
        //control.disabled();
        //System.out.println(control.isEnabled());

        var box1 = new TextBox();
        var box2 = box1;
        //System.out.println(box1.hashCode()); // Gets the has code for this object
        //System.out.println(box2.hashCode());
        box2.setText("Hello World");
        System.out.println(box1);
    }
}
