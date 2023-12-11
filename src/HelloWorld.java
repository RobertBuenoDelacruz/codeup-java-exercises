import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        //psvm TAB is the shortcut to create the method above
        System.out.println();
        //sout TAB is the shortcut to create the method above
        int id;
        boolean isLoggedIn;
        float bankAccountBalance;

        id = 123;
        isLoggedIn = false;
        bankAccountBalance = 1000.23F;

        int theAnswer = 42;
        String question = "What is your favorite color?";

        int myInteger = 900;
        long morePrecise = myInteger;

        double pi = 3.14159;
        int almostPi = (int) pi;

        System.out.println(pi);
        System.out.println(almostPi);
        //--------------------Exercise---------------------

        // 1.
        int myFavoriteNumber = 51;
        System.out.println(myFavoriteNumber);

        // 2.
//        String myString = "Here is my string.";
//        System.out.println(myString);

        // 3.
//        myString = "T";
//        System.out.println(myString);
//        myString = 't';
//        System.out.println(myString);

        // 4.
//        myString = 3.14159;
//        System.out.println(myString);

        // 5.
//        long myNumber;
//        System.out.println(myNumber);

        // 6.
//        myNumber = 3.14;
//        System.out.println(myNumber);

        // 7.
//        long myNumber = 123L;
//        System.out.println(myNumber);

        // 8.
//        myNumber = 123;
//        System.out.println(myNumber);

        // 9.
//        double myNumber = 3.14;
//        System.out.println(myNumber);

        // 10.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // 11.
//        String myClass = "This is a string";

        // 12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        System.out.println(o);
//        int three = (int) o;
//        System.out.println(three);

        // 13.
//        int x = 4;
//            x = x + 5;
//        x = x + 5;
//            x += 5;
//
//
//        int x = 3;
//        int y = 4;
//        y = y * x;
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

        // 14.
//        byte myNum = 127;
//        System.out.println(myNum++);
//        System.out.println(myNum);


        //Console Input and Output Lecture -----------------

//        System.out.println("hello");
//        System.out.print("world");

        String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you. %n", name);

        String greeting = "Salutations";
        System.out.printf("%s, %s! %n", greeting, name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}

