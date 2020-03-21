package com.ezenity.oop.interfaces;

/**
 * Drag an object on the screen
 */
public class Dragger {
    public void drag(Draggable draggable){
        draggable.drag();
        System.out.println("Dragging done!");
    }
}
