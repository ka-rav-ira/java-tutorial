import java.util.Arrays;

public class twoSumIISorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] ans = twoSumII(arr,7);
        System.out.println(Arrays.toString(ans));
    }

   static int[] twoSumII(int[] arr, int target){

        int start =  0 , end = arr.length;

        while(start<=end){
            int sum = start + end;

            if(sum==target){
                return new int[]{start+1,end+1};
            } else if (sum>target) {
                end--;
            }else {
                start++;
            }
        }
        return new int[0];
    }
}
