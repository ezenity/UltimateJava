package com.ezenity.oop.interfaces;

/**
 * <b>Interface Segregation Principle</b>
 * <p>
 * Examples of UIWidgets are:
 * <ul>
 *     <li>Text Boxes</li>
 *     <li>Check Boxes</li>
 *     <li>Regular Buttons</li>
 *     <li>Etc...</li>
 * </ul>
 * Now we have the drag() method being used in our Dragger{} class but the other methods
 * are not being used inside this method. So, let's say that the resize() method gets a
 * parameter. By doing this, the Dragger{} class needs to be recompiled. This can be
 * problematic if we have tons of classes specially if this interface has tons upon tons
 * of methods inside of it. This is where we use the 'Interface Segregation Principle'. We
 * will make smaller interfaces that is focused on each capability.
 */
public interface UIWidget
        extends Draggable, Resizable {
    void render();
}


