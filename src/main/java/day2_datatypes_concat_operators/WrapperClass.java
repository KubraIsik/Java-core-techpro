package day2_datatypes_concat_operators;

public class WrapperClass {
    public static void main(String[] args) {

        /*Java creates a new data type structure by adding new properties(methods) to primitive data types.
        This new structure is called Wrapper Class.

        Wrapper classes are classes that Java uses to represent primitive data types as objects.
        This is very useful for using primitive data types in collections (such as ArrayList),
        because in Java collections only accept Object reference types. Most importantly,
        it also paves the way for the use of methods on the data we input.
        */

        // primitive          : char          - boolean - byte - short - int         - long  - float  - double
        //wrapper class       : Character     - Boolean - Byte - Short - Integer     - Long  - Float  - Double

        int i = 12; // primitive variable created.

        Integer k = 12; // a data type as wrapper class created.
        // k.methods will be activated

        //Autoboxing - Unboxing
        /*Java has autoboxing and unboxing mechanisms that can automatically convert
        between primitive types and wrapper classes. Autoboxing automatically converts
        a primitive type into its wrapper class. For example, it converts long to Long.
        Unboxing does the opposite, converting Long to long. Both are converted automaticly.*/

        // Autoboxing
        int num = 13;
        Integer wrapperNum = num;

        // Unboxing
        Byte s = 19;
        byte primitiveS = s;

    }
}
