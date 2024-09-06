package day3_operators_casting_scanner;

public class Operators {

    public static void main(String[] args) {

        // int / int = int
        int a=34, b=3;
        System.out.println(a/b);

        // not operator !: negation once(not), !!: negation twice(not not)
        System.out.println(!!true); // output: true

        // AutoWidening : converting small data type into large data type
        byte age = 13;
        int ageInt = age; // converted byte -> age, autoWidening by Java
        // Explicit Narrowing : risky, data loss. Code writer will decide.
        int weight = 313;
        short weightShort = (short)weight; // casting
        System.out.println(weightShort);
        // casting between primitive data types


    }
}
