package Multithread;

public class Evenoddthread {

    public static void main(String[] args) {
        Evennothread obj = new Evennothread();
        oddnothread obj1 = new oddnothread();
        obj.start();
        obj1.start();
    }
    
}
