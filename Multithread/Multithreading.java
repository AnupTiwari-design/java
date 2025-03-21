package Multithread;

public class Multithreading {
    public static void main(String[] args) {

        MultithreadingThing obj = new MultithreadingThing("Thread 1");
        MultithreadingThing obj1 = new MultithreadingThing(
            "Thread 2"
        );
        MultithreadingThing obj2 = new MultithreadingThing("Thread 3");
        obj.start();
        obj1.start();
        obj2.start();
        
  
    }  
}
