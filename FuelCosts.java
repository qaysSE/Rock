import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        boolean done = false;


        String trash = "";
        System.out.println("please enter your gallons:");


        if (in.hasNextDouble()) {
            done = true;
        } else {
            trash = in.nextLine();
            System.out.println("invalid please enter a number" + trash);
            do {
                break;
            }
            while (!done);
        }

        System.out.println("please enter your efficiency:");

        Scanner out = new Scanner(System.in);
        if (out.hasNextDouble()) {
            double efficiency = in.nextDouble();
            System.out.println(efficiency * 14 + "your car can go with a full tank");


        } else {

            trash = out.nextLine();
            System.out.println("invalid please enter a number" + trash);


            do {
                break;
            }
            while (!done);
        }


        System.out.println("please enter your price per gallon:");
        Scanner it = new Scanner(System.in);


        if (it.hasNextDouble()) {
            double pricepergallon = it.nextDouble();
            System.out.println(pricepergallon * 4 + "cost to drive 100 miles");
            done = true;
        } else {
            trash = it.nextLine();
            System.out.println("invalid please enter a number" + trash);

        }
        do {

            break;
        }
        while (!done);


    }
}



