package day4_increment_decrement_if;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //Example 1: Write the code that checks whether a number
        // received from the user is positive, negative or neutral

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı yazınız: ");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("This number is a positive number.");
        }else if ( num < 0){
            System.out.println("This number is a negative number.");
        }else {
            System.out.println("This number is neutral"); // 0 yani
        }

    }
}
