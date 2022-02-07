public class Lottery {
    public static void main(String[] args) {
        int[] whiteballs = {11, 2, 13, 40, 68}; // 1 through 69, size 5
        int powerBall = 1; //1-26

        int[] userPicks = {1, 5, 13, 40, 67, 1}; // hard coded, size 6

        // n00b
        // if (whiteballs[0] == userPicks[0] && whiteballs[1] == userPicks[1])

        // loop!
        // each element of array and then compares

        int numMatches = 0;

        for (int i = 0; i < whiteballs.length; i++) {
            // this one will iterate 6 times, i = 0, 1, 2, 3, 4, 5...
            if (whiteballs[i] == userPicks[i])
                numMatches++;
        }
        if (powerBall == userPicks[5])
            numMatches++;

        System.out.println("You have " + numMatches + " matches!");
        switch(numMatches) {
            case 5:
                System.out.println("Matched 5!");
                break;
            case 6:
                System.out.println("Jackpot!");
                break;
        }


    }
}
