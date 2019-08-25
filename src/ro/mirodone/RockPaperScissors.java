package ro.mirodone;

public class RockPaperScissors {

    public String rps(String p1, String p2) {

        String draw = "Draw!";
        String player1 = "Player 1 won!";
        String player2 = "Player 2 won!";


        if (p1.equals(p2)) {
            return draw;
        }

        if ((p1.equals("rock") && p2.equals("scissors")) ||
                (p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock"))) {
            return player1;
        } else return player2;

    }

}
