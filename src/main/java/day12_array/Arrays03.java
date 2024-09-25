package day12_array;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Example 1: Create an int array and write the elements less than 5.
        //      [12, 3, -3, 5, 23] ==> 3, -3
        int[] numbers = {12, 3, -3, 5, 23};

        for (int num: numbers){
            if (num < 5){
                System.out.print(num + " ");
            }
        }
        System.out.println();

        //Example 2: Write the code to find out if a specific element is in Array
        //binarySearch() method returns index of given element for a given array
        //binarySearch(), proper way to use this method with sort() method
        //binarySearch() method returns negative integer if a given element do not included in given array
        /*
        Binary Search working strategy:
            1 Divide array into two part.
            2 If searched element
                            is equal to middle element of the array, search is complete.
                            is smaller than the middle element of the array, search continues with the left side of divided part of the array.
                            is bigger than the middle element of the array, search continues with the right side of divided part of the array.
            This process(1,2) is repeated until the searched element is found or there are no more sub arrays to search in.

         */

        String names[] = {"A", "T", "K", "E", "B"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        
        int index = Arrays.binarySearch(names, "B");
        System.out.println("index of \"B\" = " + index);

        int[] arr = {2, 1, 7, 6};
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int index1 = Arrays.binarySearch(arr, 4);// return -3, index of possible postion if this number were in the array.
        System.out.println("index of \"0\" = " + index1);

        char[] arr1 = {'a','b','c'};
        boolean[] arr2 = {true, false, true};

        //Example 3: Write the code that shows you how many words are in a given sentence.
        String s = "Java is easy. Learn Java earn money.";
        System.out.println("s = " + s);
        String[] splitS = s.split(" ");
        System.out.println("Arrays.toString(splitS) = " + Arrays.toString(splitS));
        System.out.println("splitS.length = " + splitS.length);
    }
}
