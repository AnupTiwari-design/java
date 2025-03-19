package Aggregation;

public class Main {
    public static void main(String[] args) {
        Adress ad=new Adress("Bangalore", "Karanatka", "India");
        Employee em=new Employee("Anup", 123, ad);
        em.display();
    }
    
}
