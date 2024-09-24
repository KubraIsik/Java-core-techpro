package day10loops;

public class ForLoops02 {

    public static void main(String[] args) {
        //example 1: Write the sum of all int’s from 6 to 10 to the console
        //      6+7+8+9+10=40 ==> 40

        int sum = 0;
        for (int i = 6; i < 11; i++) {
            sum += i;
            System.out.print(i);
            if (i != 10){
                System.out.print("+");
            }
        }
        System.out.println(" = " + sum);
        //example 2: Write the product of all int's from 10 to 7 to the console
        //           10x9x8x7 ==> 5040
        int multiply = 1;
        for (int i = 10; i > 6; i--) {
            multiply *= i;
            System.out.print(i);
            if (i!= 7){
                System.out.print("x");
            }
        }
        System.out.println(" = " +multiply);
    }
    
}
