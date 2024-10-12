import java.util.Scanner;



public class CtoFConverter {
    public static void main(String[] args) {
        boolean done=false;
    Scanner in = new Scanner(System.in);
        System.out.println("please enter temperature in Celsius");
        if(in.hasNextDouble())
        {double C =in.nextDouble();
        double F=C*(9/5) +32;

        System.out.println(F);}
        else do {
          String trash = in.nextLine();
            System.out.println("you entered wrong value try again"+trash);
            System.out.println(trash);
        } while (!done);
    }
}
