package day2_datatypes_concat_operators;

public class Concatenation {

    public static void main(String[] args) {
        String sum = "Toplam: ";
        int a = 2, b= 12;

        System.out.println(sum + (a + b));
        System.out.println(sum + a + b);
        System.out.println(a + "" + b);
        System.out.println(a + b);
    }
}
