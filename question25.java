// Solve the problem of finding the next greater element for each element in an array.
public class question25 {
    public static int[] GreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 7, 6};
        int[] result = GreaterElements(arr);

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

