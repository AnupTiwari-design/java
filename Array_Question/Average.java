package Array_Question;
public class Average {
    public static boolean Partition(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        
        for (int num : arr) {
            totalSum += num;
        }

        for (int k = 1; k <= n / 2; k++) {
            if ((totalSum * k) % n != 0) continue;
            int targetSum = (totalSum * k) / n;

            if (checkSubset(arr, k, targetSum)) return true;
        }
        return false;
    }

    private static boolean checkSubset(int[] arr, int k, int targetSum) {
        int n = arr.length;

        for (int i = 0; i < (1 << n); i++) {
            int count = 0, sum = 0;

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += arr[j];
                    count++;
                }
            }

            if (count == k && sum == targetSum) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 6, 4, 6};
        int[] arr2 = {2, 4, 6, 8};

        System.out.println(canPartition(arr1));
        System.out.println(canPartition(arr2));
    }
}