package ss8_clean_code_and_refactoring.exercise;

public class TennisGame {
    public static final String FIRST_SCORE = "Love";
    public static final String SECOND_SCORE = "Fifteen";
    public static final String THIRD_SCORE = "Thirty";
    public static final String FOURTH_SCORE = "Forty";
    public static final String ALL = "-All";

    public static final int PLAYER_GET_POINT_1ST = 0;
    public static final int PLAYER_GET_POINT_2ND = 1;
    public static final int PLAYER_GET_POINT_3RD = 2;
    public static final int PLAYER_GET_POINT_4TH = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {


        String gameScore = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            switch (player1Score) {
                case PLAYER_GET_POINT_1ST:
                    gameScore = FIRST_SCORE + ALL;
                    break;
                case PLAYER_GET_POINT_2ND:
                    gameScore = SECOND_SCORE + ALL;
                    break;
                case PLAYER_GET_POINT_3RD:
                    gameScore = THIRD_SCORE + ALL;
                    break;
                case PLAYER_GET_POINT_4TH:
                    gameScore = FOURTH_SCORE + ALL;
                    break;
                default:
                    gameScore = "Deuce";
                    break;

            }
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) gameScore = "Advantage player1";
            else if (minusResult == -1) gameScore = "Advantage player2";
            else if (minusResult >= 2) gameScore = "Win for player1";
            else gameScore = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    gameScore += "-";
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case PLAYER_GET_POINT_1ST:
                        gameScore += FIRST_SCORE;
                        break;
                    case PLAYER_GET_POINT_2ND:
                        gameScore += SECOND_SCORE;
                        break;
                    case PLAYER_GET_POINT_3RD:
                        gameScore += THIRD_SCORE;
                        break;
                    case PLAYER_GET_POINT_4TH:
                        gameScore += FOURTH_SCORE;
                        break;
                }
            }
        }
        return gameScore;
    }
}
