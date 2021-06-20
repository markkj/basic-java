package com.example.hellospring.refactor;

public class TennisGame3 {

    private int playerTwoPoint;
    private int playerOnePoint;
    private String playerOneName;
    private String playerTwoName;

    public TennisGame3(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public String getScore() {
        String s;
        if (playerOnePoint < 4 && playerTwoPoint < 4 && !(playerOnePoint + playerTwoPoint == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[playerOnePoint];
            return (playerOnePoint == playerTwoPoint) ? s + "-All" : s + "-" + p[playerTwoPoint];
        } else {
            if (playerOnePoint == playerTwoPoint)
                return "Deuce";
            s = playerOnePoint > playerTwoPoint ? playerOneName : playerTwoName;
            return ((playerOnePoint - playerTwoPoint)*(playerOnePoint - playerTwoPoint) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.playerOnePoint += 1;
        else
            this.playerTwoPoint += 1;

    }

}
