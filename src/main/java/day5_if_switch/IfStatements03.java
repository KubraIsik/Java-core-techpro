package day5_if_switch;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        // nested
        /*example 1:
            If the person is male;
                  i) If he is younger than 16 years old, he should not work
                  ii)Workers between 16 - 65 (inclusive)
                  iii) Must retire if over 65 years of age
            If the person is a woman;
                 i) If she is under 18 years of age, she should not work
                 ii)18 - 60 (inclusive) working age
                 iii) Must retire if over 60 years of age
           Based on the gender and age of the person, type the appropriate message into the console*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz:");
        String gender = input.next();

        System.out.println("Yasinizi giriniz: ");
        int age = input.nextInt();

        boolean isMale = gender.equalsIgnoreCase("Man") ||
                         gender.equalsIgnoreCase("Male");

        boolean isFemale = gender.equalsIgnoreCase("Woman") || gender.equalsIgnoreCase("Female");

        if (age < 0){
            System.out.println("Yaş negatif olamaz.");
        } else if (age < 16 || (isFemale && age < 18)) {
            System.out.println("Çalışmamalı");
        } else{
            if (isMale){
                if (age <= 65) {
                    System.out.println("Çalışmalı"); // isMale && age <= 65 || isFemale && age <= 60
                }else {
                    System.out.println("Emekli olmalı"); // else ?
                }
            } else if (isFemale) {
                if (age <= 60) {
                    System.out.println("Çalışmalı");
                }else {
                    System.out.println("Emekli olmalı");
                }
            }else {
                System.out.println("Tanımlanmadı.");
            }
        }
    }
}
