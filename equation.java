
import java.util.Random;
import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author bagale
 */
public class RandomInt {

    public static void main(String[] args) {

        Random ran = new Random();

        // Print next int value 
        // Returns number between 0-10 
        int nxt = ran.nextInt(10);

        /* x + 5 = 10 */
        //String x = scanner.nextLine();
        //int x = sum - nxt;
        System.out.println("Random number between 0 and 10 is : " + nxt);
        int count = 0;
        int sum = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Try value of x: ");
            //Accept Number
            int x = scanner.nextInt();
            //Check Entered Number
            sum = nxt + x;
            if (sum != 10) {

                count = count + 1;
            } else {
                break;
            }
        }

        // Printing the random number between 0 and 10 
        System.out.println("Random number between 0 and 10 is : " + nxt);
        System.out.println("Congratulations you Solved the equation and the Sum is : " + sum);
        //System.out.println("The value of x is : " + x);

    }

}
