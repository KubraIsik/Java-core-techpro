package day5_if_switch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        // after java 12 release there is new property of switch-case
        // Example with new switch-case structure:
        /*Example 1: Ask the user to enter a month number (between 1 and 12).
        Write a program that determines the season according to the entered month number and prints the result to the console.*/

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number of the month(1-12)");
        int month = input.nextInt();

        String season = switch (month){
                      case 12,1,2 -> "Winter";
                      case 3,4,5 -> "Spring";
                      case 6,7,8 -> "Summer";
                      case 9,10,11 -> "Autumn";
                    default -> "Unknown month";
        };
        System.out.println("Season: "+season);

        input.close(); // close Scanner object
    }
}
