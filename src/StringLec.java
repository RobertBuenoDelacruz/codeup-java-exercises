import java.util.Scanner;

public class StringLec {
    public static void main(String[] args) {

        String input = "Codeup Rocks!";
        // Below are examples of String Comparison Methods comparing to the string above

        System.out.println(input.equals("codeup rocks!"));// false
        System.out.println(input.equals("Codeup Rocks!")); // true


        System.out.println(input.equalsIgnoreCase("codeup rocks!")); // true
        System.out.println(input.equalsIgnoreCase("Codeup Rocks!"));; // true

        System.out.println(input.startsWith("Codeup")); // true

        System.out.println(input.endsWith("rocks")); // false
        System.out.println(input.endsWith("rocks!")); // false
        System.out.println(input.endsWith("Rocks!")); // true

        // String Manipulation Methods

        String manipulation = "String to manipulate";
        String trimTest = "         String to manipulate         ";

        System.out.println(manipulation.charAt(4)); // Gives us back the character at that index
        System.out.println(manipulation.indexOf("y")); // Since it does not exist we get a -1
        System.out.println(manipulation.indexOf("i")); // Gives back the first i
        System.out.println(manipulation.lastIndexOf("n")); // Gives back the last index of n
        System.out.println(manipulation.length()); // Give the total number of index's in the string
        System.out.println(manipulation.replace("manipulate", "change")); // Changes one words or a set of characters to something else - takes in 2 arguments
        System.out.println(manipulation.substring(0, 6)); // Gives us "String" to start and stop at certain index's
        System.out.println(manipulation.toLowerCase()); // LowerCases all or certain char.
        System.out.println(manipulation.toUpperCase()); // UpperCases all or certain char.
        System.out.println(trimTest.trim()); // Removes the leading and ending white spaces

        // \ backslash is used for escape character to help you use 's in words
    }
}
