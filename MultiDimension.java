import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        // INPUT
        System.out.println("Enter 9 integers for the 3x3 matrix:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // OUTPUT -- Option 1
        System.out.println("The 3x3 matrix is:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //Output -- Option 2
        for (int row=0;row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
