package com.ezenity.oop.inheritance;

/**
 * Base/Super/Parent Class
 *
 * This class is an example of what we can have in our single class
 *
 * The isEnabled field should be true by default because we always want our UIControls to be enabled.
 */
public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    /**
     * This method will set the isEnabled field to true.
     */
    public void enabled() {
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
