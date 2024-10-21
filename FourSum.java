import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

}

public static List<List<Integer>> fourSum(int[] nums, int target){
    Arrays.sort(nums);
    int n = nums.length;
    List<List<Integer>> ans = new ArrayList<>();

    //Calculating the quadruplets
    for(int i=0;i<n;i++){
        //avoid the duplicates while moving
        if(i>0 && nums[i]==nums[i-1]) continue;;
        for(int j=i+1;j<n;j++){
            //avoid the duplicates while moving
            if(j>i+1 && nums[j]==nums[j-1]) continue;

            //2 Pointers Approach
            int k = j+1;
            int l = n-1;

            while(k<l){
                long sum = nums[i]+nums[j]+nums[k]+nums[l];
                if(sum==target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    temp.add(nums[l]);
                    ans.add(temp);
                    k++;
                    l--;

                    //skip the duplicates
                    while(k<l && nums[k]==nums[k-1]) continue;
                    while(k<l && nums[l]==nums[l-1]) continue;
                }else if (sum<target) k++;
                else{
                    l--;
                }
            }

        }
    }
    return ans;
  }

public void main() {
}


//public static boolean find3Numbers(int A[], int n, int X){
//    Arrays.sort(A);
//    for(int i=0;i<n-2;i++){
//        int  ans = X - A[i];
//        int start = i+1, end = n-1;
//        while(start<end){
//            if(A[start]+A[end]==ans){
//                return true;
//            } else if ((A[start]+A[end]>ans)) {
//                end--;
//            }else{
//                start++;
//            }
//        }
//    }
//    return false;
//}
