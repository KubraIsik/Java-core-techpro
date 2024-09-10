package day5_if_switch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        // switch Statement

        /*Example 1: Write the code that prints the number of the day given the day name.
        Sunday==>1 . . .  Saturday==>7

        Path 1 : if - else if*/

        String dayName = "wedNesday";
        String formatDayName = dayName.substring(0,1).toUpperCase() + dayName.substring(1).toLowerCase();
        // or with dayName.toLowerCase() dayName can be converted to lower cases and all the cases can be written in lower case to control.
        switch (formatDayName){
            case "Sunday":
                System.out.println(1);
                break;
            case "Monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("No such day");
        }
    }
}
