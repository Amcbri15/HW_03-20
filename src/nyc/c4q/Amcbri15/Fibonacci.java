package nyc.c4q.Amcbri15;
import java.util.Scanner;
/**
 * Created by c4q-anthony-mcbride on 3/18/15.
 */
public class Fibonacci {

    public static int fibonacci(int number) {

        if (number == 0) {
            return 0;
        }
        if (number == 1 || number ==2) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;


        System.out.print("Which number in the Fibonacci sequence would you like me to retrieve? ");
        number = in.nextInt();


        System.out.println("\nThe number at position " + number + " in the Fibonacci sequence is " + fibonacci(number) + ".\n");

        //Started print count at zero to match assignment instructions. Human count starts at 1. 
        for(int i=0; i<=number; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
}
