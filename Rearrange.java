import java.util.Arrays;

public class Rearrange {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] newArr = rearrangeBrute(arr);
        System.out.println(Arrays.toString(newArr));
    }

    private static int[] rearrangeBrute(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        // Initializing two pointers to track even and
        // odd indices for positive and negative integers respectively
        int posIndex = 0, negIndex = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                // Placing the positive integer at desired position in ans
                ans[posIndex] = arr[i];
                posIndex += 2;
            } else {
                // Placing the negative integer at desired position in ans
                ans[negIndex] = arr[i];
                negIndex += 2;
            }
        }

        // Fill remaining positions with 0s (optional)
        while (posIndex < n) {
            ans[posIndex] = 0;
            posIndex += 2;
        }
        while (negIndex < n) {
            ans[negIndex] = 0;
            negIndex += 2;
        }

        return ans;
    }
}
