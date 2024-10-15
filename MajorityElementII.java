import java.util.List;
import java.util.*;
public class MajorityElementII {
    public static void main(String[] args) {

    }

    public static List<Integer> majorityElement(int[] nums){
        int n = nums.length;

        Integer maj1 = Integer.MIN_VALUE;
        int count1 = 0;

        Integer maj2=null;
        int count2 = 0;
        double freq = Math.floor(n/3);
        
        for(int i=0;i<n;i++){
            if(nums[i]==maj1){
                count1++;
            } else if (nums[i]==maj2) {
                count2++;
            }else if(count1==0){
                maj1 = nums[i];
                count1=1;
            }else if(count2==0){
                maj2=nums[i];
                count2=1;
            }else{
                count1--;count2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        count1=0;count2=0;
        for(int num:nums){
            if(num==maj1){
                count1++;
            }else if(num==maj2){
                count2++;
            }
        }

        if(count1>freq){
            res.add(maj1);
        }
        if(count2>freq){
            res.add(maj2);
        }

        return res;

    }
}
