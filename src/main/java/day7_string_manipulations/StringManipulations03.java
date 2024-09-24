package day7_string_manipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Example 1: Find the total price of the following products.
        //String tv = "$456.99"; String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
        String tv = "$456.99";
        String laptop = "$875.99";
        
        tv = tv.replace("$","");
        laptop = laptop.replace("$","");
        
        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println("totalPrice = " + totalPrice);

        //           "   ali cAN   " ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console.

        //trim() methods delete spaces from at the beginning and end of the string
        //split() split String by given character
        //Note: " method chain", using multiple methods in a row 
        
        String userName = "   ali cAN   ";
        String[] splittedUserName = userName.trim().toUpperCase().split("\\s");
        char firstLetterUserName = splittedUserName[0].charAt(0);
        char firstLetterUserSurName = splittedUserName[1].charAt(0);
        System.out.println("firstLetterUserName = " + firstLetterUserName);
        System.out.println("firstLetterUserSurName = " + firstLetterUserSurName);
    }
}
