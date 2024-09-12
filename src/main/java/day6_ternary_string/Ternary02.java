package day6_ternary_string;

public class Ternary02 {
    public static void main(String[] args) {

        //Example : Write the code to check if the given number has 3 digits

        int num = -123;
        //Boolean isPos3Digit = (num <= 999 && num > 99);
        //Boolean isNeg3Digit = (num >= -999 && num < -99);
        //String result = (isPos3Digit || isNeg3Digit) ? "3 digits" : "not 3 digits";
        // or just math make it work
        num = Math.abs(num); // convert absolute value of the number
        String result = (num <= 999 && num > 99) ? "3 digits" : "not 3 digits";
        System.out.println(result);

    }
}
