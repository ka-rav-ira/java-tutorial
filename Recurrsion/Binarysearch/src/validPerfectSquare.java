public class validPerfectSquare {
    public static void main(String[] args) {
        boolean ans = validPerfectSquare(121);
        System.out.println(ans);
    }

    static boolean validPerfectSquare(int n){
        int end = n; int start = 1;
        

        while(start<=end){
            int mid = start + (end-start)/2;
            long sq = (long) mid*mid;
            if(sq==n){
                return true;
            }else if(sq>n){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return false;
    }
}
