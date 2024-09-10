package day5_if_switch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        /*Example 1: Write the code that prints the names of all the months starting from the given month number until the 12th month when the month number is given.
            8 ==> August - September - October - November - December
        */

        /*Not : switch condition ok with
            1) String 2) int 3) byte 4) short 5) char data types
           but do not with 1) long 2) boolean 3) float 4) double */

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen başlangıç ay sayısını giriniz: ");
        byte numOfMonth = input.nextByte();
        System.out.print(numOfMonth+" ==> ");
        switch (numOfMonth){
            case 1:
                System.out.print("January - ");
            case 2:
                System.out.print("February - ");
            case 3:
                System.out.print("March - ");
            case 4:
                System.out.print("April - ");
            case 5:
                System.out.print("May - ");
            case 6:
                System.out.print("June - ");
            case 7:
                System.out.print("July - ");
            case 8:
                System.out.print("August - ");
            case 9:
                System.out.print("September - ");
            case 10:
                System.out.print("October - ");
            case 11:
                System.out.print("November - ");
            case 12:
                System.out.print("December");
                break;
            default:
                System.out.println("Geçerli bir ay sayısı giriniz.");
        }
    }
}
