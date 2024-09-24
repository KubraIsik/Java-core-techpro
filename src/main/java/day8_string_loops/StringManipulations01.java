package day8_string_loops;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Example 1: Starting from a specific character of a String up to a specific character. (take all characters dynamically.)
        // abc@gmail.com ===> gmail
        String mail = "abc@gmail.com";
        String companyName = mail.split("@")[1].split("\\.")[0];
        System.out.println("companyName = " + companyName);

        //indexOf() method returns index of first occurence of a given character in a String
        // return -1 when String do not contain given character
        int startIndex = mail.indexOf("@") + 1;
        int endIndex = mail.indexOf(".");
        companyName = mail.substring(startIndex,endIndex);
        System.out.println("companyName = " + companyName);
    }
}
