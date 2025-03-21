package Array_Question;
import java.util.Arrays;
public class choclate {
    
    public static choclatedistribution(int arr[],int n){
        int m=3;
        if(n==0 || m==0){
            return 0;
        }
        if(n<m){
            return -1;
        }
        Arrays.sort(arr);
        int min_diff=Integer.MAX_VALUE;
        int first=0,last=0;
        for(int i=0;i+m-1<n;i++){
            int diff=arr[i+m-1]-arr[i];
            if(diff<min_diff){
                min_diff=diff;
                first=i;
                last=i+m-1;
            }
        }
        return (arr[last]-arr[first]);
    }
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;  // Number of students
        int n = arr.length;
        System.out.println("Minimum difference is: "+choclatedistribution(arr, n));
    }

    
}
