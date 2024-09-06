package day3_operators_casting_scanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        /* Scanner class in Java provides a very easy way to get input from the user or a different source.

            1- Scanner class can easily read different data types (int, float, double, String, boolean etc.).
            2- A single Scanner object can read different types of data from the same input source.
            3- Different methods such as next(), nextInt(), nextDouble() allow to get input from the user
                in ways that suit different needs.*/

        // 1. step: Create an object from Scanner class.
        // System.in (standard input) reads from keyboard inputs.
        Scanner input = new Scanner(System.in);

        // 2. step: Inform the user (ask input).
        System.out.println("Lütfen yaşınızı giriniz: ");

        // 3. step:   Using appropriate methods get the input value
        // entered by the user from the object that we created and allocate it into the memory
        byte age = input.nextByte(); // byte data type suitable for age value
        System.out.println("Girilen yaş : " + age);

        //---------------------------------------
        // java library, collection of class, interface and methods that provide functionality
        // Java Standard library (java.lang( without import, included already), java.util, java.io, java.net), JDK bring it,

    }
}
