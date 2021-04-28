/**
 *  Feb 02, 2021
 */
package javalab;

import java.util.Scanner;
import java.lang.Math;
import static src.KotlinUtils.print;

class Feb02 {
    public static void main(String[] args){
        checkPrime();
        checkArmstrong();
    }
    public static void checkPrime(){
        // Driver Code for checking prime
        var scanner = new Scanner(System.in);
        print("Check Prime\nGive me Number");

        int input = Integer.parseInt(scanner.next());
        print(input + " is " + isPrime(input) + "\n");
    }
    public static void checkArmstrong() {
        // Driver Code for checking Armstrong
        var scanner = new Scanner(System.in);
        print("Check Armstrong\nGive me Number");

        var input = scanner.nextInt();
        print(input + " is " + isArmstrong(input) + "\n");
    }

    private static String isPrime(int input) {
        //  Logic code for checking Prime
        if (input == 2) { return "Prime."; }
        if ((input <= 1) || (input % 2 == 0)) { return "not Prime."; }
        for (int div=3; div <= Math.sqrt(input); div+=2) {
            if (input % div == 0) return "Not Prime";
        }
        return "Prime";
    }
    private static String isArmstrong(int input) {
        // Logic code for checking Armstrong
        int summation = 0;
        for (var number: String.valueOf(input).toCharArray()) {
            summation += Math.pow(Integer.parseInt(String.valueOf(number)), 3);
        }

        return (summation == input) ? "Armstrong" : "Not Armstrong";
    }
}
