import java.util.Scanner;
public class even_or_odd {

    public static void main(String [] args)  {
        boolean done = false;

        while (!done) {
                System.out.println("Enter a number!");

                Scanner scanner = new Scanner(System.in);

                int input = Integer.valueOf(scanner.nextLine());

                if(input % 2 == 0) {
                    System.out.println ("Your number is even") ;
                }
                if(input % 2 !=0) {
                    System.out.println("Your number is odd") ;
                }
                if (String.valueOf(input).equals("true")) {

                    done = true;
                    System.out.println("Goodbye!");
                }
    }   }
}
