package Collections.HashSet;
import java.util.HashSet;
public class Hash_Set_EX {
    
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);

        //remove element
        set.remove(3);

        //check element is present or not
        System.out.println(set.contains(2));

        for (Integer num : set) {
            System.out.println(num);
        }
    }
    
}
