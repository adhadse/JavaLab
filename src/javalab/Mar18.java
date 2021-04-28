/**
 *  Mar 18, 2021
 */
package javalab;

import java.util.HashMap;
import static src.KotlinUtils.print;

public class Mar18 {
    public static void comparingStrings() {
        print("Runnning comapring Strings fun");
        var name = "anurag";
        var name2 = "anurag";
        var name3 = "simran";

        print(name.equals(name2));
        print(name.equals(name3));

        print(name.compareTo(name2));
        print(name.compareTo(name3));
    }
    public static void replaceWithSubString(String text) {
        print("\nRunning replace With Sub-String function");

        var original_string = "This is a long String 123 In which we will Replace Numbers";
        print(original_string);

        print(original_string.replaceFirst("\\s(\\d+)", text));
    }
    public static void validateUserIdAndPass() {

    }
    public static void printDuplicates(String inputText) {
        print("\nRunning Duplicates program");
        var tokens = inputText.split("\s");

        for (int index=0; index<tokens.length; index++) {
            for (int indexAfter=index+1; indexAfter<tokens.length; indexAfter++) {
                if (tokens[index].compareToIgnoreCase(tokens[indexAfter]) == 0) {
                    print("Duplicate: " + tokens[index]);
                }
            }
        }
    }
    public static void checkAnagram(String string1, String string2) {
        print("\nRunning checkAnagram");
        // using hashmap
        if (string1.length() != string2.length()) return;
        var hashForString1 = new HashMap<Character, Integer>();
        var hashForString2 = new HashMap<Character, Integer>();
        for (var character: string1.toLowerCase().toCharArray()) {
            var count = hashForString1.getOrDefault(character, 0);
            hashForString1.put(character, count+1);
        }
        for (var character: string2.toLowerCase().toCharArray()) {
            var count = hashForString2.getOrDefault(character, 0);
            hashForString2.put(character, count+1);
        }
        var keysForString1 = hashForString1.keySet();
        print(hashForString1);
        print(hashForString2);
        for (var key: keysForString1 ) {
            if (!hashForString1.get(key).equals(hashForString2.get(key))) {
                //if any character occurs more in other
                // string it is not anagram
                print("Not a anagram");
                return;
            }
        }
        print("The strings " + string1 + " & " + string2 + " are anagram");

    }
    public static void main(String [] args) {
        comparingStrings();
        replaceWithSubString("seriously java?");
        printDuplicates("Here I check whether I here get a positive result check");
        checkAnagram("brainy", "binary");
    }
}
