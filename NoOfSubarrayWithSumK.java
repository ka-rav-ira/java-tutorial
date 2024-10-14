import java.util.HashMap;

public class NoOfSubarrayWithSumK {
    public static void main(String[] args) {

    }

    public int subarraySum(int[] nums,int k){
            int n = nums.length;
            if(n==0){
                return 0;
            }

            HashMap<Integer,Integer> map = new HashMap<>(); //Key = prefixSum and Value = count of prefix sum
            int currSum = 0;
            int count = 0;

            for(int i=0;i<n;i++){
                currSum += nums[i];

                if(currSum==k){ //We found a new subArray with sum  = k
                    count++;

                if(map.containsKey(currSum-k)){
                    count+=map.get(currSum-k);
                }

                map.put(currSum,map.getOrDefault(currSum,0)+1);
                }

            }
        return count;
    }
}
