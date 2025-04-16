// Check if an array can be split into two parts such that the sum of the prefix equals the sum of the suffix.

public class question4 {
    public static boolean SplitArray(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        if (SplitArray(arr)) {
            System.out.println("Array can be split into equal prefix and suffix sums.");
        } else {
            System.out.println("Array cannot be split.");
        }
    }
}