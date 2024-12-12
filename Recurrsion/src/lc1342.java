public class lc1342 {
    public static void main(String[] args) {

    }

    static int steps(int n){
        return helper(n,0);
    }

    static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);

    }
}
