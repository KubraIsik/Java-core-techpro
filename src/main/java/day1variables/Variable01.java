package day1variables;

public class Variable01 {

    public static void main(String[] args){
        // comment line
        /* Java is a Strongly Typed programming language.
                Any variable should be defined with its data type.
                and should be assigned to associated data type value.
         */

        // Primitive data types
        byte studentAge = 23;
        short sitePopulation = 1200;
        int age = 15;
        int a = 10, b = 12, c = 14;
        int countryPopulation = 83345005;
        long veryBigInt = 934754854867994794L; // max value for long, 'L' denotes long literal
        float floatVal = 0.5f; // f denotes float literal
        double doubleVal = 3.4535636364;
        boolean trueOrFalse = true;
        char oneCharacter = 'A';

        // non - primitive data types
        String hi = "Hello World";

        // print to the console syntax
        System.out.println(hi);
        System.out.println((age));

        // shortcuts to print value
        // type sout brings: System.out.println();
        System.out.println(countryPopulation);
        // type countryPopulation.soutv :
        System.out.println("countryPopulation = " + countryPopulation);
        // concat string and variable value
        System.out.println("Türkiye countryPopulation" + countryPopulation);

        // Simple arithmetic operations for primitive data types
        System.out.println(a + b + c);
        System.out.println("Total (a + b + c):" + (a + b + c));

        int Sum = age + studentAge;
        double division = doubleVal / floatVal;
        boolean comparison = studentAge > countryPopulation;
        char nextChar = (char) (oneCharacter + 1); // Moving to next character in Unicode

        System.out.println("Sum of int and byte = " + Sum);
        System.out.println("Division of souble and float = " + division);
        System.out.println("Id int greater than short comparison = " + comparison);
        System.out.println("Next charachter after = " + oneCharacter +":" + nextChar);

    }
}
