public class findTheSmallestDivisor {
    public static void main(String[] args) {
        int []  arr = {44,22,33,11,1};
        int threshold = 5;
        System.out.println(smallestDivisor(arr,threshold));
    }

        public static int smallestDivisor(int[] nums, int threshold) {
            int range[] = findRange(nums);
            int start = range[0] , end = range[1];
            int ans = 0 ;

            while(start<=end){
                int mid = start + (end - start)/2;

                if(isPossible(nums,mid,threshold)){
                    ans = mid;
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            return ans;
        }

        public static int[] findRange(int[] nums){
            int start = Integer.MAX_VALUE;
            int end = Integer.MIN_VALUE;

            for(int n:nums){
                start = Math.min(n,start);
                end = Math.max(n,end);
            }

            return new int[] {start,end};
        }

        public static boolean isPossible(int[] nums,int divisor,int threshold){
            int total = 0;
            for(int i=0;i<nums.length;i++){
                total+= (int)Math.ceil((double) nums[i]/divisor);
            }

            if(total<=threshold){
                return true;
            }
            return false;
        }


    }

