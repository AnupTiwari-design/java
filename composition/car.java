package composition;

public class car {
  private  Engine engine; //composition
  car()
  {
    engine=new Engine();
  }
void startcar(){
    engine.start();
    System.out.println("car is starting");
}
public static void main(String[] args) {
    car c=new car();
    c.startcar();
}
    
}
