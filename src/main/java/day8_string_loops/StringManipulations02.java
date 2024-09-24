package day8_string_loops;

public class StringManipulations02 {
    public static void main(String[] args) {
        // yusuf ==> ysf
        //Example 1: Print the non-repeated characters in a String side by side on the screen.
        String s = "yusuf";
        //lastIndexOf() method returns index of last occurence of a given character in a String
        //Bu method olmayan karakterler icin -1 verir
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                newS += s.charAt(i);
            }
        }
        System.out.println("newS = " + newS);

        //
        if (s.indexOf("y") == s.lastIndexOf("y")) {
            System.out.print("y");
        }

        if (s.indexOf("u") == s.lastIndexOf("u")) {
            System.out.print("u");
        }

        if (s.indexOf("s") == s.lastIndexOf("s")) {
            System.out.print("s");
        }

        if (s.indexOf("f") == s.lastIndexOf("f")) {
            System.out.print("f");
        }
        //           1234 6789 1234 6789 ==> **** **** **** 6789
        System.out.println();
        //Example 2: Make all but the last 4 digits of a bank card invisible using '*'
        String d = "1234 6789 1234 6789";
        String secretD = d.substring(0, (d.length() - 4)).replaceAll("\\d","*") + d.substring(d.length() -4) ;
        System.out.println("secretD = " + secretD);

        secretD = (d.split("\\s")[0]+
                " " +d.split("\\s")[1]+
                 " " +d.split("\\s")[2]).replaceAll("\\d","*")+
                " " +d.split("\\s")[3];
        System.out.println("secretD = " + secretD);

        // second solution
        String cardNum = "1234 6789 1234 6789";
        String first = cardNum.substring(0,15).replaceAll("[0-9]", "*");
        //System.out.println(first); //**** **** ****

        String last = cardNum.substring(15);
        //System.out.println(last); //6789

        String result1 = first + last;
        System.out.println(result1); //**** **** **** 6789
        // string concat() method
        //String result2 = first.concat(last);
        //System.out.println(result2); //**** **** **** 6789

    }
}
