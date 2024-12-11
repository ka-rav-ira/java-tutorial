public class ntoone {
    public static void main(String[] args) {
        fun(23);
        System.out.print("END");
    }

    static void fun(int n){
        if(n==0){
            return;
        }

        System.out.print(n + " -> ");
        fun(n-1);
    }
}
