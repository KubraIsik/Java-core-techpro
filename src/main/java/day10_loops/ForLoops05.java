package day10_loops;

public class ForLoops05 {
    public static void main(String[] args) {
        //Example 1: Find the sum of the digits in the decimal part of the given number.
        //            28.587 ==> 5+8+7=20
        double num = 28.587;
        String sNum = String.valueOf(num); // "28.587"
        String decimalPart = sNum.split("[\\.]")[1];
        int intDecimalPart = Integer.valueOf(decimalPart);
        int sum = 0;
        for (int i = intDecimalPart; i > 0; i /= 10) {
            int digit = i % 10;
            sum += digit;
            if ( i!= intDecimalPart){
                System.out.print("+");
            }
            System.out.print(digit);
        }
        System.out.println(" = " + sum);
    }
}
