package Collections.LinkedLIst;
import java.util.LinkedList;
public class LinkedList_EX {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //insert element at first position
        list.addFirst(0);
        //insert element at last position
        list.addLast(6);
        //insert element at specific position
        list.add(3, 10);


        //remove element at first position
        list.removeFirst();
        //remove element at last position
        list.removeLast();
        //remove element at specific position
        list.remove(3);

        for (Integer num : list) {
            System.out.println(num);
        }
    }
    
}
