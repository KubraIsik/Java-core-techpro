package day11_loops_arrays;

public class WhileLoops03 {
    public static void main(String[] args) {
        //Example 1: Write the code to check if a given integer is a palindrome.
        //           Palindrome: 121 <==> 121        123321 <==> 123321
        
        int k = 312;
        String original = String.valueOf(k); // "312"
        String reversed = "";
        
        int lastindex = original.length() - 1;
        while (lastindex >= 0){
            reversed += original.charAt(lastindex);
            lastindex--;
        }
        System.out.println("reversed = " + reversed);
        reversed = "";
        for (int i = original.length() - 1; i >= 0 ; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("reversed = " + reversed);
        if (reversed.equals(original)){
            System.out.println("It is palindrom number.");
        }else {
            System.out.println("It is not a palindrom number.");
        }
    }
}
