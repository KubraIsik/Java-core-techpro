package day11_loops_arrays;

import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {
        /*Example 1:
       Valid Username="admin" and Password="pwd123".
       Get the username and password from the user.
       If the username and password are correct, print "Welcome to your account!" to the console.
       If the username or password is incorrect, prompt "Enter your username and password" 4 times.
       If the username or password is entered incorrectly for the 4th time, complete the process with the message "Your account is blocked".
        */
        String val_userName = "admin";
        String val_pwd = "pwd123";
        Scanner input = new Scanner(System.in);
        int counter = 0 ; //
        do {

            if(counter == 4){
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("Please enter username: ");
            String userName = input.next();
            System.out.println("Please enter password: ");
            String pwd = input.next();
            counter++;
            if ( userName.equals(val_userName) && pwd.equals(val_pwd)){
                System.out.println("Welcome");
                break;
            }
            else{
                System.out.println( (4 - counter) + " attempt left.");
            }
        }while (true);
    }
}
