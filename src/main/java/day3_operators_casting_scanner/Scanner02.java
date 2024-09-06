package day3_operators_casting_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        /*
            Example 1:
            From the user;
            i) Name and Surname
            ii) Age
            iii)Height
            iv) Weight
            v) Ask him to enter his marital status.

            Then print them on separate lines in the console with a label*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lüften ad ve soyad giriniz: ");
        String fullName = input.nextLine(); // take more than one word input
        System.out.println("Lütfen yaşınızı giriniz: ");
        byte age = input.nextByte();
        System.out.println("Boyunuzu giriniz: ");
        float height = input.nextFloat();
        System.out.println("Kilonuzu giriniz: ");
        short weight = input.nextShort();
        System.out.println("Medeni durumunuzu giriniz (B: Bekar, E: Evli):");
        char maritalStatus = input.next().charAt(0);

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);



    }
}
