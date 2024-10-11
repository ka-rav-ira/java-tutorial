import java.util.HashMap;
import java.util.Map;

public class longestSubsequenceInAnArray {
    public static void main(String[] args) {
        int[] arr = {0,1,9,6,5,-1};
        int num = longestConsecutive(arr);
        System.out.println(num);

    }

   public static int longestConsecutive(int[] nums){
        int longestLength = 0 ;
        //Declaration of map
        Map<Integer,Boolean> exploredMap = new HashMap<>();
        for(int num:nums){
            exploredMap.put(num,Boolean.FALSE);
        }

        for(int num:nums) {
            int currentLength = 1;

            //Checking in the forward Direction
            int nextNum = num + 1;
            while (exploredMap.containsKey(nextNum) && exploredMap.get(nextNum) == false) {
                currentLength++;
                exploredMap.put(nextNum, Boolean.TRUE);
            }
            nextNum++;


            //checking in the reverse direction
            int prevNum = num - 1;
            while (exploredMap.containsKey(prevNum) && exploredMap.get(prevNum) == false) {
                currentLength++;
                exploredMap.put(prevNum,Boolean.TRUE);
                prevNum--;
            }
            longestLength =  Math.max(longestLength,currentLength);
        }
        return longestLength;
    }
}
