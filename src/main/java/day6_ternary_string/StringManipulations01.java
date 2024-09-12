package day6_ternary_string;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String Data Type (Class)

        //Example 1: Find the number of characters used in String "s".
        String myString = "HeyThis is the string. easy";
        int sLength = myString.length();
        System.out.println(sLength);

        //Example 2: Get the characters in the first and last index of String "myString".

        //charAt(int index) method, return char by its index
        //Indexing starts from 0
        char firstChar = myString.charAt(0);
        char lastChar = myString.charAt(sLength-1);

        System.out.println("First index of my string: "+ firstChar +
                            "\nLast index of my string: "+ lastChar);

        //Example 3: Get the first 4 characters of the string “myString”.
        //substring(int beginIndex, int endIndex) method: return string between given beginIndex(include) and endIndex(not include)
        String sub1 = myString.substring(0,4);
        System.out.println(sub1);

        //Example 4: Get the word “is” in String "myString".
        String sub2 = myString.substring(5,7);
        System.out.println(sub2);

        // Example 5: Get the word “easy” in String "myString".
        //substring(int beginIndex) method: return string starts with beginIndex until last character in String.
        String sub3 = myString.substring(23);
        System.out.println(sub3);

        //Example 6: Check if the word "easy" exists in the String "myString".
        //contains() method check if is given string exist in the String or not.
        // returns True or False.
        boolean isExist = myString.contains("easy");
        String result = isExist ? "Exist" : "Not exist";
        System.out.println(result);

        //Example 7: Check if the string "s" starts with a certain letter.
        //startsWith() methods control first characters match with given string or not.
        // returns boolean
        boolean isCertainLetter =  myString.startsWith("Hey");
        System.out.println(isCertainLetter);
    }
}
