public class findNthRootOfM {
    public static void main(String[] args) {
        System.out.println(nthRoot(2,9));
    }

    public static int nthRoot(int n,int m){
        int start = 1 , end = m;

        while(start<=end){
            int mid = start + (end - start)/2;
            int res = (int)Math.pow(mid,n);
            if(res==m){
                return mid;
            }else if(res>m){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
