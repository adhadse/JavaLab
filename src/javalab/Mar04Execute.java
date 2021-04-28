/**
 *  March 4, 2021
 */
package javalab;

import javalab.Mar04;
import javalab.Mar04Derived;

public class Mar04Execute {
    public static void main(String[] argv) {
        var baseObject = new Mar04();
        var derivedObject = new Mar04Derived();

        // Run overloaded function
        baseObject.do_something("oh my java!");

        // Run overided function from derived class
        derivedObject.do_something();
    }
}
