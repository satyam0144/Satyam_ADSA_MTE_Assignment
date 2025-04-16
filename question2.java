//Write a program to find the sum of elements in a given range [L, R] using a prefix sum array.

public class question2 {
    public static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
    public static int rangeSum(int[] prefixSum, int L, int R) {
        if (L == 0) {
            return prefixSum[R];
        }
        return prefixSum[R] - prefixSum[L - 1];
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1, 1, 5, 3};
        int[] prefixSum = buildPrefixSum(arr);
        int L = 2;
        int R = 5;

        System.out.println("Sum : " + L + " to " + R + " is: " +
                rangeSum(prefixSum, L, R));
    }
}
