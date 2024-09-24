package day7_string_manipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        /*Regular Expression (Regex)
        //String m = "Ali Can Kahraman";

        /*
        Regular Expression: used to gather one grup of data

            1) All the digits ==> [0-9]
            2) All lower case alphabets ==> [a-z]
            3) All upper case alphabets ==> [A-Z]
            4) Both upper and lower alphabets ==> [a-zA-Z]
            5) Both alphabets(upper & lower) and digits ==> [a-zA-Z0-9]
            6) All puntutations ==> \\p{Punct}
            7) All vowels ==> [aeiouAEIOU]
               Alphabets includes a,x,y ==> [axy]
                a to g both upper and lower case alphabets: [A-Ga-g]
            8) Negate lower case alphabets: ==> [^a-z]
            9) Negate both lower and upper case alphabets ==> [^a-zA-Z]

        Square brakcets are not used [] . Capital letters mean negate
            Only white space character : \\s
            Negate white space character  : \\S
            Only digits        : \\d
            Negate digits      : \\D
        */

        //Example 1: Convert all digits (0, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9) in String s to "*"
        String s = "Learn Java earn 1234 money";
        String str1 = s.replaceAll("\\d","*");
        System.out.println("str1 = " + str1);
        //Example 2: Find the number of digits in String "s"
        String numbers = s.replaceAll("[^0-9]","");
        System.out.println("numbers = " + numbers);
        System.out.println("number of numbers = " + numbers.length());
    }
}
