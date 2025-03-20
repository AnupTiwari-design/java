package string;
public class Stringm {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = " Java Programming ";
        String str3 = "hello, world!";

        //length of string
        System.out.println("Length of string: " + str1.length());

        //character at index
        System.out.println("Character at index 2: " + str1.charAt(2));

        //upper case
        System.out.println("Uppercase: " + str1.toUpperCase());

        //lower case
        System.out.println("Lowercase: " + str1.toLowerCase());

        //concatenation
        System.out.println("Concatenation: " + str1.concat(str2));

        //substring
        System.out.println("Substring: " + str1.substring(7));

        //substring with start and end index
        System.out.println("Substring with start and end index: " + str1.substring(7, 12));

        //compare
        System.out.println("Compare: " + str1.compareTo(str3));

        //trim
        System.out.println("Trim: " + str2.trim());

        //replace
        System.out.println("Replace: " + str1.replace('H', 'J'));

        //last index of
        System.out.println("Last index of: " + str1.lastIndexOf('o'));

        //first index of
        System.out.println("First index of: " + str1.indexOf('o'));

        //charaaray
        char[] charArray = str1.toCharArray();
        System.out.print("Char array: ");
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();



    }
}