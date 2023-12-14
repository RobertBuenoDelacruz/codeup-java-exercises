import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {

        System.out.println(addingNums(5, 5)); // 10
        System.out.println(subtractingNums(10, 5)); // 5
        System.out.println(multiplyingNums(5, 5)); // 25
        System.out.println(dividingNums(10, 5)); // 2
        System.out.println(remainderNums(10, 4)); //2

        System.out.println(getInteger(1, 100));

    }
    // Methods --------------------------------
    public static int addingNums(int a, int b) {
        return a + b;
    }
    public static int subtractingNums(int a, int b) {
        return a - b;
    }
    public static int multiplyingNums(int a, int b) {
        return a * b;
    }
    public static int dividingNums(int a, int b) {
        return a / b;
    }
    public static int remainderNums(int a, int b) {
        return a % b;
    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in); // Scanner scans for what the user inputs
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = sc.nextInt();
        if(userInput >= min && userInput <= max) {
            return userInput;
        } else {
            return getInteger(min, max);
        }
    }
}
