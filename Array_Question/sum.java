package Array_Question;
import java.util.ArrayList;
public class sum {

public static ArrayList<Integer> subarraySum(int[] arr, 
int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;
        int start = 0;
        int end = 0;
        while (end < n) {
            sum += arr[end];
            while (sum > s) {
                sum -= arr[start];
                start++;
            }
            if (sum == s) {
                ans.add(start + 1);
                ans.add(end + 1);
                return ans;
            }
            end++;
        }
        ans.add(-1);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int s = 12;
        ArrayList<Integer> ans = subarraySum(arr, n, s);
        System.out.println(ans);
    }
}
