import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] arg) { // <---psvm is the short cut

        // While Loop----------------------
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }
        // Do-While Loop--------------------

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i <= 1000000);

        //For Loop-------------------------

//        for(int i = 100; i > -10; i -= 5) {
//            System.out.println(i);
//        }

//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

        // FizzBuzz-------------------------

//        for(int i = 0; i <= 100; i++ ) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i + " FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println(i + " Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println(i + " Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // Display Tables of Powers -----------

//        Scanner scanner = new Scanner(System.in);
//
//        boolean confirm;
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | ------");
//
//            for(int i = 1; i <= userInt; i++) {
//                int square = i * i;
//                int cubed = i * i * i;
//
//                System.out.printf("%-7s|%-9s|%-7s\n", i, square, cubed);
//            }
//            System.out.println("Continue? [y/n]");
//            confirm = scanner.next().equalsIgnoreCase("y");
//
//        }while(confirm);
//        System.out.println("Cool! See you next time!");

        // Grading system -------------------------
        Scanner scanner = new Scanner(System.in);

        boolean confirm;
        do {
            System.out.println("Enter a numerical grade from 0 to 100.");
            int userGrade = scanner.nextInt();

            if(userGrade >= 88 && userGrade <= 100) {
                System.out.println("A");
            } else if (userGrade >= 80 && userGrade <= 100) {
                System.out.println("B");
            } else if (userGrade >= 67 && userGrade <= 100) {
                System.out.println("C");
            } else {
                System.out.println("F");
            }

            System.out.println("Continue? [y/n]");
            confirm = scanner.next().equalsIgnoreCase("y");
        }while (confirm);
        System.out.println("Ok thank goodbye!");
    }
}
