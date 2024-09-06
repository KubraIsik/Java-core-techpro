package day3_operators_casting_scanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        /*Java'da Scanner class'i, kullanıcıdan veya farklı bir kaynaktan girdi almanın oldukça kolay bir yolunu sağlar.

            1- Scanner class'i, farklı veri tiplerini (int, float, double, String, boolean vb.) kolaylıkla okuyabilir.
            2- Tek bir Scanner objesi, aynı girdi kaynağından farklı türlerde veri okuyabilir.
            3- next(), nextInt(), nextDouble() gibi farklı metotlar, farklı ihtiyaçlara uygun şekillerde kullanicidan girdi almayı sağlar.*/

        // 1. adim: Scanner class'tan object olustur.
        // System.in (standart giris) uzerinden klavyeden giris okunur
        Scanner input = new Scanner(System.in);

        // 2. adim: Kullanıcıya bilgi ver.
        System.out.println("Lütfen yaşınızı giriniz: ");

        // 3. adim: Oluşturduğumuz object üzerinden uygun method ile
        // kullanıcının girdiği veriyi alıp memory'e yerleştir.
        byte age = input.nextByte(); // yas için byte uygun 127 e kadar
        System.out.println("Girilen yaş : " + age);

        //---------------------------------------
        // java library, collection of class, interface and methods that provide functionality
        // Java Standard library (java.lang(import etmeden geliyor), java.util, java.io, java.net), JDK bring it,

    }
}
