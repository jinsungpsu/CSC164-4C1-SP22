import java.util.Scanner;

public class NextCharDemo {
    public static void main(String[] args) {
        System.out.println("PLease enter y or n for yes or no: (Y/N)");
        Scanner input = new Scanner(System.in);
        String userChoice = input.next();
        char firstCharOfUserChoice = userChoice.charAt(0);

        System.out.println("You entered: " + firstCharOfUserChoice);
    }
}
