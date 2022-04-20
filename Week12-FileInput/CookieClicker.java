import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CookieClicker {
    public static void main(String[] args) {
        loadState("Week12-FileIO/src/gamesavedstate.txt");
    }

    static void loadState(String filename) {
        String userName;
        int numCookies;
        int numCursors;
        int numGrandmas;
        int numFarms;

        File myfile = new File(filename);

        try {
            Scanner input = new Scanner(myfile);

            userName = input.next();
            numCookies = Integer.parseInt(input.next());
            numCursors = input.nextInt();
            numGrandmas = input.nextInt();
            numFarms = input.nextInt();

            System.out.println("Game save info loaded!");
            System.out.println("You now have " + numCookies + " cookies, " + userName);

        } catch (FileNotFoundException exception) {
            System.out.println("We lost all your cookies!");
            System.out.println(exception);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        } catch (Exception exception) {
            System.out.println("I dunno what happened...");
            exception.printStackTrace();
        }

        /*
          throw new FileNotFoundException();
         */

    }
}
