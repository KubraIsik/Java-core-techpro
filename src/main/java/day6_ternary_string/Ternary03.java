package day6_ternary_string;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {
        /*
        Example 1: Write the code to check if the given year is a "Leap Year".
        1) if year divided by 100, then it should be divided by 400 too, 1600==>Leap year   1800==> Not Leap year
        2) if not divided by 100, should be divided by 4. 2004==>Leap year   2005==>Not Leap year */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = input.nextInt();
        String result = (year % 100 == 0) ?
                ((year % 400 == 0)? "Leap" : "Not") :
                ((year % 4 == 0)? "Leap" : "Not");
        System.out.println(result);
    }
}
