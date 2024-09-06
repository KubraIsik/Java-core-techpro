package day3_operators_casting_scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {
        //Example 4: Get the lengths of two sides of a rectangle from the user
            //i)Calculate the area ==> Short side * Long side
            //ii)Calculate its perimeter ==> 2*Short Side + 2*Long Side
        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz: ");
        float shortSide = input.nextFloat();

        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz: ");
        float longSide = input.nextFloat();

        float area = shortSide * longSide;
        float perimeter = 2 * shortSide + 2 * longSide;
        System.out.println("Area: " + area);
        System.out.println("Perimeter = " + perimeter);

    }
}
