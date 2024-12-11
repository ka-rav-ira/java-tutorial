public class oneton {
    public static void main(String[] args) {
        funRev(4);
    }
    static void funRev(int n){
        if(n==0){
            return;
        }funRev(n-1);
        System.out.println(n);
    }
}
