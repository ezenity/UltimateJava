package com.ezenity.oop.classes.reducingCoupling;

/**
 * Reducing Coupling
 * <p>
 * Rule of thumb when working with classes and methods, keep all detail methods hidden and only
 * make methods public that you want to be used outside that class.
 * <p>
 * Look at the Browser{} class for an example.
 */
public class Main {
    public static void main(String[] args){
        var browser = new Browser();
        browser.navigate("http://exenity.com");
    }
}
