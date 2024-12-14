public class coins {
    public static void main(String[] args) {
        int ans = coins(14);
        System.out.println(ans);
    }

    static int coins(int n){

        int start  = 0;
        int end = n;
        int sum = 0 ;

        while(start<=end){

            int mid = start + (end-start)/2;
            sum = mid*(mid+1)/2;

            if(sum==n){
                return mid;
            }else if(sum<n){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return end;
    }
}
