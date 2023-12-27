//import java.util.Scanner;
//
//public class MethodExercises {
//    public static void main(String[] args) {
//
////        System.out.println(addingNums(5, 5)); // 10
////        System.out.println(subtractingNums(10, 5)); // 5
////        System.out.println(multiplyingNums(5, 5)); // 25
////        System.out.println(dividingNums(10, 5)); // 2
////        System.out.println(remainderNums(10, 4)); //2
////
////        System.out.println(getInteger(1, 100));
//
////        do {
////            long result = factorial();
////            System.out.println("Factorial result: " + result);
////        } while(confirm());
//
////        do{
////            System.out.println(dice());
////        } while (confirm());
////
////    }
//    // Methods --------------------------------
//    public static int addingNums(int a, int b) {
//        return a + b;
//    }
//    public static int subtractingNums(int a, int b) {
//        return a - b;
//    }
//    public static int multiplyingNums(int a, int b) {
//        return a * b;
//    }
//    public static double dividingNums(double a, double b) {
//        return a / b;
//    }
//    public static int remainderNums(int a, int b) {
//        return a % b;
//    }
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in); // Scanner scans for what the user inputs
//        System.out.println("Enter a number between " + min + " and " + max);
//        int userInput = sc.nextInt();
//        if(userInput >= min && userInput <= max) {
//            return userInput;
//        }
//            return getInteger(min, max); // you do not need an else statement for this
//    }
//
//    public static long factorial() {
//        int numToFactorialize = getInteger(1, 10);
//
//        long currentSum = 1;
//        for(int counter = 1; counter <= numToFactorialize; counter++) {
//            currentSum *= counter;
//        }
//        return currentSum;
//    }

//    public static boolean confirm() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Would you like to continue? [y/n]");
//        String answer = scanner.nextLine();
//        return answer.equalsIgnoreCase("y");
//
//        // Dice
//        public static String dice() {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("How many sides does your dice have?");
//            int sides = sc.nextInt();
//            int dice1 = (int) ((Math.random() * sides) + 1);
//            int dice2 = (int) ((Math.random() * sides) + 1);
//
//            return "dice #1 = " + dice1 + " dice #2 = " + dice2;
//
//        }
//    }
//}
