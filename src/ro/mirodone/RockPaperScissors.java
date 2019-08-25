package ro.mirodone;

public class RockPaperScissors {

    public String rps(String p1, String p2) {

        String result = "";
        String player1 = "Player 1 won!";
        String player2 = "Player 2 won!";


        if (p1.equals(p2)) {
            result = "Draw!";
        }

        if ((p1.equals("rock") && p2.equals("scissors")) ||
                (p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock"))) {
            return player1;
        }

        if ((p1.equals("scissors") && p2.equals("rock")) ||
                (p1.equals("paper") && p2.equals("scissors")) ||
                (p1.equals("rock") && p2.equals("paper"))) {
            return player2;
        }

        return result;
    }

}
