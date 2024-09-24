package day10loops;

import java.util.Scanner;

public class ForLoops04 {
    public static void main(String[] args) {
        /*Example 2:  Create the code that prints the following figure to the console.

              X X X X X
              X X X X X
              X X X X X    */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of row: ");
        int row = input.nextInt();
        System.out.println("Enter number of column: ");
        int column = input.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
        /*  Example: Draw the following figure using for-loop.

         *
         * *
         * * *
         * * * *

         */
        System.out.println("Enter biggest number of star pyramid:");
        int num = input.nextInt();

        for (int i = 1; i < num+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
}
