package day8_string_loops;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*Example 1: Check if a password has the following conditions.

        1- The password must contain at least one character, nothing must be entered.
        2- The characters must not only consist of (space) characters, but also non-space characters.
        3- There should be no spaces at the beginning and end.*/

        //Note: isEmpty() method only returns true if given string do not initialize with a value. ex. string = ""
        //isBlank() method returns true if given string did not initialize or it is empty. ex. string = "" or " "

        String pwd = " ";

        boolean first = pwd.isEmpty();
        boolean second = pwd.isBlank();
        boolean third = pwd.trim().equals(pwd);

        if (first) {
            System.out.println("Please enter a password");
        }else if (second) {
            System.out.println("Password can not be empty");
        }else if (!third) {
            System.out.println("Password should not have spaces at the begining and end of it.");
        }
        else{
            System.out.println("Password is accepted.");
        }
    }
}
