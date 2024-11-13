import myClass.TennisGame;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] score = new int[][]{
                {0,0},
                {1,1},
                {2,2},
                {3,3},
                {4,4},
                {0,1},
                {0,2},
                {0,3},
                {1,0},
                {2,0},
                {3,0},
                {12,11},
                {11,12},
                {12,6},
                {6,12},
        };

        TennisGame game = new TennisGame();

        for (int[] row : score) {
            System.out.println(game.getScore(row[0], row[1]));
        }
    }
}
