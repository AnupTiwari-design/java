package Multithread;

public class MultithreadingThing extends Thread{
    String threadname;
    MultithreadingThing(String threadname){
        this.threadname=threadname;
    }

    @Override
   public void run(){
        for(int i=0;i<10;i++){
           
            try {
                System.out.println(threadname+" "+i);
                if(i==5){
                    int divide=i/0;

                }

                Thread.sleep(1000);
            }
            catch (ArithmeticException e) {
                System.out.println(e);
            }
             catch (InterruptedException e) {
                System.out.println(e);
            }
            
        }
    }
}
   
    

