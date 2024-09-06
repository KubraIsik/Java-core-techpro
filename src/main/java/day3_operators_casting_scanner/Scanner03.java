package day3_operators_casting_scanner;

import java.util.Locale;
import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Example 3: Write the code that takes two numbers from the user,
        // performs 4 operations and displays the results of the operations
        // on the screen.

        Scanner input = new Scanner(System.in).useLocale(Locale.US); // Input data type,
        System.out.println("Lütfen iki sayı giriniz: ");

        double firstnumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Addition: " + (firstnumber + secondNumber));
        System.out.println("Subtraction: " + String.format("%.2f",(firstnumber - secondNumber)));
        System.out.println("Multiplication: " + (firstnumber * secondNumber));
        System.out.println("Division: " + (firstnumber / secondNumber));



    }
}
