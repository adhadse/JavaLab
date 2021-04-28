/**
 *  Feb 09, 2021
 */
package javalab;

import java.util.Scanner;
import java.util.stream.IntStream;


public class Feb09 {
    private static int[] displayElementsOfArray() {
        var scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();

        int [] newArray = new int[size];

        for (int i = 0; i <newArray.length; i++ ) {
            System.out.println("Enter Elements: ");
            int element = scanner.nextInt();
            newArray[i] = element;
        }

        //Printing elements
        System.out.println("\nPrinting Array");
        for (var element : newArray) {
            System.out.println(element);
        }
        return newArray;
    }

    private static void sumAndAverageOfArray(int [] array) {
        var sum = 0;
        for (var element : array) {
            sum += element;
        }
        var average = sum/array.length;
        System.out.println("The sum of array is " + sum + " and average is " + average);
    }

    private static int findIndexOfArrayElement(int [] array) {
        System.out.println("\nTo find index of element; Enter Key");
        var scanner = new Scanner(System.in);
        int key = scanner.nextInt();

        for (int index=0; index < array.length; index++) {
            if (array[index] == key) {
                System.out.println("Index found at " + (index + 1));
            }
        }
        return key;
    }
    private static int [] insertElementAtPosition(int [] array) {
        System.out.println("\nInsert element at specific position; Enter location");
        var scanner = new Scanner(System.in);
        int location = scanner.nextInt();

        System.out.println("Enter value");
        int value = scanner.nextInt();

        int [] replacementArray = new int[array.length + 1];
        for (int index = 0; index < array.length; index++) {
            if ((index + 1) == location) {
                replacementArray[index] = value;
                for (int index2=index; index2 < array.length; index2++) {
                    replacementArray[index2 + 1] = array[index2];
                }
                break;
            } else replacementArray[index] = array[index];
        }
        System.out.println("Now printing");
        for (var element: replacementArray) {
            System.out.println(element);
        }
        return replacementArray;

    }
    public static void main(String [] args) {
        var createdArray = displayElementsOfArray();
        sumAndAverageOfArray(createdArray);
        findIndexOfArrayElement(createdArray);
        insertElementAtPosition(createdArray);
    }

}
