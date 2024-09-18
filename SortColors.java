import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] colorArr = {2, 0, 2, 1, 1, 0, 1, 0, 1, 0};
        sortColors(colorArr);
        System.out.println(Arrays.toString(colorArr));
    }

    private static void sortColors(int[] colorArr) {
        int low = 0;
        int mid = 0;
        int high = colorArr.length - 1;

        while (mid <= high) {
            if (colorArr[mid] == 2) {
                swap(colorArr, mid, high);
                high--;
            } else if (colorArr[mid] == 0) {
                swap(colorArr, mid, low);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
