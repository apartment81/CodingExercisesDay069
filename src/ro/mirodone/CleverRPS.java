package ro.mirodone;

public class CleverRPS {

    public String rps(String p1, String p2) {

        if (p1.equals(p2)) return "Draw!";

        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("paperrock") || (p1 + p2).equals("rockscissors") ? 1 : 2;
        return "Player " + p + " won!";

    }

}
