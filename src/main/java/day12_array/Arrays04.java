package day12_array;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Example 4: In the array [0, 2, 3, 0, 12, 0], place all zeros at the end.
        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr = {0, 0,0,0,0, 4,5,67,0, 2, 0,0,0 ,3, 0, 12};
        // first solution
        int[] arrNew = new int[arr.length];
        int i = 0;
        for (int w : arr){
            if (w != 0){
                arrNew[i] = w;
                i++;
            }
        }
        System.out.println("Arrays.toString(arrNew) = " + Arrays.toString(arrNew));

        // second solution
        int curr, zeroindex;
        for (int j = 0; j < arr.length; j++) {
            curr = arr[j];
            if (curr == 0){
                zeroindex = j;
                for (int k = j + 1; k < arr.length ; k++) {
                    if (arr[k] != 0){
                        arr[zeroindex] = arr[k];
                        arr[k] = curr;
                        zeroindex = k;
                    }
                }
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
