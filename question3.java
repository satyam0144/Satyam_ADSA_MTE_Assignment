// Solve the problem of finding the equilibrium index in an array.

public class question3 {
    public static int findIndex(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {-7, 1, 5, 2, -4, 3, 0};
        int index = findIndex(array);
        if (index != -1) {
            System.out.println("Equilibrium index is: " + index);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}