package string;

public class reverse {
    public static void main(String[] args) {
         String s1="Hello";

         char reverse;

         for(int i=s1.length()-1;i>=0;i--)
         {
             reverse = s1.charAt(i);
             System.out.print(reverse);
         }

    }
    
}
