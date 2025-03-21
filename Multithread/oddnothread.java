package Multithread;

public class oddnothread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            if(i%2!=0){
            try {
                System.out.println("Odd "+i);
                Thread.sleep(1000);
            } catch (ArithmeticException e) {
                System.out.println(e);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        
        }
    }
    
}
}