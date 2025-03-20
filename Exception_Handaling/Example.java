package Exception_Handaling;

import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("C:\\test\\a.txt");
        }
        catch(IOException e){
            System.out.println("File not found");
        }
    }
    
}
