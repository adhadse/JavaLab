/**
 *  January 28, 2021
 */
package javalab;

import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        usingCommandLineArguments(args);
        usingScannerClass();
    }
    private static void usingCommandLineArguments(String[] args) {
        // 1. Static methods are the methods in Java that can be
        //    called without creating an object of class
        // 2. Shared among all Objects created from the same class.
        // 3. Static methods can NOT BE OVERRIDDEN. But can be overloaded,
        //    since they are resolved using STATIC BINDING by compiler at compile time.
        var i = 0;
        for (var arg : args){
            System.out.println("Argument No."+ i +" "+ arg);
            ++i;
        }
    }

    private static void usingScannerClass(){
        var scanner = new Scanner(System.in);
        System.out.println("Enter No: ");

        int input = Integer.parseInt(scanner.next());
        var oddOrEven = oddOrEven(input);
        System.out.println("Input was " + oddOrEven );
    }

    private static String oddOrEven(int number) {
        // 1. Instance method(s) belong to the Object of the class not to the class i.e.
        //    they can be called after creating the Object of the class.
        // 2. Every individual Object created from the class has its own
        //    copy of the instance method(s) of that class.
        // 3. Instance methods are not stored on a per-instance basis,
        //    even with virtual methods. They’re stored in a single memory
        //    location, and they only “know” which object they belong to
        //    because the this pointer is passed when you call them.
        // 4. They CAN BE OVERRIDDEN since they are resolved using DYNAMIC BINDING at run time.
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
