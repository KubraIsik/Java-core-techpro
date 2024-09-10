package day4_increment_decrement_if;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        //*Example 1: When you receive the number of days from the user,
        // write the code that writes
        // the day name1==> Sunday, 2 ==> Monday …*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün olduğunu giriniz: ");
        //int num = input.nextInt();
        // eğer ondalıklı sayı girerse
        double numDouble = input.nextDouble();
        int num = (int) numDouble;// Type casting

        if (numDouble != num){
            System.out.println("Lütfen bir tamsayı giriniz: ");
        }else{
            if(num < 0){
                System.out.println("Gün sayıları 1'den küçük olamaz.");
            } else if (num == 1) {
                System.out.println("Pazar");
            }
            else if (num == 2) {
                System.out.println("Pazartesi");
            }else if (num == 3) {
                System.out.println("Salı");
            }else if (num == 4) {
                System.out.println("Çarşamba");
            }else if (num == 5) {
                System.out.println("Perşembe");
            }else if (num == 6) {
                System.out.println("Cuma");
            }else if (num == 7) {
                System.out.println("Cumartesi");
            }else{
                System.out.println("Gün sayıları 7'den büyük olamaz.");
            }
        }

        /**/
    }
}
