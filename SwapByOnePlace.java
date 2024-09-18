import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SwapByOnePlace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Input By How Many Space You Want to Rotate the array");
        int k = in.nextInt();
        int[] arr = {1,2,3,4,5};
//        SwapByOne(arr);
//        SwapLeftByThree(arr,k);
//        SwapRightByThree(arr,k);
        SwapRightByThreeOptimal(arr,k);
        System.out.println(Arrays.toString(arr));
    }

     static void SwapLeftByThree(int[] nums,int k) {
        while(k>0) {
            int temp = nums[0];
            for (int i = 0; i < (nums.length) - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[(nums.length) - 1] = temp;
            k--;
        }
    }

    static void SwapRightByThree(int[] nums,int k) {
       int n = (nums.length)-1;
        while(k>0) {
            int temp = nums[n];
            for (int i = n-1; i >= 0; i--) {
                nums[i+1] = nums[i];
            }
            nums[0] = temp;
            k--;
        }
    }

    static void SwapRightByThreeOptimal(int[] nums,int k){
        int n = (nums.length) - 1;
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);
    }

    static void reverse(int[] nums,int i,int j){
        while(i<j){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j]=temp;
          i++;j--;
        }
    }

    static void SwapByOne(int[] arr) {
        int temp = arr[0];
        for(int i = 0 ; i<(arr.length)-1;i++){
            arr[i] = arr[i+1];
        }
        arr[(arr.length)-1] = temp;
    }
}
