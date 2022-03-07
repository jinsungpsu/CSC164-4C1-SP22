import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lottery powerball = new Lottery();
        powerball.date = "3/7/22";
        powerball.name = "Powerball";

        Lottery megamillions = new Lottery();

        LotteryTicket mrAn = new LotteryTicket();
        mrAn.date = "3/7/22";
        LotteryTicket matthew = new LotteryTicket();
        matthew.date = "3/8/22";
        matthew.name = "Matthew";
//        LotteryTicket tyler = new LotteryTicket();
//        LotteryTicket stanley = new LotteryTicket();

        matthew.date = "3/7/22";

        mrAn.pickNumbers();
        matthew.pickNumbers();

        powerball.drawballs();
        megamillions.drawballs();

        powerball.displayNumbers();
        megamillions.displayNumbers();

        mrAn.displayNumbers();
        matthew.displayNumbers();

        megamillions.checkNumbers(matthew);
        powerball.checkNumbers(matthew);

        powerball.checkNumbers(mrAn);
        megamillions.checkNumbers(mrAn);
    }
}

class Lottery {
    String name;
    String date;
    int[] lotteryNumbers = new int[3];

    Lottery() {
        // constructor
        // code that runs when object is created
        // often used to initialize stuff

        name = "default";
        date = "no date has been set yet";

        System.out.println("A lottery object has been created!!!");
    }

    void drawballs() {
        Random rand = new Random();
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = rand.nextInt(1, 5);
        }
    }

    void checkNumbers(LotteryTicket ticket) {
        int numberOfMatches = 0;
        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] == ticket.userPicks[i]) {
                numberOfMatches++;
            }
        }
        System.out.println(ticket.name + " has matched " + numberOfMatches + " balls!");
    }

    void displayNumbers() {
        System.out.println("Lottery info: ");
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Lottery numbers are: ");
        for (int i = 0; i < lotteryNumbers.length; i++) {
            System.out.println(lotteryNumbers[i]);
        }
    }
}

class LotteryTicket {
    String name;
    String date;
    int[] userPicks = new int[3];

    LotteryTicket() {
        System.out.println("A lottery ticket is now printed!");
    }

    void displayNumbers() {
        System.out.println("Ticket belongs to: " + name);
        System.out.println("User picked numbers: ");
        for (int i = 0; i < userPicks.length; i++) {
            System.out.println(userPicks[i]);
        }
    }
    void pickNumbers() {
        Random rand = new Random();
        for (int i = 0; i < userPicks.length; i++) {
            userPicks[i] = rand.nextInt(1, 5);
        }
    }
}
