import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {

        String trash = "";
        boolean done = false;
        Scanner in = new Scanner(System.in);

         System.out.println("enter the length of the rectangle side");

         if (in.hasNextDouble()) {
             double length = in.nextDouble();
             System.out.println("enter the  width of the rectangle side");
             double width = in.nextDouble();
             System.out.println(width * length + "area of rectangle");
             System.out.println(Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2)));

             System.out.println("The length of the diagonal ");
         }
         else do{
            trash = in.nextLine();
            System.out.println("please enter a number" + trash);
           break;


        } while (!done);





    }}



