package day11_loops_arrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //Example 1: A game guessing a random number between 0-100, use do-while.
        Scanner input = new Scanner(System.in);
        Random random = new Random();;

        // random int bewteen 0-100
        int randNum = random.nextInt(20,26);//101);
        System.out.println(randNum);
        // count guessNum
        int countGuess = 0;

        int guessNum;
        boolean isGuessTrue = false;
        do{
            System.out.println("Guess a number in between 0-100: ");
            guessNum = input.nextInt();
            countGuess++;

            if (guessNum < randNum){
                System.out.println("Enter bigger number");
            } else if (guessNum > randNum) {
                System.out.println("Enter smaller number");
            } else {
                System.out.println("Congrats! You found the number after " + countGuess+ " try!");
                isGuessTrue = true;
            }
        }while (!isGuessTrue);
        input.close();
    }
}
