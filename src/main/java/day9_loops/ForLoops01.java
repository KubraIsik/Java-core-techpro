package day8_string_loops;

public class ForLoops01 {
    public static void main(String[] args) {

        /*Java loop types

        1. for-loop
        2. while-loop
        3. do-while-loop
        4. for-each-loop (used for Collections)*/

        //example 1: Type 'Hi!' 4 times in the console
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
        //Example 2: Write all integers from 20(inclusive) to 3(inclusive) to console
        for (int i = 20; i > 2  ; i--) { System.out.print(i + ", ");}
        System.out.println();
        //Example 3: Write all even numbers from 3 to 20 to the console (including 20)
        for (int i = 3; i < 21 ; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        // or
        for (int i = 4; i < 21 ; i+=2) {
            System.out.println(i);
        }
    }
}
