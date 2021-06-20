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
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                throw new RuntimeException("Point is more than 3 !!");
        }
    }

    public String getScore() {

        boolean isBothPlayerPointLessThan4 = playerOne.getPoint() < 4 && playerTwo.getPoint() < 4;
        boolean isBothPlayerSumPointNotEqual6 = !(playerOne.getPoint() + playerTwo.getPoint() == 6);
        boolean isPlayerDeuce = playerOne.getPoint() == playerTwo.getPoint();

        if (isBothPlayerPointLessThan4 && isBothPlayerSumPointNotEqual6) {

            if(isPlayerDeuce){
                return checkPointState(playerOne.getPoint()) + "-All";
            }
            else{
                return checkPointState(playerOne.getPoint()) + "-" + checkPointState(playerTwo.getPoint());
            }
        } else {
            if (isPlayerDeuce)
                return "Deuce";
            String nameOfLeading = playerOne.getPoint() > playerTwo.getPoint() ? playerOne.getName() : playerTwo.getName();

            return ((playerOne.getPoint() - playerTwo.getPoint())*(playerOne.getPoint() - playerTwo.getPoint()) == 1) ? "Advantage " + nameOfLeading : "Win for " + nameOfLeading;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == playerOne.getName())
            this.playerOne.addPoint();
        else
            this.playerTwo.addPoint();

    }

}
