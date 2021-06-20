package com.example.hellospring.refactor;

public class TennisGame3 {

    private Player playerOne;
    private Player playerTwo;


    public TennisGame3(String playerOneName, String playerTwoName) {
        this.playerOne = new Player(playerOneName);
        this.playerTwo = new Player(playerTwoName);
    }

    public String checkPointState(int point){
        switch (point){
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            default:
                throw new RuntimeException("Point is more than 4 !!");
        }
    }

    public String getScore() {
        String s;
        boolean isBothPlayerPointLessThan4 = playerOne.getPoint() < 4 && playerTwo.getPoint() < 4;
        boolean isBothPlayerSumPointNotEqual6 = !(playerOne.getPoint() + playerTwo.getPoint() == 6);
        if (isBothPlayerPointLessThan4 && isBothPlayerSumPointNotEqual6) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[playerOne.getPoint()];
            return (playerOne.getPoint() == playerTwo.getPoint()) ? s + "-All" : s + "-" + p[playerTwo.getPoint()];
        } else {
            if (playerOne.getPoint() == playerTwo.getPoint())
                return "Deuce";
            s = playerOne.getPoint() > playerTwo.getPoint() ? playerOne.getName() : playerTwo.getName();
            return ((playerOne.getPoint() - playerTwo.getPoint())*(playerOne.getPoint() - playerTwo.getPoint()) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == playerOne.getName())
            this.playerOne.addPoint();
        else
            this.playerTwo.addPoint();

    }

}
