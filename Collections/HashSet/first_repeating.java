package Collections.HashSet;

import java.util.HashSet;

public class first_repeating {
    
    public static int repeating(int [] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        int min = -1;
        for(int i = arr.length - 1; i >= 0; i--)
        {
            if(set.contains(arr[i]))
            {
                min = arr[i];
            }
            else
            {
                set.add(arr[i]);
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 3, 2, 1};
        System.out.println(repeating(arr));
    }
}
