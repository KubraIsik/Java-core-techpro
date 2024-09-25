package day12_array;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        
        // How to control if arrays equals or not?
        // same length and same elements in same positions
        int[] a = {2,1,3};
        int[] b = {2,3,1};
        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));
    }
}
