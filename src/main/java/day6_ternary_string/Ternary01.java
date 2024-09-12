package day6_ternary_string;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Write the code that calculates the absolute value of a number.
        //-4 ==> -1*-4, 4 ==> 4, 0 ==> 0
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int value = input.nextInt();
        int absolute_value = (value < 0) ? (value * -1) : value;
        System.out.println(absolute_value);

        //Example 2: If the signs of two numbers are the same, multiply these numbers, if the signs are different
        // Write the code that gives the message “I cannot multiply numbers with different signs”.
        int a = 7;
        int b = 4;
        Object result = (a > 0 && b > 0) || (a < 0 && b < 0) ? a * b : "I cannot multiply numbers with different signs";
        System.out.println(result);

    }
}
