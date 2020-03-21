package com.ezenity.oop.inheritance;

/**
 * Adding final to a class allows it to not be able to extended into other classes. Only a rare case when
 * it is needed.
 */
public final class CheckBox extends UIControl {

    public CheckBox(boolean isEnabled) {
        super(isEnabled);
    }

    @Override
    public void render() {
        System.out.println("Render Checkbox");
    }
}
