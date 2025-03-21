package Collections.ArrayList;
import java.util.ArrayList;

public class Arraylist_Ex {

    public static void main(String[] args) {
      
        ArrayList<student> list = new ArrayList<>();//creating arraylist

        list.add(new student("Ravi", 21));//adding student class object
        list.add(new student("Vijay", 25));

        for (student s : list) {
            System.out.println(s.name + " " + s.age);
        }
       

    }
}