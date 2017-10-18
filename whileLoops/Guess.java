// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess;       //Number the user tries to guess
        int guess;            //The user's guess
        int tooHigh = 0;
        int tooLow = 0;
        int totalGuesses = 0;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //randomly generate the  number to guess
        numToGuess = ((int)(Math.random() * 10)+1);

        //print message asking user to enter a guess
        System.out.print("Guess a number between at 1 and 10:");
        //read in guess
        guess = scan.nextInt();
        while (guess != numToGuess)  //keep going as long as the guess is wrong
        {
            //print message saying guess is wrong
            if (guess > numToGuess)
            {
                tooHigh++;
                System.out.println("Too High!");
                totalGuesses++;
            }     
            else 
            {
                tooLow++;
                totalGuesses++;
                System.out.println("Too Low!");
            }
            //get another guess from the user
            System.out.println("Guess: ");
            guess = scan.nextInt();
        }

        //print message saying guess is right
        System.out.println();
        System.out.printf("You guessed right!\n"
        + "You guessed %d times too high\n"
        + "You guessed %d times too low\n"
        + "And you guessed for a total of %d times",tooHigh, tooLow, totalGuesses);
    }
}
