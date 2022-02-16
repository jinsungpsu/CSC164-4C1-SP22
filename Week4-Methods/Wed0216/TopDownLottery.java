public class TopDownLottery {
    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            lotterySimulation();
        }
    }
    static void lotterySimulation() {
        // generate random numbers for whiteballs & powerball
        // user picks ticket numbers
        // check white balls
        // check powerball
        // display winnings

        int[] lotteryWhiteBalls = new int[5];
        int lotteryRedball;
        int[] userPicks;

        generateLotteryWhiteBalls2(lotteryWhiteBalls);

        lotteryWhiteBalls = generateLotteryWhiteBalls();
        lotteryRedball = generateLotteryRedBall();

        userPicks = getUserPicks();

        // check white balls
        // inputs, or parameters, lotteryWhiteBalls and userPicks
        // output, or return type, integer

        int numMatches = checkWhiteBalls(lotteryWhiteBalls, userPicks);

        System.out.println("You've matched " + numMatches + " white balls!");

    }

    static int checkWhiteBalls(int[] lotteryWhiteBalls, int[] userPicks) {
        int numMatches = 0;
        for (int i = 0; i < lotteryWhiteBalls.length; i++) {
            if (lotteryWhiteBalls[i] == userPicks[i])
                numMatches++;
        }
        return numMatches;
    }

    static int[] getUserPicks() {
        int[] userPicks = generateRandomNumberArray(6);
        return userPicks;
    }

    static int generateLotteryRedBall() {
        double randomDouble = Math.random();
        return (int) ((randomDouble * (26 - 1) + 1));
    }

    private static int[] generateLotteryWhiteBalls() {
        int numWhiteBalls = 5;
        return generateRandomNumberArray(numWhiteBalls);
    }

    private static void generateLotteryWhiteBalls2(int[] whiteballs) {
        for (int i = 0; i < whiteballs.length; i++) {
            // how do I produce a random number between 1 and 69
            //
            double randomDouble = Math.random(); // [0, 1),
            int randomInteger = (int) ((randomDouble * (69 - 1) + 1));
            // (int) ((Math.random() * (max - min)) + min);
            // https://www.baeldung.com/java-generating-random-numbers-in-range
            whiteballs[i] = randomInteger;
        }
    }

    static int[] generateRandomNumberArray(int amountOfNumbers) {
        int numArray[] = new int[amountOfNumbers];
        for (int i = 0; i < numArray.length; i++) {
            // how do I produce a random number between 1 and 69
            //
            double randomDouble = Math.random(); // [0, 1),
            int randomInteger = (int) ((randomDouble * (69 - 1) + 1));
            // (int) ((Math.random() * (max - min)) + min);
            // https://www.baeldung.com/java-generating-random-numbers-in-range
            numArray[i] = randomInteger;
        }
        return numArray;
    }
}
