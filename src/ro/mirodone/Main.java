package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        RockPaperScissors rps = new RockPaperScissors();

        System.out.println(rps.rps("rock", "rock"));
        System.out.println(rps.rps("scissors", "paper"));
        System.out.println(rps.rps("scissors", "rock"));

    }
}
