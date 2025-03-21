package Multithread;

public class Evennothread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            if(i%2==0){
                try{
                    System.out.println("Even "+i);
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            
            }
        }
    }
    
}
