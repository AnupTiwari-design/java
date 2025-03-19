package Aggregation;

public class Employee {
    
    String name;
    int id;
    Adress adress;
    Employee(String name,int id,Adress adress){
        this.name=name;
        this.id=id;
        this.adress=adress;

    }

    void display(){
        System.out.println(name + " "+ id);
        System.out.println(adress.city);
        System.out.println(adress.state);
        System.out.println(adress.country);
    }
}
