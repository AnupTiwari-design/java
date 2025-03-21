package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueList {
    public static ArrayList<Integer> getUnique(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 5, 2, 3, 5, 1, 4));

        System.out.println(getUnique(list));
    }
}