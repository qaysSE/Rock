
import java.util.Scanner;
import java.util.Random;
public class highorlow {
    public static void main(String[] args) {
        Random Generator = new Random();
        int val = Generator.nextInt(10) + 1;
        String trash = "";
        boolean done = false;
        Scanner in = new Scanner(System.in);
        int guss = 10;

        System.out.println("please choose number from 1-10");

       if (in.hasNextInt()) {
            int userGuess = in.nextInt();
            if (userGuess < guss && userGuess > val)
                System.out.println("your guess was high" + val);

            if (userGuess < guss && userGuess < val) {
                System.out.println("your guess was low" + val);


                if (userGuess == val) {
                    System.out.println("congrats your guess was on point");

                    if (userGuess < guss && guss < val) {
                        System.out.println("please enter a number from 1-10" + val);
                    } else do {
                        trash= in.nextLine();
                            System.out.println("please enter a number" + trash);

                        } while (!done);
                }
            }
       }
    }
}








