package Collections.ArrayList;

public class student {
    String name;
    int age;
   public student(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
    
        return "Name: "+name+" Age: "+age;
    }
}
