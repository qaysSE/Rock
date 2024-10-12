import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Rock = "R";
        String Paper = "P";
        String Scissors = "S";
        System.out.println("player A Choose R,P,S");
        System.out.println("player B Choose R,P,S");
        Scanner in = new Scanner(System.in);
        String playerA = in.next();
        String PlayerB = in.next();
        boolean done = false;


        if (playerA.equalsIgnoreCase(Rock) && PlayerB.equalsIgnoreCase(Paper)) {
            System.out.println("Player B wins");


        } else if (playerA.equalsIgnoreCase(Paper) && PlayerB.equalsIgnoreCase(Rock)) {
            System.out.println("player A wins");
        } else if (playerA.equalsIgnoreCase(Paper) && PlayerB.equalsIgnoreCase(Paper)) {
            System.out.println("it's a tie");
        } else if (playerA.equalsIgnoreCase(Rock) && PlayerB.equalsIgnoreCase(Rock)) {
            System.out.println("it's A tie");
        } else if (playerA.equalsIgnoreCase(Scissors) && PlayerB.equalsIgnoreCase(Scissors)) {
            System.out.println("it's A tie");

        } else if (PlayerB.equalsIgnoreCase(Scissors) && playerA.equalsIgnoreCase(Paper)) {
            System.out.println("player B win");
        } else if (playerA.equalsIgnoreCase(Scissors) && PlayerB.equalsIgnoreCase(Paper)) {
            System.out.println("player A wins");
        } else if (PlayerB.equalsIgnoreCase(Rock) && playerA.equalsIgnoreCase(Scissors)) {
            System.out.println("player B wins");

        } else if (PlayerB.equalsIgnoreCase(Scissors) && playerA.equalsIgnoreCase(Rock))
            System.out.println("Player A wins");


        else do {
                String Trash = in.nextLine();
                System.out.println("you entered a wrong character please replay" + Trash);
                break;
            }

            while (!done);
    }
}











