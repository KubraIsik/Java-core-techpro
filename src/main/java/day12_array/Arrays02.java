package day12_array;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 1: Create an Array of type int called ages and place 6 elements in it,
        // display the sum of the smallest and the largest of these elements
        int[] ages = new int[6];
        ages[0] = 23;
        ages[1] = 3;
        ages[2] = 12;
        ages[3] = 45;
        ages[4] = 34;
        ages[5] = 18;

        /*Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        //min
        System.out.println("min ages[0] = " + ages[0]);
        // max
        System.out.println("max ages[ages.length - 1] = " + ages[ages.length - 1]);
        */

        int min = ages[0] ,max = ages[0];
        for (int w : ages){
            min = Math.min(min, w);
            max = Math.max(max, w);
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
