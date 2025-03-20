package string;


public class example {

    public static void main(String[] args) {
        
        String s1="Hello";//string literals
        String s2=new String("Hello");//string object
        String s3=new String("Hello");
        if(s1==s2)
        {
            System.out.println("hi");

        }
        if(s2==s3){
            System.out.println("hi hi");
        }
        if(s1==s3)
        {
            System.out.println("hello");
        }
       
        if(s2.equals(s3));
        System.out.println("true");





        
    }
    
}
