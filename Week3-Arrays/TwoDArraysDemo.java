import java.util.Random;

public class TwoDArraysDemo {
    public static void main(String[] args) {
        int numTickets = 100;
        int[][] userPicks = new int[numTickets][6];

        Random rng = new Random();

        for (int eachTicket = 0; eachTicket < userPicks.length; eachTicket++) {
            int[] singleTicket = userPicks[eachTicket];

            for (int ticketNumbers = 0; ticketNumbers < userPicks[eachTicket].length; ticketNumbers++) {
                singleTicket[ticketNumbers] = rng.nextInt(1, 69);
            }
        }

        for (int[] each: userPicks) {
            System.out.println("\n\nTicket numbers: ");
            for (int eachNum: each) {
                System.out.print(eachNum + " ");
            }
        }

    }
}
