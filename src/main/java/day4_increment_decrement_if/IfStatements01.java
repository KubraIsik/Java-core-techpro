package day4_increment_decrement_if;

public class IfStatements01 {

    public static void main(String[] args) {

        // if statements
        //Example 1: If the number is between 0 (included) and 10 (excluded), print "Number" on the screen.
        int num = 7;

        if (num > -1 && num < 10){
            System.out.println("Rakam");
        }

        //Example 2: If the number is three digits,
        // print "The number is three digits" on the screen.
        int n = 123;

        if (n <= 999 && n >= 100){
            System.out.println("The number "+ n + "is three digits");
        }
        else {
            System.out.println("The number "+ n + "is three digits");
        }

    }
}
