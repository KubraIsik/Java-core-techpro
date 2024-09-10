package day5_if_switch;

import java.util.Scanner;

public class IfStatements01 {

    public static void main(String[] args) {
        /*Example 1: Create the code that takes the age value from the user
         and prints the stage of age according to the following table.

                        0-4 (inclusive) ==> baby
                        5-12 (inclusive)==>child
                        13-20 (inclusive) ==> young
                        21-30 (inclusive) ==> adult
                        Over 30 ==> Undefined*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir yaş giriniz: ");
        byte age = input.nextByte();
        if (age < 0){
            System.out.println("Geçerli bir yaş giriniz");
        } else if (age <= 4){
            System.out.println("Baby");
        } else if ( age <= 12) {
            System.out.println("Child");
        } else if (age <= 20) {
            System.out.println("Young");
        } else if(age <= 30){
            System.out.println("Adult");
        }
        else {
            System.out.println("Undefined");
        }

    }
}
