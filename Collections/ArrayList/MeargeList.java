package Collections.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class MeargeList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : list1) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        for (Integer num : list2) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        System.out.println(result);
    }
    
}
