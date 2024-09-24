package day11_loops_arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        1)Multiple data can stored in it. ex. student names in a classroom.
        2)Can only store one type of date. ex. an int array only include int values,
        a String array only include String values.
        3) To create an Array;
            i)Data Type
            ii)Number of data Data will be stored (Maximum values for an Array length,
            Integer.MAX_VALUE is restricted as (approx. 2 million) )
            should be defined.
        4)Arrays are faster than other type of collections. Because their size is fixed.
        5)Arrays use less memory than other type of collections. Because they do not have extra metadata or functionalities.
        6)Arrays can store both primitive(e.g. int, char, double) and Object reference data types (e.g. String, Integer, wrappers)
        */
        // common way to create an array
        String[] stdName1 = new String[3]; //number of elements inside []
        // or
        //String stdName2[] = new String[4];
        // print array, using Arrays class
        System.out.println(Arrays.toString(stdName1));
        //Example 1: Create an int array named "notes" and has 5 elements, print out to the console
        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes));

        //Example 2: Create an int array named "integers" and has 10 elements, print out to the console
        //non-primitive (reference) data types can be stored in an Array
        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));

        //Example 3: Create an String array named "names" and has 3 elements, print out to the console
        String[] names = new String[3];
        System.out.println(Arrays.toString(names));

        //add a value to the Array
        names[0] = "Alican";
        names[2] = "Sam";
        names[1] = "Kubra";

        System.out.println(Arrays.toString(names));
        System.out.println(names[0]);
        names[0] = "Omer Can";
        System.out.println(Arrays.toString(names));

        //Example 1: Create a String array, add 5 elements to it, all elements have
        // display the sum of the number of characters it contains.
        String[] cities = new String[5];
        cities[0] = "Bayburt";
        cities[1] = "İstanbul";
        cities[2] = "Hatay";
        cities[3] = "Adana";
        cities[4] = "Samsun";

        // 1. solution
        int totalChar = 0;
        for (int i = 0; i < cities.length; i++) { // length: field
            totalChar += cities[i].length();
        }
        System.out.println("totalChar = " + totalChar);
        // 2. solution
        //for-each loop, can be used for Arrays, like the other structures can store multiple data.

        int newTotalChar = 0;
        for (String cityName: cities){ //  can be achieved directly a value of an array element
            newTotalChar += cityName.length();
        }
        System.out.println("newTotalChar = " + newTotalChar);
    }
}
