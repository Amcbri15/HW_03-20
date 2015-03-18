package nyc.c4q.Amcbri15;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by c4q-anthony-mcbride on 3/18/15.
 */
public class TwentyQuestions {
    public static void guessGame(){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int userGuess;
        int chances = 0;

        int number = rand.nextInt(100000);

        //Debug mode
        System.out.println(number);


        System.out.print("I'm thinking of a number between 1 and 100,000. What is my number? ");
        userGuess = in.nextInt();

        while (userGuess != number) {
            chances += 1;

            if (userGuess < number) {
                System.out.println("\nMy number is higher than " + userGuess + ".");
                System.out.print("Your guess: ");
                userGuess = in.nextInt();
            }
            else if(userGuess > number) {
                System.out.println("\nMy number is lower than " + userGuess + ".");
                System.out.print("Your guess: ");
                userGuess = in.nextInt();
            }
            if (chances >= 20) {
                System.out.println("I'm sorry. You're out of guesses... Game over!");
                break;
            }
        }
        if (userGuess == number) {
            System.out.println("\nCorrect! My number was:" + number + "\nYou win!");
        }

        //System.out.println("Number: " + number + "\nYour guess: " + userGuess);




    }
    public static void main(String[] args) {

        guessGame();

    }
}
