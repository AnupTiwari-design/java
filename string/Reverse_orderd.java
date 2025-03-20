// input The sky is blue
// output blue is sky The
package string;
public class Reverse_orderd {
   public static String reverseWord(String str){

    String [] words = str.trim().split("\\s+");
    String result = "";
    for (int i = words.length-1; i >= 0; i--) {
        result += words[i] + " ";

        if (i>0) {
            result += " ";  
            
        }


    }
    return result; 
}
public static void main(String[] args) {
    String str = "The sky is blue";
    System.out.println(reverseWord(str));
}
}