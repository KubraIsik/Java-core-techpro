package day3_operators_casting_scanner;

import java.util.List;
import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        //Example 5: The first two and last two digits of a 5-digit number
        // you will receive from the user.
        //Write the code that prints the sum of the numbers
        //           45678 ==> 45 + 78 = 123
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz: ");

        //System.out.println(input.next().chars());
        int number = input.nextInt();

        int firstTwoDigit = number / 1000;
        int lastTwoDigits = number % 100;
        System.out.println( firstTwoDigit + lastTwoDigits);

    }
}
