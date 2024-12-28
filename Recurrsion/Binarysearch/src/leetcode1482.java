public class leetcode1482 {
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,12,7,7};
        System.out.println(minDays(bloomDay,2,3));
    }

    public static int[] findRange(int[] bloomDay){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int bloom:bloomDay){
            min = Math.min(bloom,min);
            max = Math.max(bloom,max);
        }

        return new int[] {min,max};
    }

    public static int minDays(int[] bloomDay, int m, int k){
        int range[] = findRange(bloomDay);
        int start = range[0];
        int end = range[1];
        int ans = 0 ;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(isPossible(mid,m,k,bloomDay)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }

    public static  boolean isPossible(int minDay, int m , int k , int[] bloomDay){
        int total = 0 , count  = 0 ;
        for(int i = 0 ;i<bloomDay.length;i++){
            if(bloomDay[i]<=minDay){
                count++;
            }else{
                count = 0;
            }
            if(count==k){
                total++;
                count=0;
            }if(total>=m){
                return true;
            }
        }
        return false;
    }

}
