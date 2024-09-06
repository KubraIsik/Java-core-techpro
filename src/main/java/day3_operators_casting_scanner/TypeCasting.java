package day3_operators_casting_scanner;

public class TypeCasting {

    public static void main(String[] args) {

        /* Conversion of Numeric primitive data types into each other is called Type Casting.
        Numeric Data Type ==> byte - short -      int -    long -             float - double */

        /* Note 1: Java automatically converts small data types to large data types.
                    This is called “AutoWidening“.*/

        /* Note 2: Converting big data types into small ones can be risky. Data loss may occur.
                    Java do not make this conversion automatically. Developers do.
                    This process is called "Explicit Narrowing“.*/

        // (AutoWidening)
        // Example 1: Convert byte data type to int data type.
        byte age = 13;
        int ageInt = age;

        // (Explicit Narrowing)
        // Example 2: Convert int data type to short data type.
        int weight = 32000;
        short weightShort = (short) weight;
        System.out.println(weightShort);
    }
}
