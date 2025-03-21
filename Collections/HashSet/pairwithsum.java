package Collections.HashSet;
import java.util.HashSet;
public class pairwithsum {

   public static boolean pair(int []arr,int sum)
    {
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(s.contains(sum-arr[i]))
            {
                return true;
            }
            s.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {4,7,1,-3,2};
        int sum = 5;
        System.out.println(pair(arr, sum));
    }
    
}
