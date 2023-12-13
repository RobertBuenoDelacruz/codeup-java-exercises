import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        boolean confirm;

        do {
            System.out.println("Say something to Bob.");
            String userInput = sc.nextLine();

            if(userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            }else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Continue? [y/n]");
            confirm = sc.nextLine().equalsIgnoreCase("y");
        } while(confirm);
        System.out.println("See ya!");
    }
}
