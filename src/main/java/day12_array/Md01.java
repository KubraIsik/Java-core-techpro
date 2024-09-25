package day12_array;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        // Multi Dimensional Arrays
        // outer [ inner array[], [], [] ...]
        
        int[][] mdA = new int[3][2];
        mdA[0][0] = 1;

        System.out.println("Arrays.toString(mdA[0]) = " + Arrays.toString(mdA[0]));
    }
}
