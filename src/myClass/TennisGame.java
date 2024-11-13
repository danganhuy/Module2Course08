package myClass;

public class TennisGame {
    public String getScore(int score1, int score2) {
        String score;

        if (score1 == score2)
        {
            score = score1 > 3 ? "Deuce" : this.scoreType(score1) + "-All";
        }
        else if (score1 >= 4 || score2 >= 4)
        {
            int minusResult = score1 - score2;

            if (Math.abs(minusResult) == 1) {
                score = minusResult == 1 ? "Advantage player1" : "Advantage player2";
            }
            else {
                score = minusResult >= 2 ? "Win for player1" : "Win for player2";
            }
        }
        else
        {
            score = this.scoreType(score1) + "-" + scoreType(score2);
        }
        return score;
    }
    private String scoreType(int score) {
        switch(score)
        {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "";
        }
    }
}

