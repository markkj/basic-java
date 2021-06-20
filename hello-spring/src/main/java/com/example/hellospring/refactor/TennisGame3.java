package com.example.hellospring.refactor;

public class TennisGame3 {

    private Player playerOne;
    private Player playerTwo;
    private String nameOfLeading;

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

    public String printRefereeCallAll(){
        return checkPointState(playerOne.getPoint()) + "-All";
    }

    public String printRefereeCallOnGame4(){
        return checkPointState(playerOne.getPoint()) + "-" + checkPointState(playerTwo.getPoint());
    }

    public String printRefereeCallDeuce(){
        return "Deuce";
    }

    public String printRefereeCallAdvantage(){
        return "Advantage " + nameOfLeading;
    }

    public String printRefereeCallWin(){
        return "Win for " + nameOfLeading;
    }
    public String getScore() {

        boolean isBothPlayerPointLessThan4 = playerOne.getPoint() < 4 && playerTwo.getPoint() < 4;
        boolean isBothPlayerSumPointNotEqual6 = (playerOne.getPoint() + playerTwo.getPoint() != 6);
        boolean isPlayerPointEqual = playerOne.getPoint() == playerTwo.getPoint();

        if (isBothPlayerPointLessThan4 && isBothPlayerSumPointNotEqual6) {

            if(isPlayerPointEqual){
                return printRefereeCallAll();
            }
            else{
                return printRefereeCallOnGame4();
            }

        } else {
            if (isPlayerPointEqual)
                return printRefereeCallDeuce();

            nameOfLeading = playerOne.getPoint() > playerTwo.getPoint() ? playerOne.getName() : playerTwo.getName();
            boolean isOnAdvantage = (playerOne.getPoint() - playerTwo.getPoint())*(playerOne.getPoint() - playerTwo.getPoint()) == 1;
            if(isOnAdvantage){
                return printRefereeCallAdvantage();
            }else{
                return printRefereeCallWin();
            }
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == playerOne.getName())
            this.playerOne.addPoint();
        else if(playerName == playerTwo.getName())
            this.playerTwo.addPoint();
        else
            throw new RuntimeException("playerName not exits");

    }

}
