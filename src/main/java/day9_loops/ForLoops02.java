package day9_loops;

public class ForLoops02 {
    public static void main(String[] args) {
        /*==> “Tramvay”==> “Tr”*/
        /*Example 1: Write all characters before the first letter 'a' in a given String to the console*/

        //charAt() method returns character of a given index located in a string
        //break keyword terminate the loop or switch
        String s = "Tramway";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'a') {
                System.out.println(ch);
            }else{
                break;
            }
        }

        //"Pwd12?Ab" ==> P12?A
        //Example 2: Write the code that does not print lowercase letters in a given String to the console
        String pwd = "Pwd12?Ab";
        String newPwd = "";
        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);
            if ( ch >= 'a' && ch <= 'z'){
                continue;
            }
            System.out.print(ch);
        }
        //example 3: Write the code that reverses a given String
        //           String t = "Ali Can";  ==> “naC ilA”
        //last index of a String equal length()-1
        System.out.println();
        String t = "Ali Can";
        String reverse = "";
        for (int i = t.length() - 1 ; i > -1; i--) {
            reverse += t.charAt(i);
        }
        System.out.println("original: " + t);
        System.out.println("reversed: " + reverse);
    }
}
