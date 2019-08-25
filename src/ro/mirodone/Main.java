package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        RockPaperScissors rps = new RockPaperScissors();

        System.out.println(rps.rps("rock", "rock"));
        System.out.println(rps.rps("paper", "rock"));
        System.out.println(rps.rps("rock", "paper"));

    }
}
