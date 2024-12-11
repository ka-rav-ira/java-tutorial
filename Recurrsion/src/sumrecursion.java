public class sumrecursion {
    public static void main(String[] args) {
    int ans = digitSum(1342);
        System.out.println(ans);



    }

    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n + sum(n-1);
    }

    static int digitSum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) +   digitSum(n/10);
    }
}
