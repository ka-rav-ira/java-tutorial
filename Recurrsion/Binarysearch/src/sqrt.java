public class sqrt {
    public static void main(String[] args) {
        int ans = sqrt(169);
        System.out.println(ans);
    }

    static int sqrt(int num){
        int start = 0 , end = num;
        int  mid = -1;

        while(start<=end){

             mid = start + (end - start)/2;
            if((long)mid*mid==num){
                return mid;
            } else if ((long)mid*mid>num) {
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        return mid;
    }
}
