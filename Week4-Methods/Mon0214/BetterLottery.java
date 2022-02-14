public class BetterLottery {
    public static void main(String[] args) {

        /*
        checking for matches
        picking the numbers
        displaying the info
        calculating random numbers
         */
        int tries = 0;
        int numMatches = 0;

        while (numMatches < 4) {
            int[] whiteballs = new int[5]; // 1 through 69, size 5

            numMatches=0;

            for (int i = 0; i < whiteballs.length; i++) {
                // how do I produce a random number between 1 and 69
                //
                double randomDouble = Math.random(); // [0, 1),
                int randomInteger = (int) ((randomDouble * (69 - 1) + 1));
                // (int) ((Math.random() * (max - min)) + min);
                // https://www.baeldung.com/java-generating-random-numbers-in-range
                whiteballs[i] = randomInteger;
            }
            int powerBall = (int) ((Math.random() * (26 - 1) + 1));
            ; //1-26

            int[] userPicks = {1, 5, 13, 40, 67, 1}; // hard coded, size 6

            // n00b
            // if (whiteballs[0] == userPicks[0] && whiteballs[1] == userPicks[1])

            // loop!
            // each element of array and then compares



            for (int i = 0; i < whiteballs.length; i++) {
                // this one will iterate 6 times, i = 0, 1, 2, 3, 4, 5...
                if (whiteballs[i] == userPicks[i])
                    numMatches++;
            }
            if (powerBall == userPicks[5])
                numMatches++;

            System.out.println("You have " + numMatches + " matches!");

            System.out.println("Lottery numbers are: ");
            for (int each : whiteballs) {
                System.out.print(each + " ");
            }
            System.out.println("The powerball is: " + powerBall);

            System.out.println("User numbers are: ");
            for (int each : userPicks) {
                System.out.print(each + " ");
            }
            tries++;
        }
        System.out.println("It took you this many tries to win: " + tries);
    }
}
