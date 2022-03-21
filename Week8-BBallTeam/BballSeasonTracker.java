import java.util.Random;

public class BballSeasonTracker {
    public static void main(String[] args) {
        BballTeam sixers = new BballTeam("Sixers");
        Random random = new Random();

        int[][] scores = new int[82][4];
        for (int game = 0; game < 82; game++) {
            for (int qtr = 0; qtr < 4; qtr++) {
                // We will assign a random number between 20 and 40 for each quarter)
                int randomQtrScore = random.nextInt(20, 40);
                // scores[game][qtr] = randomQtrScore;

                sixers.setGameAndQuarterScore(game, qtr, randomQtrScore);

                sixers.getScores()[game][qtr] = randomQtrScore;
            }
        }
        // sixers.setScores(scores);

        for (int game = 0; game < 82; game++) {
            for (int qtr = 0; qtr < 4; qtr++) {
                System.out.print("Q" + (qtr+1) + ": " + sixers.getScores()[game][qtr] + "\t");
            }
            System.out.println();
        }


    }
}

/*
import java.util.Random;
import java.util.Scanner;

public class BasketballSeasonTracker {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        // This 2 dimensional array holds scores for 82 games by quarter
        int[][] teamScores = new int[82][4];
        Random random = new Random();

        // Seeding random for testing purposes
        random.setSeed(0);

        // for pseudorandom values, seed with current time
        // random.setSeed(System.currentTimeMillis());

        // Initialize the array to random scores
        for (int game = 0; game < teamScores.length; game++) {
            for (int qtr = 0; qtr < teamScores[0].length; qtr++) {
                // We will assign a random number between 20 and 40 for each quarter)
                teamScores[game][qtr] = random.nextInt(20, 40);
            }
        }

        // View the scores for all games/quarters
        for (int game = 0; game < teamScores.length; game++) {
            System.out.println("\nGame: " + (game+1));
            for (int qtr = 0; qtr < teamScores[0].length; qtr++) {
                System.out.print("Q" + (qtr+1) + ": " + teamScores[game][qtr] + "\t");
            }
        }
    }
}
 */
