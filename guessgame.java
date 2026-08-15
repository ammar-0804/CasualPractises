//Making Beginner level games for practise


Code:

import java.util.Scanner;
public class game
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        int attempts=0;
        int numguess = (int)(Math.random() *100)+1;
        System.out.println("Welcome to my first java game");
        System.out.println("In this game you have to guess a number given randomly by the program");
        System.out.println("So, lets start the show");
        System.out.println("Guess number between 1 to 100");
        while( guess != numguess)
        {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if(guess > numguess)
            {
                System.out.println("Too High! Guess again.");
            }
            else if(guess < numguess)
            {
                System.out.println("Too Low! Guess again");
            }
            else
            {
                System.out.println("Congo! You guessed it in "+ attempts +" attempts");
            }
        }
        sc.close();
    }
}
