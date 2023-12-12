import java.util.Objects;
import java.util.Scanner;

public class ControlStatementsLoops {
    public static void main(String[] args) {
//      -------------Boolean Expression---------------
        System.out.println(10 > 5);
        System.out.println(5 == 5);
        System.out.println(true == false);
        System.out.println();
        System.out.println(2 <= 2);

//        -------------Logical Operators-----------
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        if(isLoggedIn && isAdmin) {
            System.out.println("admin page");
        }

        System.out.println((true == true) || true == false);

//        ------------- String Comparison ----------
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Continue? [y/n] ");
        //String userInput = sc.next();

        //boolean confirmation = userInput == "y";
//        System.out.print(userInput == "y");  DO NOT USE THIS
        //System.out.print(Objects.equals(userInput, "y")); // USE THIS

//        ------------ Control Structure -----------
        boolean lectureTime = true;
        if(lectureTime) {
            System.out.println("learning something.");
        } else {
            System.out.println("this will always run");
        }

        boolean learningJava = true;
        boolean learningJavaScript = true;
        boolean learningHTML = true;

        //Order of operations is very important, it will only perform what is first.
        if(learningJava && learningHTML && learningJavaScript) {
            System.out.println("Learning all languages");
        } else if(learningJavaScript){
            System.out.println("Learning JavaScript");
        } else if(learningHTML) {
            System.out.println("Leaning HTML");
        } else if(learningJava) {
            System.out.println("Learning Java");
        } else {
            System.out.println("Learning something else");
        }

        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
                break; //<--- we need break for it to stop at case 1
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;

        }
//        int i = 11;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }
//        do {
//            System.out.println("You will see this despite the condition!");
//        } while (i < 10);

        for(int i = 0; i <= 20; i++) {
            if(i == 7) {
                System.out.println("Lucky Number");
                continue;  //does not print the #7 but gets replaced
            }
            if(i == 9) {
                System.out.println("break the loop");
                break; //does not print the #9 but gets replaced and the loop stops
            }
            System.out.println("i " + i);
        }
    }
}
