package com.ezenity.oop.inheritance;

/**
 * Base/Super/Parent Class
 *
 * This class is an example of what we can have in our single class
 *
 * The isEnabled field should be true by default because we always want our UIControls to be enabled.
 */
public abstract class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    public abstract void render();

    /**
     * This method will set the isEnabled field to true.
     *
     * Adding a final to a method allows it not to be able inherited into other classes
     */
    public final void enabled() {
        isEnabled = true;
    }

    /**
     * This method will set the isEnabled field to false.
     */
    public void disabled() {
        isEnabled = false;
    }

    /**
     * This method will get the value of the isEnabled field.
     *
     * @return Return field value
     */
    public boolean isEnabled() {
        return isEnabled;
    }

}
