package com.ezenity.oop.classes.memoryAllocation;

/**
 * Classes Intro
 * <ul>
 *     <li>Encapsulation</li>
 *     <li>Abstraction</li>
 *     <li>Constructors</li>
 *     <li>Getters / Setters</li>
 *     <li>Method Overloading</li>
 * </ul>
 */
public class Main {
    public static void main(String[] args){
        /*
         * Memory Allocation
         *
         * Java stores two different types of memory:
         *      Heap
         *          Store the objects
         *      Stack
         *          Stores short-lived variables like primitives and short-lived variables like references to objects on the heap.
         *
         * Both of the variables below are referencing the same textBox object on the Heap. We have two variables on the stack however that are
         * referencing this object. "textBoxMemory1" is the address location on the Heap. So by doing this, if the value is changed it will be
         * visible to the other variable.
         *
         * With Java, we do not need to worry about memory de-allocation, unlike C++. Java automatically removes the memory for us. The way this
         * works is that when we move out a given method, Java will remove the variables out of the stack it is stored in. However, we still have
         * objects on the Heap, and with another process when a certain time length occurs Java will remove this object off of the Heap. This is
         * called "Garbage Collection".
         *
         * Garbage Collector: Remove unused objects on the Heap. (The time length can be adjusted using Java runtime parameters.)
         */
        System.out.println();
        System.out.println("Memory Allocation");
        var textBoxMemory1 = new TextBox();
        var textBoxMemory2 = textBoxMemory1;
        textBoxMemory2.setText("Hello World");
        System.out.println(textBoxMemory1.text);


    }

}
