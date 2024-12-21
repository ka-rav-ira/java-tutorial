public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int target  = 2;
        int ans = lowerBound(arr,target);
        System.out.println(ans);
    }

    static int lowerBound(int[] arr,int target){
        int n = arr.length;
        int idx = -1;
        if(n==0){
            return idx;
        }
       int start = 0 , end = n-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]>=target){
                idx=mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return idx;
    }
}
