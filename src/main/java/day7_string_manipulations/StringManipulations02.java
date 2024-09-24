package day7_string_manipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
       /*Example 1: Check the password entered by the user according to the following rules.

        i) At least 8 characters
        ii) Space character should not be in password
        iii) At least one capital letter
        iv) At least one lowercase letter
        v) At least one number */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the password: ");
        String pwd = input.nextLine();
        //i)
        boolean lengthControl = pwd.length() > 7;
        System.out.println("lengthControl = " + lengthControl);
        // ii)
        boolean spaceControl = pwd.replaceAll("[^ ]","").length() == 0;
        System.out.println("spaceControl = " + spaceControl);
        spaceControl = !pwd.contains(" ");
        System.out.println("spaceControl = " + spaceControl);
        spaceControl = pwd.replaceAll("^ ","").isEmpty();
        System.out.println("spaceControl = " + spaceControl);

        // iii)
        boolean upperControl = pwd.replaceAll("[^A-Z]","").length() > 0 ;
        System.out.println("upperControl = " + upperControl);

        // iv)
        boolean lowerControl = pwd.replaceAll("[^a-z]","").length() > 0;
        System.out.println("lowerControl = " + lowerControl);

        // v)
        boolean digitControl = pwd.replaceAll("\\D","").length() > 0;
        System.out.println("digitControl = " + digitControl);

        boolean isValid = lengthControl && spaceControl && upperControl && lowerControl && digitControl;

        if (isValid){
            System.out.println("Password is valid");
        }else{
            System.out.println("Password is not valid");
        }

        // at least one symbol

        boolean symbolControl = pwd.replaceAll("\\p{Punct}","").length() > 0;
        System.out.println(pwd.replaceAll("^\\p{Punct}",""));
        System.out.println("symbolControl = " + symbolControl);

    }
}
