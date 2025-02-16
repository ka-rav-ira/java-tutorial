public class clearLSBs {
    public static void main(String[] args){
        System.out.println(clearLSB(180,5));

    }

    public static int clearLSB(int n,int k){
        return  n & (~((1 << (k + 1)) - 1));
    }
}
