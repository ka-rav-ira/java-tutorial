public class bs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int ans = bs(arr,10);
        System.out.println(ans);

    }

    static int bs(int[] arr,int target){
        int s =  0;
        int e = arr.length-1;

        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==target){
                return m;
            } else if (target<arr[m]) {
                e = m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }
}