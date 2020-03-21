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
 * <h3>Upcasting</h3>
 * Casting an object to one of its <b>super</b> types
 *
 * <h3>Downcasting</h3>
 * Casting an object to one of its <b>sub</b> types
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

        System.out.println();
        System.out.println();

        //var controlCasting = new UIControl(true);
        //show(controlCasting);

        //System.out.println();

        var textBoxControl = new TextBox();
        show(textBoxControl);

        System.out.println();
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        /*
         * This two outputs will return false because it is being based on their references. This is where
         * we want to override the object class ( .equals() )
         */
        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

    }

    public static void show(UIControl uiControl){
        if (uiControl instanceof TextBox) {
            var textBox = (TextBox) uiControl; // downcasting
            textBox.setText("Hello World");
        }
        System.out.println(uiControl);
    }
}
