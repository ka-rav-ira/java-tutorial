import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean result = funResult(num);
        System.out.println(result);
    }

    private static boolean funResult(int num) {
        int i = 2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }


}
