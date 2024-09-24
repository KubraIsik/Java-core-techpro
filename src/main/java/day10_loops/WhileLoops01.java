package day10loops;

public class WhileLoops01 {
    public static void main(String[] args) {
        //Example 1: Write integers from 3 to 6 to console (including 3 and 6)
        int i = 3;
        while (i < 7){
            System.out.println(i);
            i++;
        }

        //Example 2: Write the even integers from 23 to 12 to the console (including 12)
        int j = 23;
        while (j > 11){
            if ( j % 2 == 0){
                System.out.println(j);
            }
            j--;
        }
    }
}
