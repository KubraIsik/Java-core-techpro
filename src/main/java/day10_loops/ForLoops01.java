package day10_loops;

public class ForLoops01 {
    public static void main(String[] args) {
        //example 1: Print the sum of the digits of a given integer to the console
        //           578 ==> 5+7+8=20 ==> Output 20 olmali
        int sum = 0;
        // more than one variable can be initialized in a for loop
        for(int i= 578; i> 0; i /= 10){ // i values: 578, 57, 5
            sum += i % 10;
        }
        System.out.println("sum = " + sum);

        //Example 2: Write the code that returns the non-repeating
        // characters in a String.
        // Yusuf ==> Ysf

        String t = "Yusuf";
        String uniqueStr = "";

        for (int i = 0 ; i < t.length() ; i++){
            char ch = t.charAt(i);
            // want to see only unique characters
            if (uniqueStr.indexOf(ch) == -1){
                uniqueStr += ch;
            }
            /* do not include reoccured characters
            if (t.indexOf(ch) == t.lastIndexOf(ch)) {
                unique = unique + ch;
            }*/
        }
        System.out.println("uniqueStr = " + uniqueStr);
    }
}
