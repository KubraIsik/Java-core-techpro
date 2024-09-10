package day5_if_switch;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {
        /*Example 1: Write the code that decides whether it is Weekend or Weekday based on the day names given by the user.
            Monday ==> Weekday Saturday ==> Weekend*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day name:");
        String dayName = input.next(); // wait for next word

        // equals() String method, check whether string equals another string, return True if equals
        // equalsIgnoreCase() check if both string equals without case sensitvity, ignores upper or lower case.

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");

        if(isWeekendDay){
            System.out.println("Yeay it is Weekend!");
        } else if (isWeekDay) {
            System.out.println("This is a Weekday.");
        }else {
            System.out.println("Please enter a valid day name.");
        }
    }
}
