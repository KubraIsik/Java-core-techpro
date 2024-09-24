package day10loops;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {
        /*Example 1: Write the code that creates the multiplication
        table for the number given by the user and writes it to the console.

            3 ==> 3x1=3
            3x2=6
            3x3=9
            3x4=12 …
            3x10=30*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to see in multiplication table:");
        int num = input.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num + "x" + i + "=" + (num*i));
        }

    }
}
