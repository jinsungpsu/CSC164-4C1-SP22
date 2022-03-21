public class BballTeam {
    private String name;
    private int[][] scores = new int[82][4];

    public BballTeam() {

    }

    public BballTeam(String name) {

    }

    public void setGameAndQuarterScore(int game, int quarter, int score) {
        // assigns it to the proper place in the 2D array
    }

    public int getGameAndQuarterScore(int game, int quarter) {
        return 0;
    }

    public double averagePointsInQuarter(int quarter) {
        return 0;
    }

    public double averagePointsInSeason() {
        return 0;
    }

    public void setScores(int[][] scores) {
        this.scores = scores;
    }

    public int[][] getScores() {
        return scores;
    }


}
