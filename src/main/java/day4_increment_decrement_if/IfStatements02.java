package day4_increment_decrement_if;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Example 1: Create the code that prints whether a number
        // received from the user is odd or even.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("num = " + num + " is even.");
        } // if (num % 2 != 0)
        else {
            System.out.println("num = " + num + " is odd.");
        }
    }
}
